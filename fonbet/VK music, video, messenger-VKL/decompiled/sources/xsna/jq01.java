package xsna;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes13.dex */
public final class jq01 extends sl01 {
    public final /* synthetic */ ur01 c;

    public jq01(ur01 ur01Var) {
        this.c = ur01Var;
    }

    @Override // xsna.sl01
    public final void a() {
        as01 as01Var = this.c.b;
        as01Var.b.c("unlinkToDeath", new Object[0]);
        as01Var.m.asBinder().unlinkToDeath(as01Var.j, 0);
        as01Var.m = null;
        as01Var.g = false;
    }
}
