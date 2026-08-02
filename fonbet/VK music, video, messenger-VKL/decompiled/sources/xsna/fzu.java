package xsna;

import androidx.health.connect.client.aggregate.AggregateMetric;
import kotlin.jvm.internal.Lambda;

/* compiled from: HealthConnectClientAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class fzu extends Lambda implements izs<AggregateMetric<?>, Boolean> {
    final /* synthetic */ dcy<? extends zef0> $recordType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzu(dcy<? extends zef0> dcyVar) {
        super(1);
        this.$recordType = dcyVar;
    }

    @Override // xsna.izs
    public final Boolean invoke(AggregateMetric<?> aggregateMetric) {
        AggregateMetric<?> aggregateMetric2 = aggregateMetric;
        return Boolean.valueOf(!y71.a(aggregateMetric2) && aggregateMetric2.b.equals(whf0.b.get(this.$recordType)));
    }
}
