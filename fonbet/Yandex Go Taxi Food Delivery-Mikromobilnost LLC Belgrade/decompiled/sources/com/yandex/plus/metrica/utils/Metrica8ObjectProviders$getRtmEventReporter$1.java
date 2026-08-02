package com.yandex.plus.metrica.utils;

import defpackage.sls;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class Metrica8ObjectProviders$getRtmEventReporter$1 extends FunctionReferenceImpl implements sls {
    public Metrica8ObjectProviders$getRtmEventReporter$1(e eVar) {
        super(0, eVar, e.class, "getReporterInternal", "getReporterInternal()Ljava/lang/Object;", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return (IReporterYandex) ((e) this.receiver).h();
    }
}
