package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.j;
import defpackage.kvh0;
import defpackage.ny61;
import defpackage.rwg0;
import defpackage.wm10;

/* loaded from: classes10.dex */
final class StandardMenuPopup extends MenuPopup implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    private static final int ITEM_LAYOUT = kvh0.abc_popup_menu_item_layout;
    private final MenuAdapter mAdapter;
    private View mAnchorView;
    private int mContentWidth;
    private final Context mContext;
    private boolean mHasContentWidth;
    private final MenuBuilder mMenu;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    final j mPopup;
    private final int mPopupMaxWidth;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private wm10 mPresenterCallback;
    private boolean mShowTitle;
    View mShownAnchorView;
    ViewTreeObserver mTreeObserver;
    private boolean mWasDismissed;
    final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (StandardMenuPopup.this.isShowing()) {
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                if (standardMenuPopup.mPopup.R) {
                    return;
                }
                View view = standardMenuPopup.mShownAnchorView;
                if (view == null || !view.isShown()) {
                    StandardMenuPopup.this.dismiss();
                } else {
                    StandardMenuPopup.this.mPopup.show();
                }
            }
        }
    };
    private final View.OnAttachStateChangeListener mAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.StandardMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = StandardMenuPopup.this.mTreeObserver;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    StandardMenuPopup.this.mTreeObserver = view.getViewTreeObserver();
                }
                StandardMenuPopup standardMenuPopup = StandardMenuPopup.this;
                standardMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(standardMenuPopup.mGlobalLayoutListener);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private int mDropDownGravity = 0;

    public StandardMenuPopup(Context context, MenuBuilder menuBuilder, View view, int i, int i2, boolean z) {
        this.mContext = context;
        this.mMenu = menuBuilder;
        this.mOverflowOnly = z;
        this.mAdapter = new MenuAdapter(menuBuilder, LayoutInflater.from(context), z, ITEM_LAYOUT);
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
        Resources resources = context.getResources();
        this.mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(rwg0.abc_config_prefDialogWidth));
        this.mAnchorView = view;
        this.mPopup = new j(context, null, i, i2);
        menuBuilder.addMenuPresenter(this, context);
    }

    private boolean tryShow() {
        View view;
        Rect rect;
        if (isShowing()) {
            return true;
        }
        if (this.mWasDismissed || (view = this.mAnchorView) == null) {
            return false;
        }
        this.mShownAnchorView = view;
        this.mPopup.S.setOnDismissListener(this);
        j jVar = this.mPopup;
        jVar.I = this;
        jVar.e();
        View view2 = this.mShownAnchorView;
        boolean z = this.mTreeObserver == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.mTreeObserver = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
        }
        view2.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        j jVar2 = this.mPopup;
        jVar2.H = view2;
        jVar2.E = this.mDropDownGravity;
        if (!this.mHasContentWidth) {
            this.mContentWidth = MenuPopup.measureIndividualMenuWidth(this.mAdapter, null, this.mContext, this.mPopupMaxWidth);
            this.mHasContentWidth = true;
        }
        this.mPopup.d(this.mContentWidth);
        this.mPopup.S.setInputMethodMode(2);
        j jVar3 = this.mPopup;
        Rect epicenterBounds = getEpicenterBounds();
        if (epicenterBounds != null) {
            jVar3.getClass();
            rect = new Rect(epicenterBounds);
        } else {
            rect = null;
        }
        jVar3.Q = rect;
        this.mPopup.show();
        DropDownListView dropDownListView = this.mPopup.c;
        dropDownListView.setOnKeyListener(this);
        if (this.mShowTitle && this.mMenu.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.mContext).inflate(kvh0.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.mMenu.getHeaderTitle());
            }
            frameLayout.setEnabled(false);
            dropDownListView.addHeaderView(frameLayout, null, false);
        }
        this.mPopup.setAdapter(this.mAdapter);
        this.mPopup.show();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(MenuBuilder menuBuilder) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public void dismiss() {
        if (isShowing()) {
            this.mPopup.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public ListView getListView() {
        return this.mPopup.c;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public boolean isShowing() {
        return !this.mWasDismissed && this.mPopup.S.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.mMenu) {
            return;
        }
        dismiss();
        wm10 wm10Var = this.mPresenterCallback;
        if (wm10Var != null) {
            wm10Var.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.mWasDismissed = true;
        this.mMenu.close();
        ViewTreeObserver viewTreeObserver = this.mTreeObserver;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.mTreeObserver = this.mShownAnchorView.getViewTreeObserver();
            }
            this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            this.mTreeObserver = null;
        }
        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        PopupWindow.OnDismissListener onDismissListener = this.mOnDismissListener;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        if (subMenuBuilder.hasVisibleItems()) {
            d dVar = new d(this.mContext, subMenuBuilder, this.mShownAnchorView, this.mPopupStyleAttr, this.mPopupStyleRes, this.mOverflowOnly);
            dVar.f(this.mPresenterCallback);
            dVar.e(MenuPopup.shouldPreserveIconSpacing(subMenuBuilder));
            dVar.k = this.mOnDismissListener;
            this.mOnDismissListener = null;
            this.mMenu.close(false);
            j jVar = this.mPopup;
            int i = jVar.y;
            int verticalOffset = jVar.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.mDropDownGravity, this.mAnchorView.getLayoutDirection()) & 7) == 5) {
                i += this.mAnchorView.getWidth();
            }
            if (!dVar.c()) {
                if (dVar.f != null) {
                    dVar.g(i, verticalOffset, true, true);
                }
            }
            wm10 wm10Var = this.mPresenterCallback;
            if (wm10Var != null) {
                wm10Var.onOpenSubMenu(subMenuBuilder);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(View view) {
        this.mAnchorView = view;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setCallback(wm10 wm10Var) {
        this.mPresenterCallback = wm10Var;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean z) {
        this.mAdapter.setForceShowIcon(z);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int i) {
        this.mDropDownGravity = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int i) {
        this.mPopup.y = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setShowTitle(boolean z) {
        this.mShowTitle = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setVerticalOffset(int i) {
        this.mPopup.setVerticalOffset(i);
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public void show() {
        if (tryShow()) {
            return;
        }
        ny61.r("StandardMenuPopup cannot be used without an anchor");
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public void updateMenuView(boolean z) {
        this.mHasContentWidth = false;
        MenuAdapter menuAdapter = this.mAdapter;
        if (menuAdapter != null) {
            menuAdapter.notifyDataSetChanged();
        }
    }
}
