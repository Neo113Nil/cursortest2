package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: SafeContinuationJvm.kt */
/* loaded from: classes8.dex */
public final class gzg0<T> implements spj<T>, awj {
    public static final AtomicReferenceFieldUpdater<gzg0<?>, Object> c = AtomicReferenceFieldUpdater.newUpdater(gzg0.class, Object.class, "result");
    public final spj<T> b;
    private volatile Object result;

    public gzg0(spj spjVar, CoroutineSingletons coroutineSingletons) {
        this.b = spjVar;
        this.result = coroutineSingletons;
    }

    public final Object a() {
        Object obj = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            AtomicReferenceFieldUpdater<gzg0<?>, Object> atomicReferenceFieldUpdater = c;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, coroutineSingletons2)) {
                if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                    obj = this.result;
                }
            }
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
        return obj;
    }

    @Override // xsna.awj
    public final awj getCallerFrame() {
        spj<T> spjVar = this.b;
        if (spjVar instanceof awj) {
            return (awj) spjVar;
        }
        return null;
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return this.b.getContext();
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                AtomicReferenceFieldUpdater<gzg0<?>, Object> atomicReferenceFieldUpdater = c;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, coroutineSingletons, obj)) {
                    if (atomicReferenceFieldUpdater.get(this) != coroutineSingletons) {
                        break;
                    }
                }
                return;
            }
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (obj2 != coroutineSingletons2) {
                throw new IllegalStateException("Already resumed");
            }
            AtomicReferenceFieldUpdater<gzg0<?>, Object> atomicReferenceFieldUpdater2 = c;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.RESUMED;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, coroutineSingletons2, coroutineSingletons3)) {
                if (atomicReferenceFieldUpdater2.get(this) != coroutineSingletons2) {
                    break;
                }
            }
            this.b.resumeWith(obj);
            return;
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.b;
    }

    public gzg0(spj<? super T> spjVar) {
        this(spjVar, CoroutineSingletons.UNDECIDED);
    }
}
