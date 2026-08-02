package com.yandex.go.superapp.api.loading_tracker;

import defpackage.fdn;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/superapp/api/loading_tracker/GlobalLoadingEvent;", "Lfdn;", "", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "HANDLE_DEEPLINK", "ROUTING_PREPARE", "NATIVE_AUTH_START", "NATIVE_AUTH_FINISH", "ROUTING_START", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GlobalLoadingEvent implements fdn {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ GlobalLoadingEvent[] $VALUES;
    public static final GlobalLoadingEvent HANDLE_DEEPLINK;
    public static final GlobalLoadingEvent NATIVE_AUTH_FINISH;
    public static final GlobalLoadingEvent NATIVE_AUTH_START;
    public static final GlobalLoadingEvent ROUTING_PREPARE;
    public static final GlobalLoadingEvent ROUTING_START;
    private final String key;

    static {
        GlobalLoadingEvent globalLoadingEvent = new GlobalLoadingEvent("HANDLE_DEEPLINK", 0, "handle_deeplink");
        HANDLE_DEEPLINK = globalLoadingEvent;
        GlobalLoadingEvent globalLoadingEvent2 = new GlobalLoadingEvent("ROUTING_PREPARE", 1, "routing_prepare");
        ROUTING_PREPARE = globalLoadingEvent2;
        GlobalLoadingEvent globalLoadingEvent3 = new GlobalLoadingEvent("NATIVE_AUTH_START", 2, "native_auth_start");
        NATIVE_AUTH_START = globalLoadingEvent3;
        GlobalLoadingEvent globalLoadingEvent4 = new GlobalLoadingEvent("NATIVE_AUTH_FINISH", 3, "native_auth_finish");
        NATIVE_AUTH_FINISH = globalLoadingEvent4;
        GlobalLoadingEvent globalLoadingEvent5 = new GlobalLoadingEvent("ROUTING_START", 4, "routing_start");
        ROUTING_START = globalLoadingEvent5;
        GlobalLoadingEvent[] globalLoadingEventArr = {globalLoadingEvent, globalLoadingEvent2, globalLoadingEvent3, globalLoadingEvent4, globalLoadingEvent5};
        $VALUES = globalLoadingEventArr;
        $ENTRIES = a.a(globalLoadingEventArr);
    }

    public GlobalLoadingEvent(String str, int i, String str2) {
        this.key = str2;
    }

    public static GlobalLoadingEvent valueOf(String str) {
        return (GlobalLoadingEvent) Enum.valueOf(GlobalLoadingEvent.class, str);
    }

    public static GlobalLoadingEvent[] values() {
        return (GlobalLoadingEvent[]) $VALUES.clone();
    }

    @Override // defpackage.fdn
    public final String getKey() {
        return this.key;
    }
}
