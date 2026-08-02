package xsna;

import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ki01 extends oyz0 {
    public final /* synthetic */ dj01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki01(dj01 dj01Var, ed01 ed01Var) {
        super(ed01Var);
        this.e = dj01Var;
    }

    @Override // xsna.oyz0
    public final void b() {
        dj01 dj01Var = this.e;
        fj01 fj01Var = dj01Var.d;
        fj01Var.k();
        mb01 mb01Var = (mb01) fj01Var.b;
        mb01Var.o.getClass();
        dj01Var.a(SystemClock.elapsedRealtime(), false, false);
        w601 m = mb01Var.m();
        mb01Var.o.getClass();
        m.n(SystemClock.elapsedRealtime());
    }
}
