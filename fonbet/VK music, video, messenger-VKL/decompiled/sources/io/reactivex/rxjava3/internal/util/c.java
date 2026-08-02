package io.reactivex.rxjava3.internal.util;

import java.util.concurrent.CountDownLatch;

/* compiled from: BlockingIgnoringReceiver.java */
/* loaded from: classes8.dex */
public final class c extends CountDownLatch implements io.reactivex.rxjava3.functions.f<Throwable>, io.reactivex.rxjava3.functions.a {
    public Throwable b;

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Throwable th) throws Throwable {
        this.b = th;
        countDown();
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        countDown();
    }
}
