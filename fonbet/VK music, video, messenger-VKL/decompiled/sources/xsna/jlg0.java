package xsna;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public final class jlg0 {
    public static final pqo a = new pqo(new qc00(9));
    public static final nlg0 b;
    public static final nlg0 c;
    public static final ykg0 d;
    public static final ykg0 e;
    public static final ykg0 f;

    static {
        long j = l5g.k;
        b = new nlg0(true, j);
        c = new nlg0(false, j);
        d = new ykg0(0.16f, 0.24f, 0.08f, 0.24f);
        e = new ykg0(0.08f, 0.12f, 0.04f, 0.12f);
        f = new ykg0(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static nlg0 a(int i) {
        boolean z = (i & 1) != 0;
        long j = l5g.k;
        return (pco.b(Float.NaN, Float.NaN) && l5g.d(j, j)) ? z ? b : c : new nlg0(z, j);
    }
}
