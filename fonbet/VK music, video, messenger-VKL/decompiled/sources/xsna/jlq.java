package xsna;

/* compiled from: FastQualityIncreaseConfig.kt */
/* loaded from: classes11.dex */
public final class jlq {
    public static final a c = new a();
    public final b a;
    public final b b;

    /* compiled from: FastQualityIncreaseConfig.kt */
    public static final class a {
    }

    /* compiled from: FastQualityIncreaseConfig.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final long a;
        public final long b;
        public final long c;
        public final long d;

        public b(long j, long j2, long j3, long j4) {
            this.a = j;
            this.b = j2;
            this.c = j3;
            this.d = j4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c && this.d == bVar.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("IncreaseQualityValues(chunkLess4Sec=");
            sb.append(this.a);
            sb.append(", chunk4to7Sec=");
            sb.append(this.b);
            sb.append(", chunk7to10Sec=");
            sb.append(this.c);
            sb.append(", chunkMore10Sec=");
            return vu5.a(')', this.d, sb);
        }
    }

    public jlq(b bVar, b bVar2) {
        this.a = bVar;
        this.b = bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlq)) {
            return false;
        }
        jlq jlqVar = (jlq) obj;
        return epx.f(this.a, jlqVar.a) && epx.f(this.b, jlqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FastQualityIncreaseConfig(increaseValues=" + this.a + ", retainValues=" + this.b + ')';
    }
}
