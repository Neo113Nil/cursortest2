package com.yandex.go.payments.cards.data.model;

import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.m831;
import defpackage.qje;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/cards/data/model/VerificationsParam;", "", "Companion", "$serializer", "com/yandex/go/payments/cards/data/model/p", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VerificationsParam {
    public static final p Companion = new p();
    public static final i3y[] f;
    public final String a;
    public final PaymentMethod$Type b;
    public final String c;
    public final String d;
    public final Set e;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new b931(1)), null, null, kotlin.a.b(lazyThreadSafetyMode, new b931(2))};
    }

    public /* synthetic */ VerificationsParam(int i, String str, PaymentMethod$Type paymentMethod$Type, String str2, String str3, Set set) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, VerificationsParam$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = paymentMethod$Type;
        this.c = str2;
        this.d = str3;
        this.e = set;
    }

    public VerificationsParam(m831 m831Var, String str, String str2, Set set) {
        String str3 = m831Var.a;
        PaymentMethod$Type paymentMethod$Type = m831Var.b;
        this.a = str3;
        this.b = paymentMethod$Type;
        this.c = str;
        this.d = str2;
        this.e = set;
    }
}
