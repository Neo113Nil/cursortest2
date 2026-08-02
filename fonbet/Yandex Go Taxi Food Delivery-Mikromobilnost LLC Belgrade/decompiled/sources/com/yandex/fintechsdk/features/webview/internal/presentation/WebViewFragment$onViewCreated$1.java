package com.yandex.fintechsdk.features.webview.internal.presentation;

import com.yandex.pay.payment.YPayResult;
import defpackage.sls;
import defpackage.w13;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public /* synthetic */ class WebViewFragment$onViewCreated$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        w13 w13Var = ((b) this.receiver).w.a;
        YPayResult.Cancelled cancelled = YPayResult.Cancelled.INSTANCE;
        w13Var.c = null;
        w13Var.a.g(cancelled);
        return zy11.a;
    }
}
