package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.expand.ProductExpandTextsView;

/* loaded from: classes2.dex */
public final class l8f0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProductExpandTextsView b;
    public final /* synthetic */ int c;

    public /* synthetic */ l8f0(ProductExpandTextsView productExpandTextsView, int i, int i2) {
        this.a = i2;
        this.b = productExpandTextsView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ProductExpandTextsView productExpandTextsView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById = productExpandTextsView.findViewById(i2);
                    if (findViewById != null) {
                        return (f9f0) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.ProductTexts");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            default:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = productExpandTextsView.findViewById(i2);
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
