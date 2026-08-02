package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import java.io.File;
import java.util.concurrent.Executor;
import xsna.fpf0;
import xsna.s3q0;

/* renamed from: io.appmetrica.analytics.impl.s6, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5161s6 implements Consumer {
    public final Executor a;
    public final C4810eh b;

    public C5161s6(Context context, InterfaceC5084p6 interfaceC5084p6, EnumC5037nb enumC5037nb, InterfaceC4969kl interfaceC4969kl, Executor executor, String str) {
        this.a = executor;
        this.b = new C4810eh(context, interfaceC5084p6, enumC5037nb, interfaceC4969kl);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(File file) {
        if (file == null) {
            return;
        }
        Executor executor = this.a;
        C4810eh c4810eh = this.b;
        C5343zb c5343zb = c4810eh.c;
        Consumer consumer = c4810eh.e;
        Context context = c4810eh.a;
        if (C4984la.c == null) {
            synchronized (fpf0.a(C4984la.class)) {
                try {
                    if (C4984la.c == null) {
                        C4984la.c = new C4984la(context);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        C4984la c4984la = C4984la.c;
        if (c4984la == null) {
            c4984la = null;
        }
        executor.execute(new RunnableC4784dg(file, c5343zb, c5343zb, consumer, c4984la, c4810eh.b));
    }
}
