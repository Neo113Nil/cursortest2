package com.yandex.plus.home.analytics.evgen;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class EvgenGlobalParamsProviderFactoryImpl$createDiagnosticGlobalParamsProvider$3 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        Object obj = (Long) ((b) this.receiver).f.invoke();
        if (obj == null) {
            obj = "no_value";
        }
        return obj.toString();
    }
}
