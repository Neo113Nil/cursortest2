package yads;

import java.util.Set;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.izi0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class nh3 {
    public static final /* synthetic */ qcy[] c;
    public final Set a = izi0.i(lh3.b);
    public final mh3 b = new mh3(this);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(nh3.class, "status", "getStatus()Lcom/monetization/ads/instream/status/VideoAdStatus;", 0);
        fpf0.a.getClass();
        c = new qcy[]{mutablePropertyReference1Impl};
    }

    public final lh3 a() {
        return (lh3) this.b.getValue(this, c[0]);
    }

    public final void a(lh3 lh3Var) {
        this.b.setValue(this, c[0], lh3Var);
    }
}
