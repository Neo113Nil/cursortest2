package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;

/* compiled from: SeriesRecordAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class s71<T> {
    public final AggregateMetric<T> a;
    public final AggregateMetric<T> b;
    public final AggregateMetric<T> c;

    /* JADX WARN: Multi-variable type inference failed */
    public s71(AggregateMetric<? extends T> aggregateMetric, AggregateMetric<? extends T> aggregateMetric2, AggregateMetric<? extends T> aggregateMetric3) {
        this.a = aggregateMetric;
        this.b = aggregateMetric2;
        this.c = aggregateMetric3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s71)) {
            return false;
        }
        s71 s71Var = (s71) obj;
        return epx.f(this.a, s71Var.a) && epx.f(this.b, s71Var.b) && epx.f(this.c, s71Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregateMetricsInfo(averageMetric=" + this.a + ", minMetric=" + this.b + ", maxMetric=" + this.c + ')';
    }
}
