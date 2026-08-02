package com.yandex.plus.home.analytics.evgen;

import defpackage.k2d0;
import defpackage.m4d0;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class EvgenGlobalParamsProviderFactoryImpl$createAnalyticsGlobalParamsProvider$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        k2d0 k2d0Var;
        String str;
        m4d0 m4d0Var = ((b) this.receiver).k;
        return (m4d0Var == null || (k2d0Var = (k2d0) m4d0Var.invoke()) == null || (str = k2d0Var.a) == null) ? "no_value" : str;
    }
}
