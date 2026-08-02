package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import kotlin.jvm.internal.Lambda;
import xsna.izs;

/* renamed from: io.appmetrica.analytics.impl.q5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5109q5 extends Lambda implements izs {
    public static final C5109q5 a = new C5109q5();

    public C5109q5() {
        super(1);
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        return ((IExecutionPolicy) obj).description();
    }
}
