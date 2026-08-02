package xsna;

import java.util.Collections;
import java.util.List;

/* compiled from: AutoValue_EmptyExponentialHistogramBuckets.java */
/* loaded from: classes8.dex */
public final class wl5 extends tfp {
    public final int b;
    public final List<Long> c;

    public wl5(int i) {
        List<Long> list = Collections.EMPTY_LIST;
        this.b = i;
        if (list == null) {
            throw new NullPointerException("Null bucketCounts");
        }
        this.c = list;
    }

    @Override // xsna.naq
    public final int c() {
        return this.b;
    }

    @Override // xsna.naq
    public final List<Long> d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tfp)) {
            return false;
        }
        wl5 wl5Var = (wl5) ((tfp) obj);
        if (this.b != wl5Var.b) {
            return false;
        }
        wl5Var.getClass();
        return this.c.equals(wl5Var.c);
    }

    @Override // xsna.naq
    public final int getOffset() {
        return 0;
    }

    @Override // xsna.naq
    public final long getTotalCount() {
        return 0L;
    }

    public final int hashCode() {
        return ((((this.b ^ 1000003) * (-721379959)) ^ this.c.hashCode()) * 1000003) ^ ((int) 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EmptyExponentialHistogramBuckets{scale=");
        sb.append(this.b);
        sb.append(", offset=0, bucketCounts=");
        return vp.b(", totalCount=0}", sb, this.c);
    }
}
