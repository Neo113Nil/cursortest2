package defpackage;

import android.os.Looper;

/* loaded from: classes15.dex */
public final class pvw extends xx4 {
    public final boolean w;

    public pvw(boolean z) {
        this.w = z;
    }

    @Override // defpackage.xx4
    public final void j(cl21 cl21Var) {
        o0x0 o0x0Var = (o0x0) ((d9g) cl21Var).o0.get();
        z83.g(null, o0x0Var.w.getLooper(), Looper.myLooper());
        z83.c(null, o0x0Var.J);
        o0x0Var.a();
        o0x0Var.c(this.w);
        h();
    }
}
