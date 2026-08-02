package xsna;

import java.util.List;
import xsna.x41;

/* compiled from: AutoValue_Advice.java */
/* loaded from: classes8.dex */
public final class nk5 extends x41 {
    public final List<Double> b;

    /* compiled from: AutoValue_Advice.java */
    public static final class a extends x41.a {
        public List<Double> a;
    }

    public nk5(List list) {
        this.b = list;
    }

    @Override // xsna.x41
    public final List<i94<?>> a() {
        return null;
    }

    @Override // xsna.x41
    public final List<Double> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x41)) {
            return false;
        }
        x41 x41Var = (x41) obj;
        List<Double> list = this.b;
        if (list == null) {
            if (x41Var.b() != null) {
                return false;
            }
        } else if (!list.equals(x41Var.b())) {
            return false;
        }
        return x41Var.a() == null;
    }

    public final int hashCode() {
        List<Double> list = this.b;
        return ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
    }

    public final String toString() {
        return vp.b(", attributes=null}", new StringBuilder("Advice{explicitBucketBoundaries="), this.b);
    }
}
