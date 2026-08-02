package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.BlockingObserver;
import io.reactivex.rxjava3.internal.observers.LambdaObserver;
import io.reactivex.rxjava3.internal.util.NotificationLite;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: ObservableBlockingSubscribe.java */
/* loaded from: classes8.dex */
public final class g {
    public static <T> void subscribe(io.reactivex.rxjava3.core.t<? extends T> tVar, io.reactivex.rxjava3.core.v<? super T> vVar) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BlockingObserver blockingObserver = new BlockingObserver(linkedBlockingQueue);
        vVar.onSubscribe(blockingObserver);
        tVar.subscribe(blockingObserver);
        while (!blockingObserver.h()) {
            Object poll = linkedBlockingQueue.poll();
            if (poll == null) {
                try {
                    poll = linkedBlockingQueue.take();
                } catch (InterruptedException e) {
                    blockingObserver.dispose();
                    vVar.onError(e);
                    return;
                }
            }
            if (blockingObserver.h() || poll == BlockingObserver.b || NotificationLite.b(vVar, poll)) {
                return;
            }
        }
    }

    public static <T> void subscribe(io.reactivex.rxjava3.core.t<? extends T> tVar) {
        io.reactivex.rxjava3.internal.util.c cVar = new io.reactivex.rxjava3.internal.util.c(1);
        LambdaObserver lambdaObserver = new LambdaObserver(io.reactivex.rxjava3.internal.functions.a.d, cVar, cVar);
        tVar.subscribe(lambdaObserver);
        if (cVar.getCount() != 0) {
            try {
                cVar.await();
            } catch (InterruptedException e) {
                DisposableHelper.a(lambdaObserver);
                Thread.currentThread().interrupt();
                throw new IllegalStateException("Interrupted while waiting for subscription to complete.", e);
            }
        }
        Throwable th = cVar.b;
        if (th != null) {
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }

    public static <T> void subscribe(io.reactivex.rxjava3.core.t<? extends T> tVar, io.reactivex.rxjava3.functions.f<? super T> fVar, io.reactivex.rxjava3.functions.f<? super Throwable> fVar2, io.reactivex.rxjava3.functions.a aVar) {
        Objects.requireNonNull(fVar, "onNext is null");
        Objects.requireNonNull(fVar2, "onError is null");
        Objects.requireNonNull(aVar, "onComplete is null");
        subscribe(tVar, new LambdaObserver(fVar, fVar2, aVar));
    }
}
