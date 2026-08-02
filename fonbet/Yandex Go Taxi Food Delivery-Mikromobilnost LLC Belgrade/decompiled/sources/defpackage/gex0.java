package defpackage;

/* loaded from: classes14.dex */
public final /* synthetic */ class gex0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ m3u0 b;
    public final /* synthetic */ m3u0 c;

    public /* synthetic */ gex0(m3u0 m3u0Var, m3u0 m3u0Var2, int i) {
        this.a = i;
        this.b = m3u0Var;
        this.c = m3u0Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        m3u0 m3u0Var = this.c;
        m3u0 m3u0Var2 = this.b;
        m2k0 m2k0Var = (m2k0) obj;
        switch (i) {
            case 0:
                m2k0Var.D(((Number) m3u0Var2.getValue()).floatValue());
                m2k0Var.b(((Number) m3u0Var.getValue()).floatValue());
                break;
            default:
                m2k0Var.u(((Number) m3u0Var2.getValue()).floatValue());
                m2k0Var.v(((Number) m3u0Var2.getValue()).floatValue());
                m2k0Var.b(((Number) m3u0Var.getValue()).floatValue());
                break;
        }
        return zy11Var;
    }
}
