package yads;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import java.util.LinkedHashMap;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class d32 implements MediatedNativeAdapterListener {
    public static final /* synthetic */ qcy[] p = {wb.a(d32.class, "nativeAdLoadManager", "getNativeAdLoadManager()Lcom/monetization/ads/nativeads/NativeAdLoadManager;", 0)};
    public final v9 a;
    public final ov2 b;
    public final ep1 c;
    public final kp1 d;
    public final iq1 e;
    public final z51 f;
    public final Context g;
    public final mn2 h;
    public final LinkedHashMap i;
    public final LinkedHashMap j;
    public final f41 k;
    public final hq1 l;
    public final qp1 m;
    public final rq1 n;

    public /* synthetic */ d32(v9 v9Var, ov2 ov2Var, n12 n12Var, ep1 ep1Var) {
        this(v9Var, ov2Var, n12Var, ep1Var, new kp1(), new iq1(), new z51(ep1Var));
    }

    public d32(v9 v9Var, ov2 ov2Var, n12 n12Var, ep1 ep1Var, kp1 kp1Var, iq1 iq1Var, z51 z51Var) {
        this.a = v9Var;
        this.b = ov2Var;
        this.c = ep1Var;
        this.d = kp1Var;
        this.e = iq1Var;
        this.f = z51Var;
        Context applicationContext = n12Var.g().getApplicationContext();
        this.g = applicationContext;
        this.h = nn2.a(n12Var);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.i = linkedHashMap;
        this.j = new LinkedHashMap();
        f41 f41Var = new f41(n12Var.g());
        this.k = f41Var;
        hq1 hq1Var = new hq1(n12Var.g());
        this.l = hq1Var;
        this.m = new qp1(n12Var.g(), f41Var, hq1Var);
        this.n = new rq1(applicationContext, ep1Var, linkedHashMap);
    }
}
