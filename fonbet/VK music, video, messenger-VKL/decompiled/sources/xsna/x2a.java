package xsna;

/* compiled from: CatalogCacheCombineStrategy.kt */
/* loaded from: classes16.dex */
public interface x2a<T> {

    /* compiled from: CatalogCacheCombineStrategy.kt */
    public static final class a<T> implements x2a<T> {
        @Override // xsna.x2a
        public final io.reactivex.rxjava3.core.q a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z) {
            return new io.reactivex.rxjava3.internal.operators.observable.c(qVar).w().L(new qj4(new td0(7, b0Var, qVar), 3), false);
        }
    }

    /* compiled from: CatalogCacheCombineStrategy.kt */
    public static final class b<T> implements x2a<T> {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        @Override // xsna.x2a
        public final io.reactivex.rxjava3.core.q a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z) {
            return this.a ? new io.reactivex.rxjava3.internal.operators.observable.t(new y2a(0, qVar, b0Var)) : io.reactivex.rxjava3.core.q.q(qVar, b0Var);
        }
    }

    /* compiled from: CatalogCacheCombineStrategy.kt */
    public static final class c<T> implements x2a<T> {
        public boolean a;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [io.reactivex.rxjava3.core.q] */
        @Override // xsna.x2a
        public final io.reactivex.rxjava3.core.q a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z) {
            io.reactivex.rxjava3.internal.operators.observable.b0 b0Var2 = b0Var;
            if (!this.a) {
                b0Var2 = io.reactivex.rxjava3.core.q.q(qVar, b0Var);
            }
            this.a = true;
            return b0Var2;
        }
    }

    io.reactivex.rxjava3.core.q a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z);

    /* compiled from: CatalogCacheCombineStrategy.kt */
    public static final class d<T> implements x2a<T> {
        @Override // xsna.x2a
        public final io.reactivex.rxjava3.core.q a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z) {
            return qVar;
        }
    }

    /* compiled from: CatalogCacheCombineStrategy.kt */
    public static final class e<T> implements x2a<T> {
        @Override // xsna.x2a
        public final io.reactivex.rxjava3.core.q a(io.reactivex.rxjava3.core.q qVar, io.reactivex.rxjava3.internal.operators.observable.b0 b0Var, boolean z) {
            return b0Var;
        }
    }
}
