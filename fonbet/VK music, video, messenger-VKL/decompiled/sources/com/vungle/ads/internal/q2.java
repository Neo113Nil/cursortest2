package com.vungle.ads.internal;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes7.dex */
public final class q2 extends Lambda implements izs {
    public static final q2 a = new q2();

    public q2() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean z = com.vungle.ads.internal.util.u.a;
        com.vungle.ads.internal.util.t.a("VungleInitializer", "Config fetch result: " + booleanValue);
        return s3q0.a;
    }
}
