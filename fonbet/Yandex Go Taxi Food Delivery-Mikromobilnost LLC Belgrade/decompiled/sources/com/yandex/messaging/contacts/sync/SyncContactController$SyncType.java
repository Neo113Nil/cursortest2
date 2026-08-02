package com.yandex.messaging.contacts.sync;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/messaging/contacts/sync/SyncContactController$SyncType", "", "Lcom/yandex/messaging/contacts/sync/SyncContactController$SyncType;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "FULL", "INCREMENT", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SyncContactController$SyncType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SyncContactController$SyncType[] $VALUES;
    public static final SyncContactController$SyncType FULL;
    public static final SyncContactController$SyncType INCREMENT;
    private final String value;

    static {
        SyncContactController$SyncType syncContactController$SyncType = new SyncContactController$SyncType("FULL", 0, "full");
        FULL = syncContactController$SyncType;
        SyncContactController$SyncType syncContactController$SyncType2 = new SyncContactController$SyncType("INCREMENT", 1, "increment");
        INCREMENT = syncContactController$SyncType2;
        SyncContactController$SyncType[] syncContactController$SyncTypeArr = {syncContactController$SyncType, syncContactController$SyncType2};
        $VALUES = syncContactController$SyncTypeArr;
        $ENTRIES = kotlin.enums.a.a(syncContactController$SyncTypeArr);
    }

    public SyncContactController$SyncType(String str, int i, String str2) {
        this.value = str2;
    }

    public static SyncContactController$SyncType valueOf(String str) {
        return (SyncContactController$SyncType) Enum.valueOf(SyncContactController$SyncType.class, str);
    }

    public static SyncContactController$SyncType[] values() {
        return (SyncContactController$SyncType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
