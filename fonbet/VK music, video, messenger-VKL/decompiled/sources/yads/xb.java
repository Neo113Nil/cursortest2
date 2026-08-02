package yads;

import xsna.qcy;

/* loaded from: classes10.dex */
public final class xb implements yb {
    public static final /* synthetic */ qcy[] b = {wb.a(xb.class, "adViewReference", "getAdViewReference()Lcom/monetization/ads/banner/InternalAdView;", 0)};
    public final mn2 a;

    public xb(wc1 wc1Var) {
        this.a = nn2.a(wc1Var);
    }

    @Override // yads.yb
    public final boolean a() {
        mn2 mn2Var = this.a;
        qcy qcyVar = b[0];
        wc1 wc1Var = (wc1) mn2Var.a.get();
        return wc1Var != null && om3.a.a(wc1Var).a >= 1;
    }
}
