package xsna;

import java.util.List;

/* compiled from: VKAppsCatalogSearchCache.kt */
/* loaded from: classes6.dex */
public final class z8r0 {
    public static io.reactivex.rxjava3.disposables.c b;
    public static final io.reactivex.rxjava3.subjects.d a = io.reactivex.rxjava3.subjects.d.N0();
    public static volatile a c = a.b.a;

    /* compiled from: VKAppsCatalogSearchCache.kt */
    public static abstract class a {

        /* compiled from: VKAppsCatalogSearchCache.kt */
        /* renamed from: xsna.z8r0$a$a, reason: collision with other inner class name */
        public static final class C4167a extends a {
        }

        /* compiled from: VKAppsCatalogSearchCache.kt */
        public static final class b extends a {
            public static final b a = new b();
        }

        /* compiled from: VKAppsCatalogSearchCache.kt */
        public static final class c extends a {
            public final List<x7a> a;

            /* JADX WARN: Multi-variable type inference failed */
            public c(List<? extends x7a> list) {
                this.a = list;
            }
        }
    }

    public static void a(a aVar) {
        if (epx.f(c, aVar)) {
            return;
        }
        c = aVar;
        a.onNext(aVar);
    }
}
