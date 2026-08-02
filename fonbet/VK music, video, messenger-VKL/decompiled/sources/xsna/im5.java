package xsna;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import java.util.Collection;

/* compiled from: AutoValue_ImmutableExponentialHistogramData.java */
/* loaded from: classes8.dex */
public final class im5 extends jow {
    public final AggregationTemporality b;
    public final Collection<paq> c;

    public im5(AggregationTemporality aggregationTemporality, Collection<paq> collection) {
        if (aggregationTemporality == null) {
            throw new NullPointerException("Null aggregationTemporality");
        }
        this.b = aggregationTemporality;
        if (collection == null) {
            throw new NullPointerException("Null points");
        }
        this.c = collection;
    }

    @Override // xsna.oaq
    public final AggregationTemporality a() {
        return this.b;
    }

    @Override // xsna.qtk
    public final Collection<paq> b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jow) {
            jow jowVar = (jow) obj;
            if (this.b.equals(((im5) jowVar).b)) {
                if (this.c.equals(((im5) jowVar).c)) {
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
        return "ImmutableExponentialHistogramData{aggregationTemporality=" + this.b + ", points=" + this.c + "}";
    }
}
