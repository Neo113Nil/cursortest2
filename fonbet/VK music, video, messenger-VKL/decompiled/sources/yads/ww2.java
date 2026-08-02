package yads;

import android.content.Context;
import java.util.LinkedHashMap;
import xsna.jgp;
import xsna.myc0;
import xsna.qcy;
import xsna.ttp0;

/* loaded from: classes10.dex */
public final class ww2 implements x32 {
    public static final /* synthetic */ qcy[] f = {wb.a(ww2.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};
    public final d4 a;
    public final qw2 b;
    public final mn2 c;
    public final cu2 d;
    public final e32 e;

    public ww2(n12 n12Var, d4 d4Var, qw2 qw2Var) {
        this.a = d4Var;
        this.b = qw2Var;
        this.c = nn2.a(n12Var);
        this.d = new cu2(n12Var.e(), n12Var.h());
        this.e = new e32(n12Var.e());
    }

    @Override // yads.x32
    public final void a(Context context, v9 v9Var) {
        mn2 mn2Var = this.c;
        qcy qcyVar = f[0];
        n12 n12Var = (n12) mn2Var.a.get();
        if (n12Var != null) {
            n12Var.b.a(v5.c, null);
            e22 e22Var = (e22) v9Var.t;
            d4 d4Var = this.a;
            g32 g32Var = new g32();
            this.d.a(context, v9Var, this.e);
            cu2 cu2Var = this.d;
            cu2Var.getClass();
            jgp jgpVar = jgp.b;
            if (!ttp0.g(jgpVar)) {
                jgpVar = null;
            }
            if (jgpVar == null) {
                new LinkedHashMap();
            }
            gp2 a = g32Var.a(v9Var, d4Var, e22Var);
            ep2 ep2Var = ep2.c;
            a.b("success", "status");
            cu2Var.a(context, v9Var, dp2.h, a);
            y02 a2 = this.b.a(v9Var);
            if (n12Var.r == z5.b) {
                return;
            }
            e22 e22Var2 = (e22) v9Var.t;
            n02 n02Var = n12Var.B;
            myc0.h(n02Var.d, null, null, new m02(n02Var, v9Var, e22Var2, a2, n12Var.C, null), 3);
        }
    }
}
