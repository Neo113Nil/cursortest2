package defpackage;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;

/* loaded from: classes2.dex */
public final class ep31 implements vbi0 {
    public final sls a;
    public final hh31 b;
    public zo31 c;
    public final wgk w = new wgk(this);

    public ep31(sls slsVar, hh31 hh31Var) {
        this.a = slsVar;
        this.b = hh31Var;
    }

    @Override // defpackage.vbi0
    public final Object getValue(Object obj, kgx kgxVar) {
        if (!jl40.l(Looper.myLooper(), Looper.getMainLooper())) {
            ny61.r("Trying attempt access to binding in background thread ");
            return null;
        }
        zo31 zo31Var = this.c;
        if (zo31Var != null) {
            return zo31Var;
        }
        Lifecycle lifecycle = ((pey) this.a.invoke()).getLifecycle();
        if (!lifecycle.b().a(Lifecycle.State.INITIALIZED)) {
            ny61.r("Binding is unavailable, view already destroyed.");
            return null;
        }
        lifecycle.a(this.w);
        zo31 zo31Var2 = (zo31) this.b.invoke();
        this.c = zo31Var2;
        return zo31Var2;
    }
}
