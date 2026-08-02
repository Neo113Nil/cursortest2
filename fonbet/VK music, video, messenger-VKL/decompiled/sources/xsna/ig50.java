package xsna;

import java.util.List;
import java.util.Objects;

/* compiled from: MutableExponentialHistogramBuckets.java */
/* loaded from: classes8.dex */
public final class ig50 implements naq {
    public int a;
    public int b;
    public long c;
    public oqo d = new oqo(10);

    @Override // xsna.naq
    public final int c() {
        return this.a;
    }

    @Override // xsna.naq
    public final List<Long> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof naq)) {
            return false;
        }
        naq naqVar = (naq) obj;
        return this.a == naqVar.c() && this.b == naqVar.getOffset() && this.c == naqVar.getTotalCount() && Objects.equals(this.d, naqVar.d());
    }

    @Override // xsna.naq
    public final int getOffset() {
        return this.b;
    }

    @Override // xsna.naq
    public final long getTotalCount() {
        return this.c;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        long j = this.c;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        oqo oqoVar = this.d;
        return i2 + (oqoVar != null ? oqoVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableExponentialHistogramBuckets{scale=");
        sb.append(this.a);
        sb.append(", offset=");
        sb.append(this.b);
        sb.append(", bucketCounts=");
        sb.append(this.d);
        sb.append(", totalCount=");
        return efz.b(this.c, "}", sb);
    }
}
