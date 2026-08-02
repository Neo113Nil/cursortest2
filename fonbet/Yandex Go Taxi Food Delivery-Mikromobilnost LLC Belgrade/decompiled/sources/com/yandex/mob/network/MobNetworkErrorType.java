package com.yandex.mob.network;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/mob/network/MobNetworkErrorType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Timeout", "Http", "Dns", "Connection", "Ssl", "Unknown", "Cancelled", "core"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MobNetworkErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MobNetworkErrorType[] $VALUES;
    public static final MobNetworkErrorType Cancelled;
    public static final MobNetworkErrorType Connection;
    public static final MobNetworkErrorType Dns;
    public static final MobNetworkErrorType Http;
    public static final MobNetworkErrorType Ssl;
    public static final MobNetworkErrorType Timeout;
    public static final MobNetworkErrorType Unknown;
    private final String value;

    static {
        MobNetworkErrorType mobNetworkErrorType = new MobNetworkErrorType("Timeout", 0, "timeout");
        Timeout = mobNetworkErrorType;
        MobNetworkErrorType mobNetworkErrorType2 = new MobNetworkErrorType("Http", 1, "http");
        Http = mobNetworkErrorType2;
        MobNetworkErrorType mobNetworkErrorType3 = new MobNetworkErrorType("Dns", 2, "dns");
        Dns = mobNetworkErrorType3;
        MobNetworkErrorType mobNetworkErrorType4 = new MobNetworkErrorType("Connection", 3, "connection");
        Connection = mobNetworkErrorType4;
        MobNetworkErrorType mobNetworkErrorType5 = new MobNetworkErrorType("Ssl", 4, "ssl");
        Ssl = mobNetworkErrorType5;
        MobNetworkErrorType mobNetworkErrorType6 = new MobNetworkErrorType("Unknown", 5, "unknown");
        Unknown = mobNetworkErrorType6;
        MobNetworkErrorType mobNetworkErrorType7 = new MobNetworkErrorType("Cancelled", 6, "cancelled");
        Cancelled = mobNetworkErrorType7;
        MobNetworkErrorType[] mobNetworkErrorTypeArr = {mobNetworkErrorType, mobNetworkErrorType2, mobNetworkErrorType3, mobNetworkErrorType4, mobNetworkErrorType5, mobNetworkErrorType6, mobNetworkErrorType7};
        $VALUES = mobNetworkErrorTypeArr;
        $ENTRIES = kotlin.enums.a.a(mobNetworkErrorTypeArr);
    }

    public MobNetworkErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static MobNetworkErrorType valueOf(String str) {
        return (MobNetworkErrorType) Enum.valueOf(MobNetworkErrorType.class, str);
    }

    public static MobNetworkErrorType[] values() {
        return (MobNetworkErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
