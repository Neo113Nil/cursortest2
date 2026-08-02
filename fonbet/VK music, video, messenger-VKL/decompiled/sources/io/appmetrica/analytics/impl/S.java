package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes8.dex */
public final class S extends Lambda implements gzs {
    public final /* synthetic */ U a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(U u) {
        super(0);
        this.a = u;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        U u = this.a;
        N n = u.g;
        Context context = u.a;
        n.getClass();
        return N.a(new L(n, context));
    }
}
