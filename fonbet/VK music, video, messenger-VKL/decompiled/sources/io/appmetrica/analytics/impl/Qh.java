package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* loaded from: classes8.dex */
public final class Qh implements Runnable {
    public final /* synthetic */ String a;
    public final /* synthetic */ List b;
    public final /* synthetic */ C5122qi c;

    public Qh(C5122qi c5122qi, String str, List list) {
        this.c = c5122qi;
        this.a = str;
        this.b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5122qi c5122qi = this.c;
        C5122qi.a(c5122qi.a, c5122qi.d, c5122qi.e).reportEvent(this.a, CollectionUtils.getMapFromList(this.b));
    }
}
