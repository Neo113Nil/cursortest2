package com.yandex.plus.metrica.utils;

import defpackage.la20;
import defpackage.tls;
import io.appmetrica.analytics.IReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Metrica8ObjectProviders$getErrorReporter$2 extends FunctionReferenceImpl implements tls {
    public static final Metrica8ObjectProviders$getErrorReporter$2 b = new Metrica8ObjectProviders$getErrorReporter$2(1, 0, la20.class, "<init>", "<init>(Lio/appmetrica/analytics/IReporter;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new la20((IReporter) obj);
    }
}
