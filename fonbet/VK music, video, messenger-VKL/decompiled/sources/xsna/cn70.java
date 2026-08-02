package xsna;

/* compiled from: NumberExt.kt */
/* loaded from: classes.dex */
public final class cn70 {
    public static final bpn0 a = new bpn0(new wv8(4));
    public static final bpn0 b = new bpn0(new m03(5));

    public static final float a() {
        return ((Number) a.getValue()).floatValue();
    }

    public static final int b(int i) {
        return (int) (a() * i);
    }

    public static final float c(int i) {
        return a() * i;
    }

    public static final float d(int i) {
        return i / a();
    }

    public static final float e() {
        return ((Number) b.getValue()).floatValue();
    }

    public static final int f(int i) {
        return (int) (e() * i);
    }

    public static final String g(int i) {
        if (i > 0) {
            return uqm0.o(i);
        }
        return null;
    }
}
