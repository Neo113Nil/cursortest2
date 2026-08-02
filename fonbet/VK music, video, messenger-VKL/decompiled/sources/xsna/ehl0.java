package xsna;

import java.util.Collections;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: StorageMemCacheSingleHelper.kt */
/* loaded from: classes2.dex */
public final class ehl0<T> {
    public final cil0<T> a;
    public final FunctionReferenceImpl b;
    public final FunctionReferenceImpl c;
    public final Object d = new Object();
    public T e;
    public boolean f;

    /* JADX WARN: Multi-variable type inference failed */
    public ehl0(cil0<? super T> cil0Var, gzs<? extends T> gzsVar, izs<? super T, s3q0> izsVar) {
        this.a = cil0Var;
        this.b = (FunctionReferenceImpl) gzsVar;
        this.c = (FunctionReferenceImpl) izsVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    public final T a() {
        boolean z;
        T t;
        synchronized (this.d) {
            z = this.f;
        }
        if (!z) {
            T t2 = (T) this.b.invoke();
            synchronized (this.d) {
                this.e = t2;
                this.f = true;
                s3q0 s3q0Var = s3q0.a;
            }
        }
        synchronized (this.d) {
            t = this.e;
        }
        return t;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    public final void b(T t) {
        T a = a();
        if (epx.f(a, t)) {
            return;
        }
        this.c.invoke(t);
        synchronized (this.d) {
            this.e = t;
            this.f = true;
            s3q0 s3q0Var = s3q0.a;
        }
        cil0<T> cil0Var = this.a;
        if (cil0Var != null) {
            cil0Var.c(Collections.singletonList(new hhl0(a, t)));
        }
    }
}
