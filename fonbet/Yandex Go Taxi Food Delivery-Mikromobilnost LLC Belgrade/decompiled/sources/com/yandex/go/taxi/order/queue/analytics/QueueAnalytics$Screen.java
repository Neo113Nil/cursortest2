package com.yandex.go.taxi.order.queue.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"com/yandex/go/taxi/order/queue/analytics/QueueAnalytics$Screen", "", "Lcom/yandex/go/taxi/order/queue/analytics/QueueAnalytics$Screen;", "", MetaDataField.SCREEN_FIELD, "Ljava/lang/String;", "getScreen", "()Ljava/lang/String;", "MAIN", "CONFIRM", "UPDATE", "CONFIRM_ERROR", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class QueueAnalytics$Screen {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QueueAnalytics$Screen[] $VALUES;
    public static final QueueAnalytics$Screen CONFIRM;
    public static final QueueAnalytics$Screen CONFIRM_ERROR;
    public static final QueueAnalytics$Screen MAIN;
    public static final QueueAnalytics$Screen UPDATE;
    private final String screen;

    static {
        QueueAnalytics$Screen queueAnalytics$Screen = new QueueAnalytics$Screen("MAIN", 0, "main");
        MAIN = queueAnalytics$Screen;
        QueueAnalytics$Screen queueAnalytics$Screen2 = new QueueAnalytics$Screen("CONFIRM", 1, "confirm");
        CONFIRM = queueAnalytics$Screen2;
        QueueAnalytics$Screen queueAnalytics$Screen3 = new QueueAnalytics$Screen("UPDATE", 2, "update");
        UPDATE = queueAnalytics$Screen3;
        QueueAnalytics$Screen queueAnalytics$Screen4 = new QueueAnalytics$Screen("CONFIRM_ERROR", 3, "confirm_error");
        CONFIRM_ERROR = queueAnalytics$Screen4;
        QueueAnalytics$Screen[] queueAnalytics$ScreenArr = {queueAnalytics$Screen, queueAnalytics$Screen2, queueAnalytics$Screen3, queueAnalytics$Screen4};
        $VALUES = queueAnalytics$ScreenArr;
        $ENTRIES = a.a(queueAnalytics$ScreenArr);
    }

    public QueueAnalytics$Screen(String str, int i, String str2) {
        this.screen = str2;
    }

    public static QueueAnalytics$Screen valueOf(String str) {
        return (QueueAnalytics$Screen) Enum.valueOf(QueueAnalytics$Screen.class, str);
    }

    public static QueueAnalytics$Screen[] values() {
        return (QueueAnalytics$Screen[]) $VALUES.clone();
    }

    public final String getScreen() {
        return this.screen;
    }
}
