package com.yandex.go.messenger_native.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/messenger_native/api/NativeMessengerConnectionStatus;", "", "CONNECTED", "IN_PROGRESS", "FAILED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NativeMessengerConnectionStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerConnectionStatus[] $VALUES;
    public static final NativeMessengerConnectionStatus CONNECTED;
    public static final NativeMessengerConnectionStatus FAILED;
    public static final NativeMessengerConnectionStatus IN_PROGRESS;

    static {
        NativeMessengerConnectionStatus nativeMessengerConnectionStatus = new NativeMessengerConnectionStatus("CONNECTED", 0);
        CONNECTED = nativeMessengerConnectionStatus;
        NativeMessengerConnectionStatus nativeMessengerConnectionStatus2 = new NativeMessengerConnectionStatus("IN_PROGRESS", 1);
        IN_PROGRESS = nativeMessengerConnectionStatus2;
        NativeMessengerConnectionStatus nativeMessengerConnectionStatus3 = new NativeMessengerConnectionStatus("FAILED", 2);
        FAILED = nativeMessengerConnectionStatus3;
        NativeMessengerConnectionStatus[] nativeMessengerConnectionStatusArr = {nativeMessengerConnectionStatus, nativeMessengerConnectionStatus2, nativeMessengerConnectionStatus3};
        $VALUES = nativeMessengerConnectionStatusArr;
        $ENTRIES = a.a(nativeMessengerConnectionStatusArr);
    }

    public static NativeMessengerConnectionStatus valueOf(String str) {
        return (NativeMessengerConnectionStatus) Enum.valueOf(NativeMessengerConnectionStatus.class, str);
    }

    public static NativeMessengerConnectionStatus[] values() {
        return (NativeMessengerConnectionStatus[]) $VALUES.clone();
    }
}
