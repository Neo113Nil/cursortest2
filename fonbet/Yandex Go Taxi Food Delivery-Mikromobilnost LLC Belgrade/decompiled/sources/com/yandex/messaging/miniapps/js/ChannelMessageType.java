package com.yandex.messaging.miniapps.js;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/messaging/miniapps/js/ChannelMessageType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Registration", "Request", "Response", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ChannelMessageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChannelMessageType[] $VALUES;
    public static final ChannelMessageType Registration;
    public static final ChannelMessageType Request;
    public static final ChannelMessageType Response;
    private final String value;

    static {
        ChannelMessageType channelMessageType = new ChannelMessageType("Registration", 0, "registration");
        Registration = channelMessageType;
        ChannelMessageType channelMessageType2 = new ChannelMessageType("Request", 1, "request");
        Request = channelMessageType2;
        ChannelMessageType channelMessageType3 = new ChannelMessageType("Response", 2, "response");
        Response = channelMessageType3;
        ChannelMessageType[] channelMessageTypeArr = {channelMessageType, channelMessageType2, channelMessageType3};
        $VALUES = channelMessageTypeArr;
        $ENTRIES = a.a(channelMessageTypeArr);
    }

    public ChannelMessageType(String str, int i, String str2) {
        this.value = str2;
    }

    public static ChannelMessageType valueOf(String str) {
        return (ChannelMessageType) Enum.valueOf(ChannelMessageType.class, str);
    }

    public static ChannelMessageType[] values() {
        return (ChannelMessageType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
