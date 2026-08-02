package com.yandex.go.payments.paymentlist.experiments;

import defpackage.c6z;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.n96;
import defpackage.wrp0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00032\u00020\u00012\u00020\u0002:\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/SelectedPaymentMethodButtonUIExperiment;", "Ln96;", "Lc6z;", "Companion", "com/yandex/go/payments/paymentlist/experiments/w", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SelectedPaymentMethodButtonUIExperiment extends n96 implements c6z {
    public static final w Companion = new w();
    public static final i3y[] h;
    public static final SelectedPaymentMethodButtonUIExperiment i;
    public final boolean b;
    public final Map c;
    public final String d;
    public final String e;
    public final String f;
    public final jsq0 g;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        h = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(14)), null, null, null, kotlin.a.b(lazyThreadSafetyMode, new wrp0(15))};
        i = new SelectedPaymentMethodButtonUIExperiment(0);
    }

    public /* synthetic */ SelectedPaymentMethodButtonUIExperiment(int i2, boolean z, Map map, String str, String str2, String str3, jsq0 jsq0Var) {
        this.b = (i2 & 1) == 0 ? false : z;
        if ((i2 & 2) == 0) {
            this.c = kotlin.collections.b.f();
        } else {
            this.c = map;
        }
        if ((i2 & 4) == 0) {
            this.d = "";
        } else {
            this.d = str;
        }
        if ((i2 & 8) == 0) {
            this.e = "";
        } else {
            this.e = str2;
        }
        if ((i2 & 16) == 0) {
            this.f = "";
        } else {
            this.f = str3;
        }
        if ((i2 & 32) == 0) {
            this.g = ksq0.a;
        } else {
            this.g = jsq0Var;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.c6z
    /* renamed from: f, reason: from getter */
    public final Map getB() {
        return this.c;
    }

    public SelectedPaymentMethodButtonUIExperiment() {
        this(0);
    }

    public SelectedPaymentMethodButtonUIExperiment(int i2) {
        Map f = kotlin.collections.b.f();
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = f;
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = jsq0Var;
    }
}
