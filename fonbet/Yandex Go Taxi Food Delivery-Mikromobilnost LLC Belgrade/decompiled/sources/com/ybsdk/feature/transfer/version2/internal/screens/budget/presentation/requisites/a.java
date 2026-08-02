package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites;

import android.net.Uri;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b;
import defpackage.ds31;
import defpackage.h791;
import defpackage.j3h;
import defpackage.m04;
import defpackage.ou01;
import defpackage.p05;
import defpackage.rm01;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.v0h;
import defpackage.vo6;
import defpackage.yo6;

/* loaded from: classes3.dex */
public final class a extends p05 {
    public final BudgetChargesRequisitesScreenParams B;
    public final b C;
    public final com.ybsdk.widgets.common.shimmer.b D;
    public final rm01 E;
    public final j3h F;
    public final tfl0 G;
    public final m04 H;

    public a(BudgetChargesRequisitesScreenParams budgetChargesRequisitesScreenParams, b bVar, com.ybsdk.widgets.common.shimmer.b bVar2, rm01 rm01Var, j3h j3hVar, tfl0 tfl0Var, m04 m04Var) {
        super(new vo6(bVar2, 0), new yo6());
        this.B = budgetChargesRequisitesScreenParams;
        this.C = bVar;
        this.D = bVar2;
        this.E = rm01Var;
        this.F = j3hVar;
        this.G = tfl0Var;
        this.H = m04Var;
        tje.N(ds31.a(this), null, null, new BudgetChargesRequisitesViewModel$loadRequisites$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void b0() {
        this.H.a.B.a.a("payment.gov.payment_info.close.click", null);
        this.G.e();
    }

    @Override // defpackage.p05
    public final boolean c0(Uri uri) {
        return h791.d(this.F, uri, 14) instanceof v0h;
    }

    @Override // defpackage.p05
    public final void d0() {
        tje.N(ds31.a(this), null, null, new BudgetChargesRequisitesViewModel$loadRequisites$1(this, null), 3);
    }

    @Override // defpackage.p05
    public final void e0(String str) {
        ((ou01) this.E).a(str);
    }
}
