package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import defpackage.wl10;

/* loaded from: classes10.dex */
public final class j extends i implements wl10 {
    public wl10 T;

    @Override // defpackage.wl10
    public final void a(MenuBuilder menuBuilder, MenuItem menuItem) {
        wl10 wl10Var = this.T;
        if (wl10Var != null) {
            wl10Var.a(menuBuilder, menuItem);
        }
    }

    @Override // defpackage.wl10
    public final void b(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        wl10 wl10Var = this.T;
        if (wl10Var != null) {
            wl10Var.b(menuBuilder, menuItemImpl);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.appcompat.widget.DropDownListView, androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView] */
    @Override // androidx.appcompat.widget.i
    public final DropDownListView c(final Context context, final boolean z) {
        ?? r0 = new DropDownListView(context, z) { // from class: androidx.appcompat.widget.MenuPopupWindow$MenuDropDownListView
            final int mAdvanceKey;
            private wl10 mHoverListener;
            private MenuItem mHoveredMenuItem;
            final int mRetreatKey;

            {
                super(context, z);
                if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                    this.mAdvanceKey = 21;
                    this.mRetreatKey = 22;
                } else {
                    this.mAdvanceKey = 22;
                    this.mRetreatKey = 21;
                }
            }

            public void clearSelection() {
                setSelection(-1);
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.ViewGroup, android.view.View
            public /* bridge */ /* synthetic */ boolean hasFocus() {
                return super.hasFocus();
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.View
            public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
                return super.hasWindowFocus();
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.View
            public /* bridge */ /* synthetic */ boolean isFocused() {
                return super.isFocused();
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.View
            public /* bridge */ /* synthetic */ boolean isInTouchMode() {
                return super.isInTouchMode();
            }

            @Override // androidx.appcompat.widget.DropDownListView
            public /* bridge */ /* synthetic */ int lookForSelectablePosition(int i, boolean z2) {
                return super.lookForSelectablePosition(i, z2);
            }

            @Override // androidx.appcompat.widget.DropDownListView
            public /* bridge */ /* synthetic */ int measureHeightOfChildrenCompat(int i, int i2, int i3, int i4, int i5) {
                return super.measureHeightOfChildrenCompat(i, i2, i3, i4, i5);
            }

            @Override // androidx.appcompat.widget.DropDownListView
            public /* bridge */ /* synthetic */ boolean onForwardedEvent(MotionEvent motionEvent, int i) {
                return super.onForwardedEvent(motionEvent, i);
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.view.View
            public boolean onHoverEvent(MotionEvent motionEvent) {
                MenuAdapter menuAdapter;
                int i;
                int pointToPosition;
                int i2;
                if (this.mHoverListener != null) {
                    ListAdapter adapter = getAdapter();
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i = headerViewListAdapter.getHeadersCount();
                        menuAdapter = (MenuAdapter) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        menuAdapter = (MenuAdapter) adapter;
                        i = 0;
                    }
                    MenuItemImpl item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= menuAdapter.getCount()) ? null : menuAdapter.getItem(i2);
                    MenuItem menuItem = this.mHoveredMenuItem;
                    if (menuItem != item) {
                        MenuBuilder adapterMenu = menuAdapter.getAdapterMenu();
                        if (menuItem != null) {
                            this.mHoverListener.a(adapterMenu, menuItem);
                        }
                        this.mHoveredMenuItem = item;
                        if (item != null) {
                            this.mHoverListener.b(adapterMenu, item);
                        }
                    }
                }
                return super.onHoverEvent(motionEvent);
            }

            @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
            public boolean onKeyDown(int i, KeyEvent keyEvent) {
                ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
                if (listMenuItemView != null && i == this.mAdvanceKey) {
                    if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                        performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                    }
                    return true;
                }
                if (listMenuItemView == null || i != this.mRetreatKey) {
                    return super.onKeyDown(i, keyEvent);
                }
                setSelection(-1);
                ListAdapter adapter = getAdapter();
                (adapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (MenuAdapter) adapter).getAdapterMenu().close(false);
                return true;
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView, android.view.View
            public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
                return super.onTouchEvent(motionEvent);
            }

            public void setHoverListener(wl10 wl10Var) {
                this.mHoverListener = wl10Var;
            }

            @Override // androidx.appcompat.widget.DropDownListView, android.widget.AbsListView
            public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
                super.setSelector(drawable);
            }
        };
        r0.setHoverListener(this);
        return r0;
    }
}
