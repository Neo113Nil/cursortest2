package com.yandex.plus.metrica.utils;

import defpackage.sls;
import io.appmetrica.analytics.IReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class Metrica8ObjectProviders$getEventReporter$3 extends FunctionReferenceImpl implements sls {
    public Metrica8ObjectProviders$getEventReporter$3(e eVar) {
        super(0, eVar, e.class, "getReporter", "getReporter()Ljava/lang/Object;", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return (IReporter) ((e) this.receiver).g();
    }
}
