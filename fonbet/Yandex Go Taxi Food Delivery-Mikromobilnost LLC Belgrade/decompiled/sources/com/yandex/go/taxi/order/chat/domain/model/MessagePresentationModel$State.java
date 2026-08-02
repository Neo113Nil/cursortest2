package com.yandex.go.taxi.order.chat.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/taxi/order/chat/domain/model/MessagePresentationModel$State", "", "Lcom/yandex/go/taxi/order/chat/domain/model/MessagePresentationModel$State;", "SENT", "PROGRESS", "ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MessagePresentationModel$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MessagePresentationModel$State[] $VALUES;
    public static final MessagePresentationModel$State ERROR;
    public static final MessagePresentationModel$State PROGRESS;
    public static final MessagePresentationModel$State SENT;

    static {
        MessagePresentationModel$State messagePresentationModel$State = new MessagePresentationModel$State("SENT", 0);
        SENT = messagePresentationModel$State;
        MessagePresentationModel$State messagePresentationModel$State2 = new MessagePresentationModel$State("PROGRESS", 1);
        PROGRESS = messagePresentationModel$State2;
        MessagePresentationModel$State messagePresentationModel$State3 = new MessagePresentationModel$State("ERROR", 2);
        ERROR = messagePresentationModel$State3;
        MessagePresentationModel$State[] messagePresentationModel$StateArr = {messagePresentationModel$State, messagePresentationModel$State2, messagePresentationModel$State3};
        $VALUES = messagePresentationModel$StateArr;
        $ENTRIES = a.a(messagePresentationModel$StateArr);
    }

    public static MessagePresentationModel$State valueOf(String str) {
        return (MessagePresentationModel$State) Enum.valueOf(MessagePresentationModel$State.class, str);
    }

    public static MessagePresentationModel$State[] values() {
        return (MessagePresentationModel$State[]) $VALUES.clone();
    }
}
