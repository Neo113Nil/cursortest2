package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout;

import defpackage.bob;
import defpackage.ds31;
import defpackage.iy90;
import defpackage.pzt0;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class b implements iy90 {
    public final /* synthetic */ CheckoutFragment a;

    public b(CheckoutFragment checkoutFragment) {
        this.a = checkoutFragment;
    }

    @Override // defpackage.iy90
    public final void a() {
        d viewModel;
        Object value;
        bob bobVar;
        viewModel = this.a.getViewModel();
        pzt0 pzt0Var = viewModel.T.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        r0 r0Var = viewModel.L;
        do {
            value = r0Var.getValue();
            bobVar = (bob) value;
        } while (!r0Var.k(value, bobVar != null ? new bob(bobVar.a, true) : null));
    }

    @Override // defpackage.iy90
    public final void b() {
        d viewModel;
        viewModel = this.a.getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new CheckoutViewModel$on3dsWebPageError$1(viewModel, null), 3);
    }
}
