package xsna;

/* compiled from: IconState.kt */
/* loaded from: classes16.dex */
public final class drv {
    public final int a;

    public drv() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof drv) && this.a == ((drv) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) * 31;
    }

    public final String toString() {
        return h5s.c(this.a, ", tintRes=null)", new StringBuilder("IconState(imageRes="));
    }

    public drv(int i, int i2) {
        this.a = (i2 & 1) != 0 ? 0 : i;
    }
}
