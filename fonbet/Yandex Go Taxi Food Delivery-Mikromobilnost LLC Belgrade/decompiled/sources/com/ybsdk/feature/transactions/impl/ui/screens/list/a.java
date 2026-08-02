package com.ybsdk.feature.transactions.impl.ui.screens.list;

import android.net.Uri;
import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import com.ybsdk.feature.transactions.api.entities.TransactionsState;
import com.ybsdk.feature.transactions.impl.domain.interactors.b;
import defpackage.c1x0;
import defpackage.cg01;
import defpackage.ds31;
import defpackage.evu0;
import defpackage.h791;
import defpackage.j3h;
import defpackage.lg01;
import defpackage.ppl;
import defpackage.pz40;
import defpackage.tc01;
import defpackage.tf01;
import defpackage.tje;
import defpackage.uc5;
import defpackage.uf01;
import defpackage.v0h;
import defpackage.x4c;
import defpackage.yvf0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final TransactionsParams B;
    public final b C;
    public final tf01 D;
    public final c1x0 E;

    public a(TransactionsParams transactionsParams, b bVar, tf01 tf01Var, c1x0 c1x0Var, lg01 lg01Var) {
        super(new tc01(1), lg01Var);
        this.B = transactionsParams;
        this.C = bVar;
        this.D = tf01Var;
        this.E = c1x0Var;
        e0(false);
    }

    public final void b0(TransactionsLoadType transactionsLoadType) {
        r0 r0Var;
        Object value;
        ppl pplVar = ((uf01) X()).d;
        if (pplVar == null) {
            return;
        }
        String agreementId = this.B.getAgreementId();
        if (agreementId != null && agreementId.length() != 0) {
            tje.N(ds31.a(this), null, null, new TransactionsViewModel$fetchTransactions$2(this, transactionsLoadType, pplVar, agreementId, null), 3);
            return;
        }
        x4c.g("Failed to load more transactions agreement_id is null", null, null, null, 14);
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, uf01.a((uf01) value, null, null, null, TransactionsState.ERROR, null, transactionsLoadType == TransactionsLoadType.REFRESH, 47)));
    }

    public final boolean c0(Uri uri) {
        return h791.d((j3h) ((yvf0) this.E.a).get(), uri, 14) instanceof v0h;
    }

    public final void d0() {
        TransactionsLoadType transactionsLoadType = TransactionsLoadType.NEXT_PAGE;
        ppl pplVar = ((uf01) X()).d;
        String str = pplVar != null ? pplVar.b : null;
        if (str == null || evu0.J(str)) {
            return;
        }
        if (((uf01) X()).e == TransactionsState.IDLE || ((uf01) X()).f != null) {
            b0(transactionsLoadType);
        }
    }

    public final void e0(boolean z) {
        r0 r0Var;
        Object value;
        uf01 uf01Var;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            uf01Var = (uf01) value;
        } while (!r0Var.k(value, uf01.a(uf01Var, null, null, z ? uf01Var.d : null, null, null, false, 23)));
        Z(new cg01(z));
        tje.N(ds31.a(this), null, null, new TransactionsViewModel$requestInfo$2(this, z, null), 3);
    }
}
