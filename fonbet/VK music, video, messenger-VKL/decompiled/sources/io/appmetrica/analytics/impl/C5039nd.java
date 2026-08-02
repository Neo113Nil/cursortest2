package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import xsna.ew4;

/* renamed from: io.appmetrica.analytics.impl.nd, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5039nd {
    public final Executor a;
    public final El b;
    public final String c;
    public final SystemTimeProvider d;

    public C5039nd(IHandlerExecutor iHandlerExecutor, Jd jd, String str, SystemTimeProvider systemTimeProvider) {
        this.a = iHandlerExecutor;
        this.b = jd;
        this.c = str;
        this.d = systemTimeProvider;
    }

    public static final void a(C5039nd c5039nd, List list) {
        C4710ak c4710ak = AbstractC5326yj.a;
        C5091pd c5091pd = new C5091pd(c5039nd.b, c5039nd.c, c5039nd.d, list);
        c4710ak.getClass();
        c4710ak.a(new Oj(c5091pd));
    }

    public final void a(ArrayList arrayList) {
        this.a.execute(new ew4(6, this, arrayList));
    }
}
