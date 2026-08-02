package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4940ji implements Runnable {
    public final /* synthetic */ List a;
    public final /* synthetic */ C5122qi b;

    public RunnableC4940ji(C5122qi c5122qi, List list) {
        this.b = c5122qi;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.b;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportAnr(CollectionUtils.getMapFromList(this.a));
    }
}
