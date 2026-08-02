package defpackage;

import android.view.KeyEvent;
import com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.product.texts.badges.ProductTextsWithBadgesView;

/* loaded from: classes2.dex */
public final class k9f0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProductTextsWithBadgesView b;
    public final /* synthetic */ int c;

    public /* synthetic */ k9f0(ProductTextsWithBadgesView productTextsWithBadgesView, int i, int i2) {
        this.a = i2;
        this.b = productTextsWithBadgesView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        ProductTextsWithBadgesView productTextsWithBadgesView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    KeyEvent.Callback findViewById = productTextsWithBadgesView.findViewById(i2);
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
                    KeyEvent.Callback findViewById2 = productTextsWithBadgesView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (xn4) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.acquisition.sdk.button.section.ui.impl.views.badges.Badges");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
        }
    }
}
