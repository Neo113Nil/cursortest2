package io.appmetrica.analytics.coreapi.internal.control;

/* loaded from: classes8.dex */
public interface DataSendingRestrictionController {
    boolean isRestrictedForMainReporter();

    boolean isRestrictedForReporter(String str);

    boolean isRestrictedForSdk();
}
