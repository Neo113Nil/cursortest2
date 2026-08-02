package yads;

import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class jx0 implements kx0 {
    public static final /* synthetic */ qcy[] b;
    public final mn2 a = nn2.a();

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(jx0.class, "forceImpressionTrackingListenerReference", "getForceImpressionTrackingListenerReference()Lcom/monetization/ads/base/impression/ForceImpressionTrackingListener;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // yads.kx0
    public final void a() {
        mn2 mn2Var = this.a;
        qcy qcyVar = b[0];
        kx0 kx0Var = (kx0) mn2Var.a.get();
        if (kx0Var != null) {
            kx0Var.a();
        }
    }
}
