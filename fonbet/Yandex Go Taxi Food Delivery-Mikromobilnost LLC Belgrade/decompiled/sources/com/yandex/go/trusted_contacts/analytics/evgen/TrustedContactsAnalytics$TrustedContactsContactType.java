package com.yandex.go.trusted_contacts.analytics.evgen;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/trusted_contacts/analytics/evgen/TrustedContactsAnalytics$TrustedContactsContactType", "", "Lcom/yandex/go/trusted_contacts/analytics/evgen/TrustedContactsAnalytics$TrustedContactsContactType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Trusted", "Trusting", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrustedContactsAnalytics$TrustedContactsContactType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TrustedContactsAnalytics$TrustedContactsContactType[] $VALUES;
    public static final TrustedContactsAnalytics$TrustedContactsContactType Trusted;
    public static final TrustedContactsAnalytics$TrustedContactsContactType Trusting;
    private final String eventValue;

    static {
        TrustedContactsAnalytics$TrustedContactsContactType trustedContactsAnalytics$TrustedContactsContactType = new TrustedContactsAnalytics$TrustedContactsContactType("Trusted", 0, "trusted");
        Trusted = trustedContactsAnalytics$TrustedContactsContactType;
        TrustedContactsAnalytics$TrustedContactsContactType trustedContactsAnalytics$TrustedContactsContactType2 = new TrustedContactsAnalytics$TrustedContactsContactType("Trusting", 1, "trusting");
        Trusting = trustedContactsAnalytics$TrustedContactsContactType2;
        TrustedContactsAnalytics$TrustedContactsContactType[] trustedContactsAnalytics$TrustedContactsContactTypeArr = {trustedContactsAnalytics$TrustedContactsContactType, trustedContactsAnalytics$TrustedContactsContactType2};
        $VALUES = trustedContactsAnalytics$TrustedContactsContactTypeArr;
        $ENTRIES = a.a(trustedContactsAnalytics$TrustedContactsContactTypeArr);
    }

    public TrustedContactsAnalytics$TrustedContactsContactType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TrustedContactsAnalytics$TrustedContactsContactType valueOf(String str) {
        return (TrustedContactsAnalytics$TrustedContactsContactType) Enum.valueOf(TrustedContactsAnalytics$TrustedContactsContactType.class, str);
    }

    public static TrustedContactsAnalytics$TrustedContactsContactType[] values() {
        return (TrustedContactsAnalytics$TrustedContactsContactType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
