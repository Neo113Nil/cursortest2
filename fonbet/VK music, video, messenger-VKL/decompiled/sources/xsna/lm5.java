package xsna;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Collection;

/* compiled from: AutoValue_ImmutableHistogramData.java */
/* loaded from: classes8.dex */
public final class lm5 extends oow {
    public final AggregationTemporality b;
    public final Collection<v7v> c;

    public lm5(AggregationTemporality aggregationTemporality, Collection<v7v> collection) {
        if (aggregationTemporality == null) {
            throw new NullPointerException("Null aggregationTemporality");
        }
        this.b = aggregationTemporality;
        if (collection == null) {
            throw new NullPointerException("Null points");
        }
        this.c = collection;
    }

    @Override // xsna.t7v
    public final AggregationTemporality a() {
        return this.b;
    }

    @Override // xsna.qtk
    public final Collection<v7v> b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oow) {
            oow oowVar = (oow) obj;
            if (this.b.equals(((lm5) oowVar).b)) {
                if (this.c.equals(((lm5) oowVar).c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "ImmutableHistogramData{aggregationTemporality=" + this.b + ", points=" + this.c + "}";
    }
}
