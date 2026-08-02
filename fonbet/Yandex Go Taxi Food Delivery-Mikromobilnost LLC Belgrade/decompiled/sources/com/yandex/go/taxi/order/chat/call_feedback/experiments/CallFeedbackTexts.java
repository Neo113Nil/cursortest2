package com.yandex.go.taxi.order.chat.call_feedback.experiments;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/chat/call_feedback/experiments/CallFeedbackTexts;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/chat/call_feedback/experiments/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CallFeedbackTexts {
    public static final d Companion = new d();
    public final BadFeedback a;
    public final GoodFeedback b;
    public final GeneralFeedback c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ CallFeedbackTexts(int i, BadFeedback badFeedback, GoodFeedback goodFeedback, GeneralFeedback generalFeedback, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = badFeedback;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = goodFeedback;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = generalFeedback;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str3;
        }
    }

    /* renamed from: a, reason: from getter */
    public final BadFeedback getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final String getD() {
        return this.d;
    }

    /* renamed from: c, reason: from getter */
    public final GeneralFeedback getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final GoodFeedback getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final String getE() {
        return this.e;
    }

    /* renamed from: f, reason: from getter */
    public final String getF() {
        return this.f;
    }

    public CallFeedbackTexts() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
