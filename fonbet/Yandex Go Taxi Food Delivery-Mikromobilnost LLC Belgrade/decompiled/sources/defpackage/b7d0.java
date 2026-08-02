package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.plus.home.feature.panel.internalapi.shortcuts.lite.minipromo.PlusPanelMiniPromoView;

/* loaded from: classes2.dex */
public final class b7d0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PlusPanelMiniPromoView b;
    public final /* synthetic */ int c;

    public /* synthetic */ b7d0(PlusPanelMiniPromoView plusPanelMiniPromoView, int i, int i2) {
        this.a = i2;
        this.b = plusPanelMiniPromoView;
        this.c = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        PlusPanelMiniPromoView plusPanelMiniPromoView = this.b;
        switch (i) {
            case 0:
                kgx kgxVar = (kgx) obj;
                try {
                    View findViewById = plusPanelMiniPromoView.findViewById(i2);
                    if (findViewById != null) {
                        return (TextView) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e) {
                    dy31.f(kgxVar, e);
                    return null;
                }
            case 1:
                kgx kgxVar2 = (kgx) obj;
                try {
                    View findViewById2 = plusPanelMiniPromoView.findViewById(i2);
                    if (findViewById2 != null) {
                        return (TextView) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                } catch (ClassCastException e2) {
                    dy31.f(kgxVar2, e2);
                    return null;
                }
            case 2:
                kgx kgxVar3 = (kgx) obj;
                try {
                    View findViewById3 = plusPanelMiniPromoView.findViewById(i2);
                    if (findViewById3 != null) {
                        return (ImageView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e3) {
                    dy31.f(kgxVar3, e3);
                    return null;
                }
            default:
                kgx kgxVar4 = (kgx) obj;
                try {
                    View findViewById4 = plusPanelMiniPromoView.findViewById(i2);
                    if (findViewById4 != null) {
                        return (ImageView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                } catch (ClassCastException e4) {
                    dy31.f(kgxVar4, e4);
                    return null;
                }
        }
    }
}
