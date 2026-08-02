package defpackage;

import android.view.View;
import android.widget.ImageButton;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.debug.internal.ui.form.ReportFormFragment;
import com.yandex.plus.webview.api.WebViewContainer;

/* loaded from: classes2.dex */
public final class j2j0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReportFormFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ j2j0(ReportFormFragment reportFormFragment, int i, int i2) {
        this.a = i2;
        this.b = reportFormFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ReportFormFragment reportFormFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = reportFormFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (ImageButton) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageButton");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = reportFormFragment.requireView().findViewById(i2);
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
                    View findViewById3 = reportFormFragment.requireView().findViewById(i2);
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
