package xsna;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class pg01 extends oyz0 {
    public final /* synthetic */ yh01 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg01(yh01 yh01Var, mb01 mb01Var) {
        super(mb01Var);
        this.e = yh01Var;
    }

    @Override // xsna.oyz0
    public final void b() {
        yh01 yh01Var = this.e;
        yh01Var.k();
        if (yh01Var.q()) {
            k901 k901Var = ((mb01) yh01Var.b).j;
            mb01.k(k901Var);
            k901Var.q.a("Inactivity, disconnecting from the service");
            yh01Var.A();
        }
    }
}
