package com.yandex.plus.metrica.utils;

import defpackage.tls;
import defpackage.va20;
import io.appmetrica.analytics.IReporterYandex;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Metrica8ObjectProviders$getStatboxReporter$2 extends FunctionReferenceImpl implements tls {
    public static final Metrica8ObjectProviders$getStatboxReporter$2 b = new Metrica8ObjectProviders$getStatboxReporter$2(1, 0, va20.class, "<init>", "<init>(Lio/appmetrica/analytics/IReporterYandex;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new va20(0, (IReporterYandex) obj);
    }
}
