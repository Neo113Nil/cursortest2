package com.yandex.go.analytics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/analytics/ApplicationAnalytics$SuperappSessionCreationReason", "", "Lcom/yandex/go/analytics/ApplicationAnalytics$SuperappSessionCreationReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "New", "MaxTtlExpired", "MaxTtlInactivityExpired", "AppVersionChanged", "UidChanged", "go-client-android.features.analytics:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ApplicationAnalytics$SuperappSessionCreationReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApplicationAnalytics$SuperappSessionCreationReason[] $VALUES;
    public static final ApplicationAnalytics$SuperappSessionCreationReason AppVersionChanged;
    public static final ApplicationAnalytics$SuperappSessionCreationReason MaxTtlExpired;
    public static final ApplicationAnalytics$SuperappSessionCreationReason MaxTtlInactivityExpired;
    public static final ApplicationAnalytics$SuperappSessionCreationReason New;
    public static final ApplicationAnalytics$SuperappSessionCreationReason UidChanged;
    private final String eventValue;

    static {
        ApplicationAnalytics$SuperappSessionCreationReason applicationAnalytics$SuperappSessionCreationReason = new ApplicationAnalytics$SuperappSessionCreationReason("New", 0, "new");
        New = applicationAnalytics$SuperappSessionCreationReason;
        ApplicationAnalytics$SuperappSessionCreationReason applicationAnalytics$SuperappSessionCreationReason2 = new ApplicationAnalytics$SuperappSessionCreationReason("MaxTtlExpired", 1, "max_ttl_expired");
        MaxTtlExpired = applicationAnalytics$SuperappSessionCreationReason2;
        ApplicationAnalytics$SuperappSessionCreationReason applicationAnalytics$SuperappSessionCreationReason3 = new ApplicationAnalytics$SuperappSessionCreationReason("MaxTtlInactivityExpired", 2, "max_ttl_inactivity_expired");
        MaxTtlInactivityExpired = applicationAnalytics$SuperappSessionCreationReason3;
        ApplicationAnalytics$SuperappSessionCreationReason applicationAnalytics$SuperappSessionCreationReason4 = new ApplicationAnalytics$SuperappSessionCreationReason("AppVersionChanged", 3, "app_version_changed");
        AppVersionChanged = applicationAnalytics$SuperappSessionCreationReason4;
        ApplicationAnalytics$SuperappSessionCreationReason applicationAnalytics$SuperappSessionCreationReason5 = new ApplicationAnalytics$SuperappSessionCreationReason("UidChanged", 4, "uid_changed");
        UidChanged = applicationAnalytics$SuperappSessionCreationReason5;
        ApplicationAnalytics$SuperappSessionCreationReason[] applicationAnalytics$SuperappSessionCreationReasonArr = {applicationAnalytics$SuperappSessionCreationReason, applicationAnalytics$SuperappSessionCreationReason2, applicationAnalytics$SuperappSessionCreationReason3, applicationAnalytics$SuperappSessionCreationReason4, applicationAnalytics$SuperappSessionCreationReason5};
        $VALUES = applicationAnalytics$SuperappSessionCreationReasonArr;
        $ENTRIES = kotlin.enums.a.a(applicationAnalytics$SuperappSessionCreationReasonArr);
    }

    public ApplicationAnalytics$SuperappSessionCreationReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static ApplicationAnalytics$SuperappSessionCreationReason valueOf(String str) {
        return (ApplicationAnalytics$SuperappSessionCreationReason) Enum.valueOf(ApplicationAnalytics$SuperappSessionCreationReason.class, str);
    }

    public static ApplicationAnalytics$SuperappSessionCreationReason[] values() {
        return (ApplicationAnalytics$SuperappSessionCreationReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
