package com.yandex.plus.home.internal.di;

import defpackage.ol5;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class DomainModule$redAlertsInteractor$2$1 extends FunctionReferenceImpl implements sls {
    public DomainModule$redAlertsInteractor$2$1(Object obj) {
        super(0, obj, ol5.class, "createRedAlertsDigestBenchmark", "createRedAlertsDigestBenchmark()Lcom/yandex/plus/core/benchmark/ApiRequestBenchmark;", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return ((ol5) this.receiver).a.d("RedAlert.Digest.DataLoading");
    }
}
