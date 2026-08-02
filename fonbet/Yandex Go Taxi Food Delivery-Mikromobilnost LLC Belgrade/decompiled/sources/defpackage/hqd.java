package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.composite.offer.CompositeOfferView;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconsLayout;

/* loaded from: classes2.dex */
public final class hqd implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ CompositeOfferView b;
    public final /* synthetic */ int c;

    public /* synthetic */ hqd(CompositeOfferView compositeOfferView, int i, int i2) {
        this.a = i2;
        this.b = compositeOfferView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        CompositeOfferView compositeOfferView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById = compositeOfferView.findViewById(i2);
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
                    View findViewById2 = compositeOfferView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (ProductIconsLayout) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.icons.ProductIconsLayout");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
