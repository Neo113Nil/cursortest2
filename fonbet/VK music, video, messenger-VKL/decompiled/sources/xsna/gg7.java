package xsna;

import kotlin.jvm.internal.Lambda;

/* compiled from: BloodPressureAggregationExtensions.kt */
/* loaded from: classes12.dex */
public final class gg7 extends Lambda implements izs<u7x, jb1<jg7>> {
    final /* synthetic */ o71 $aggregateRequest;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg7(o71 o71Var) {
        super(1);
        this.$aggregateRequest = o71Var;
    }

    @Override // xsna.izs
    public final jb1<jg7> invoke(u7x u7xVar) {
        return new ig7(this.$aggregateRequest.a);
    }
}
