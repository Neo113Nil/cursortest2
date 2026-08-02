package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class gkb implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CheckoutFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ gkb(CheckoutFragment checkoutFragment, int i, int i2) {
        this.a = i2;
        this.b = checkoutFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        CheckoutFragment checkoutFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = checkoutFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = checkoutFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (CheckoutContentView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.CheckoutContentView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = checkoutFragment.requireView().findViewById(i2);
                    if (findViewById3 != null) {
                        return (BottomSheetLoadingView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.common.BottomSheetLoadingView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            default:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = checkoutFragment.requireView().findViewById(i2);
                    if (findViewById4 != null) {
                        return (WebViewContainer) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
        }
    }
}
