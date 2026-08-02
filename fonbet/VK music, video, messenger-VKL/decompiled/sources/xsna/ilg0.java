package xsna;

/* compiled from: Ripple.kt */
/* loaded from: classes11.dex */
public final class ilg0 {
    public static final pqo a = new pqo(new com.vk.movika.sdk.base.logic.interactor.g(28));
    public static final llg0 b;
    public static final llg0 c;

    static {
        long j = l5g.k;
        b = new llg0(j, Float.NaN, true);
        c = new llg0(j, Float.NaN, false);
    }

    public static llg0 a(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = l5g.k;
        return (pco.b(f, Float.NaN) && l5g.d(j, j)) ? z ? b : c : new llg0(j, f, z);
    }
}
