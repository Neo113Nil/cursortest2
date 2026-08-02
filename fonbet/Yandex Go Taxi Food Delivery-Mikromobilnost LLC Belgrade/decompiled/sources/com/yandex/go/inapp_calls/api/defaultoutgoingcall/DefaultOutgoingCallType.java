package com.yandex.go.inapp_calls.api.defaultoutgoingcall;

import defpackage.k4o;
import defpackage.kgh;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/inapp_calls/api/defaultoutgoingcall/DefaultOutgoingCallType;", "", "", "wireName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "kgh", "VOIP", "PHONE", "ALWAYS_ASK", "go-client-android.features.inapp_calls:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DefaultOutgoingCallType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DefaultOutgoingCallType[] $VALUES;
    public static final DefaultOutgoingCallType ALWAYS_ASK;
    public static final kgh Companion;
    public static final DefaultOutgoingCallType PHONE;
    public static final DefaultOutgoingCallType VOIP;
    private final String wireName;

    static {
        DefaultOutgoingCallType defaultOutgoingCallType = new DefaultOutgoingCallType("VOIP", 0, "VOIP");
        VOIP = defaultOutgoingCallType;
        DefaultOutgoingCallType defaultOutgoingCallType2 = new DefaultOutgoingCallType("PHONE", 1, "PHONE");
        PHONE = defaultOutgoingCallType2;
        DefaultOutgoingCallType defaultOutgoingCallType3 = new DefaultOutgoingCallType("ALWAYS_ASK", 2, "ALWAYS_ASK");
        ALWAYS_ASK = defaultOutgoingCallType3;
        DefaultOutgoingCallType[] defaultOutgoingCallTypeArr = {defaultOutgoingCallType, defaultOutgoingCallType2, defaultOutgoingCallType3};
        $VALUES = defaultOutgoingCallTypeArr;
        $ENTRIES = a.a(defaultOutgoingCallTypeArr);
        Companion = new kgh();
    }

    public DefaultOutgoingCallType(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static DefaultOutgoingCallType valueOf(String str) {
        return (DefaultOutgoingCallType) Enum.valueOf(DefaultOutgoingCallType.class, str);
    }

    public static DefaultOutgoingCallType[] values() {
        return (DefaultOutgoingCallType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
