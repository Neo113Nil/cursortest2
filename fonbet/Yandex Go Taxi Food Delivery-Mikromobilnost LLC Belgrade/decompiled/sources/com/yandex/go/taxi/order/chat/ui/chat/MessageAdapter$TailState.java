package com.yandex.go.taxi.order.chat.ui.chat;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/chat/ui/chat/MessageAdapter$TailState", "", "Lcom/yandex/go/taxi/order/chat/ui/chat/MessageAdapter$TailState;", "NO_TAIL_CHANGES", "TAIL_MOVES", "TAIL_APPENDED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
final class MessageAdapter$TailState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessageAdapter$TailState[] $VALUES;
    public static final MessageAdapter$TailState NO_TAIL_CHANGES;
    public static final MessageAdapter$TailState TAIL_APPENDED;
    public static final MessageAdapter$TailState TAIL_MOVES;

    static {
        MessageAdapter$TailState messageAdapter$TailState = new MessageAdapter$TailState("NO_TAIL_CHANGES", 0);
        NO_TAIL_CHANGES = messageAdapter$TailState;
        MessageAdapter$TailState messageAdapter$TailState2 = new MessageAdapter$TailState("TAIL_MOVES", 1);
        TAIL_MOVES = messageAdapter$TailState2;
        MessageAdapter$TailState messageAdapter$TailState3 = new MessageAdapter$TailState("TAIL_APPENDED", 2);
        TAIL_APPENDED = messageAdapter$TailState3;
        MessageAdapter$TailState[] messageAdapter$TailStateArr = {messageAdapter$TailState, messageAdapter$TailState2, messageAdapter$TailState3};
        $VALUES = messageAdapter$TailStateArr;
        $ENTRIES = kotlin.enums.a.a(messageAdapter$TailStateArr);
    }

    public static MessageAdapter$TailState valueOf(String str) {
        return (MessageAdapter$TailState) Enum.valueOf(MessageAdapter$TailState.class, str);
    }

    public static MessageAdapter$TailState[] values() {
        return (MessageAdapter$TailState[]) $VALUES.clone();
    }
}
