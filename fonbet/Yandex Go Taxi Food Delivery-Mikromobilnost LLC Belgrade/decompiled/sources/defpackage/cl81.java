package defpackage;

import android.os.Bundle;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes7.dex */
public final class cl81 implements rk81 {
    public static final /* synthetic */ kgx[] b;
    public final r581 a = new r581(null);

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("adEventsReceiver", 0, "getAdEventsReceiver()Lcom/monetization/ads/base/AdEventsReceiver;", cl81.class);
        qoi0.a.getClass();
        b = new kgx[]{mutablePropertyReference1Impl};
    }

    @Override // defpackage.rk81
    public final void a(int i, Bundle bundle) {
        kgx kgxVar = b[0];
        rk81 rk81Var = (rk81) this.a.a.get();
        if (rk81Var != null) {
            rk81Var.a(i, bundle);
        }
    }
}
