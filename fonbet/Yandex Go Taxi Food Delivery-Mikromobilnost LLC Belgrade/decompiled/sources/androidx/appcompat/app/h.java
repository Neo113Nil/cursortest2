package androidx.appcompat.app;

import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import defpackage.cr2;
import defpackage.np31;
import defpackage.uw;
import defpackage.vw;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public final class h implements uw {
    public final uw a;
    public final /* synthetic */ AppCompatDelegateImpl b;

    public h(AppCompatDelegateImpl appCompatDelegateImpl, uw uwVar) {
        this.b = appCompatDelegateImpl;
        this.a = uwVar;
    }

    @Override // defpackage.uw
    public final boolean a(vw vwVar, MenuItem menuItem) {
        return this.a.a(vwVar, menuItem);
    }

    @Override // defpackage.uw
    public final void b(vw vwVar) {
        this.a.b(vwVar);
        AppCompatDelegateImpl appCompatDelegateImpl = this.b;
        if (appCompatDelegateImpl.mActionModePopup != null) {
            appCompatDelegateImpl.mWindow.getDecorView().removeCallbacks(appCompatDelegateImpl.mShowActionModePopup);
        }
        if (appCompatDelegateImpl.mActionModeView != null) {
            appCompatDelegateImpl.endOnGoingFadeAnimation();
            androidx.core.view.d c = androidx.core.view.b.c(appCompatDelegateImpl.mActionModeView);
            c.a(0.0f);
            appCompatDelegateImpl.mFadeAnim = c;
            c.d(new e(2, this));
        }
        cr2 cr2Var = appCompatDelegateImpl.mAppCompatCallback;
        if (cr2Var != null) {
            cr2Var.onSupportActionModeFinished(appCompatDelegateImpl.mActionMode);
        }
        appCompatDelegateImpl.mActionMode = null;
        ViewGroup viewGroup = appCompatDelegateImpl.mSubDecor;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(viewGroup);
        appCompatDelegateImpl.updateBackInvokedCallbackState();
    }

    @Override // defpackage.uw
    public final boolean c(vw vwVar, Menu menu) {
        return this.a.c(vwVar, menu);
    }

    @Override // defpackage.uw
    public final boolean d(vw vwVar, Menu menu) {
        ViewGroup viewGroup = this.b.mSubDecor;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        np31.c(viewGroup);
        return this.a.d(vwVar, menu);
    }
}
