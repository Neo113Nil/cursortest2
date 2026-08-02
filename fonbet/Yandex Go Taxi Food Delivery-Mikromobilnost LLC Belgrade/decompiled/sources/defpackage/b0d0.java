package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.ui.api.PlusAcquisitionLoadingView;

/* loaded from: classes2.dex */
public final class b0d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusAcquisitionLoadingView b;
    public final /* synthetic */ int c;

    public /* synthetic */ b0d0(PlusAcquisitionLoadingView plusAcquisitionLoadingView, int i, int i2) {
        this.a = i2;
        this.b = plusAcquisitionLoadingView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        PlusAcquisitionLoadingView plusAcquisitionLoadingView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = plusAcquisitionLoadingView.findViewById(i2);
                    if (findViewById != null) {
                        return (ProgressBar) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = plusAcquisitionLoadingView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (TextView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
