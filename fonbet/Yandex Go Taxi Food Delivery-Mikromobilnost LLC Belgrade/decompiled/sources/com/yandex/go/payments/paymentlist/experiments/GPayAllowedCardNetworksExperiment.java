package com.yandex.go.payments.paymentlist.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.n96;
import defpackage.v5r;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/payments/paymentlist/experiments/GPayAllowedCardNetworksExperiment;", "Ln96;", "Companion", "com/yandex/go/payments/paymentlist/experiments/h", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GPayAllowedCardNetworksExperiment extends n96 {
    public static final h Companion = new h();
    public static final i3y[] d = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v5r(29))};
    public static final GPayAllowedCardNetworksExperiment e = new GPayAllowedCardNetworksExperiment(0);
    public final boolean b;
    public final jsq0 c;

    public /* synthetic */ GPayAllowedCardNetworksExperiment(int i, boolean z, jsq0 jsq0Var) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.c = ksq0.a;
        } else {
            this.c = jsq0Var;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    public GPayAllowedCardNetworksExperiment() {
        this(0);
    }

    public GPayAllowedCardNetworksExperiment(int i) {
        jsq0 jsq0Var = ksq0.a;
        this.b = false;
        this.c = jsq0Var;
    }
}
