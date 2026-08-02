package com.yandex.plus.paywall.sdk.analytics.impl.evgen.diagnostic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.common.clid.ClidProvider;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/plus/paywall/sdk/analytics/impl/evgen/diagnostic/AcquisitionEvgenSubscriptionStatus;", "", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NotLoggedIn", "NoSubscription", CA20Status.STATUS_USER_DESCRIPTION_A, "Unknown", "acquisition-sdk-analytics_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AcquisitionEvgenSubscriptionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcquisitionEvgenSubscriptionStatus[] $VALUES;
    public static final AcquisitionEvgenSubscriptionStatus Active;
    public static final AcquisitionEvgenSubscriptionStatus NoSubscription;
    public static final AcquisitionEvgenSubscriptionStatus NotLoggedIn;
    public static final AcquisitionEvgenSubscriptionStatus Unknown;
    private final String eventValue;

    static {
        AcquisitionEvgenSubscriptionStatus acquisitionEvgenSubscriptionStatus = new AcquisitionEvgenSubscriptionStatus("NotLoggedIn", 0, "not_logged_in");
        NotLoggedIn = acquisitionEvgenSubscriptionStatus;
        AcquisitionEvgenSubscriptionStatus acquisitionEvgenSubscriptionStatus2 = new AcquisitionEvgenSubscriptionStatus("NoSubscription", 1, "no_subscription");
        NoSubscription = acquisitionEvgenSubscriptionStatus2;
        AcquisitionEvgenSubscriptionStatus acquisitionEvgenSubscriptionStatus3 = new AcquisitionEvgenSubscriptionStatus(CA20Status.STATUS_USER_DESCRIPTION_A, 2, ClidProvider.APP_ACTIVE);
        Active = acquisitionEvgenSubscriptionStatus3;
        AcquisitionEvgenSubscriptionStatus acquisitionEvgenSubscriptionStatus4 = new AcquisitionEvgenSubscriptionStatus("Unknown", 3, "unknown");
        Unknown = acquisitionEvgenSubscriptionStatus4;
        AcquisitionEvgenSubscriptionStatus[] acquisitionEvgenSubscriptionStatusArr = {acquisitionEvgenSubscriptionStatus, acquisitionEvgenSubscriptionStatus2, acquisitionEvgenSubscriptionStatus3, acquisitionEvgenSubscriptionStatus4};
        $VALUES = acquisitionEvgenSubscriptionStatusArr;
        $ENTRIES = a.a(acquisitionEvgenSubscriptionStatusArr);
    }

    public AcquisitionEvgenSubscriptionStatus(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static AcquisitionEvgenSubscriptionStatus valueOf(String str) {
        return (AcquisitionEvgenSubscriptionStatus) Enum.valueOf(AcquisitionEvgenSubscriptionStatus.class, str);
    }

    public static AcquisitionEvgenSubscriptionStatus[] values() {
        return (AcquisitionEvgenSubscriptionStatus[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
