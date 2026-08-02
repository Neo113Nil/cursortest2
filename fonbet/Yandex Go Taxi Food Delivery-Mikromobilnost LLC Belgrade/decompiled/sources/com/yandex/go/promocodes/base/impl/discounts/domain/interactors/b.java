package com.yandex.go.promocodes.base.impl.discounts.domain.interactors;

import com.yandex.go.promocodes.referral.impl.provider.k;
import defpackage.lni0;
import defpackage.nni0;
import defpackage.tpr;
import defpackage.zuj0;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes13.dex */
public final class b {
    public final zuj0 a;
    public final nni0 b;
    public final lni0 c;

    public b(zuj0 zuj0Var, nni0 nni0Var, lni0 lni0Var) {
        this.a = zuj0Var;
        this.b = nni0Var;
        this.c = lni0Var;
    }

    public final m0 a() {
        return new m0(((k) this.b).a(), (tpr) this.c.d.getValue(), new DiscountsReferralsInteractor$referralsInfoFlow$1(3, null));
    }
}
