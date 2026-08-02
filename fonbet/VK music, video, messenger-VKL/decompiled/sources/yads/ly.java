package yads;

import android.view.ViewGroup;
import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R$id;

/* loaded from: classes10.dex */
public final class ly implements zf0 {
    public final y00 a;
    public final int b;

    public ly(y00 y00Var, int i) {
        this.a = y00Var;
        this.b = i;
    }

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        y00 y00Var = this.a;
        ny nyVar = new ny(y00Var, this.b, new hz1());
        ImageView a = nyVar.a(extendedNativeAdView, my.b, y00Var.b);
        ImageView a2 = nyVar.a(extendedNativeAdView, my.c, y00Var.c);
        if (a != null) {
            a.setId(R$id.favicon);
        }
        if (a2 != null) {
            a2.setId(R$id.icon);
        }
    }

    @Override // yads.zf0
    public final void c() {
    }
}
