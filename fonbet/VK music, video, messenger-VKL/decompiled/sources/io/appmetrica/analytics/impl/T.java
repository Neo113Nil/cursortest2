package io.appmetrica.analytics.impl;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes8.dex */
public final class T extends Lambda implements gzs {
    public final /* synthetic */ U a;
    public final /* synthetic */ Qi b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u, Qi qi) {
        super(0);
        this.a = u;
        this.b = qi;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        U u = this.a;
        N n = u.h;
        Context context = u.a;
        Qi qi = this.b;
        n.getClass();
        return N.a(new M(n, context, qi));
    }
}
