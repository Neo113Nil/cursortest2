package xsna;

import com.vk.clips.sdk.shared.api.nps.api.condition.SdkExternalNpsCondition;

/* compiled from: ExternalNpsConditionManagerAdapter.kt */
/* loaded from: classes17.dex */
public final class cfq implements kjh0 {
    public final bfq a;

    public cfq(bfq bfqVar) {
        this.a = bfqVar;
    }

    @Override // xsna.kjh0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 a() {
        return this.a.a().U(new pq(new dz(26), 8));
    }

    @Override // xsna.kjh0
    public final io.reactivex.rxjava3.internal.operators.observable.j1 b() {
        return this.a.b().U(new nq(new bz(22), 11));
    }

    @Override // xsna.kjh0
    public final void c(SdkExternalNpsCondition sdkExternalNpsCondition) {
        this.a.c(afq.a(sdkExternalNpsCondition));
    }

    @Override // xsna.kjh0
    public final void d(SdkExternalNpsCondition sdkExternalNpsCondition) {
        this.a.d(afq.a(sdkExternalNpsCondition));
    }
}
