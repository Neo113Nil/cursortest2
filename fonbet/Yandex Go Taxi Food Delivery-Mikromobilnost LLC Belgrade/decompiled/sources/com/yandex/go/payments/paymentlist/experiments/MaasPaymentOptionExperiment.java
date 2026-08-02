package com.yandex.go.payments.paymentlist.experiments;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/MaasPaymentOptionExperiment;", "Ln96;", "Companion", "com/yandex/go/payments/paymentlist/experiments/i", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MaasPaymentOptionExperiment extends n96 {
    public static final i Companion = new i();
    public static final MaasPaymentOptionExperiment d = new MaasPaymentOptionExperiment(0);
    public final boolean b;
    public final String c;

    public /* synthetic */ MaasPaymentOptionExperiment(int i, String str, boolean z) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = "";
        } else {
            this.c = str;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public MaasPaymentOptionExperiment(int i) {
        this.b = false;
        this.c = "";
    }

    public MaasPaymentOptionExperiment() {
        this(0);
    }
}
