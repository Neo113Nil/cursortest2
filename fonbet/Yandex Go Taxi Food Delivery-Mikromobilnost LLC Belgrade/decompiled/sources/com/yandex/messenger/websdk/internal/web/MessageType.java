package com.yandex.messenger.websdk.internal.web;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/messenger/websdk/internal/web/MessageType;", "", "", "rawValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Registration", "Request", "Response", "Observe", "Unobserve", "websdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageType[] $VALUES;
    public static final MessageType Observe;
    public static final MessageType Registration;
    public static final MessageType Request;
    public static final MessageType Response;
    public static final MessageType Unobserve;
    private final String rawValue;

    static {
        MessageType messageType = new MessageType("Registration", 0, "registration");
        Registration = messageType;
        MessageType messageType2 = new MessageType("Request", 1, "request");
        Request = messageType2;
        MessageType messageType3 = new MessageType("Response", 2, "response");
        Response = messageType3;
        MessageType messageType4 = new MessageType("Observe", 3, "observe");
        Observe = messageType4;
        MessageType messageType5 = new MessageType("Unobserve", 4, "unobserve");
        Unobserve = messageType5;
        MessageType[] messageTypeArr = {messageType, messageType2, messageType3, messageType4, messageType5};
        $VALUES = messageTypeArr;
        $ENTRIES = a.a(messageTypeArr);
    }

    public MessageType(String str, int i, String str2) {
        this.rawValue = str2;
    }

    public static MessageType valueOf(String str) {
        return (MessageType) Enum.valueOf(MessageType.class, str);
    }

    public static MessageType[] values() {
        return (MessageType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getRawValue() {
        return this.rawValue;
    }
}
