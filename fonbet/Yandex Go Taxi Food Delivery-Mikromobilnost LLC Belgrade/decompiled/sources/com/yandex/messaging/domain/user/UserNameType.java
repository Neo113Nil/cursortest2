package com.yandex.messaging.domain.user;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/messaging/domain/user/UserNameType;", "", "NORMAL", "DELETED", "NOT_FOUND", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserNameType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserNameType[] $VALUES;
    public static final UserNameType DELETED;
    public static final UserNameType NORMAL;
    public static final UserNameType NOT_FOUND;

    static {
        UserNameType userNameType = new UserNameType("NORMAL", 0);
        NORMAL = userNameType;
        UserNameType userNameType2 = new UserNameType("DELETED", 1);
        DELETED = userNameType2;
        UserNameType userNameType3 = new UserNameType("NOT_FOUND", 2);
        NOT_FOUND = userNameType3;
        UserNameType[] userNameTypeArr = {userNameType, userNameType2, userNameType3};
        $VALUES = userNameTypeArr;
        $ENTRIES = kotlin.enums.a.a(userNameTypeArr);
    }

    public static UserNameType valueOf(String str) {
        return (UserNameType) Enum.valueOf(UserNameType.class, str);
    }

    public static UserNameType[] values() {
        return (UserNameType[]) $VALUES.clone();
    }
}
