package xsna;

/* compiled from: ClipCarouselAttachesSetupParams.kt */
/* loaded from: classes18.dex */
public final class k64 {
    public final int a;
    public final int b;

    public k64() {
        this(0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k64)) {
            return false;
        }
        k64 k64Var = (k64) obj;
        return this.a == k64Var.a && this.b == k64Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + shy.a(0, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachesContentPaddingParams(start=");
        sb.append(this.a);
        sb.append(", end=");
        return h5s.c(this.b, ", top=0, bottom=0)", sb);
    }

    public k64(int i, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        int i3 = (i2 & 2) == 0 ? 16 : 0;
        this.a = i;
        this.b = i3;
    }
}
