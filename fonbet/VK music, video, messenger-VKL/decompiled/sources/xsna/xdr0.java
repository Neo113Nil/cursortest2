package xsna;

import android.app.Activity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import me.grishka.appkit.fragments.AppKitFragment;
import xsna.ify;
import xsna.xbs;

/* compiled from: VKNavigationDelegate.kt */
/* loaded from: classes.dex */
public abstract class xdr0<T extends Activity & xbs> extends ww50<T> implements ify.a {
    public xdr0() {
        throw null;
    }

    @Override // xsna.ww50
    public void G() {
        int i = ify.a;
        ify.g(this);
        pjk0 m0 = m0();
        io.reactivex.rxjava3.disposables.c cVar = m0.c;
        if (cVar != null && !cVar.h()) {
            cVar.dispose();
        }
        m0.c = null;
    }

    public void Y0() {
        pjk0 m0 = m0();
        m0.l = 0;
        int a = m0.a();
        mjk0 mjk0Var = m0.j;
        if (mjk0Var != null) {
            mjk0Var.d(a);
        }
    }

    public abstract pjk0 m0();

    public void n0(Bundle bundle) {
        int i = ify.a;
        ify.a(this);
    }

    public void x0(int i) {
        pjk0 m0 = m0();
        m0.l = i;
        int a = m0.a() + i;
        mjk0 mjk0Var = m0.j;
        if (mjk0Var != null) {
            mjk0Var.d(a);
        }
    }

    public void o0(boolean z) {
    }

    public void p0(AppKitFragment appKitFragment, Toolbar toolbar) {
    }
}
