package com.yandex.messaging.internal;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/messaging/internal/MessageMenuActions$MessageActionsBehaviour", "", "Lcom/yandex/messaging/internal/MessageMenuActions$MessageActionsBehaviour;", "DEFAULT", "FORWARDED", "HAS_FORWARDS", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MessageMenuActions$MessageActionsBehaviour {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageMenuActions$MessageActionsBehaviour[] $VALUES;
    public static final MessageMenuActions$MessageActionsBehaviour DEFAULT;
    public static final MessageMenuActions$MessageActionsBehaviour FORWARDED;
    public static final MessageMenuActions$MessageActionsBehaviour HAS_FORWARDS;

    static {
        MessageMenuActions$MessageActionsBehaviour messageMenuActions$MessageActionsBehaviour = new MessageMenuActions$MessageActionsBehaviour("DEFAULT", 0);
        DEFAULT = messageMenuActions$MessageActionsBehaviour;
        MessageMenuActions$MessageActionsBehaviour messageMenuActions$MessageActionsBehaviour2 = new MessageMenuActions$MessageActionsBehaviour("FORWARDED", 1);
        FORWARDED = messageMenuActions$MessageActionsBehaviour2;
        MessageMenuActions$MessageActionsBehaviour messageMenuActions$MessageActionsBehaviour3 = new MessageMenuActions$MessageActionsBehaviour("HAS_FORWARDS", 2);
        HAS_FORWARDS = messageMenuActions$MessageActionsBehaviour3;
        MessageMenuActions$MessageActionsBehaviour[] messageMenuActions$MessageActionsBehaviourArr = {messageMenuActions$MessageActionsBehaviour, messageMenuActions$MessageActionsBehaviour2, messageMenuActions$MessageActionsBehaviour3};
        $VALUES = messageMenuActions$MessageActionsBehaviourArr;
        $ENTRIES = kotlin.enums.a.a(messageMenuActions$MessageActionsBehaviourArr);
    }

    public static MessageMenuActions$MessageActionsBehaviour valueOf(String str) {
        return (MessageMenuActions$MessageActionsBehaviour) Enum.valueOf(MessageMenuActions$MessageActionsBehaviour.class, str);
    }

    public static MessageMenuActions$MessageActionsBehaviour[] values() {
        return (MessageMenuActions$MessageActionsBehaviour[]) $VALUES.clone();
    }
}
