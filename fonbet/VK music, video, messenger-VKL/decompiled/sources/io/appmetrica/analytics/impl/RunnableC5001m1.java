package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5001m1 implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ C5208u1 b;

    public RunnableC5001m1(C5208u1 c5208u1, List list) {
        this.b = c5208u1;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.b).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}
