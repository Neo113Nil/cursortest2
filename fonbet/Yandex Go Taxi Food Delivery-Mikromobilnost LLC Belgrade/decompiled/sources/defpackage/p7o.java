package defpackage;

import android.view.View;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorFragment;

/* loaded from: classes2.dex */
public final class p7o implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ErrorFragment b;
    public final /* synthetic */ int c;

    public /* synthetic */ p7o(ErrorFragment errorFragment, int i, int i2) {
        this.a = i2;
        this.b = errorFragment;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ErrorFragment errorFragment = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = errorFragment.requireView().findViewById(i2);
                    if (findViewById != null) {
                        return (ErrorContentView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.error.ErrorContentView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = errorFragment.requireView().findViewById(i2);
                    if (findViewById2 != null) {
                        return (ProgressView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
