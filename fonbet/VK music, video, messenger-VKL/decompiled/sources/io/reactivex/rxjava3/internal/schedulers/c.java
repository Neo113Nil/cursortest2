package io.reactivex.rxjava3.internal.schedulers;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: DisposeOnCancel.java */
/* loaded from: classes11.dex */
public final class c implements Future<Object> {
    public final io.reactivex.rxjava3.disposables.c b;

    public c(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.b.dispose();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return null;
    }
}
