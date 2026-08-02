package com.yandex.passport.internal.report.reporters;

import defpackage.b64;
import defpackage.k4o;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.HexString;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/yandex/passport/internal/report/reporters/DropPlace;", "", "Lcom/yandex/passport/internal/report/reporters/DropReason;", CRLReasonCodeExtension.REASON, "Lcom/yandex/passport/internal/report/reporters/DropReason;", "UNKNOWN", "CORRUPT", "GET_ACCOUNT", "INSERT_ACCOUNT", "GET_CODE_BY_UID_PERFORMER", "GREAT_PUSH_SUBSCRIBE", "GREAT_PUSH_UNSUBSCRIBE", "BIND_PHONE_COMMIT", "BIND_PHONE_SUBMIT", "AUTH_SDK_NATIVE", "GET_CLIENT_TOKEN", "REPAIR_CORRUPTED_SYNC", "REPAIR_CORRUPTED_RETRIEVE", "LEGACY_ACCOUNT_UPGRADE", "REFRESH_MODERN_ACCOUNT", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DropPlace {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DropPlace[] $VALUES;
    public static final DropPlace AUTH_SDK_NATIVE;
    public static final DropPlace BIND_PHONE_COMMIT;
    public static final DropPlace BIND_PHONE_SUBMIT;
    public static final DropPlace CORRUPT;
    public static final DropPlace GET_ACCOUNT;
    public static final DropPlace GET_CLIENT_TOKEN;
    public static final DropPlace GET_CODE_BY_UID_PERFORMER;
    public static final DropPlace GREAT_PUSH_SUBSCRIBE;
    public static final DropPlace GREAT_PUSH_UNSUBSCRIBE;
    public static final DropPlace INSERT_ACCOUNT;
    public static final DropPlace LEGACY_ACCOUNT_UPGRADE;
    public static final DropPlace REFRESH_MODERN_ACCOUNT;
    public static final DropPlace REPAIR_CORRUPTED_RETRIEVE;
    public static final DropPlace REPAIR_CORRUPTED_SYNC;
    public static final DropPlace UNKNOWN;
    private final DropReason reason;

    static {
        DropReason dropReason = DropReason.UNKNOWN;
        DropPlace dropPlace = new DropPlace("UNKNOWN", 0, dropReason);
        UNKNOWN = dropPlace;
        DropPlace dropPlace2 = new DropPlace("CORRUPT", 1, dropReason);
        CORRUPT = dropPlace2;
        DropReason dropReason2 = DropReason.SSO;
        DropPlace dropPlace3 = new DropPlace("GET_ACCOUNT", 2, dropReason2);
        GET_ACCOUNT = dropPlace3;
        DropPlace dropPlace4 = new DropPlace("INSERT_ACCOUNT", 3, dropReason2);
        INSERT_ACCOUNT = dropPlace4;
        DropPlace dropPlace5 = new DropPlace("GET_CODE_BY_UID_PERFORMER", 4, DropReason.GET_CODE_BY_UID);
        GET_CODE_BY_UID_PERFORMER = dropPlace5;
        DropPlace dropPlace6 = new DropPlace("GREAT_PUSH_SUBSCRIBE", 5, DropReason.PUSH_SUBSCRIBE);
        GREAT_PUSH_SUBSCRIBE = dropPlace6;
        DropPlace dropPlace7 = new DropPlace("GREAT_PUSH_UNSUBSCRIBE", 6, DropReason.PUSH_UNSUBSCRIBE);
        GREAT_PUSH_UNSUBSCRIBE = dropPlace7;
        DropPlace dropPlace8 = new DropPlace("BIND_PHONE_COMMIT", 7, DropReason.BIND_PHONE_COMMIT);
        BIND_PHONE_COMMIT = dropPlace8;
        DropPlace dropPlace9 = new DropPlace("BIND_PHONE_SUBMIT", 8, DropReason.BIND_PHONE_SUBMIT);
        BIND_PHONE_SUBMIT = dropPlace9;
        DropPlace dropPlace10 = new DropPlace("AUTH_SDK_NATIVE", 9, DropReason.AUTH_SDK_SUBMIT);
        AUTH_SDK_NATIVE = dropPlace10;
        DropPlace dropPlace11 = new DropPlace("GET_CLIENT_TOKEN", 10, DropReason.GET_CLIENT_TOKEN);
        GET_CLIENT_TOKEN = dropPlace11;
        DropReason dropReason3 = DropReason.SHORT_INFO;
        DropPlace dropPlace12 = new DropPlace("REPAIR_CORRUPTED_SYNC", 11, dropReason3);
        REPAIR_CORRUPTED_SYNC = dropPlace12;
        DropPlace dropPlace13 = new DropPlace("REPAIR_CORRUPTED_RETRIEVE", 12, dropReason3);
        REPAIR_CORRUPTED_RETRIEVE = dropPlace13;
        DropPlace dropPlace14 = new DropPlace("LEGACY_ACCOUNT_UPGRADE", 13, dropReason3);
        LEGACY_ACCOUNT_UPGRADE = dropPlace14;
        DropPlace dropPlace15 = new DropPlace("REFRESH_MODERN_ACCOUNT", 14, dropReason3);
        REFRESH_MODERN_ACCOUNT = dropPlace15;
        DropPlace[] dropPlaceArr = {dropPlace, dropPlace2, dropPlace3, dropPlace4, dropPlace5, dropPlace6, dropPlace7, dropPlace8, dropPlace9, dropPlace10, dropPlace11, dropPlace12, dropPlace13, dropPlace14, dropPlace15};
        $VALUES = dropPlaceArr;
        $ENTRIES = kotlin.enums.a.a(dropPlaceArr);
    }

    public DropPlace(String str, int i, DropReason dropReason) {
        this.reason = dropReason;
    }

    public static DropPlace valueOf(String str) {
        return (DropPlace) Enum.valueOf(DropPlace.class, str);
    }

    public static DropPlace[] values() {
        return (DropPlace[]) $VALUES.clone();
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder("Master token dropped. ");
        sb.append(str == null ? "" : unr0.l(HexString.CHAR_SPACE, "CallingPackageName: ", str));
        sb.append("Place: ");
        sb.append(name());
        sb.append(". Reason: ");
        return b64.p(sb, this.reason.getReason(), '.');
    }
}
