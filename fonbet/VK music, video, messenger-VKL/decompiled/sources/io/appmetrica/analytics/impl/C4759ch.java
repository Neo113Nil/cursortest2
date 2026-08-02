package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4759ch implements InterfaceC5084p6 {
    public final Context a;
    public final C5004m4 b;
    public final IHandlerExecutor c = C5342za.k().w().e();

    public C4759ch(Context context, C5004m4 c5004m4) {
        this.a = context;
        this.b = c5004m4;
    }

    public final void a(C4722b6 c4722b6, Bundle bundle) {
        if (c4722b6.m()) {
            return;
        }
        this.c.execute(new RunnableC5249vh(this.a, c4722b6, bundle, this.b));
    }

    public final void a(C4720b4 c4720b4, C4722b6 c4722b6, B4 b4) {
        this.b.a(c4720b4, b4).a(c4722b6, b4);
        this.b.a(c4720b4.b, c4720b4.c, c4720b4.d);
    }
}
