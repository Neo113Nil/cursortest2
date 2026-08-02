package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* loaded from: classes8.dex */
public abstract class A5 implements InterfaceC5045nj {
    public BaseRequestConfig a;
    public final BaseRequestConfig.RequestConfigLoader b;
    public X5 c;

    public A5(@NonNull BaseRequestConfig.RequestConfigLoader<Object, X5> requestConfigLoader, @NonNull C5100pm c5100pm, @NonNull ArgumentsMerger<Object, Object> argumentsMerger) {
        this.b = requestConfigLoader;
        C5342za.k().v().a(this);
        a(new X5(c5100pm, C5342za.k().v(), C5342za.k().s(), argumentsMerger));
    }

    public final synchronized void a(@NonNull X5 x5) {
        this.c = x5;
    }

    @NonNull
    public final synchronized ArgumentsMerger<Object, Object> b() {
        return (ArgumentsMerger) this.c.componentArguments;
    }

    @NonNull
    public final synchronized C5100pm c() {
        return this.c.a;
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final synchronized void e() {
        this.a = null;
    }

    public synchronized void a(@NonNull Object obj) {
        if (!((ArgumentsMerger) this.c.componentArguments).compareWithOtherArguments(obj)) {
            a(new X5(c(), C5342za.I.v(), C5342za.I.s(), (ArgumentsMerger) ((ArgumentsMerger) this.c.componentArguments).mergeFrom(obj)));
            e();
        }
    }

    public final synchronized void a(@NonNull C5100pm c5100pm) {
        a(new X5(c5100pm, C5342za.I.v(), C5342za.I.s(), b()));
        e();
    }

    @NonNull
    public final synchronized BaseRequestConfig a() {
        try {
            if (this.a == null) {
                this.a = this.b.load(this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.a;
    }
}
