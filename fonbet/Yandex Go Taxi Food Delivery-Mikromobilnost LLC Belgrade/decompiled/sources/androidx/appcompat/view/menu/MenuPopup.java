package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import defpackage.q9s0;
import defpackage.wm10;
import defpackage.xm10;
import defpackage.xn10;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes10.dex */
public abstract class MenuPopup implements q9s0, xm10, AdapterView.OnItemClickListener {
    private Rect mEpicenterBounds;

    public static int measureIndividualMenuWidth(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean shouldPreserveIconSpacing(MenuBuilder menuBuilder) {
        int size = menuBuilder.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuBuilder.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static MenuAdapter toMenuAdapter(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (MenuAdapter) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (MenuAdapter) listAdapter;
    }

    public abstract void addMenu(MenuBuilder menuBuilder);

    public boolean closeMenuOnSubMenuOpened() {
        return true;
    }

    @Override // defpackage.xm10
    public boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.q9s0
    public abstract /* synthetic */ void dismiss();

    @Override // defpackage.xm10
    public boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    public abstract /* synthetic */ boolean flagActionItems();

    public Rect getEpicenterBounds() {
        return this.mEpicenterBounds;
    }

    @Override // defpackage.xm10
    public int getId() {
        return 0;
    }

    @Override // defpackage.q9s0
    public abstract /* synthetic */ ListView getListView();

    public xn10 getMenuView(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // defpackage.xm10
    public void initForMenu(Context context, MenuBuilder menuBuilder) {
    }

    @Override // defpackage.q9s0
    public abstract /* synthetic */ boolean isShowing();

    public abstract /* synthetic */ void onCloseMenu(MenuBuilder menuBuilder, boolean z);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        toMenuAdapter(listAdapter).mAdapterMenu.performItemAction((MenuItem) listAdapter.getItem(i), this, closeMenuOnSubMenuOpened() ? 0 : 4);
    }

    public abstract /* synthetic */ void onRestoreInstanceState(Parcelable parcelable);

    public abstract /* synthetic */ Parcelable onSaveInstanceState();

    public abstract /* synthetic */ boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder);

    public abstract void setAnchorView(View view);

    public abstract /* synthetic */ void setCallback(wm10 wm10Var);

    public void setEpicenterBounds(Rect rect) {
        this.mEpicenterBounds = rect;
    }

    public abstract void setForceShowIcon(boolean z);

    public abstract void setGravity(int i);

    public abstract void setHorizontalOffset(int i);

    public abstract void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener);

    public abstract void setShowTitle(boolean z);

    public abstract void setVerticalOffset(int i);

    @Override // defpackage.q9s0
    public abstract /* synthetic */ void show();

    public abstract /* synthetic */ void updateMenuView(boolean z);
}
