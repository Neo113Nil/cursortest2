package xsna;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: SequenceBuilder.kt */
/* loaded from: classes8.dex */
public final class vki0<T> extends ali0<T> implements Iterator<T>, spj<s3q0>, gcy {
    public int b;
    public T c;
    public Iterator<? extends T> d;
    public spj<? super s3q0> e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ali0
    public final CoroutineSingletons a(Object obj, spj spjVar) {
        this.c = obj;
        this.b = 3;
        this.e = spjVar;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @Override // xsna.ali0
    public final Object b(Iterator it, RestrictedSuspendLambda restrictedSuspendLambda) {
        if (!it.hasNext()) {
            return s3q0.a;
        }
        this.d = it;
        this.b = 2;
        this.e = restrictedSuspendLambda;
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public final RuntimeException c() {
        int i = this.b;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.b);
    }

    public final void d(spj<? super s3q0> spjVar) {
        this.e = spjVar;
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return EmptyCoroutineContext.b;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw c();
                }
                if (this.d.hasNext()) {
                    this.b = 2;
                    return true;
                }
                this.d = null;
            }
            this.b = 5;
            spj<? super s3q0> spjVar = this.e;
            this.e = null;
            spjVar.resumeWith(s3q0.a);
        }
    }

    @Override // java.util.Iterator
    public final T next() {
        int i = this.b;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.b = 1;
            return this.d.next();
        }
        if (i != 3) {
            throw c();
        }
        this.b = 0;
        T t = this.c;
        this.c = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        kotlin.a.a(obj);
        this.b = 4;
    }
}
