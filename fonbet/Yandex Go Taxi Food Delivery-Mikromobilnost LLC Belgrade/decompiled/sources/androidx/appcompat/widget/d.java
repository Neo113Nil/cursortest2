package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import defpackage.d45;
import defpackage.ex;
import defpackage.gx;
import defpackage.kvh0;
import defpackage.ny61;
import defpackage.qw;
import defpackage.rw;
import defpackage.ryh;
import defpackage.tqs;
import defpackage.vr;
import defpackage.wm10;
import defpackage.wn10;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class d extends d45 implements ex {
    public ActionMenuPresenter$OverflowMenuButton C;
    public Drawable D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public final SparseBooleanArray L;
    public qw M;
    public qw N;
    public tqs O;
    public rw P;
    public final ryh Q;
    public int R;

    public d(Context context) {
        int i = kvh0.abc_action_menu_layout;
        int i2 = kvh0.abc_action_menu_item_layout;
        this.a = context;
        this.w = LayoutInflater.from(context);
        this.y = i;
        this.z = i2;
        this.L = new SparseBooleanArray();
        this.Q = new ryh(8, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [wn10] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View a(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            ActionMenuItemView actionMenuItemView = view instanceof wn10 ? (wn10) view : (wn10) this.w.inflate(this.z, viewGroup, false);
            actionMenuItemView.initialize(menuItemImpl, 0);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.A);
            if (this.P == null) {
                this.P = new rw(this);
            }
            actionMenuItemView2.setPopupCallback(this.P);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final boolean b() {
        Object obj;
        tqs tqsVar = this.O;
        if (tqsVar != null && (obj = this.A) != null) {
            ((View) obj).removeCallbacks(tqsVar);
            this.O = null;
            return true;
        }
        qw qwVar = this.M;
        if (qwVar == null) {
            return false;
        }
        qwVar.a();
        return true;
    }

    public final boolean c() {
        qw qwVar = this.M;
        return qwVar != null && qwVar.c();
    }

    public final void d() {
        this.K = true;
    }

    public final boolean e() {
        MenuBuilder menuBuilder;
        boolean z = false;
        if (!this.F || c() || (menuBuilder = this.c) == null || this.A == null || this.O != null || menuBuilder.getNonActionItems().isEmpty()) {
            return false;
        }
        tqs tqsVar = new tqs(this, new qw(this, this.b, this.c, this.C), z, 1);
        this.O = tqsVar;
        ((View) this.A).post(tqsVar);
        return true;
    }

    @Override // defpackage.xm10
    public final boolean flagActionItems() {
        ArrayList<MenuItemImpl> arrayList;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        MenuBuilder menuBuilder = this.c;
        View view = null;
        boolean z4 = false;
        if (menuBuilder != null) {
            arrayList = menuBuilder.getVisibleItems();
            i = arrayList.size();
        } else {
            arrayList = null;
            i = 0;
        }
        int i2 = this.J;
        int i3 = this.I;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.A;
        int i4 = 0;
        boolean z5 = false;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            z = true;
            if (i4 >= i) {
                break;
            }
            MenuItemImpl menuItemImpl = arrayList.get(i4);
            if (menuItemImpl.requiresActionButton()) {
                i5++;
            } else if (menuItemImpl.requestsActionButton()) {
                i6++;
            } else {
                z5 = true;
            }
            if (this.K && menuItemImpl.isActionViewExpanded()) {
                i2 = 0;
            }
            i4++;
        }
        if (this.F && (z5 || i6 + i5 > i2)) {
            i2--;
        }
        int i7 = i2 - i5;
        SparseBooleanArray sparseBooleanArray = this.L;
        sparseBooleanArray.clear();
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            MenuItemImpl menuItemImpl2 = arrayList.get(i8);
            if (menuItemImpl2.requiresActionButton()) {
                View a = a(menuItemImpl2, view, viewGroup);
                a.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = a.getMeasuredWidth();
                i3 -= measuredWidth;
                if (i9 == 0) {
                    i9 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z);
                }
                menuItemImpl2.setIsActionButton(z);
                z2 = z4;
                z3 = z;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z6 = sparseBooleanArray.get(groupId2);
                boolean z7 = ((i7 > 0 || z6) && i3 > 0) ? z : z4;
                if (z7) {
                    View a2 = a(menuItemImpl2, view, viewGroup);
                    a2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = a2.getMeasuredWidth();
                    i3 -= measuredWidth2;
                    if (i9 == 0) {
                        i9 = measuredWidth2;
                    }
                    z7 &= i3 + i9 > 0 ? z : false;
                }
                boolean z8 = z7;
                if (z8 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z);
                } else if (z6) {
                    sparseBooleanArray.put(groupId2, false);
                    int i10 = 0;
                    while (i10 < i8) {
                        MenuItemImpl menuItemImpl3 = arrayList.get(i10);
                        boolean z9 = z;
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i7++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                        i10++;
                        z = z9;
                    }
                }
                z3 = z;
                if (z8) {
                    i7--;
                }
                menuItemImpl2.setIsActionButton(z8);
                z2 = false;
            } else {
                z2 = z4;
                z3 = z;
                menuItemImpl2.setIsActionButton(z2);
            }
            i8++;
            z4 = z2;
            z = z3;
            view = null;
        }
        return z;
    }

    @Override // defpackage.xm10
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        this.b = context;
        LayoutInflater.from(context);
        this.c = menuBuilder;
        Resources resources = context.getResources();
        vr d = vr.d(context);
        if (!this.G) {
            this.F = true;
        }
        this.H = d.a.getResources().getDisplayMetrics().widthPixels / 2;
        this.J = d.e();
        int i = this.H;
        if (this.F) {
            if (this.C == null) {
                ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = new ActionMenuPresenter$OverflowMenuButton(this, this.a);
                this.C = actionMenuPresenter$OverflowMenuButton;
                if (this.E) {
                    actionMenuPresenter$OverflowMenuButton.setImageDrawable(this.D);
                    this.D = null;
                    this.E = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.C.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.C.getMeasuredWidth();
        } else {
            this.C = null;
        }
        this.I = i;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.xm10
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
        b();
        qw qwVar = this.N;
        if (qwVar != null) {
            qwVar.a();
        }
        wm10 wm10Var = this.x;
        if (wm10Var != null) {
            wm10Var.onCloseMenu(menuBuilder, z);
        }
    }

    @Override // defpackage.xm10
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof ActionMenuPresenter$SavedState) && (i = ((ActionMenuPresenter$SavedState) parcelable).openSubMenuId) > 0 && (findItem = this.c.findItem(i)) != null) {
            onSubMenuSelected((SubMenuBuilder) findItem.getSubMenu());
        }
    }

    @Override // defpackage.xm10
    public final Parcelable onSaveInstanceState() {
        ActionMenuPresenter$SavedState actionMenuPresenter$SavedState = new ActionMenuPresenter$SavedState();
        actionMenuPresenter$SavedState.openSubMenuId = this.R;
        return actionMenuPresenter$SavedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm10
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z;
        if (subMenuBuilder.hasVisibleItems()) {
            SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
            while (subMenuBuilder2.getParentMenu() != this.c) {
                subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.getParentMenu();
            }
            MenuItem item = subMenuBuilder2.getItem();
            ViewGroup viewGroup = (ViewGroup) this.A;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof wn10) && ((wn10) childAt).getItemData() == item) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.R = subMenuBuilder.getItem().getItemId();
                int size = subMenuBuilder.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item2 = subMenuBuilder.getItem(i2);
                    if (item2.isVisible() && item2.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                qw qwVar = new qw(this, this.b, subMenuBuilder, view);
                this.N = qwVar;
                qwVar.e(z);
                qw qwVar2 = this.N;
                if (!qwVar2.c()) {
                    if (qwVar2.f == null) {
                        ny61.r("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    qwVar2.g(0, 0, false, false);
                }
                wm10 wm10Var = this.x;
                if (wm10Var != null) {
                    wm10Var.onOpenSubMenu(subMenuBuilder);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm10
    public final void updateMenuView(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.A;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuBuilder menuBuilder = this.c;
            if (menuBuilder != null) {
                menuBuilder.flagActionItems();
                ArrayList<MenuItemImpl> visibleItems = this.c.getVisibleItems();
                int size = visibleItems.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItemImpl menuItemImpl = visibleItems.get(i2);
                    if (menuItemImpl.isActionButton()) {
                        View childAt = viewGroup.getChildAt(i);
                        MenuItemImpl itemData = childAt instanceof wn10 ? ((wn10) childAt).getItemData() : null;
                        View a = a(menuItemImpl, childAt, viewGroup);
                        if (menuItemImpl != itemData) {
                            a.setPressed(false);
                            a.jumpDrawablesToCurrentState();
                        }
                        if (a != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) a.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(a);
                            }
                            ((ViewGroup) this.A).addView(a, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.C) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A).requestLayout();
        MenuBuilder menuBuilder2 = this.c;
        if (menuBuilder2 != null) {
            ArrayList<MenuItemImpl> actionItems = menuBuilder2.getActionItems();
            int size2 = actionItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                gx supportActionProvider = actionItems.get(i3).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        MenuBuilder menuBuilder3 = this.c;
        ArrayList<MenuItemImpl> nonActionItems = menuBuilder3 != null ? menuBuilder3.getNonActionItems() : null;
        if (this.F && nonActionItems != null) {
            int size3 = nonActionItems.size();
            if (size3 == 1) {
                z2 = !nonActionItems.get(0).isActionViewExpanded();
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        ActionMenuPresenter$OverflowMenuButton actionMenuPresenter$OverflowMenuButton = this.C;
        if (z2) {
            if (actionMenuPresenter$OverflowMenuButton == null) {
                this.C = new ActionMenuPresenter$OverflowMenuButton(this, this.a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.C.getParent();
            if (viewGroup3 != this.A) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.C);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.A;
                actionMenuView.addView(this.C, actionMenuView.generateOverflowButtonLayoutParams());
            }
        } else if (actionMenuPresenter$OverflowMenuButton != null) {
            Object parent = actionMenuPresenter$OverflowMenuButton.getParent();
            Object obj = this.A;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.C);
            }
        }
        ((ActionMenuView) this.A).setOverflowReserved(this.F);
    }
}
