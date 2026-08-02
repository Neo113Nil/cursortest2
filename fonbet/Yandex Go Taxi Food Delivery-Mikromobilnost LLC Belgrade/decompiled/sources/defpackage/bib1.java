package defpackage;

/* loaded from: classes.dex */
public final class bib1 {
    public static final cna1 a;
    public static final cna1 b;
    public static final cna1 c;
    public static final cna1 d;
    public static final cna1 e;
    public static final cna1 f;

    static {
        eid eidVar = new eid(wma1.a(), true, true);
        a = eidVar.o("measurement.test.boolean_flag", false);
        b = eidVar.n(-1L, "measurement.test.cached_long_flag");
        Double valueOf = Double.valueOf(-3.0d);
        Object obj = cna1.g;
        c = new cna1(eidVar, "measurement.test.double_flag", valueOf, 2);
        d = eidVar.n(-2L, "measurement.test.int_flag");
        e = eidVar.n(-1L, "measurement.test.long_flag");
        f = eidVar.p("measurement.test.string_flag", "---");
    }
}
