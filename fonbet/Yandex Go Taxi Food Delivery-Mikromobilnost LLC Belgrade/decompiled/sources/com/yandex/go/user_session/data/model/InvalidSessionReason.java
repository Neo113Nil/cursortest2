package com.yandex.go.user_session.data.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/user_session/data/model/InvalidSessionReason;", "", "NoSession", "MaxTtlExpired", "MaxTtlInactivityExpired", "UidChanged", "AppVersionChanged", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class InvalidSessionReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InvalidSessionReason[] $VALUES;
    public static final InvalidSessionReason AppVersionChanged;
    public static final InvalidSessionReason MaxTtlExpired;
    public static final InvalidSessionReason MaxTtlInactivityExpired;
    public static final InvalidSessionReason NoSession;
    public static final InvalidSessionReason UidChanged;

    static {
        InvalidSessionReason invalidSessionReason = new InvalidSessionReason("NoSession", 0);
        NoSession = invalidSessionReason;
        InvalidSessionReason invalidSessionReason2 = new InvalidSessionReason("MaxTtlExpired", 1);
        MaxTtlExpired = invalidSessionReason2;
        InvalidSessionReason invalidSessionReason3 = new InvalidSessionReason("MaxTtlInactivityExpired", 2);
        MaxTtlInactivityExpired = invalidSessionReason3;
        InvalidSessionReason invalidSessionReason4 = new InvalidSessionReason("UidChanged", 3);
        UidChanged = invalidSessionReason4;
        InvalidSessionReason invalidSessionReason5 = new InvalidSessionReason("AppVersionChanged", 4);
        AppVersionChanged = invalidSessionReason5;
        InvalidSessionReason[] invalidSessionReasonArr = {invalidSessionReason, invalidSessionReason2, invalidSessionReason3, invalidSessionReason4, invalidSessionReason5};
        $VALUES = invalidSessionReasonArr;
        $ENTRIES = kotlin.enums.a.a(invalidSessionReasonArr);
    }

    public static InvalidSessionReason valueOf(String str) {
        return (InvalidSessionReason) Enum.valueOf(InvalidSessionReason.class, str);
    }

    public static InvalidSessionReason[] values() {
        return (InvalidSessionReason[]) $VALUES.clone();
    }
}
