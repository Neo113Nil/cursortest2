package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.SilentPaymentFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class ncs0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ SilentPaymentFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ ncs0(SilentPaymentFragment silentPaymentFragment, int i, int i2) {
        this.a = i2;
        this.b = silentPaymentFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        SilentPaymentFragment silentPaymentFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = silentPaymentFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (WebViewContainer) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = silentPaymentFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (PlusPayPaymentLoadingView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.loading.PlusPayPaymentLoadingView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
