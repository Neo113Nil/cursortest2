package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;

/* loaded from: classes2.dex */
public final class hy20 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ModalContentViewContainer b;
    public final /* synthetic */ int c;

    public /* synthetic */ hy20(ModalContentViewContainer modalContentViewContainer, int i, int i2) {
        this.a = i2;
        this.b = modalContentViewContainer;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ModalContentViewContainer modalContentViewContainer = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = modalContentViewContainer.findViewById(i2);
                    if (findViewById != null) {
                        return (ViewGroup) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = modalContentViewContainer.findViewById(i2);
                    if (findViewById2 != null) {
                        return findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
