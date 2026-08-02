package com.yandex.plus.metrica.utils;

import defpackage.oa20;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class BaseMetricaFacade$getReporter$1$reporter$1$1 extends FunctionReferenceImpl implements sls {
    public BaseMetricaFacade$getReporter$1$reporter$1$1(oa20 oa20Var) {
        super(0, oa20Var, d.class, "getMetricaStatus", "getMetricaStatus()Lcom/yandex/plus/metrica/utils/BaseMetricaFacade$Status;", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return (BaseMetricaFacade$Status) ((d) this.receiver).a.getValue();
    }
}
