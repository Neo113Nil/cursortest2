package xsna;

/* compiled from: Dp.kt */
@vby
/* loaded from: classes.dex */
public final class pco implements Comparable<pco> {
    public final float b;

    public static int a(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            return 0;
        }
        return Float.compare(f, f2);
    }

    public static final boolean b(float f, float f2) {
        return Float.compare(f, f2) == 0;
    }

    public static String c(float f) {
        if (Float.isNaN(f)) {
            return "Dp.Unspecified";
        }
        return f + ".dp";
    }

    @Override // java.lang.Comparable
    public final int compareTo(pco pcoVar) {
        return a(this.b, pcoVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pco) {
            return Float.compare(this.b, ((pco) obj).b) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b);
    }

    public final String toString() {
        return c(this.b);
    }
}
