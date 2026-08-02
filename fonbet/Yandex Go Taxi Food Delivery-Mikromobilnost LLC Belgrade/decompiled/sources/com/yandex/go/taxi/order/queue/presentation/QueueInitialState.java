package com.yandex.go.taxi.order.queue.presentation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/queue/presentation/QueueInitialState;", "", "MAIN", "CONFIRM", "UPDATE", "CONFIRM_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QueueInitialState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QueueInitialState[] $VALUES;
    public static final QueueInitialState CONFIRM;
    public static final QueueInitialState CONFIRM_ERROR;
    public static final QueueInitialState MAIN;
    public static final QueueInitialState UPDATE;

    static {
        QueueInitialState queueInitialState = new QueueInitialState("MAIN", 0);
        MAIN = queueInitialState;
        QueueInitialState queueInitialState2 = new QueueInitialState("CONFIRM", 1);
        CONFIRM = queueInitialState2;
        QueueInitialState queueInitialState3 = new QueueInitialState("UPDATE", 2);
        UPDATE = queueInitialState3;
        QueueInitialState queueInitialState4 = new QueueInitialState("CONFIRM_ERROR", 3);
        CONFIRM_ERROR = queueInitialState4;
        QueueInitialState[] queueInitialStateArr = {queueInitialState, queueInitialState2, queueInitialState3, queueInitialState4};
        $VALUES = queueInitialStateArr;
        $ENTRIES = a.a(queueInitialStateArr);
    }

    public static QueueInitialState valueOf(String str) {
        return (QueueInitialState) Enum.valueOf(QueueInitialState.class, str);
    }

    public static QueueInitialState[] values() {
        return (QueueInitialState[]) $VALUES.clone();
    }
}
