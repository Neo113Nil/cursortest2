package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;

/* loaded from: classes8.dex */
public final class B extends Lambda implements izs {
    public final /* synthetic */ C5154s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(C5154s c5154s) {
        super(1);
        this.a = c5154s;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        this.a.g = (byte[]) obj;
        return s3q0.a;
    }
}
