package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: CoroutineDispatcher.kt */
/* loaded from: classes11.dex */
public abstract class ovj extends kotlin.coroutines.a implements kotlin.coroutines.c {
    public static final a b = new a(c.a.b, new nvj());

    /* compiled from: CoroutineDispatcher.kt */
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.c, ovj> {
    }

    public ovj() {
        super(c.a.b);
    }

    @Override // kotlin.coroutines.c
    public final mcn L(ContinuationImpl continuationImpl) {
        return new mcn(this, continuationImpl);
    }

    public abstract void P(kotlin.coroutines.d dVar, Runnable runnable);

    public void Q(kotlin.coroutines.d dVar, Runnable runnable) {
        upj.c(this, dVar, runnable);
    }

    public boolean S(kotlin.coroutines.d dVar) {
        return !(this instanceof u2q0);
    }

    public ovj T(int i) {
        p7i.c(i);
        return new j7z(this, i);
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        boolean z;
        E e;
        if (!(cVar instanceof kotlin.coroutines.b)) {
            if (c.a.b == cVar) {
                return this;
            }
            return null;
        }
        kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar;
        d.c<?> key = getKey();
        if (key == bVar) {
            bVar.getClass();
        } else if (bVar.c != key) {
            z = false;
            if (!z && (e = (E) bVar.b.invoke(this)) != null) {
                return e;
            }
        }
        z = true;
        return !z ? null : null;
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        boolean z;
        if (cVar instanceof kotlin.coroutines.b) {
            kotlin.coroutines.b bVar = (kotlin.coroutines.b) cVar;
            d.c<?> key = getKey();
            if (key == bVar) {
                bVar.getClass();
            } else if (bVar.c != key) {
                z = false;
                if (z && ((d.b) bVar.b.invoke(this)) != null) {
                    return EmptyCoroutineContext.b;
                }
            }
            z = true;
            if (z) {
                return EmptyCoroutineContext.b;
            }
        } else if (c.a.b == cVar) {
            return EmptyCoroutineContext.b;
        }
        return this;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + y6l.a(this);
    }

    @Override // kotlin.coroutines.c
    public final void v(spj<?> spjVar) {
        mcn mcnVar = (mcn) spjVar;
        mcnVar.getClass();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mcn.i;
        while (atomicReferenceFieldUpdater.get(mcnVar) == upj.b) {
        }
        Object obj = atomicReferenceFieldUpdater.get(mcnVar);
        lq9 lq9Var = obj instanceof lq9 ? (lq9) obj : null;
        if (lq9Var != null) {
            lq9Var.k();
        }
    }
}
