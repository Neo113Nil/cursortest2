package com.yandex.go.taxi.order.chat.call_feedback.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackNotification;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/call_feedback/experiments/c", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallFeedbackNotification {
    public static final c Companion = new c();
    public final String a;
    public final String b;

    public /* synthetic */ CallFeedbackNotification(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public CallFeedbackNotification() {
        this.a = null;
        this.b = null;
    }
}
