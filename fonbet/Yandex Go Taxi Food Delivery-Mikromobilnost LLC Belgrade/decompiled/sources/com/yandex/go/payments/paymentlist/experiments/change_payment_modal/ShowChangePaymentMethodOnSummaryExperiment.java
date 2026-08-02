package com.yandex.go.payments.paymentlist.experiments.change_payment_modal;

import defpackage.c6z;
import defpackage.dwq0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w96;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/change_payment_modal/ShowChangePaymentMethodOnSummaryExperiment;", "Lw96;", "Lc6z;", "Companion", "com/yandex/go/payments/paymentlist/experiments/change_payment_modal/g", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ShowChangePaymentMethodOnSummaryExperiment extends w96 implements c6z {
    public static final g Companion = new g();
    public static final i3y[] l;
    public static final ShowChangePaymentMethodOnSummaryExperiment m;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final PaymentMethod$Type j;
    public final List k;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        l = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new dwq0(25)), null, null, null, null, null, null, kotlin.a.b(lazyThreadSafetyMode, new dwq0(26)), kotlin.a.b(lazyThreadSafetyMode, new dwq0(27))};
        m = new ShowChangePaymentMethodOnSummaryExperiment(0);
    }

    public /* synthetic */ ShowChangePaymentMethodOnSummaryExperiment(int i, boolean z, Map map, String str, String str2, String str3, String str4, String str5, int i2, PaymentMethod$Type paymentMethod$Type, List list) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i & 32) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i & 64) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 128) == 0) {
            this.i = 1;
        } else {
            this.i = i2;
        }
        if ((i & 256) == 0) {
            this.j = null;
        } else {
            this.j = paymentMethod$Type;
        }
        if ((i & 512) == 0) {
            this.k = EmptyList.a;
        } else {
            this.k = list;
        }
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    public ShowChangePaymentMethodOnSummaryExperiment() {
        this(0);
    }

    public ShowChangePaymentMethodOnSummaryExperiment(int i) {
        Map f = kotlin.collections.b.f();
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = 1;
        this.j = null;
        this.k = EmptyList.a;
    }
}
