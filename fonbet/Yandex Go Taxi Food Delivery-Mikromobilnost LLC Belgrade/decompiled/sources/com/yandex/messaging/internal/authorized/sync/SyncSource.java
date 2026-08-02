package com.yandex.messaging.internal.authorized.sync;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/yandex/messaging/internal/authorized/sync/SyncSource;", "", "", "logName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Sync", "LazySync", "Notification", "ThreadFetcher", "MeetingCall", "MarkAsReadAction", "LastMessageApi", "UnreadCountApi", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SyncSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SyncSource[] $VALUES;
    public static final SyncSource LastMessageApi;
    public static final SyncSource LazySync;
    public static final SyncSource MarkAsReadAction;
    public static final SyncSource MeetingCall;
    public static final SyncSource Notification;
    public static final SyncSource Sync;
    public static final SyncSource ThreadFetcher;
    public static final SyncSource UnreadCountApi;
    private final String logName;

    static {
        SyncSource syncSource = new SyncSource("Sync", 0, "Sync");
        Sync = syncSource;
        SyncSource syncSource2 = new SyncSource("LazySync", 1, "LazySync");
        LazySync = syncSource2;
        SyncSource syncSource3 = new SyncSource("Notification", 2, "Notification");
        Notification = syncSource3;
        SyncSource syncSource4 = new SyncSource("ThreadFetcher", 3, "ThreadFetcher");
        ThreadFetcher = syncSource4;
        SyncSource syncSource5 = new SyncSource("MeetingCall", 4, "MeetingCall");
        MeetingCall = syncSource5;
        SyncSource syncSource6 = new SyncSource("MarkAsReadAction", 5, "MarkAsReadAction");
        MarkAsReadAction = syncSource6;
        SyncSource syncSource7 = new SyncSource("LastMessageApi", 6, "LastMessageApi");
        LastMessageApi = syncSource7;
        SyncSource syncSource8 = new SyncSource("UnreadCountApi", 7, "UnreadCountApi");
        UnreadCountApi = syncSource8;
        SyncSource[] syncSourceArr = {syncSource, syncSource2, syncSource3, syncSource4, syncSource5, syncSource6, syncSource7, syncSource8};
        $VALUES = syncSourceArr;
        $ENTRIES = kotlin.enums.a.a(syncSourceArr);
    }

    public SyncSource(String str, int i, String str2) {
        this.logName = str2;
    }

    public static SyncSource valueOf(String str) {
        return (SyncSource) Enum.valueOf(SyncSource.class, str);
    }

    public static SyncSource[] values() {
        return (SyncSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getLogName() {
        return this.logName;
    }
}
