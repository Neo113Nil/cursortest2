package xsna;

import androidx.annotation.Nullable;
import xsna.ub9;

/* compiled from: CameraX.java */
/* loaded from: classes11.dex */
public final class uo9 implements o0t<Void> {
    public final /* synthetic */ ub9.a b;
    public final /* synthetic */ vo9 c;

    public uo9(ub9.a aVar, vo9 vo9Var) {
        this.b = aVar;
        this.c = vo9Var;
    }

    @Override // xsna.o0t
    public final void onFailure(Throwable th) {
        synchronized (vo9.m) {
            vo9 vo9Var = vo9.n;
            if (vo9Var == this.c && vo9Var != null) {
                vo9.n = null;
                vo9.q = r0t.e(ub9.a(new h7(vo9Var, 6)));
            }
        }
        this.b.d(th);
    }

    @Override // xsna.o0t
    public final void onSuccess(@Nullable Void r2) {
        this.b.b(null);
    }
}
