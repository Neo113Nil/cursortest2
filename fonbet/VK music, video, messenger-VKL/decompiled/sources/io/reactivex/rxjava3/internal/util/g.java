package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.v;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.axm0;

/* compiled from: HalfSerializer.java */
/* loaded from: classes8.dex */
public final class g {
    public static void a(v<?> vVar, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.f(vVar);
        }
    }

    public static void b(v<?> vVar, Throwable th, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicThrowable.a(th) && atomicInteger.getAndIncrement() == 0) {
            atomicThrowable.f(vVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void c(v<? super T> vVar, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            vVar.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                atomicThrowable.f(vVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean d(axm0<? super T> axm0Var, T t, AtomicInteger atomicInteger, AtomicThrowable atomicThrowable) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            axm0Var.onNext(t);
            if (atomicInteger.decrementAndGet() == 0) {
                return true;
            }
            atomicThrowable.g(axm0Var);
        }
        return false;
    }
}
