package com.vungle.ads;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes7.dex */
public final class VungleMediationLogger {
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    public static final void logError(VungleAdType vungleAdType, String str) {
        AnalyticsClient.INSTANCE.c(Sdk.SDKError.Reason.MEDIATION_ERROR, str, vungleAdType != null ? VungleMediationLoggerKt.access$getAdLogEntry(vungleAdType) : null);
    }
}
