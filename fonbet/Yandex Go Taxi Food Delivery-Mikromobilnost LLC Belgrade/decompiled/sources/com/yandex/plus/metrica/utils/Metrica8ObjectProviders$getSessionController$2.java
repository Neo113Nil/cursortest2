package com.yandex.plus.metrica.utils;

import defpackage.tls;
import defpackage.ua20;
import io.appmetrica.analytics.IReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Metrica8ObjectProviders$getSessionController$2 extends FunctionReferenceImpl implements tls {
    public static final Metrica8ObjectProviders$getSessionController$2 b = new Metrica8ObjectProviders$getSessionController$2(1, 0, ua20.class, "<init>", "<init>(Lio/appmetrica/analytics/IReporter;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new ua20((IReporter) obj);
    }
}
