package xsna;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class a201 implements b9i {
    public static final /* synthetic */ a201 b = new a201();
    public static bpn0 c;
    public static bpn0 d;

    public static final rmr0 a() {
        bpn0 bpn0Var = c;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (rmr0) bpn0Var.getValue();
    }

    public static final afw0 b() {
        bpn0 bpn0Var = d;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (afw0) bpn0Var.getValue();
    }

    public static final boolean d(String str) {
        return brm0.B(str, "/newuim", false) || brm0.B(str, "/uim", false) || brm0.B(str, "/ruim", false);
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return new rt20();
    }
}
