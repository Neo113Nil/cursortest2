package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;
import xsna.an10;

/* loaded from: classes10.dex */
public final class re1 implements wy0 {
    public final zf0 a;
    public final jp2 b;
    public final tq2 c;
    public final rx d;

    public re1(qw qwVar, bu1 bu1Var, tq2 tq2Var, rx rxVar) {
        this.a = qwVar;
        this.b = bu1Var;
        this.c = tq2Var;
        this.d = rxVar;
    }

    @Override // yads.wy0
    public final ve1 a(Context context, v9 v9Var, x12 x12Var, kz kzVar, z00 z00Var) {
        y00 adAssets = x12Var.getAdAssets();
        tq2 tq2Var = this.c;
        int i = R$dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        tq2Var.getClass();
        ly lyVar = new ly(adAssets, an10.b(context.getResources().getDimension(i)));
        rx rxVar = this.d;
        zf0 zf0Var = this.a;
        jp2 jp2Var = this.b;
        rxVar.getClass();
        return new ve1(R$layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, new jy(lyVar, rx.a(x12Var, kzVar, z00Var, zf0Var, jp2Var), new qk1(adAssets), new ge2(adAssets), new ko3(), new xs(x12Var)), new vb2(2));
    }
}
