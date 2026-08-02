package com.yandex.go.about.domain;

import defpackage.k4o;
import kotlin.Metadata;
import ru.cprocsp.ACSP.tools.license.LicenseConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/about/domain/BusinessNameAboutAnalytics$ActionV2", "", "Lcom/yandex/go/about/domain/BusinessNameAboutAnalytics$ActionV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "UUID", "AnotherApps", "License", "LogoTap", "PrivacyPolicy", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class BusinessNameAboutAnalytics$ActionV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BusinessNameAboutAnalytics$ActionV2[] $VALUES;
    public static final BusinessNameAboutAnalytics$ActionV2 AnotherApps;
    public static final BusinessNameAboutAnalytics$ActionV2 License;
    public static final BusinessNameAboutAnalytics$ActionV2 LogoTap;
    public static final BusinessNameAboutAnalytics$ActionV2 PrivacyPolicy;
    public static final BusinessNameAboutAnalytics$ActionV2 UUID;
    private final String eventValue;

    static {
        BusinessNameAboutAnalytics$ActionV2 businessNameAboutAnalytics$ActionV2 = new BusinessNameAboutAnalytics$ActionV2("UUID", 0, "UUID");
        UUID = businessNameAboutAnalytics$ActionV2;
        BusinessNameAboutAnalytics$ActionV2 businessNameAboutAnalytics$ActionV22 = new BusinessNameAboutAnalytics$ActionV2("AnotherApps", 1, "anotherApps");
        AnotherApps = businessNameAboutAnalytics$ActionV22;
        BusinessNameAboutAnalytics$ActionV2 businessNameAboutAnalytics$ActionV23 = new BusinessNameAboutAnalytics$ActionV2("License", 2, LicenseConstants.LICENSE);
        License = businessNameAboutAnalytics$ActionV23;
        BusinessNameAboutAnalytics$ActionV2 businessNameAboutAnalytics$ActionV24 = new BusinessNameAboutAnalytics$ActionV2("LogoTap", 3, "logoTap");
        LogoTap = businessNameAboutAnalytics$ActionV24;
        BusinessNameAboutAnalytics$ActionV2 businessNameAboutAnalytics$ActionV25 = new BusinessNameAboutAnalytics$ActionV2("PrivacyPolicy", 4, "privacyPolicy");
        PrivacyPolicy = businessNameAboutAnalytics$ActionV25;
        BusinessNameAboutAnalytics$ActionV2[] businessNameAboutAnalytics$ActionV2Arr = {businessNameAboutAnalytics$ActionV2, businessNameAboutAnalytics$ActionV22, businessNameAboutAnalytics$ActionV23, businessNameAboutAnalytics$ActionV24, businessNameAboutAnalytics$ActionV25};
        $VALUES = businessNameAboutAnalytics$ActionV2Arr;
        $ENTRIES = kotlin.enums.a.a(businessNameAboutAnalytics$ActionV2Arr);
    }

    public BusinessNameAboutAnalytics$ActionV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static BusinessNameAboutAnalytics$ActionV2 valueOf(String str) {
        return (BusinessNameAboutAnalytics$ActionV2) Enum.valueOf(BusinessNameAboutAnalytics$ActionV2.class, str);
    }

    public static BusinessNameAboutAnalytics$ActionV2[] values() {
        return (BusinessNameAboutAnalytics$ActionV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
