package xsna;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Collection;
import xsna.jlb0;

/* compiled from: AutoValue_ImmutableSumData.java */
/* loaded from: classes8.dex */
public final class um5<T extends jlb0> extends opw<T> {
    public final Collection<T> b;
    public final boolean c;
    public final AggregationTemporality d;

    public um5(Collection<T> collection, boolean z, AggregationTemporality aggregationTemporality) {
        if (collection == null) {
            throw new NullPointerException("Null points");
        }
        this.b = collection;
        this.c = z;
        if (aggregationTemporality == null) {
            throw new NullPointerException("Null aggregationTemporality");
        }
        this.d = aggregationTemporality;
    }

    @Override // xsna.u6n0
    public final AggregationTemporality a() {
        return this.d;
    }

    @Override // xsna.qtk
    public final Collection<T> b() {
        return this.b;
    }

    @Override // xsna.u6n0
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof opw) {
            opw opwVar = (opw) obj;
            if (this.b.equals(((um5) opwVar).b)) {
                um5 um5Var = (um5) opwVar;
                if (this.c == um5Var.c && this.d.equals(um5Var.d)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ImmutableSumData{points=" + this.b + ", monotonic=" + this.c + ", aggregationTemporality=" + this.d + "}";
    }
}
