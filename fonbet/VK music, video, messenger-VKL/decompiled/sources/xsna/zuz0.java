package xsna;

/* compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* loaded from: classes13.dex */
public final class zuz0 extends xq01 {
    public final /* synthetic */ rvz0 c;

    public zuz0(rvz0 rvz0Var) {
        this.c = rvz0Var;
    }

    @Override // xsna.xq01
    public final void c() {
        uvz0 uvz0Var = this.c.b;
        uvz0Var.b.d("unlinkToDeath", new Object[0]);
        uvz0Var.m.asBinder().unlinkToDeath(uvz0Var.j, 0);
        uvz0Var.m = null;
        uvz0Var.g = false;
    }
}
