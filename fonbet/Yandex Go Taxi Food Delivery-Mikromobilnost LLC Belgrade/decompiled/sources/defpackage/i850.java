package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.x0;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuPresenter;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class i850 extends RecyclerView.Adapter {
    public final ArrayList a = new ArrayList();
    public MenuItemImpl b;
    public boolean c;
    public final /* synthetic */ NavigationMenuPresenter w;

    public i850(NavigationMenuPresenter navigationMenuPresenter) {
        this.w = navigationMenuPresenter;
        f();
    }

    public final void f() {
        if (this.c) {
            return;
        }
        this.c = true;
        ArrayList arrayList = this.a;
        arrayList.clear();
        arrayList.add(new j850());
        NavigationMenuPresenter navigationMenuPresenter = this.w;
        int size = navigationMenuPresenter.c.getVisibleItems().size();
        boolean z = false;
        int i = -1;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        while (i2 < size) {
            MenuItemImpl menuItemImpl = navigationMenuPresenter.c.getVisibleItems().get(i2);
            if (menuItemImpl.isChecked()) {
                g(menuItemImpl);
            }
            if (menuItemImpl.isCheckable()) {
                menuItemImpl.setExclusiveCheckable(z);
            }
            if (menuItemImpl.hasSubMenu()) {
                SubMenu subMenu = menuItemImpl.getSubMenu();
                if (subMenu.hasVisibleItems()) {
                    if (i2 != 0) {
                        arrayList.add(new l850(navigationMenuPresenter.T, z ? 1 : 0));
                    }
                    arrayList.add(new m850(menuItemImpl));
                    int size2 = subMenu.size();
                    int i4 = z ? 1 : 0;
                    int i5 = i4;
                    while (i4 < size2) {
                        MenuItemImpl menuItemImpl2 = (MenuItemImpl) subMenu.getItem(i4);
                        if (menuItemImpl2.isVisible()) {
                            if (i5 == 0 && menuItemImpl2.getIcon() != null) {
                                i5 = 1;
                            }
                            if (menuItemImpl2.isCheckable()) {
                                menuItemImpl2.setExclusiveCheckable(z);
                            }
                            if (menuItemImpl2.isChecked()) {
                                g(menuItemImpl2);
                            }
                            arrayList.add(new m850(menuItemImpl2));
                        }
                        i4++;
                        z = false;
                    }
                    if (i5 != 0) {
                        int size3 = arrayList.size();
                        for (int size4 = arrayList.size(); size4 < size3; size4++) {
                            ((m850) arrayList.get(size4)).b = true;
                        }
                    }
                }
            } else {
                int groupId = menuItemImpl.getGroupId();
                if (groupId != i) {
                    i3 = arrayList.size();
                    z2 = menuItemImpl.getIcon() != null;
                    if (i2 != 0) {
                        i3++;
                        int i6 = navigationMenuPresenter.T;
                        arrayList.add(new l850(i6, i6));
                    }
                } else if (!z2 && menuItemImpl.getIcon() != null) {
                    int size5 = arrayList.size();
                    for (int i7 = i3; i7 < size5; i7++) {
                        ((m850) arrayList.get(i7)).b = true;
                    }
                    z2 = true;
                }
                m850 m850Var = new m850(menuItemImpl);
                m850Var.b = z2;
                arrayList.add(m850Var);
                i = groupId;
            }
            i2++;
            z = false;
        }
        this.c = z;
    }

    public final void g(MenuItemImpl menuItemImpl) {
        if (this.b == menuItemImpl || !menuItemImpl.isCheckable()) {
            return;
        }
        MenuItemImpl menuItemImpl2 = this.b;
        if (menuItemImpl2 != null) {
            menuItemImpl2.setChecked(false);
        }
        this.b = menuItemImpl;
        menuItemImpl.setChecked(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        k850 k850Var = (k850) this.a.get(i);
        if (k850Var instanceof l850) {
            return 2;
        }
        if (k850Var instanceof j850) {
            return 3;
        }
        if (k850Var instanceof m850) {
            return ((m850) k850Var).a.hasSubMenu() ? 1 : 0;
        }
        kbs.g("Unknown item type.");
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(x0 x0Var, int i) {
        p850 p850Var = (p850) x0Var;
        int itemViewType = getItemViewType(i);
        ArrayList arrayList = this.a;
        NavigationMenuPresenter navigationMenuPresenter = this.w;
        if (itemViewType != 0) {
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                l850 l850Var = (l850) arrayList.get(i);
                p850Var.a.setPaddingRelative(navigationMenuPresenter.L, l850Var.a, navigationMenuPresenter.M, l850Var.b);
                return;
            }
            TextView textView = (TextView) p850Var.a;
            textView.setText(((m850) arrayList.get(i)).a.getTitle());
            textView.setTextAppearance(navigationMenuPresenter.z);
            textView.setPaddingRelative(navigationMenuPresenter.N, textView.getPaddingTop(), navigationMenuPresenter.O, textView.getPaddingBottom());
            ColorStateList colorStateList = navigationMenuPresenter.A;
            if (colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
            b.p(textView, new h850(this, i, true));
            return;
        }
        NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) p850Var.a;
        navigationMenuItemView.setIconTintList(navigationMenuPresenter.E);
        navigationMenuItemView.setTextAppearance(navigationMenuPresenter.B);
        ColorStateList colorStateList2 = navigationMenuPresenter.D;
        if (colorStateList2 != null) {
            navigationMenuItemView.setTextColor(colorStateList2);
        }
        Drawable drawable = navigationMenuPresenter.F;
        navigationMenuItemView.setBackground(drawable != null ? drawable.getConstantState().newDrawable() : null);
        RippleDrawable rippleDrawable = navigationMenuPresenter.G;
        if (rippleDrawable != null) {
            navigationMenuItemView.setForeground(rippleDrawable.getConstantState().newDrawable());
        }
        m850 m850Var = (m850) arrayList.get(i);
        navigationMenuItemView.setNeedsEmptyIcon(m850Var.b);
        int i2 = navigationMenuPresenter.H;
        int i3 = navigationMenuPresenter.I;
        navigationMenuItemView.setPadding(i2, i3, i2, i3);
        navigationMenuItemView.setIconPadding(navigationMenuPresenter.J);
        if (navigationMenuPresenter.P) {
            navigationMenuItemView.setIconSize(navigationMenuPresenter.K);
        }
        navigationMenuItemView.setMaxLines(navigationMenuPresenter.R);
        navigationMenuItemView.initialize(m850Var.a, navigationMenuPresenter.C);
        b.p(navigationMenuItemView, new h850(this, i, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final x0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        NavigationMenuPresenter navigationMenuPresenter = this.w;
        if (i == 0) {
            LayoutInflater layoutInflater = navigationMenuPresenter.y;
            View.OnClickListener onClickListener = navigationMenuPresenter.V;
            View inflate = layoutInflater.inflate(jvh0.design_navigation_item, viewGroup, false);
            o850 o850Var = new o850(inflate);
            inflate.setOnClickListener(onClickListener);
            return o850Var;
        }
        if (i == 1) {
            return new g850(navigationMenuPresenter.y.inflate(jvh0.design_navigation_item_subheader, viewGroup, false));
        }
        if (i == 2) {
            return new g850(navigationMenuPresenter.y.inflate(jvh0.design_navigation_item_separator, viewGroup, false));
        }
        if (i != 3) {
            return null;
        }
        return new g850(navigationMenuPresenter.b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(x0 x0Var) {
        p850 p850Var = (p850) x0Var;
        if (p850Var instanceof o850) {
            ((NavigationMenuItemView) p850Var.a).recycle();
        }
    }
}
