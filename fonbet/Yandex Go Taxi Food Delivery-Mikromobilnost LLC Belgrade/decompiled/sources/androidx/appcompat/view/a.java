package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.view.menu.MenuWrapperICS;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import defpackage.uw;
import defpackage.vw;
import defpackage.ycs0;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class a implements uw {
    public final ActionMode.Callback a;
    public final Context b;
    public final ArrayList c = new ArrayList();
    public final ycs0 d = new ycs0();

    public a(Context context, ActionMode.Callback callback) {
        this.b = context;
        this.a = callback;
    }

    @Override // defpackage.uw
    public final boolean a(vw vwVar, MenuItem menuItem) {
        return this.a.onActionItemClicked(e(vwVar), new MenuItemWrapperICS(this.b, (SupportMenuItem) menuItem));
    }

    @Override // defpackage.uw
    public final void b(vw vwVar) {
        this.a.onDestroyActionMode(e(vwVar));
    }

    @Override // defpackage.uw
    public final boolean c(vw vwVar, Menu menu) {
        SupportActionModeWrapper e = e(vwVar);
        ycs0 ycs0Var = this.d;
        Menu menu2 = (Menu) ycs0Var.get(menu);
        if (menu2 == null) {
            menu2 = new MenuWrapperICS(this.b, (SupportMenu) menu);
            ycs0Var.put(menu, menu2);
        }
        return this.a.onCreateActionMode(e, menu2);
    }

    @Override // defpackage.uw
    public final boolean d(vw vwVar, Menu menu) {
        SupportActionModeWrapper e = e(vwVar);
        ycs0 ycs0Var = this.d;
        Menu menu2 = (Menu) ycs0Var.get(menu);
        if (menu2 == null) {
            menu2 = new MenuWrapperICS(this.b, (SupportMenu) menu);
            ycs0Var.put(menu, menu2);
        }
        return this.a.onPrepareActionMode(e, menu2);
    }

    public final SupportActionModeWrapper e(vw vwVar) {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            SupportActionModeWrapper supportActionModeWrapper = (SupportActionModeWrapper) arrayList.get(i);
            if (supportActionModeWrapper != null && supportActionModeWrapper.mWrappedObject == vwVar) {
                return supportActionModeWrapper;
            }
        }
        SupportActionModeWrapper supportActionModeWrapper2 = new SupportActionModeWrapper(this.b, vwVar);
        arrayList.add(supportActionModeWrapper2);
        return supportActionModeWrapper2;
    }
}
