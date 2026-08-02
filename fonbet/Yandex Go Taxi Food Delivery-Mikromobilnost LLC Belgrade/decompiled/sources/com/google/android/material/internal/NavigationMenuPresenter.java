package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import defpackage.i850;
import defpackage.k850;
import defpackage.l850;
import defpackage.m850;
import defpackage.org0;
import defpackage.xm10;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public class NavigationMenuPresenter implements xm10 {
    public ColorStateList A;
    public ColorStateList D;
    public ColorStateList E;
    public Drawable F;
    public RippleDrawable G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public boolean P;
    public int R;
    public int S;
    public int T;
    public NavigationMenuView a;
    public LinearLayout b;
    public MenuBuilder c;
    public int w;
    public i850 x;
    public LayoutInflater y;
    public int z = 0;
    public int B = 0;
    public boolean C = true;
    public boolean Q = true;
    public int U = -1;
    public final View.OnClickListener V = new View.OnClickListener() { // from class: com.google.android.material.internal.NavigationMenuPresenter.1
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) view;
            i850 i850Var = NavigationMenuPresenter.this.x;
            boolean z = true;
            if (i850Var != null) {
                i850Var.c = true;
            }
            MenuItemImpl itemData = navigationMenuItemView.getItemData();
            NavigationMenuPresenter navigationMenuPresenter = NavigationMenuPresenter.this;
            boolean performItemAction = navigationMenuPresenter.c.performItemAction(itemData, navigationMenuPresenter, 0);
            if (itemData != null && itemData.isCheckable() && performItemAction) {
                NavigationMenuPresenter.this.x.g(itemData);
            } else {
                z = false;
            }
            NavigationMenuPresenter navigationMenuPresenter2 = NavigationMenuPresenter.this;
            i850 i850Var2 = navigationMenuPresenter2.x;
            if (i850Var2 != null) {
                i850Var2.c = false;
            }
            if (z) {
                navigationMenuPresenter2.updateMenuView(false);
            }
        }
    };

    public final void a() {
        i850 i850Var = this.x;
        if (i850Var != null) {
            ArrayList arrayList = i850Var.a;
            for (int i = 0; i < arrayList.size(); i++) {
                if (arrayList.get(i) instanceof l850) {
                    i850Var.notifyItemChanged(i);
                }
            }
        }
    }

    public final void b() {
        i850 i850Var = this.x;
        if (i850Var != null) {
            ArrayList arrayList = i850Var.a;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof m850) && i850Var.getItemViewType(i) == 1) {
                    i850Var.notifyItemChanged(i);
                }
            }
        }
    }

    public final void c() {
        i850 i850Var = this.x;
        if (i850Var != null) {
            ArrayList arrayList = i850Var.a;
            for (int i = 0; i < arrayList.size(); i++) {
                if ((arrayList.get(i) instanceof m850) && i850Var.getItemViewType(i) == 0) {
                    i850Var.notifyItemChanged(i);
                }
            }
        }
    }

    @Override // defpackage.xm10
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.xm10
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // defpackage.xm10
    public final boolean flagActionItems() {
        return false;
    }

    @Override // defpackage.xm10
    public final int getId() {
        return this.w;
    }

    @Override // defpackage.xm10
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.y = LayoutInflater.from(context);
        this.c = menuBuilder;
        this.T = context.getResources().getDimensionPixelOffset(org0.design_navigation_separator_vertical_padding);
    }

    @Override // defpackage.xm10
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // defpackage.xm10
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItemImpl menuItemImpl;
        View actionView;
        ParcelableSparseArray parcelableSparseArray;
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ListMenuPresenter.VIEWS_TAG);
            if (sparseParcelableArray != null) {
                this.a.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle("android:menu:adapter");
            if (bundle2 != null) {
                i850 i850Var = this.x;
                ArrayList arrayList = i850Var.a;
                int i = bundle2.getInt("android:menu:checked", 0);
                if (i != 0) {
                    i850Var.c = true;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        }
                        k850 k850Var = (k850) arrayList.get(i2);
                        if (k850Var instanceof m850) {
                            MenuItemImpl menuItemImpl2 = ((m850) k850Var).a;
                            if (menuItemImpl2.getItemId() == i) {
                                i850Var.g(menuItemImpl2);
                                break;
                            }
                        }
                        i2++;
                    }
                    i850Var.c = false;
                    i850Var.f();
                }
                SparseArray sparseParcelableArray2 = bundle2.getSparseParcelableArray("android:menu:action_views");
                if (sparseParcelableArray2 != null) {
                    int size2 = arrayList.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        k850 k850Var2 = (k850) arrayList.get(i3);
                        if ((k850Var2 instanceof m850) && (actionView = (menuItemImpl = ((m850) k850Var2).a).getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray2.get(menuItemImpl.getItemId())) != null) {
                            actionView.restoreHierarchyState(parcelableSparseArray);
                        }
                    }
                }
            }
            SparseArray<Parcelable> sparseParcelableArray3 = bundle.getSparseParcelableArray("android:menu:header");
            if (sparseParcelableArray3 != null) {
                this.b.restoreHierarchyState(sparseParcelableArray3);
            }
        }
    }

    @Override // defpackage.xm10
    public final Parcelable onSaveInstanceState() {
        MenuItemImpl menuItemImpl;
        View actionView;
        Bundle bundle = new Bundle();
        if (this.a != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.a.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ListMenuPresenter.VIEWS_TAG, sparseArray);
        }
        i850 i850Var = this.x;
        if (i850Var != null) {
            ArrayList arrayList = i850Var.a;
            Bundle bundle2 = new Bundle();
            MenuItemImpl menuItemImpl2 = i850Var.b;
            if (menuItemImpl2 != null) {
                bundle2.putInt("android:menu:checked", menuItemImpl2.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray2 = new SparseArray<>();
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                k850 k850Var = (k850) arrayList.get(i);
                if ((k850Var instanceof m850) && (actionView = (menuItemImpl = ((m850) k850Var).a).getActionView()) != null) {
                    ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                    actionView.saveHierarchyState(parcelableSparseArray);
                    sparseArray2.put(menuItemImpl.getItemId(), parcelableSparseArray);
                }
            }
            bundle2.putSparseParcelableArray("android:menu:action_views", sparseArray2);
            bundle.putBundle("android:menu:adapter", bundle2);
        }
        if (this.b != null) {
            SparseArray<Parcelable> sparseArray3 = new SparseArray<>();
            this.b.saveHierarchyState(sparseArray3);
            bundle.putSparseParcelableArray("android:menu:header", sparseArray3);
        }
        return bundle;
    }

    @Override // defpackage.xm10
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // defpackage.xm10
    public final void updateMenuView(boolean z) {
        i850 i850Var = this.x;
        if (i850Var != null) {
            ArrayList arrayList = i850Var.a;
            int size = arrayList.size();
            i850Var.f();
            i850Var.notifyDataSetChanged();
            if (size == arrayList.size()) {
                i850Var.notifyItemRangeChanged(0, arrayList.size());
            }
        }
    }
}
