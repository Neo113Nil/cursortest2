package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.upsale;

import defpackage.ds31;
import defpackage.iy90;
import defpackage.pzt0;
import defpackage.tje;

/* loaded from: classes2.dex */
public final class a implements iy90 {
    public final /* synthetic */ UpsaleFragment a;

    public a(UpsaleFragment upsaleFragment) {
        this.a = upsaleFragment;
    }

    @Override // defpackage.iy90
    public final void a() {
        b viewModel;
        viewModel = this.a.getViewModel();
        pzt0 pzt0Var = viewModel.H.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }

    @Override // defpackage.iy90
    public final void b() {
        b viewModel;
        viewModel = this.a.getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new UpsaleViewModel$on3dsWebPageError$1(viewModel, null), 3);
    }
}
