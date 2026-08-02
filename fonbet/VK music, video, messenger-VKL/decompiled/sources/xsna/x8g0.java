package xsna;

/* compiled from: Text.kt */
/* loaded from: classes4.dex */
public final class x8g0 implements jbo0 {
    public final int a;

    public x8g0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x8g0) && this.a == ((x8g0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return tgw.b(this.a, "ResText(id=", ")");
    }
}
