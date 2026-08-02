package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.DropDownListView;
import androidx.appcompat.widget.j;
import defpackage.b64;
import defpackage.kvh0;
import defpackage.rwg0;
import defpackage.s19;
import defpackage.sm10;
import defpackage.tm10;
import defpackage.wl10;
import defpackage.wm10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
final class CascadingMenuPopup extends MenuPopup implements View.OnKeyListener, PopupWindow.OnDismissListener {
    static final int HORIZ_POSITION_LEFT = 0;
    static final int HORIZ_POSITION_RIGHT = 1;
    private static final int ITEM_LAYOUT = kvh0.abc_cascading_menu_item_layout;
    static final int SUBMENU_TIMEOUT_MS = 200;
    private View mAnchorView;
    private final Context mContext;
    private boolean mHasXOffset;
    private boolean mHasYOffset;
    private final int mMenuMaxWidth;
    private PopupWindow.OnDismissListener mOnDismissListener;
    private final boolean mOverflowOnly;
    private final int mPopupStyleAttr;
    private final int mPopupStyleRes;
    private wm10 mPresenterCallback;
    boolean mShouldCloseImmediately;
    private boolean mShowTitle;
    View mShownAnchorView;
    final Handler mSubMenuHoverHandler;
    ViewTreeObserver mTreeObserver;
    private int mXOffset;
    private int mYOffset;
    private final List<MenuBuilder> mPendingMenus = new ArrayList();
    final List<s19> mShowingMenus = new ArrayList();
    final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.1
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!CascadingMenuPopup.this.isShowing() || CascadingMenuPopup.this.mShowingMenus.size() <= 0 || CascadingMenuPopup.this.mShowingMenus.get(0).a.R) {
                return;
            }
            View view = CascadingMenuPopup.this.mShownAnchorView;
            if (view == null || !view.isShown()) {
                CascadingMenuPopup.this.dismiss();
                return;
            }
            Iterator<s19> it = CascadingMenuPopup.this.mShowingMenus.iterator();
            while (it.hasNext()) {
                it.next().a.show();
            }
        }
    };
    private final View.OnAttachStateChangeListener mAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: androidx.appcompat.view.menu.CascadingMenuPopup.2
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = CascadingMenuPopup.this.mTreeObserver;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    CascadingMenuPopup.this.mTreeObserver = view.getViewTreeObserver();
                }
                CascadingMenuPopup cascadingMenuPopup = CascadingMenuPopup.this;
                cascadingMenuPopup.mTreeObserver.removeGlobalOnLayoutListener(cascadingMenuPopup.mGlobalLayoutListener);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    };
    private final wl10 mMenuItemHoverListener = new c(this);
    private int mRawDropDownGravity = 0;
    private int mDropDownGravity = 0;
    private boolean mForceShowIcon = false;
    private int mLastPosition = getInitialMenuPosition();

    public CascadingMenuPopup(Context context, View view, int i, int i2, boolean z) {
        this.mContext = context;
        this.mAnchorView = view;
        this.mPopupStyleAttr = i;
        this.mPopupStyleRes = i2;
        this.mOverflowOnly = z;
        Resources resources = context.getResources();
        this.mMenuMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(rwg0.abc_config_prefDialogWidth));
        this.mSubMenuHoverHandler = new Handler();
    }

    private j createPopupWindow() {
        j jVar = new j(this.mContext, null, this.mPopupStyleAttr, this.mPopupStyleRes);
        jVar.T = this.mMenuItemHoverListener;
        jVar.I = this;
        jVar.S.setOnDismissListener(this);
        jVar.H = this.mAnchorView;
        jVar.E = this.mDropDownGravity;
        jVar.e();
        jVar.S.setInputMethodMode(2);
        return jVar;
    }

    private int findIndexOfAddedMenu(MenuBuilder menuBuilder) {
        int size = this.mShowingMenus.size();
        for (int i = 0; i < size; i++) {
            if (menuBuilder == this.mShowingMenus.get(i).b) {
                return i;
            }
        }
        return -1;
    }

    private MenuItem findMenuItemForSubmenu(MenuBuilder menuBuilder, MenuBuilder menuBuilder2) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.hasSubMenu() && menuBuilder2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View findParentViewForSubmenu(s19 s19Var, MenuBuilder menuBuilder) {
        MenuAdapter menuAdapter;
        int i;
        int firstVisiblePosition;
        MenuItem findMenuItemForSubmenu = findMenuItemForSubmenu(s19Var.b, menuBuilder);
        if (findMenuItemForSubmenu == null) {
            return null;
        }
        DropDownListView dropDownListView = s19Var.a.c;
        ListAdapter adapter = dropDownListView.getAdapter();
        int i2 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            i = headerViewListAdapter.getHeadersCount();
            menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
        } else {
            menuAdapter = (MenuAdapter) adapter;
            i = 0;
        }
        int count = menuAdapter.getCount();
        while (true) {
            if (i2 >= count) {
                i2 = -1;
                break;
            }
            if (findMenuItemForSubmenu == menuAdapter.getItem(i2)) {
                break;
            }
            i2++;
        }
        if (i2 != -1 && (firstVisiblePosition = (i2 + i) - dropDownListView.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < dropDownListView.getChildCount()) {
            return dropDownListView.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    private int getInitialMenuPosition() {
        return this.mAnchorView.getLayoutDirection() == 1 ? 0 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0034 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int getNextMenuPosition(int i) {
        DropDownListView dropDownListView = ((s19) b64.c(1, this.mShowingMenus)).a.c;
        int[] iArr = new int[2];
        dropDownListView.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.mShownAnchorView.getWindowVisibleDisplayFrame(rect);
        if (this.mLastPosition == 1) {
            return (dropDownListView.getWidth() + iArr[0]) + i > rect.right ? 0 : 1;
        }
        if (iArr[0] - i < 0) {
        }
    }

    private void showMenu(MenuBuilder menuBuilder) {
        s19 s19Var;
        View view;
        LayoutInflater from = LayoutInflater.from(this.mContext);
        MenuAdapter menuAdapter = new MenuAdapter(menuBuilder, from, this.mOverflowOnly, ITEM_LAYOUT);
        if (!isShowing() && this.mForceShowIcon) {
            menuAdapter.setForceShowIcon(true);
        } else if (isShowing()) {
            menuAdapter.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(menuBuilder));
        }
        int measureIndividualMenuWidth = MenuPopup.measureIndividualMenuWidth(menuAdapter, null, this.mContext, this.mMenuMaxWidth);
        j createPopupWindow = createPopupWindow();
        createPopupWindow.setAdapter(menuAdapter);
        PopupWindow popupWindow = createPopupWindow.S;
        createPopupWindow.d(measureIndividualMenuWidth);
        createPopupWindow.E = this.mDropDownGravity;
        if (this.mShowingMenus.size() > 0) {
            s19Var = (s19) b64.c(1, this.mShowingMenus);
            view = findParentViewForSubmenu(s19Var, menuBuilder);
        } else {
            s19Var = null;
            view = null;
        }
        if (view != null) {
            tm10.a(popupWindow, false);
            sm10.a(popupWindow, null);
            int nextMenuPosition = getNextMenuPosition(measureIndividualMenuWidth);
            boolean z = nextMenuPosition == 1;
            this.mLastPosition = nextMenuPosition;
            createPopupWindow.H = view;
            if ((this.mDropDownGravity & 5) != 5) {
                measureIndividualMenuWidth = z ? view.getWidth() : 0 - measureIndividualMenuWidth;
            } else if (!z) {
                measureIndividualMenuWidth = 0 - view.getWidth();
            }
            createPopupWindow.y = measureIndividualMenuWidth;
            createPopupWindow.D = true;
            createPopupWindow.C = true;
            createPopupWindow.setVerticalOffset(0);
        } else {
            if (this.mHasXOffset) {
                createPopupWindow.y = this.mXOffset;
            }
            if (this.mHasYOffset) {
                createPopupWindow.setVerticalOffset(this.mYOffset);
            }
            Rect epicenterBounds = getEpicenterBounds();
            createPopupWindow.Q = epicenterBounds != null ? new Rect(epicenterBounds) : null;
        }
        this.mShowingMenus.add(new s19(createPopupWindow, menuBuilder, this.mLastPosition));
        createPopupWindow.show();
        DropDownListView dropDownListView = createPopupWindow.c;
        dropDownListView.setOnKeyListener(this);
        if (s19Var == null && this.mShowTitle && menuBuilder.getHeaderTitle() != null) {
            FrameLayout frameLayout = (FrameLayout) from.inflate(kvh0.abc_popup_menu_header_item_layout, (ViewGroup) dropDownListView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuBuilder.getHeaderTitle());
            dropDownListView.addHeaderView(frameLayout, null, false);
            createPopupWindow.show();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void addMenu(MenuBuilder menuBuilder) {
        menuBuilder.addMenuPresenter(this, this.mContext);
        if (isShowing()) {
            showMenu(menuBuilder);
        } else {
            this.mPendingMenus.add(menuBuilder);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public boolean closeMenuOnSubMenuOpened() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public void dismiss() {
        int size = this.mShowingMenus.size();
        if (size > 0) {
            s19[] s19VarArr = (s19[]) this.mShowingMenus.toArray(new s19[size]);
            for (int i = size - 1; i >= 0; i--) {
                s19 s19Var = s19VarArr[i];
                if (s19Var.a.S.isShowing()) {
                    s19Var.a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public ListView getListView() {
        if (this.mShowingMenus.isEmpty()) {
            return null;
        }
        return ((s19) b64.c(1, this.mShowingMenus)).a.c;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public boolean isShowing() {
        return this.mShowingMenus.size() > 0 && this.mShowingMenus.get(0).a.S.isShowing();
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        int findIndexOfAddedMenu = findIndexOfAddedMenu(menuBuilder);
        if (findIndexOfAddedMenu < 0) {
            return;
        }
        int i = findIndexOfAddedMenu + 1;
        if (i < this.mShowingMenus.size()) {
            this.mShowingMenus.get(i).b.close(false);
        }
        s19 remove = this.mShowingMenus.remove(findIndexOfAddedMenu);
        MenuBuilder menuBuilder2 = remove.b;
        j jVar = remove.a;
        PopupWindow popupWindow = jVar.S;
        menuBuilder2.removeMenuPresenter(this);
        if (this.mShouldCloseImmediately) {
            sm10.b(popupWindow, null);
            popupWindow.setAnimationStyle(0);
        }
        jVar.dismiss();
        int size = this.mShowingMenus.size();
        if (size > 0) {
            this.mLastPosition = this.mShowingMenus.get(size - 1).c;
        } else {
            this.mLastPosition = getInitialMenuPosition();
        }
        if (size != 0) {
            if (z) {
                this.mShowingMenus.get(0).b.close(false);
                return;
            }
            return;
        }
        dismiss();
        wm10 wm10Var = this.mPresenterCallback;
        if (wm10Var != null) {
            wm10Var.onCloseMenu(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.mTreeObserver;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.mTreeObserver.removeGlobalOnLayoutListener(this.mGlobalLayoutListener);
            }
            this.mTreeObserver = null;
        }
        this.mShownAnchorView.removeOnAttachStateChangeListener(this.mAttachStateChangeListener);
        this.mOnDismissListener.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        s19 s19Var;
        int size = this.mShowingMenus.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                s19Var = null;
                break;
            }
            s19Var = this.mShowingMenus.get(i);
            if (!s19Var.a.S.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (s19Var != null) {
            s19Var.b.close(false);
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
        for (s19 s19Var : this.mShowingMenus) {
            if (subMenuBuilder == s19Var.b) {
                s19Var.a.c.requestFocus();
                return true;
            }
        }
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        addMenu(subMenuBuilder);
        wm10 wm10Var = this.mPresenterCallback;
        if (wm10Var != null) {
            wm10Var.onOpenSubMenu(subMenuBuilder);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setAnchorView(View view) {
        if (this.mAnchorView != view) {
            this.mAnchorView = view;
            this.mDropDownGravity = Gravity.getAbsoluteGravity(this.mRawDropDownGravity, view.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setCallback(wm10 wm10Var) {
        this.mPresenterCallback = wm10Var;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setForceShowIcon(boolean z) {
        this.mForceShowIcon = z;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setGravity(int i) {
        if (this.mRawDropDownGravity != i) {
            this.mRawDropDownGravity = i;
            this.mDropDownGravity = Gravity.getAbsoluteGravity(i, this.mAnchorView.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup
    public void setHorizontalOffset(int i) {
        this.mHasXOffset = true;
        this.mXOffset = i;
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
        this.mHasYOffset = true;
        this.mYOffset = i;
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.q9s0
    public void show() {
        if (isShowing()) {
            return;
        }
        Iterator<MenuBuilder> it = this.mPendingMenus.iterator();
        while (it.hasNext()) {
            showMenu(it.next());
        }
        this.mPendingMenus.clear();
        View view = this.mAnchorView;
        this.mShownAnchorView = view;
        if (view != null) {
            boolean z = this.mTreeObserver == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.mTreeObserver = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.mGlobalLayoutListener);
            }
            this.mShownAnchorView.addOnAttachStateChangeListener(this.mAttachStateChangeListener);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPopup, defpackage.xm10
    public void updateMenuView(boolean z) {
        Iterator<s19> it = this.mShowingMenus.iterator();
        while (it.hasNext()) {
            MenuPopup.toMenuAdapter(it.next().a.c.getAdapter()).notifyDataSetChanged();
        }
    }
}
