package com.yandex.plus.metrica.utils;

import defpackage.ta20;
import defpackage.tls;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class Metrica8ObjectProviders$getRtmEventReporter$2 extends FunctionReferenceImpl implements tls {
    public static final Metrica8ObjectProviders$getRtmEventReporter$2 b = new Metrica8ObjectProviders$getRtmEventReporter$2(1, 0, ta20.class, "<init>", "<init>(Lio/appmetrica/analytics/IReporterYandex;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new ta20((IReporterYandex) obj);
    }
}
