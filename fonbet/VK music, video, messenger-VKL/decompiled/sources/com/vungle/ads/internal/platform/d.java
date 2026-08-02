package com.vungle.ads.internal.platform;

import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* loaded from: classes7.dex */
public final class d extends Lambda implements izs {
    public static final d a = new d();

    public d() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return ((Throwable) obj).getCause();
    }
}
