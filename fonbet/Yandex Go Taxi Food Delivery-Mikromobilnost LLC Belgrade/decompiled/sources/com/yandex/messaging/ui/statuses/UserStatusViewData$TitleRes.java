package com.yandex.messaging.ui.statuses;

import defpackage.k4o;
import defpackage.oyh0;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/messaging/ui/statuses/UserStatusViewData$TitleRes", "", "Lcom/yandex/messaging/ui/statuses/UserStatusViewData$TitleRes;", "", "res", CA20Status.STATUS_USER_I, "a", "()I", "Default", "Busy", "Away", "Dnd", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UserStatusViewData$TitleRes {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserStatusViewData$TitleRes[] $VALUES;
    public static final UserStatusViewData$TitleRes Away;
    public static final UserStatusViewData$TitleRes Busy;
    public static final UserStatusViewData$TitleRes Default;
    public static final UserStatusViewData$TitleRes Dnd;
    private final int res;

    static {
        UserStatusViewData$TitleRes userStatusViewData$TitleRes = new UserStatusViewData$TitleRes("Default", 0, oyh0.statuses_default_title);
        Default = userStatusViewData$TitleRes;
        UserStatusViewData$TitleRes userStatusViewData$TitleRes2 = new UserStatusViewData$TitleRes("Busy", 1, oyh0.statuses_busy_title);
        Busy = userStatusViewData$TitleRes2;
        UserStatusViewData$TitleRes userStatusViewData$TitleRes3 = new UserStatusViewData$TitleRes("Away", 2, oyh0.statuses_away_title);
        Away = userStatusViewData$TitleRes3;
        UserStatusViewData$TitleRes userStatusViewData$TitleRes4 = new UserStatusViewData$TitleRes("Dnd", 3, oyh0.statuses_dnd_title);
        Dnd = userStatusViewData$TitleRes4;
        UserStatusViewData$TitleRes[] userStatusViewData$TitleResArr = {userStatusViewData$TitleRes, userStatusViewData$TitleRes2, userStatusViewData$TitleRes3, userStatusViewData$TitleRes4};
        $VALUES = userStatusViewData$TitleResArr;
        $ENTRIES = kotlin.enums.a.a(userStatusViewData$TitleResArr);
    }

    public UserStatusViewData$TitleRes(String str, int i, int i2) {
        this.res = i2;
    }

    public static UserStatusViewData$TitleRes valueOf(String str) {
        return (UserStatusViewData$TitleRes) Enum.valueOf(UserStatusViewData$TitleRes.class, str);
    }

    public static UserStatusViewData$TitleRes[] values() {
        return (UserStatusViewData$TitleRes[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final int getRes() {
        return this.res;
    }
}
