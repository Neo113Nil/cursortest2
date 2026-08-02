package yads;

import com.monetization.ads.mediation.rewarded.MediatedRewardedAdapterListener;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class is2 implements MediatedRewardedAdapterListener {
    public static final /* synthetic */ qcy[] e;
    public final ep1 a;
    public final z51 b;
    public final mn2 c;
    public final mn2 d;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(is2.class, "contentController", "getContentController()Lcom/monetization/ads/rewarded/content/RewardedAdContentController;", 0);
        fpf0.a.getClass();
        e = new qcy[]{mutablePropertyReference1Impl, wb.a(is2.class, "loadController", "getLoadController()Lcom/monetization/ads/fullscreen/FullScreenLoadController;", 0)};
    }

    public /* synthetic */ is2(gy0 gy0Var, ep1 ep1Var) {
        this(gy0Var, ep1Var, new z51(ep1Var));
    }

    public is2(gy0 gy0Var, ep1 ep1Var, z51 z51Var) {
        this.a = ep1Var;
        this.b = z51Var;
        this.c = nn2.a(null);
        this.d = nn2.a(gy0Var);
    }
}
