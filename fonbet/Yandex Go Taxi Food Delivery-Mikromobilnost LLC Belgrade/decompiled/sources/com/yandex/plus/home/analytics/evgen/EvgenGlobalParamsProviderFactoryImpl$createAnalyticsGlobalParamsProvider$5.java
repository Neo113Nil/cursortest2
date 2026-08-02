package com.yandex.plus.home.analytics.evgen;

import defpackage.cmd0;
import defpackage.hmd0;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$5 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        hmd0 hmd0Var;
        cmd0 a;
        sls slsVar = ((b) this.receiver).l;
        return Double.valueOf((slsVar == null || (hmd0Var = (hmd0) slsVar.invoke()) == null || (a = hmd0Var.a()) == null) ? 0.0d : a.a());
    }
}
