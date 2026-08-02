package defpackage;

/* loaded from: classes11.dex */
public final class e9i0 {
    public final int a;

    public e9i0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9i0) && this.a == ((e9i0) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + oyr.b(0, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.j(this.a, "RawGifImageStableKey(rawResId=", ", repeatCount=0, autoStart=false)");
    }
}
