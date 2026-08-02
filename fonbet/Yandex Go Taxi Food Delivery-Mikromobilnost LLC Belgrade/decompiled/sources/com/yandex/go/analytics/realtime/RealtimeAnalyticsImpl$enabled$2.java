package com.yandex.go.analytics.realtime;

import com.yandex.go.analytics.realtime.experiments.InAppRealtimeAnalyticsExperiment;
import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
final /* synthetic */ class RealtimeAnalyticsImpl$enabled$2 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        return Boolean.valueOf(((InAppRealtimeAnalyticsExperiment) this.receiver).getB());
    }
}
