package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/passport/api/PassportVpnStatus;", "", "Allowed", "Blocked", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PassportVpnStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportVpnStatus[] $VALUES;
    public static final PassportVpnStatus Allowed;
    public static final PassportVpnStatus Blocked;

    static {
        PassportVpnStatus passportVpnStatus = new PassportVpnStatus("Allowed", 0);
        Allowed = passportVpnStatus;
        PassportVpnStatus passportVpnStatus2 = new PassportVpnStatus("Blocked", 1);
        Blocked = passportVpnStatus2;
        PassportVpnStatus[] passportVpnStatusArr = {passportVpnStatus, passportVpnStatus2};
        $VALUES = passportVpnStatusArr;
        $ENTRIES = kotlin.enums.a.a(passportVpnStatusArr);
    }

    public static PassportVpnStatus valueOf(String str) {
        return (PassportVpnStatus) Enum.valueOf(PassportVpnStatus.class, str);
    }

    public static PassportVpnStatus[] values() {
        return (PassportVpnStatus[]) $VALUES.clone();
    }
}
