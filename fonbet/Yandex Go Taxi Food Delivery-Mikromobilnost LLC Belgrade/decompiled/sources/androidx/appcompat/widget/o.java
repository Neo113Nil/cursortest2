package androidx.appcompat.widget;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.appcompat.widget.Toolbar;
import defpackage.fbc;
import defpackage.xm10;

/* loaded from: classes10.dex */
public final class o implements xm10 {
    public MenuBuilder a;
    public MenuItemImpl b;
    public final /* synthetic */ Toolbar c;

    public o(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.xm10
    public final boolean collapseItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof fbc) {
            ((fbc) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.mExpandedActionView);
        toolbar.removeView(toolbar.mCollapseButtonView);
        toolbar.mExpandedActionView = null;
        toolbar.addChildrenForExpandedActionView();
        this.b = null;
        toolbar.requestLayout();
        menuItemImpl.setActionViewExpanded(false);
        toolbar.updateBackInvokedCallbackState();
        return true;
    }

    @Override // defpackage.xm10
    public final boolean expandItemActionView(MenuBuilder menuBuilder, MenuItemImpl menuItemImpl) {
        Toolbar toolbar = this.c;
        toolbar.ensureCollapseButtonView();
        ViewParent parent = toolbar.mCollapseButtonView.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
            }
            toolbar.addView(toolbar.mCollapseButtonView);
        }
        View actionView = menuItemImpl.getActionView();
        toolbar.mExpandedActionView = actionView;
        this.b = menuItemImpl;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.mExpandedActionView);
            }
            Toolbar.LayoutParams generateDefaultLayoutParams = toolbar.generateDefaultLayoutParams();
            generateDefaultLayoutParams.gravity = (toolbar.mButtonGravity & 112) | 8388611;
            generateDefaultLayoutParams.mViewType = 2;
            toolbar.mExpandedActionView.setLayoutParams(generateDefaultLayoutParams);
            toolbar.addView(toolbar.mExpandedActionView);
        }
        toolbar.removeChildrenForExpandedActionView();
        toolbar.requestLayout();
        menuItemImpl.setActionViewExpanded(true);
        KeyEvent.Callback callback = toolbar.mExpandedActionView;
        if (callback instanceof fbc) {
            ((fbc) callback).onActionViewExpanded();
        }
        toolbar.updateBackInvokedCallbackState();
        return true;
    }

    @Override // defpackage.xm10
    public final boolean flagActionItems() {
        return false;
    }

    @Override // defpackage.xm10
    public final int getId() {
        return 0;
    }

    @Override // defpackage.xm10
    public final void initForMenu(Context context, MenuBuilder menuBuilder) {
        MenuItemImpl menuItemImpl;
        MenuBuilder menuBuilder2 = this.a;
        if (menuBuilder2 != null && (menuItemImpl = this.b) != null) {
            menuBuilder2.collapseItemActionView(menuItemImpl);
        }
        this.a = menuBuilder;
    }

    @Override // defpackage.xm10
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // defpackage.xm10
    public final void onRestoreInstanceState(Parcelable parcelable) {
    }

    @Override // defpackage.xm10
    public final Parcelable onSaveInstanceState() {
        return null;
    }

    @Override // defpackage.xm10
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        return false;
    }

    @Override // defpackage.xm10
    public final void updateMenuView(boolean z) {
        if (this.b != null) {
            MenuBuilder menuBuilder = this.a;
            if (menuBuilder != null) {
                int size = menuBuilder.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            collapseItemActionView(this.a, this.b);
        }
    }
}
