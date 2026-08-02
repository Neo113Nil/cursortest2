package com.yandex.go.taxi.order.queue.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/taxi/order/queue/analytics/QueueAnalytics$Action", "", "Lcom/yandex/go/taxi/order/queue/analytics/QueueAnalytics$Action;", "", "action", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PRIMARY", "SECONDARY", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QueueAnalytics$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QueueAnalytics$Action[] $VALUES;
    public static final QueueAnalytics$Action PRIMARY;
    public static final QueueAnalytics$Action SECONDARY;
    private final String action;

    static {
        QueueAnalytics$Action queueAnalytics$Action = new QueueAnalytics$Action("PRIMARY", 0, "primary");
        PRIMARY = queueAnalytics$Action;
        QueueAnalytics$Action queueAnalytics$Action2 = new QueueAnalytics$Action("SECONDARY", 1, "secondary");
        SECONDARY = queueAnalytics$Action2;
        QueueAnalytics$Action[] queueAnalytics$ActionArr = {queueAnalytics$Action, queueAnalytics$Action2};
        $VALUES = queueAnalytics$ActionArr;
        $ENTRIES = a.a(queueAnalytics$ActionArr);
    }

    public QueueAnalytics$Action(String str, int i, String str2) {
        this.action = str2;
    }

    public static QueueAnalytics$Action valueOf(String str) {
        return (QueueAnalytics$Action) Enum.valueOf(QueueAnalytics$Action.class, str);
    }

    public static QueueAnalytics$Action[] values() {
        return (QueueAnalytics$Action[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAction() {
        return this.action;
    }
}
