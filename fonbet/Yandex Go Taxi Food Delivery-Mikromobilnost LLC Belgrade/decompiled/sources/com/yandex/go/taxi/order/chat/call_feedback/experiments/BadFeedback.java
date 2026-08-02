package com.yandex.go.taxi.order.chat.call_feedback.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.p73;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/BadFeedback;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/call_feedback/experiments/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BadFeedback {
    public static final a Companion = new a();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new p73(26)), null};
    public final String a;
    public final List b;
    public final CallFeedbackNotification c;

    public /* synthetic */ BadFeedback(int i, String str, List list, CallFeedbackNotification callFeedbackNotification) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = callFeedbackNotification;
        }
    }

    public BadFeedback() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
