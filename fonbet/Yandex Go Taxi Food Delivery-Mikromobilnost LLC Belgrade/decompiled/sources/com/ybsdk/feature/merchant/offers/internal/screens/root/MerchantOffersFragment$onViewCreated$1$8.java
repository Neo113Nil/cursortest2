package com.ybsdk.feature.merchant.offers.internal.screens.root;

import defpackage.ds31;
import defpackage.nq10;
import defpackage.pz40;
import defpackage.sls;
import defpackage.tje;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class MerchantOffersFragment$onViewCreated$1$8 extends FunctionReferenceImpl implements sls {
    public MerchantOffersFragment$onViewCreated$1$8(uc5 uc5Var) {
        super(0, uc5Var, b.class, "onErrorPrimaryButtonClick", "onErrorPrimaryButtonClick()V", 0);
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m445invoke() {
        r0 r0Var;
        Object value;
        b bVar = (b) this.receiver;
        pz40 Y = bVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, nq10.a((nq10) value, null, null, null, 11)));
        tje.N(ds31.a(bVar), null, null, new MerchantOffersViewModel$onErrorPrimaryButtonClick$2(bVar, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m445invoke();
        return zy11.a;
    }
}
