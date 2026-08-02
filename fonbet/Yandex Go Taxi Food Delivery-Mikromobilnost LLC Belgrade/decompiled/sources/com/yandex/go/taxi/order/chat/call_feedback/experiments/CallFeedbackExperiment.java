package com.yandex.go.taxi.order.chat.call_feedback.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.n96;
import defpackage.rm6;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/taxi/order/chat/call_feedback/experiments/b", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CallFeedbackExperiment extends n96 implements c6z {
    public static final b Companion = new b();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new rm6(29)), null};
    public final boolean b;
    public final Map c;
    public final CallFeedbackTexts d;

    public /* synthetic */ CallFeedbackExperiment(int i, boolean z, Map map, CallFeedbackTexts callFeedbackTexts) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = callFeedbackTexts;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getC() {
        return this.c;
    }

    public CallFeedbackExperiment() {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = null;
    }
}
