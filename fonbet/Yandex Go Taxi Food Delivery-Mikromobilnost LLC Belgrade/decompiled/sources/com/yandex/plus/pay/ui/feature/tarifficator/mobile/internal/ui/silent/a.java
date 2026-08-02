package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent;

import defpackage.ds31;
import defpackage.iy90;
import defpackage.ocs0;
import defpackage.pzt0;
import defpackage.tje;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class a implements iy90 {
    public final /* synthetic */ SilentPaymentFragment a;

    public a(SilentPaymentFragment silentPaymentFragment) {
        this.a = silentPaymentFragment;
    }

    @Override // defpackage.iy90
    public final void a() {
        b viewModel;
        viewModel = this.a.getViewModel();
        Object value = viewModel.F.getValue();
        ocs0 ocs0Var = value instanceof ocs0 ? (ocs0) value : null;
        if (ocs0Var == null) {
            return;
        }
        pzt0 pzt0Var = viewModel.D.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        r0 r0Var = viewModel.E;
        ocs0 ocs0Var2 = new ocs0(ocs0Var.a, true, ocs0Var.c);
        r0Var.getClass();
        r0Var.m(null, ocs0Var2);
    }

    @Override // defpackage.iy90
    public final void b() {
        b viewModel;
        viewModel = this.a.getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new SilentPaymentViewModel$on3dsWebPageError$1(viewModel, null), 3);
    }
}
