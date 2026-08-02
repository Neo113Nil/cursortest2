package yads;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.qcy;

/* loaded from: classes10.dex */
public final class z9 implements f4 {
    public static final /* synthetic */ qcy[] b;
    public final mn2 a = nn2.a(null);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(z9.class, "adEventsReceiver", "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // yads.f4
    public final void a(int i, Bundle bundle) {
        mn2 mn2Var = this.a;
        qcy qcyVar = b[0];
        f4 f4Var = (f4) mn2Var.a.get();
        if (f4Var != null) {
            f4Var.a(i, bundle);
        }
    }

    public final void a(f4 f4Var) {
        mn2 mn2Var = this.a;
        qcy qcyVar = b[0];
        mn2Var.getClass();
        mn2Var.a = new WeakReference(f4Var);
    }
}
