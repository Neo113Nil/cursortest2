package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;
import xsna.yqy0;

/* renamed from: io.appmetrica.analytics.impl.dg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC4784dg implements Runnable {
    public final File a;
    public final Function b;
    public final Consumer c;
    public final Consumer d;
    public final C4984la e;
    public final InterfaceC4969kl f;

    public RunnableC4784dg(File file, Function function, Consumer consumer, Consumer consumer2, C4984la c4984la, InterfaceC4969kl interfaceC4969kl) {
        this.a = file;
        this.b = function;
        this.c = consumer;
        this.d = consumer2;
        this.e = c4984la;
        this.f = interfaceC4969kl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.exists()) {
            J9 b = this.e.b(this.a.getName());
            Consumer consumer = this.c;
            try {
                b.a.lock();
                b.b.a();
            } catch (Throwable unused) {
            }
            if (!this.a.exists()) {
                consumer.consume(this.a);
                b.c();
                C4984la c4984la = this.e;
                String name = this.a.getName();
                synchronized (c4984la) {
                    c4984la.b.remove(name);
                }
                return;
            }
            Object apply = this.b.apply(this.a);
            if (apply != null) {
                if (this.f.a(apply)) {
                    this.d.consume(apply);
                } else {
                    consumer = new yqy0();
                }
            }
            consumer.consume(this.a);
            b.c();
            this.e.a(this.a.getName());
        }
    }

    public static final void a(File file) {
    }
}
