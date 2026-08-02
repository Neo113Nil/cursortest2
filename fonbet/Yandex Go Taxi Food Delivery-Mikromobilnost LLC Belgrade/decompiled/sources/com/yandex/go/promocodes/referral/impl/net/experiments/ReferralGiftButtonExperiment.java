package com.yandex.go.promocodes.referral.impl.net.experiments;

import defpackage.gsq0;
import defpackage.n96;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/referral/impl/net/experiments/ReferralGiftButtonExperiment;", "Ln96;", "Companion", "com/yandex/go/promocodes/referral/impl/net/experiments/a", "$serializer", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ReferralGiftButtonExperiment extends n96 {
    public static final a Companion = new a();
    public final boolean b;
    public final boolean c;

    public /* synthetic */ ReferralGiftButtonExperiment(int i, boolean z, boolean z2) {
        if ((i & 1) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 2) == 0) {
            this.c = false;
        } else {
            this.c = z2;
        }
    }

    @Override // defpackage.n96
    /* renamed from: a, reason: from getter */
    public final boolean getB() {
        return this.b;
    }

    @Override // defpackage.n96
    public final boolean b() {
        return this.c || getB();
    }

    public ReferralGiftButtonExperiment(int i) {
        this.b = false;
        this.c = false;
    }

    public ReferralGiftButtonExperiment() {
        this(0);
    }
}
