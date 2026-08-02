package xsna;

import com.vk.log.L;

/* compiled from: EventBusController.java */
/* loaded from: classes3.dex */
public final class byp {
    public static volatile byp b;
    public final io.reactivex.rxjava3.processors.c a = new io.reactivex.rxjava3.processors.c();

    /* compiled from: EventBusController.java */
    public class a implements io.reactivex.rxjava3.functions.f<Throwable> {
        @Override // io.reactivex.rxjava3.functions.f
        public final void accept(Throwable th) throws Throwable {
            L.l("EVENTBUS_SERVICE", ms9.b("eventbus error: ", th));
        }
    }

    /* compiled from: EventBusController.java */
    public class c implements io.reactivex.rxjava3.functions.m<Object> {
        public final /* synthetic */ Class b;

        public c(Class cls) {
            this.b = cls;
        }

        @Override // io.reactivex.rxjava3.functions.m
        public final boolean test(Object obj) throws Exception {
            return obj.getClass().equals(this.b);
        }
    }

    public static byp b() {
        if (b == null) {
            synchronized (byp.class) {
                try {
                    if (b == null) {
                        b = new byp();
                    }
                } finally {
                }
            }
        }
        return b;
    }

    public final <T> io.reactivex.rxjava3.disposables.c a(Class<T> cls, io.reactivex.rxjava3.functions.f<T> fVar) {
        c cVar = new c(cls);
        io.reactivex.rxjava3.processors.c cVar2 = this.a;
        cVar2.getClass();
        return new io.reactivex.rxjava3.internal.operators.flowable.g0(new io.reactivex.rxjava3.internal.operators.flowable.m(new io.reactivex.rxjava3.internal.operators.flowable.c0(new io.reactivex.rxjava3.internal.operators.flowable.r(cVar2, cVar), new b()), io.reactivex.rxjava3.internal.functions.a.d, new a())).subscribe(fVar);
    }

    public final void c(Object obj) {
        io.reactivex.rxjava3.processors.c cVar = this.a;
        if (cVar != null) {
            cVar.onNext(obj);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: EventBusController.java */
    public class b<T> implements io.reactivex.rxjava3.functions.l<Object, T> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.functions.l
        public final T apply(Object obj) throws Exception {
            return obj;
        }
    }
}
