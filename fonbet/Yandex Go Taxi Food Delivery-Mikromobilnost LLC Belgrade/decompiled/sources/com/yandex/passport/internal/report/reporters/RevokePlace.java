package com.yandex.passport.internal.report.reporters;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/passport/internal/report/reporters/RevokePlace;", "", "UNKNOWN", "REMOVE_ACCOUNT_API", "REMOVE_ACCOUNT_EXPLICITLY_API", "SSO_ACCOUNT_SYNC", "DELETE_ACCOUNT_USE_CASE", "AUTHENTICATOR", "Rotation", "Quarantine", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RevokePlace {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RevokePlace[] $VALUES;
    public static final RevokePlace AUTHENTICATOR;
    public static final RevokePlace DELETE_ACCOUNT_USE_CASE;
    public static final RevokePlace Quarantine;
    public static final RevokePlace REMOVE_ACCOUNT_API;
    public static final RevokePlace REMOVE_ACCOUNT_EXPLICITLY_API;
    public static final RevokePlace Rotation;
    public static final RevokePlace SSO_ACCOUNT_SYNC;
    public static final RevokePlace UNKNOWN;

    static {
        RevokePlace revokePlace = new RevokePlace("UNKNOWN", 0);
        UNKNOWN = revokePlace;
        RevokePlace revokePlace2 = new RevokePlace("REMOVE_ACCOUNT_API", 1);
        REMOVE_ACCOUNT_API = revokePlace2;
        RevokePlace revokePlace3 = new RevokePlace("REMOVE_ACCOUNT_EXPLICITLY_API", 2);
        REMOVE_ACCOUNT_EXPLICITLY_API = revokePlace3;
        RevokePlace revokePlace4 = new RevokePlace("SSO_ACCOUNT_SYNC", 3);
        SSO_ACCOUNT_SYNC = revokePlace4;
        RevokePlace revokePlace5 = new RevokePlace("DELETE_ACCOUNT_USE_CASE", 4);
        DELETE_ACCOUNT_USE_CASE = revokePlace5;
        RevokePlace revokePlace6 = new RevokePlace("AUTHENTICATOR", 5);
        AUTHENTICATOR = revokePlace6;
        RevokePlace revokePlace7 = new RevokePlace("Rotation", 6);
        Rotation = revokePlace7;
        RevokePlace revokePlace8 = new RevokePlace("Quarantine", 7);
        Quarantine = revokePlace8;
        RevokePlace[] revokePlaceArr = {revokePlace, revokePlace2, revokePlace3, revokePlace4, revokePlace5, revokePlace6, revokePlace7, revokePlace8};
        $VALUES = revokePlaceArr;
        $ENTRIES = kotlin.enums.a.a(revokePlaceArr);
    }

    public static RevokePlace valueOf(String str) {
        return (RevokePlace) Enum.valueOf(RevokePlace.class, str);
    }

    public static RevokePlace[] values() {
        return (RevokePlace[]) $VALUES.clone();
    }

    public final String a() {
        return "Master token revoked. Place: " + name() + '.';
    }
}
