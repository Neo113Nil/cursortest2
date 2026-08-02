package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC5105q1 implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C5208u1 c;

    public RunnableC5105q1(C5208u1 c5208u1, String str, List list) {
        this.c = c5208u1;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5208u1.a(this.c).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
