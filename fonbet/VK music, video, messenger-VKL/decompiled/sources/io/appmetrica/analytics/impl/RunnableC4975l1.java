package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;

/* renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4975l1 implements Runnable {
    public final /* synthetic */ ExternalAttribution a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC4975l1(C5208u1 c5208u1, ExternalAttribution externalAttribution) {
        this.b = c5208u1;
        this.a = externalAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).a(this.a);
    }
}
