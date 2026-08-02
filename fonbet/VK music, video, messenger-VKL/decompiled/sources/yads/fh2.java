package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$layout;

/* loaded from: classes10.dex */
public final class fh2 implements wy0 {
    public final zf0 a;
    public final jp2 b;
    public final rx c;

    public fh2(qw qwVar, bu1 bu1Var, rx rxVar) {
        this.a = qwVar;
        this.b = bu1Var;
        this.c = rxVar;
    }

    @Override // yads.wy0
    public final ve1 a(Context context, v9 v9Var, x12 x12Var, kz kzVar, z00 z00Var) {
        y00 adAssets = x12Var.getAdAssets();
        rx rxVar = this.c;
        zf0 zf0Var = this.a;
        jp2 jp2Var = this.b;
        rxVar.getClass();
        return new ve1(R$layout.monetization_ads_internal_native_interstitial_portrait, new jy(rx.a(x12Var, kzVar, z00Var, zf0Var, jp2Var), new hn1(new c02(), new rk1(adAssets)), new ko3(), new xs(x12Var), new vs(new kz1(), new us(context))), new vb2(1));
    }
}
