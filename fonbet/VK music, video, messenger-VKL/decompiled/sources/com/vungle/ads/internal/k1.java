package com.vungle.ads.internal;

import kotlin.jvm.internal.Lambda;
import xsna.gzs;

/* loaded from: classes7.dex */
public final class k1 extends Lambda implements gzs {
    public final /* synthetic */ r1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(r1 r1Var) {
        super(0);
        this.a = r1Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vungle.ads.internal.util.p pVar = com.vungle.ads.internal.util.p.b;
        pVar.a(((com.vungle.ads.internal.executor.d) r1.a(this.a)).a);
        return pVar;
    }
}
