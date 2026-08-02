package io.reactivex.rxjava3.internal.functions;

import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: Functions.java */
/* loaded from: classes11.dex */
public final class a {
    public static final q a = new q();
    public static final m b = new m();
    public static final k c = new k();
    public static final l d = new l();
    public static final n e = new n();
    public static final w f = new w();
    public static final x g = new x();
    public static final o h = new o();
    public static final v i = new v();

    /* compiled from: Functions.java */
    /* renamed from: io.reactivex.rxjava3.internal.functions.a$a, reason: collision with other inner class name */
    public static final class C2116a<T> implements io.reactivex.rxjava3.functions.f<T> {
        public final io.reactivex.rxjava3.functions.a b;

        public C2116a(io.reactivex.rxjava3.functions.a aVar) {
            this.b = aVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(T t) throws Throwable {
            this.b.run();
        }
    }

    /* compiled from: Functions.java */
    public static final class b<T1, T2, R> implements io.reactivex.rxjava3.functions.l<Object[], R> {
        public final io.reactivex.rxjava3.functions.c<? super T1, ? super T2, ? extends R> b;

        public b(io.reactivex.rxjava3.functions.c<? super T1, ? super T2, ? extends R> cVar) {
            this.b = cVar;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length == 2) {
                return this.b.apply(objArr2[0], objArr2[1]);
            }
            throw new IllegalArgumentException("Array of size 2 expected but got " + objArr2.length);
        }
    }

    /* compiled from: Functions.java */
    public static final class c<T1, T2, T3, R> implements io.reactivex.rxjava3.functions.l<Object[], R> {
        public final io.reactivex.rxjava3.functions.g<T1, T2, T3, R> b;

