package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.common.log.LogTag;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.domain.success.SuccessFlowScreen;
import defpackage.ds31;
import defpackage.ii41;
import defpackage.m3v0;
import defpackage.mdd0;
import defpackage.tje;

/* loaded from: classes2.dex */
public final class a implements ii41 {
    public final /* synthetic */ SuccessFragment a;

    public a(SuccessFragment successFragment) {
        this.a = successFragment;
    }

    @Override // defpackage.ii41
    public final void a() {
        b viewModel;
        viewModel = this.a.getViewModel();
        mdd0.c(viewModel.A, LogTag.TARIFFICATOR, "Success WebView loaded URL successfully");
    }

    @Override // defpackage.ii41
    public final void d() {
        b viewModel;
        viewModel = this.a.getViewModel();
        mdd0.g(viewModel.A, LogTag.TARIFFICATOR, "Success WebView error on the web side", null, 12);
        viewModel.X();
    }

    @Override // defpackage.ii41
    public final void e(String str) {
        b viewModel;
        viewModel = this.a.getViewModel();
        mdd0.g(viewModel.A, LogTag.TARIFFICATOR, "Success WebView could\\'t load contacts URL", null, 12);
        viewModel.X();
    }

    @Override // defpackage.ii41
    public final void g(String str, boolean z) {
        b viewModel;
        viewModel = this.a.getViewModel();
        viewModel.getClass();
        tje.N(ds31.a(viewModel), null, null, new SuccessViewModel$onWebPageOpenUri$1(z, viewModel, str, null), 3);
    }

    @Override // defpackage.ii41
    public final void i() {
        b viewModel;
        viewModel = this.a.getViewModel();
        ((m3v0) viewModel.c).b(SuccessFlowScreen.SUCCESS);
    }

    @Override // defpackage.ii41
    public final void l(String str) {
        b viewModel;
        viewModel = this.a.getViewModel();
        mdd0.g(viewModel.A, LogTag.TARIFFICATOR, "Success WebView error on the web side", null, 12);
        viewModel.X();
    }

    @Override // defpackage.ii41
    public final void o() {
        b viewModel;
        viewModel = this.a.getViewModel();
        ((m3v0) viewModel.c).b(SuccessFlowScreen.SUCCESS);
    }
}
