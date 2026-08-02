package com.yandex.plus.pay.repository.api.model.sync;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/pay/repository/api/model/sync/UserSyncStatus;", "", "SYNC_IN_PROGRESS", "SYNCED", "pay-sdk-domain-repository-api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserSyncStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UserSyncStatus[] $VALUES;
    public static final UserSyncStatus SYNCED;
    public static final UserSyncStatus SYNC_IN_PROGRESS;

    static {
        UserSyncStatus userSyncStatus = new UserSyncStatus("SYNC_IN_PROGRESS", 0);
        SYNC_IN_PROGRESS = userSyncStatus;
        UserSyncStatus userSyncStatus2 = new UserSyncStatus("SYNCED", 1);
        SYNCED = userSyncStatus2;
        UserSyncStatus[] userSyncStatusArr = {userSyncStatus, userSyncStatus2};
        $VALUES = userSyncStatusArr;
        $ENTRIES = a.a(userSyncStatusArr);
    }

    public static UserSyncStatus valueOf(String str) {
        return (UserSyncStatus) Enum.valueOf(UserSyncStatus.class, str);
    }

    public static UserSyncStatus[] values() {
        return (UserSyncStatus[]) $VALUES.clone();
    }
}
