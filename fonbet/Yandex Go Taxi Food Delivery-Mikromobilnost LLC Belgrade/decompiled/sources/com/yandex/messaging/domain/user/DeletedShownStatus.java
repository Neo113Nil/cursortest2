package com.yandex.messaging.domain.user;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/messaging/domain/user/DeletedShownStatus;", "", "EmptyStatus", "DeletedInOrg", "DeletedAccount", "NormalStatus", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DeletedShownStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeletedShownStatus[] $VALUES;
    public static final DeletedShownStatus DeletedAccount;
    public static final DeletedShownStatus DeletedInOrg;
    public static final DeletedShownStatus EmptyStatus;
    public static final DeletedShownStatus NormalStatus;

    static {
        DeletedShownStatus deletedShownStatus = new DeletedShownStatus("EmptyStatus", 0);
        EmptyStatus = deletedShownStatus;
        DeletedShownStatus deletedShownStatus2 = new DeletedShownStatus("DeletedInOrg", 1);
        DeletedInOrg = deletedShownStatus2;
        DeletedShownStatus deletedShownStatus3 = new DeletedShownStatus("DeletedAccount", 2);
        DeletedAccount = deletedShownStatus3;
        DeletedShownStatus deletedShownStatus4 = new DeletedShownStatus("NormalStatus", 3);
        NormalStatus = deletedShownStatus4;
        DeletedShownStatus[] deletedShownStatusArr = {deletedShownStatus, deletedShownStatus2, deletedShownStatus3, deletedShownStatus4};
        $VALUES = deletedShownStatusArr;
        $ENTRIES = kotlin.enums.a.a(deletedShownStatusArr);
    }

    public static DeletedShownStatus valueOf(String str) {
        return (DeletedShownStatus) Enum.valueOf(DeletedShownStatus.class, str);
    }

    public static DeletedShownStatus[] values() {
        return (DeletedShownStatus[]) $VALUES.clone();
    }
}
