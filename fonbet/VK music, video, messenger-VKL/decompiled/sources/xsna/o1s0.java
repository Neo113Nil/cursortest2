package xsna;

/* compiled from: VideoAllocatorConfig.kt */
/* loaded from: classes11.dex */
public final class o1s0 {
    public static final a c = new a();
    public static final o1s0 d = new o1s0(65536, 0);
    public final int a;
    public final int b;

    /* compiled from: VideoAllocatorConfig.kt */
    public static final class a {
    }

    public o1s0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1s0)) {
            return false;
        }
        o1s0 o1s0Var = (o1s0) obj;
        return this.a == o1s0Var.a && this.b == o1s0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoAllocatorConfig(singleChunkSize=");
        sb.append(this.a);
        sb.append(", preAllocatedChunksCount=");
        return vu5.b(sb, this.b, ')');
    }
}
