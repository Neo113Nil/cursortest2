package androidx.appcompat.widget;

import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.MenuBuilder;
import defpackage.an10;
import defpackage.c1x0;
import defpackage.hsz0;
import defpackage.ncs;
import defpackage.sj10;
import defpackage.tw;
import defpackage.va90;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class e implements sj10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ e(ViewGroup viewGroup, int i) {
        this.a = i;
        this.b = viewGroup;
    }

    @Override // defpackage.sj10
    public final boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem) {
        boolean onMenuItemSelected;
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                tw twVar = ((ActionMenuView) viewGroup).mOnMenuItemClickListener;
                if (twVar != null) {
                    Toolbar toolbar = (Toolbar) ((va90) twVar).a;
                    if (toolbar.mMenuHostHelper.c(menuItem)) {
                        onMenuItemSelected = true;
                    } else {
                        hsz0 hsz0Var = toolbar.mOnMenuItemClickListener;
                        onMenuItemSelected = hsz0Var != null ? ((androidx.appcompat.app.n) ((c1x0) hsz0Var).a).b.onMenuItemSelected(0, menuItem) : false;
                    }
                    if (onMenuItemSelected) {
                        break;
                    }
                }
                break;
            default:
                sj10 sj10Var = ((Toolbar) viewGroup).mMenuBuilderCallback;
                if (sj10Var != null && sj10Var.onMenuItemSelected(menuBuilder, menuItem)) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.sj10
    public final void onMenuModeChange(MenuBuilder menuBuilder) {
        int i = this.a;
        ViewGroup viewGroup = this.b;
        switch (i) {
            case 0:
                sj10 sj10Var = ((ActionMenuView) viewGroup).mMenuBuilderCallback;
                if (sj10Var != null) {
                    sj10Var.onMenuModeChange(menuBuilder);
                    break;
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) viewGroup;
                if (!toolbar.mMenuView.isOverflowMenuShowing()) {
                    Iterator it = toolbar.mMenuHostHelper.b.iterator();
                    while (it.hasNext()) {
                        ((ncs) ((an10) it.next())).a.t(menuBuilder);
                    }
                }
                sj10 sj10Var2 = toolbar.mMenuBuilderCallback;
                if (sj10Var2 != null) {
                    sj10Var2.onMenuModeChange(menuBuilder);
                    break;
                }
                break;
        }
    }
}
