package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: DispatchedContinuation.kt */
/* loaded from: classes11.dex */
public final class mcn<T> extends ocn<T> implements awj, spj<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(mcn.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final ovj e;
    public final ContinuationImpl f;
    public Object g;
    public final Object h;

    public mcn(ovj ovjVar, ContinuationImpl continuationImpl) {
        super(-1);
        this.e = ovjVar;
        this.f = continuationImpl;
        this.g = upj.a;
        this.h = continuationImpl.getContext().fold(0, mqo0.b);
    }

    @Override // xsna.ocn
    public final Object g() {
        Object obj = this.g;
        this.g = upj.a;
        return obj;
    }

    @Override // xsna.awj
    public final awj getCallerFrame() {
        ContinuationImpl continuationImpl = this.f;
        if (continuationImpl != null) {
            return continuationImpl;
        }
        return null;
    }

    @Override // xsna.spj
    public final kotlin.coroutines.d getContext() {
        return this.f.getContext();
    }

    @Override // xsna.spj
    public final void resumeWith(Object obj) {
        Throwable a = Result.a(obj);
        Object d8iVar = a == null ? obj : new d8i(a, false);
        ContinuationImpl continuationImpl = this.f;
        kotlin.coroutines.d context = continuationImpl.getContext();
        ovj ovjVar = this.e;
        if (upj.d(ovjVar, context)) {
            this.g = d8iVar;
            this.d = 0;
            upj.c(ovjVar, continuationImpl.getContext(), this);
            return;
        }
        c0q a2 = bro0.a();
        if (a2.c >= 4294967296L) {
            this.g = d8iVar;
            this.d = 0;
            a2.V(this);
            return;
        }
        a2.X(true);
        try {
            kotlin.coroutines.d context2 = continuationImpl.getContext();
            Object b = mqo0.b(context2, this.h);
            try {
                continuationImpl.resumeWith(obj);
                s3q0 s3q0Var = s3q0.a;
                while (a2.a0()) {
                }
            } finally {
                mqo0.a(context2, b);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.e + ", " + y6l.c(this.f) + ']';
    }

    @Override // xsna.ocn
    public final spj<T> b() {
        return this;
    }
}
