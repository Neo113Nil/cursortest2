package io.reactivex.rxjava3.internal.subscribers;

import io.reactivex.rxjava3.core.j;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.functions.f;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableInternalHelper$RequestMax;
import io.reactivex.rxjava3.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;
import xsna.jxm0;

/* loaded from: classes11.dex */
public final class LambdaSubscriber<T> extends AtomicReference<jxm0> implements j<T>, jxm0, io.reactivex.rxjava3.disposables.c, io.reactivex.rxjava3.observers.c {
    private static final long serialVersionUID = -7251123623727029452L;
    final io.reactivex.rxjava3.functions.a onComplete;
    final f<? super Throwable> onError;
    final f<? super T> onNext;
    final f<? super jxm0> onSubscribe;

    public LambdaSubscriber(f fVar, f fVar2, io.reactivex.rxjava3.functions.a aVar, FlowableInternalHelper$RequestMax flowableInternalHelper$RequestMax) {
        this.onNext = fVar;
        this.onError = fVar2;
        this.onComplete = aVar;
        this.onSubscribe = flowableInternalHelper$RequestMax;
    }

    @Override // xsna.jxm0
    public final void cancel() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final void dispose() {
        SubscriptionHelper.a(this);
    }

    @Override // io.reactivex.rxjava3.disposables.c
    public final boolean h() {
        return get() == SubscriptionHelper.CANCELLED;
    }

    @Override // io.reactivex.rxjava3.observers.c
    public final boolean hasCustomOnError() {
        return this.onError != io.reactivex.rxjava3.internal.functions.a.f;
    }

    @Override // xsna.axm0
    public final void onComplete() {
        jxm0 jxm0Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (jxm0Var != subscriptionHelper) {
            lazySet(subscriptionHelper);
            try {
                this.onComplete.run();
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                io.reactivex.rxjava3.plugins.a.a(th);
            }
        }
    }

    @Override // xsna.axm0
    public final void onError(Throwable th) {
        jxm0 jxm0Var = get();
        SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
        if (jxm0Var == subscriptionHelper) {
            io.reactivex.rxjava3.plugins.a.a(th);
            return;
        }
        lazySet(subscriptionHelper);
        try {
            this.onError.accept(th);
        } catch (Throwable th2) {
            io.reactivex.rxjava3.exceptions.a.b(th2);
            io.reactivex.rxjava3.plugins.a.a(new CompositeException(th, th2));
        }
    }

    @Override // xsna.axm0
    public final void onNext(T t) {
        if (h()) {
            return;
        }
        try {
            this.onNext.accept(t);
        } catch (Throwable th) {
            io.reactivex.rxjava3.exceptions.a.b(th);
            get().cancel();
            onError(th);
        }
    }

    @Override // xsna.axm0
    public final void onSubscribe(jxm0 jxm0Var) {
        if (SubscriptionHelper.d(this, jxm0Var)) {
            try {
                this.onSubscribe.accept(this);
            } catch (Throwable th) {
                io.reactivex.rxjava3.exceptions.a.b(th);
                jxm0Var.cancel();
                onError(th);
            }
        }
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        get().request(j);
    }
}
