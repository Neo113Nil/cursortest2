package com.yandex.fintechsdk.features.webview.payment.internal.presentation;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.cma1;
import defpackage.ny61;
import defpackage.tls;
import defpackage.war;
import defpackage.wgh0;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public /* synthetic */ class WebViewPaymentFragment$binding$2 extends FunctionReferenceImpl implements tls {
    public static final WebViewPaymentFragment$binding$2 b = new WebViewPaymentFragment$binding$2(1, 0, war.class, "bind", "bind(Landroid/view/View;)Lcom/yandex/fintechsdk/features/webview/payment/databinding/FinsdkFragmentWebviewPaymentBinding;");

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        View view = (View) obj;
        int i = wgh0.finsdkShimmersContainer;
        FrameLayout frameLayout = (FrameLayout) cma1.O(i, view);
        if (frameLayout != null) {
            i = wgh0.finsdkWebViewRoot;
            FrameLayout frameLayout2 = (FrameLayout) cma1.O(i, view);
            if (frameLayout2 != null) {
                return new war((FrameLayout) view, frameLayout, frameLayout2);
            }
        }
        ny61.t("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
