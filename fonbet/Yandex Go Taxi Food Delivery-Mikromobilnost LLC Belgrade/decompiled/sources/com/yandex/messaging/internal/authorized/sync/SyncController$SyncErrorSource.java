package com.yandex.messaging.internal.authorized.sync;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/messaging/internal/authorized/sync/SyncController$SyncErrorSource", "", "Lcom/yandex/messaging/internal/authorized/sync/SyncController$SyncErrorSource;", "HISTORY", "WHOAMI", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SyncController$SyncErrorSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SyncController$SyncErrorSource[] $VALUES;
    public static final SyncController$SyncErrorSource HISTORY;
    public static final SyncController$SyncErrorSource WHOAMI;

    static {
        SyncController$SyncErrorSource syncController$SyncErrorSource = new SyncController$SyncErrorSource("HISTORY", 0);
        HISTORY = syncController$SyncErrorSource;
        SyncController$SyncErrorSource syncController$SyncErrorSource2 = new SyncController$SyncErrorSource("WHOAMI", 1);
        WHOAMI = syncController$SyncErrorSource2;
        SyncController$SyncErrorSource[] syncController$SyncErrorSourceArr = {syncController$SyncErrorSource, syncController$SyncErrorSource2};
        $VALUES = syncController$SyncErrorSourceArr;
        $ENTRIES = kotlin.enums.a.a(syncController$SyncErrorSourceArr);
    }

    public static SyncController$SyncErrorSource valueOf(String str) {
        return (SyncController$SyncErrorSource) Enum.valueOf(SyncController$SyncErrorSource.class, str);
    }

    public static SyncController$SyncErrorSource[] values() {
        return (SyncController$SyncErrorSource[]) $VALUES.clone();
    }
}