        public c(io.reactivex.rxjava3.functions.g<T1, T2, T3, R> gVar) {
            this.b = gVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 3) {
                throw new IllegalArgumentException("Array of size 3 expected but got " + objArr2.length);
            }
            return this.b.d(objArr2[0], objArr2[1], objArr2[2]);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class d<T1, T2, T3, T4, R> implements io.reactivex.rxjava3.functions.l<Object[], R> {
        public final io.reactivex.rxjava3.functions.h<T1, T2, T3, T4, R> b;

        public d(io.reactivex.rxjava3.functions.h<T1, T2, T3, T4, R> hVar) {
            this.b = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 4) {
                throw new IllegalArgumentException("Array of size 4 expected but got " + objArr2.length);
            }
            return this.b.f(objArr2[0], objArr2[1], objArr2[2], objArr2[3]);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class e<T1, T2, T3, T4, T5, R> implements io.reactivex.rxjava3.functions.l<Object[], R> {
        public final io.reactivex.rxjava3.functions.i<T1, T2, T3, T4, T5, R> b;

        public e(io.reactivex.rxjava3.functions.i<T1, T2, T3, T4, T5, R> iVar) {
            this.b = iVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 5) {
                throw new IllegalArgumentException("Array of size 5 expected but got " + objArr2.length);
            }
            return this.b.g(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4]);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class f<T1, T2, T3, T4, T5, T6, R> implements io.reactivex.rxjava3.functions.l<Object[], R> {
        public final io.reactivex.rxjava3.functions.j<T1, T2, T3, T4, T5, T6, R> b;

        public f(io.reactivex.rxjava3.functions.j<T1, T2, T3, T4, T5, T6, R> jVar) {
            this.b = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 6) {
                throw new IllegalArgumentException("Array of size 6 expected but got " + objArr2.length);
            }
            return this.b.g(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5]);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class g<T1, T2, T3, T4, T5, T6, T7, R> implements io.reactivex.rxjava3.functions.l<Object[], R> {
        public final io.reactivex.rxjava3.functions.k<T1, T2, T3, T4, T5, T6, T7, R> b;

        public g(io.reactivex.rxjava3.functions.k<T1, T2, T3, T4, T5, T6, T7, R> kVar) {
            this.b = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object[] objArr) throws Throwable {
            Object[] objArr2 = objArr;
            if (objArr2.length != 7) {
                throw new IllegalArgumentException("Array of size 7 expected but got " + objArr2.length);
            }
            return this.b.b(objArr2[0], objArr2[1], objArr2[2], objArr2[3], objArr2[4], objArr2[5], objArr2[6]);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class h<T> implements io.reactivex.rxjava3.functions.n<List<T>> {
        @Override // io.reactivex.rxjava3.functions.n
        public final Object get() throws Throwable {
            return new ArrayList(16);
        }
    }

    /* compiled from: Functions.java */
    public static final class i<T, U> implements io.reactivex.rxjava3.functions.l<T, U> {
        public final Class<U> b;

        public i(Class<U> cls) {
            this.b = cls;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final U apply(T t) {
            return this.b.cast(t);
        }
    }

    /* compiled from: Functions.java */
    public static final class j<T, U> implements io.reactivex.rxjava3.functions.m<T> {
        public final Class<U> b;

        public j(Class<U> cls) {
            this.b = cls;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(T t) {
            return this.b.isInstance(t);
        }
    }

    /* compiled from: Functions.java */
    public static final class n implements io.reactivex.rxjava3.functions.f<Throwable> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) throws Throwable {
            io.reactivex.rxjava3.plugins.a.a(th);
        }
    }

    /* compiled from: Functions.java */
    public static final class o implements io.reactivex.rxjava3.functions.m<Object> {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return false;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class p implements io.reactivex.rxjava3.functions.n<Set<Object>> {
        private static final /* synthetic */ p[] $VALUES;
        public static final p INSTANCE;

        static {
            p pVar = new p("INSTANCE", 0);
            INSTANCE = pVar;
            $VALUES = new p[]{pVar};
        }

        public p() {
            throw null;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) $VALUES.clone();
        }

        @Override // io.reactivex.rxjava3.functions.n
        public final Set<Object> get() throws Throwable {
            return new HashSet();
        }
    }

    /* compiled from: Functions.java */
    public static final class r<T, U> implements Callable<U>, io.reactivex.rxjava3.functions.n<U>, io.reactivex.rxjava3.functions.l<T, U> {
        public final U b;

        public r(U u) {
            this.b = u;
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final U apply(T t) {
            return this.b;
        }

        @Override // java.util.concurrent.Callable
        public final U call() {
            return this.b;
        }

        @Override // io.reactivex.rxjava3.functions.n
        public final U get() {
            return this.b;
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class s<T> implements io.reactivex.rxjava3.functions.a {
        public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.core.p<T>> b;

        public s(io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.core.p<T>> fVar) {
            this.b = fVar;
        }

        @Override // io.reactivex.rxjava3.functions.a
        public final void run() throws Throwable {
            this.b.accept(io.reactivex.rxjava3.core.p.b);
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class t<T> implements io.reactivex.rxjava3.functions.f<Throwable> {
        public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.core.p<T>> b;

        public t(io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.core.p<T>> fVar) {
            this.b = fVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) throws Throwable {
            this.b.accept(io.reactivex.rxjava3.core.p.a(th));
        }
    }

    /* compiled from: Functions.java */
    /* loaded from: classes8.dex */
    public static final class u<T> implements io.reactivex.rxjava3.functions.f<T> {
        public final io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.core.p<T>> b;

        public u(io.reactivex.rxjava3.functions.f<? super io.reactivex.rxjava3.core.p<T>> fVar) {
            this.b = fVar;
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(T t) throws Throwable {
            this.b.accept(io.reactivex.rxjava3.core.p.b(t));
        }
    }

    /* compiled from: Functions.java */
    public static final class v implements io.reactivex.rxjava3.functions.n<Object> {
        @Override // io.reactivex.rxjava3.functions.n
        public final Object get() {
            return null;
        }
    }

    /* compiled from: Functions.java */
    public static final class w implements io.reactivex.rxjava3.functions.f<Throwable> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) throws Throwable {
            io.reactivex.rxjava3.plugins.a.a(new OnErrorNotImplementedException(th));
        }
    }

    /* compiled from: Functions.java */
    public static final class x implements io.reactivex.rxjava3.functions.m<Object> {
        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) {
            return true;
        }
    }

    /* compiled from: Functions.java */
    public static final class k implements io.reactivex.rxjava3.functions.a {
        public final String toString() {
            return "EmptyAction";
        }

        @Override // io.reactivex.rxjava3.functions.a
        public final void run() {
        }
    }

    /* compiled from: Functions.java */
    public static final class m implements Runnable {
        public final String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public final void run() {
        }
    }

    /* compiled from: Functions.java */
    public static final class l implements io.reactivex.rxjava3.functions.f<Object> {
        public final String toString() {
            return "EmptyConsumer";
        }

        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Object obj) {
        }
    }

    /* compiled from: Functions.java */
    public static final class q implements io.reactivex.rxjava3.functions.l<Object, Object> {
        public final String toString() {
            return "IdentityFunction";
        }

        @Override // io.reactivex.rxjava3.functions.l
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
