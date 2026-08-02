package io.reactivex.rxjava3.internal.subscriptions;

import io.reactivex.rxjava3.internal.fuseable.i;
import xsna.axm0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class EmptySubscription implements i<Object> {
    private static final /* synthetic */ EmptySubscription[] $VALUES;
    public static final EmptySubscription INSTANCE;

    static {
        EmptySubscription emptySubscription = new EmptySubscription("INSTANCE", 0);
        INSTANCE = emptySubscription;
        $VALUES = new EmptySubscription[]{emptySubscription};
    }

    public EmptySubscription() {
        throw null;
    }

    public static void b(axm0<?> axm0Var) {
        axm0Var.onSubscribe(INSTANCE);
        axm0Var.onComplete();
    }

    public static void c(Throwable th, axm0<?> axm0Var) {
        axm0Var.onSubscribe(INSTANCE);
        axm0Var.onError(th);
    }

    public static EmptySubscription valueOf(String str) {
        return (EmptySubscription) Enum.valueOf(EmptySubscription.class, str);
    }

    public static EmptySubscription[] values() {
        return (EmptySubscription[]) $VALUES.clone();
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.h
    public final int a(int i) {
        return 2;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean isEmpty() {
        return true;
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final Object poll() {
        return null;
    }

    @Override // xsna.jxm0
    public final void request(long j) {
        SubscriptionHelper.e(j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "EmptySubscription";
    }

    @Override // xsna.jxm0
    public final void cancel() {
    }

    @Override // io.reactivex.rxjava3.internal.fuseable.l
    public final void clear() {
    }
}
