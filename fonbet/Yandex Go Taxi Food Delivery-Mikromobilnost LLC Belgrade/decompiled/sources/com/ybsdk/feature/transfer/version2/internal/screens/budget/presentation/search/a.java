package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b;
import defpackage.ap6;
import defpackage.dp6;
import defpackage.ds31;
import defpackage.gp6;
import defpackage.h791;
import defpackage.j3h;
import defpackage.m04;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qp6;
import defpackage.rm01;
import defpackage.rm6;
import defpackage.t8j0;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.u8j0;
import defpackage.uc5;
import defpackage.w511;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final BudgetChargesSearchStatusScreenParams B;
    public final b C;
    public final rm01 D;
    public final j3h E;
    public final tfl0 F;
    public final m04 G;
    public pzt0 H;

    public a(ap6 ap6Var, BudgetChargesSearchStatusScreenParams budgetChargesSearchStatusScreenParams, b bVar, rm01 rm01Var, j3h j3hVar, tfl0 tfl0Var, m04 m04Var) {
        super(new rm6(6), ap6Var);
        this.B = budgetChargesSearchStatusScreenParams;
        this.C = bVar;
        this.D = rm01Var;
        this.E = j3hVar;
        this.F = tfl0Var;
        this.G = m04Var;
        d0();
    }

    public final void b0() {
        String str;
        dp6 dp6Var = (dp6) ((u8j0) X()).a();
        if (dp6Var == null) {
            return;
        }
        qp6 qp6Var = dp6Var.b;
        int i = gp6.a[qp6Var.a.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            str = qp6Var.c;
        } else if (i != 4) {
            w511.b();
            return;
        } else {
            ActionButtonEntity actionButtonEntity = dp6Var.a.d;
            str = actionButtonEntity != null ? actionButtonEntity.getAction() : null;
        }
        if (str == null || h791.e(this.E, str, false, null, 14) == null) {
            c0();
        }
    }

    public final void c0() {
        this.F.e();
    }

    public final void d0() {
        r0 r0Var;
        Object value;
        this.G.a.B.a.a("payment.gov.search.initiated", null);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, new t8j0()));
        pzt0 pzt0Var = this.H;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.H = tje.N(ds31.a(this), null, null, new BudgetChargesSearchStatusViewModel$onStartSearch$2(this, null), 3);
    }

    public final void e0() {
        this.G.a.B.a.a("payment.gov.search.close.click", null);
        c0();
    }
}
