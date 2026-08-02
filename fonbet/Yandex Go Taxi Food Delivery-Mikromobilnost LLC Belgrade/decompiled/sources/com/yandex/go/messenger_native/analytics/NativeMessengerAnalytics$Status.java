package com.yandex.go.messenger_native.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/messenger_native/analytics/NativeMessengerAnalytics$Status", "", "Lcom/yandex/go/messenger_native/analytics/NativeMessengerAnalytics$Status;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Connected", "Failed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class NativeMessengerAnalytics$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NativeMessengerAnalytics$Status[] $VALUES;
    public static final NativeMessengerAnalytics$Status Connected;
    public static final NativeMessengerAnalytics$Status Failed;
    private final String eventValue;

    static {
        NativeMessengerAnalytics$Status nativeMessengerAnalytics$Status = new NativeMessengerAnalytics$Status("Connected", 0, "connected");
        Connected = nativeMessengerAnalytics$Status;
        NativeMessengerAnalytics$Status nativeMessengerAnalytics$Status2 = new NativeMessengerAnalytics$Status("Failed", 1, "failed");
        Failed = nativeMessengerAnalytics$Status2;
        NativeMessengerAnalytics$Status[] nativeMessengerAnalytics$StatusArr = {nativeMessengerAnalytics$Status, nativeMessengerAnalytics$Status2};
        $VALUES = nativeMessengerAnalytics$StatusArr;
        $ENTRIES = a.a(nativeMessengerAnalytics$StatusArr);
    }

    public NativeMessengerAnalytics$Status(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NativeMessengerAnalytics$Status valueOf(String str) {
        return (NativeMessengerAnalytics$Status) Enum.valueOf(NativeMessengerAnalytics$Status.class, str);
    }

    public static NativeMessengerAnalytics$Status[] values() {
        return (NativeMessengerAnalytics$Status[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
