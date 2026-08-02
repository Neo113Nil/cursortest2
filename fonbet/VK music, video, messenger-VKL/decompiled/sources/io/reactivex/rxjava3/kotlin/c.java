package io.reactivex.rxjava3.kotlin;

import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.functions.f;
import kotlin.jvm.internal.Lambda;
import xsna.gzs;
import xsna.izs;
import xsna.s3q0;

/* compiled from: subscribers.kt */
/* loaded from: classes8.dex */
public final class c {
    public static final C2160c a = C2160c.i;
    public static final b b = b.i;
    public static final a c = a.i;

    /* compiled from: subscribers.kt */
    public static final class a extends Lambda implements gzs<s3q0> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final /* bridge */ /* synthetic */ s3q0 invoke() {
            return s3q0.a;
        }
    }

    /* compiled from: subscribers.kt */
    public static final class b extends Lambda implements izs<Throwable, s3q0> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(Throwable th) {
            return s3q0.a;
        }
    }

    /* compiled from: subscribers.kt */
    /* renamed from: io.reactivex.rxjava3.kotlin.c$c, reason: collision with other inner class name */
    public static final class C2160c extends Lambda implements izs<Object, s3q0> {
        public static final C2160c i = new C2160c(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
            return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.kotlin.e] */
    public static final <T> f<T> a(izs<? super T, s3q0> izsVar) {
        if (izsVar == a) {
            return io.reactivex.rxjava3.internal.functions.a.d;
        }
        if (izsVar != null) {
            izsVar = new e(izsVar);
        }
        return (f) izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.kotlin.d] */
    public static final io.reactivex.rxjava3.functions.a b(gzs<s3q0> gzsVar) {
        if (gzsVar == c) {
            return io.reactivex.rxjava3.internal.functions.a.c;
        }
        if (gzsVar != null) {
            gzsVar = new d(gzsVar);
        }
        return (io.reactivex.rxjava3.functions.a) gzsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.kotlin.e] */
    public static final f<Throwable> c(izs<? super Throwable, s3q0> izsVar) {
        if (izsVar == b) {
            return io.reactivex.rxjava3.internal.functions.a.f;
        }
        if (izsVar != null) {
            izsVar = new e(izsVar);
        }
        return (f) izsVar;
    }

    public static final io.reactivex.rxjava3.disposables.c d(io.reactivex.rxjava3.core.a aVar, gzs gzsVar, izs izsVar) {
        b bVar = b;
        return (izsVar == bVar && gzsVar == c) ? aVar.subscribe() : izsVar == bVar ? aVar.subscribe(new d(gzsVar)) : aVar.subscribe(b(gzsVar), new e(izsVar));
    }

    public static final <T> io.reactivex.rxjava3.disposables.c e(x<T> xVar, izs<? super Throwable, s3q0> izsVar, izs<? super T, s3q0> izsVar2) {
        return xVar.subscribe(a(izsVar2), c(izsVar));
    }

    public static io.reactivex.rxjava3.disposables.c f(int i, q qVar, gzs gzsVar, izs izsVar, izs izsVar2) {
        if ((i & 1) != 0) {
            izsVar = b;
        }
        if ((i & 2) != 0) {
            gzsVar = c;
        }
        if ((i & 4) != 0) {
            izsVar2 = a;
        }
        return qVar.subscribe(a(izsVar2), c(izsVar), b(gzsVar));
    }

    public static /* synthetic */ io.reactivex.rxjava3.disposables.c g(io.reactivex.rxjava3.core.a aVar, izs izsVar, gzs gzsVar, int i) {
        if ((i & 1) != 0) {
            izsVar = b;
        }
        if ((i & 2) != 0) {
            gzsVar = c;
        }
        return d(aVar, gzsVar, izsVar);
    }

    public static /* synthetic */ io.reactivex.rxjava3.disposables.c h(x xVar, izs izsVar, izs izsVar2, int i) {
        if ((i & 1) != 0) {
            izsVar = b;
        }
        if ((i & 2) != 0) {
            izsVar2 = a;
        }
        return e(xVar, izsVar, izsVar2);
    }
}
