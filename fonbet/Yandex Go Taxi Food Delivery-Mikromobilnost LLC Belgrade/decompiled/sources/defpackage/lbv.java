package defpackage;

/* loaded from: classes11.dex */
public final class lbv implements rbv {
    public final int a;

    public lbv(int i) {
        this.a = i;
        v4b1.f(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lbv) && this.a == ((lbv) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + oyr.b(0, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.j(this.a, "RawGif(rawResId=", ", repeatCount=0, autoStart=false)");
    }
}
