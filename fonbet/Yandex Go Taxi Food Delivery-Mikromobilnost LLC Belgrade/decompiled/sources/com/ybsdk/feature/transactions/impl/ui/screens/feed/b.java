package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import com.ybsdk.feature.transactions.api.entities.TransactionsFeedFilterEntity;
import defpackage.ds31;
import defpackage.ff01;
import defpackage.jl40;
import defpackage.ppl;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements tls {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TransactionsFeedFilterEntity transactionsFeedFilterEntity = (TransactionsFeedFilterEntity) obj;
        c cVar = this.a;
        ppl pplVar = ((ff01) cVar.X()).e;
        zy11 zy11Var = zy11.a;
        if (pplVar != null && jl40.l(((ff01) cVar.X()).a, transactionsFeedFilterEntity)) {
            return zy11Var;
        }
        pzt0 pzt0Var = cVar.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.J = tje.N(ds31.a(cVar), null, null, new TransactionsFeedViewModel$4$1(cVar, transactionsFeedFilterEntity, null), 3);
        return zy11Var;
    }
}
