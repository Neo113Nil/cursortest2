package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.yb.web.internal.ui.PlusPayYbWebActivity;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class hhd0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusPayYbWebActivity b;
    public final /* synthetic */ int c;

    public /* synthetic */ hhd0(PlusPayYbWebActivity plusPayYbWebActivity, int i, int i2) {
        this.a = i2;
        this.b = plusPayYbWebActivity;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        PlusPayYbWebActivity plusPayYbWebActivity = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = plusPayYbWebActivity.findViewById(i2);
                    if (findViewById != null) {
                        return (ViewGroup) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = plusPayYbWebActivity.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ProgressView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            default:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = plusPayYbWebActivity.findViewById(i2);
                    if (findViewById3 != null) {
                        return (WebViewContainer) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.webview.api.WebViewContainer");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
        }
    }
}
