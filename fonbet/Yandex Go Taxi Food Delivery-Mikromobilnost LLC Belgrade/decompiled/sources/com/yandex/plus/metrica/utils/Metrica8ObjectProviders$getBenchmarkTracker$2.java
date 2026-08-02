package com.yandex.plus.metrica.utils;

import com.yandex.pulse.histogram.ComponentHistograms;
import defpackage.pa20;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class Metrica8ObjectProviders$getBenchmarkTracker$2 extends FunctionReferenceImpl implements tls {
    public static final Metrica8ObjectProviders$getBenchmarkTracker$2 b = new Metrica8ObjectProviders$getBenchmarkTracker$2(1, 0, pa20.class, "<init>", "<init>(Lcom/yandex/pulse/histogram/ComponentHistograms;)V");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return new pa20((ComponentHistograms) obj);
    }
}
