package xsna;

import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.vk.core.view.components.search.VkSearchView;
import xsna.l0i0;

/* compiled from: MenuItemCompat.java */
/* loaded from: classes11.dex */
public final class m720 implements MenuItem.OnActionExpandListener {
    public final /* synthetic */ l0i0.a b;

    public m720(l0i0.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        l0i0.a aVar = this.b;
        MenuItem menuItem2 = aVar.b;
        Menu menu = aVar.a;
        l0i0 l0i0Var = l0i0.this;
        l0i0Var.e = false;
        Activity activity = l0i0Var.g;
        l0i0.c cVar = l0i0Var.f;
        if (cVar != null) {
            cVar.sg(false);
        }
        mhy.b(activity);
        if (!l0i0Var.n) {
            activity.onBackPressed();
            return true;
        }
        l0i0Var.h.setQuery("");
        l0i0Var.a.a("");
        for (int i = 0; i < menu.size(); i++) {
            if (menu.getItem(i) != menuItem2 && l0i0Var.l != null) {
                menu.getItem(i).setVisible(l0i0Var.l[i]);
            }
        }
        menuItem2.setVisible(true);
        Toolbar toolbar = l0i0Var.k;
        ViewGroup.LayoutParams layoutParams = toolbar == null ? null : toolbar.getLayoutParams();
        if (layoutParams instanceof AppBarLayout.d) {
            ((AppBarLayout.d) layoutParams).a = l0i0Var.m;
        }
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        l0i0.a aVar = this.b;
        Menu menu = aVar.a;
        l0i0 l0i0Var = l0i0.this;
        l0i0Var.e = true;
        VkSearchView vkSearchView = l0i0Var.h;
        l0i0.c cVar = l0i0Var.f;
        if (cVar != null) {
            cVar.sg(true);
        }
        vkSearchView.e5();
        vkSearchView.a5();
        l0i0Var.l = new boolean[menu.size()];
        for (int i = 0; i < menu.size(); i++) {
            if (menu.getItem(i) != aVar.b) {
                l0i0Var.l[i] = menu.getItem(i).isVisible();
                menu.getItem(i).setVisible(false);
            }
        }
        Toolbar toolbar = l0i0Var.k;
        ViewGroup.LayoutParams layoutParams = toolbar == null ? null : toolbar.getLayoutParams();
        if (layoutParams instanceof AppBarLayout.d) {
            AppBarLayout.d dVar = (AppBarLayout.d) layoutParams;
            l0i0Var.m = dVar.a;
            dVar.a = 0;
        }
        return true;
    }
}
