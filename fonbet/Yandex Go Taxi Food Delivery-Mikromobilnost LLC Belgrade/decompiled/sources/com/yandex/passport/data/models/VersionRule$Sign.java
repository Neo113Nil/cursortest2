package com.yandex.passport.data.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/passport/data/models/VersionRule$Sign", "", "Lcom/yandex/passport/data/models/VersionRule$Sign;", "EQUAL", "GREATER_OR_EQUAL", "passport-data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VersionRule$Sign {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VersionRule$Sign[] $VALUES;
    public static final VersionRule$Sign EQUAL;
    public static final VersionRule$Sign GREATER_OR_EQUAL;

    static {
        VersionRule$Sign versionRule$Sign = new VersionRule$Sign("EQUAL", 0);
        EQUAL = versionRule$Sign;
        VersionRule$Sign versionRule$Sign2 = new VersionRule$Sign("GREATER_OR_EQUAL", 1);
        GREATER_OR_EQUAL = versionRule$Sign2;
        VersionRule$Sign[] versionRule$SignArr = {versionRule$Sign, versionRule$Sign2};
        $VALUES = versionRule$SignArr;
        $ENTRIES = kotlin.enums.a.a(versionRule$SignArr);
    }

    public static VersionRule$Sign valueOf(String str) {
        return (VersionRule$Sign) Enum.valueOf(VersionRule$Sign.class, str);
    }

    public static VersionRule$Sign[] values() {
        return (VersionRule$Sign[]) $VALUES.clone();
    }
}
