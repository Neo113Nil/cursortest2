package com.ybsdk.feature.transactions.impl.ui.screens.feed;

import defpackage.ds31;
import defpackage.ff01;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class TransactionsFeedFragment$onViewCreated$1$8 extends FunctionReferenceImpl implements sls {
    public TransactionsFeedFragment$onViewCreated$1$8(uc5 uc5Var) {
        super(0, uc5Var, c.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m463invoke() {
        r0 r0Var;
        Object value;
        ff01 ff01Var;
        c cVar = (c) this.receiver;
        pz40 Y = cVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
            ff01Var = (ff01) value;
        } while (!r0Var.k(value, ff01.a(ff01Var, null, ff01Var.d.c(), null, null, false, null, null, 0, 2039)));
        cVar.I = tje.N(ds31.a(cVar), null, null, new TransactionsFeedViewModel$onErrorPrimaryButtonClick$2(cVar, null), 3);
        pzt0 pzt0Var = cVar.J;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        cVar.J = tje.N(ds31.a(cVar), null, null, new TransactionsFeedViewModel$onErrorPrimaryButtonClick$3(cVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m463invoke();
        return zy11.a;
    }
}
