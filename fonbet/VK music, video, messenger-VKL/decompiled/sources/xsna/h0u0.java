package xsna;

import com.vk.mvi.core.internal.executors.ThreadType;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ViewProperty.kt */
/* loaded from: classes3.dex */
public final class h0u0<T> implements yzt0 {
    public final ug50<T> a = new ug50<>();
    public final AtomicReference<T> b = new AtomicReference<>(null);
    public volatile T c;
    public volatile T d;

    /* compiled from: ViewProperty.kt */
    public static final class a implements fr70, g0t {
        public final /* synthetic */ d8k b;

        public a(d8k d8kVar) {
            this.b = d8kVar;
        }

        @Override // xsna.fr70
        public final /* synthetic */ void a(Object obj) {
            this.b.invoke(obj);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof fr70) && (obj instanceof g0t)) {
                return epx.f(getFunctionDelegate(), ((g0t) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // xsna.g0t
        public final xzs<?> getFunctionDelegate() {
            return this.b;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Override // xsna.yzt0
    public final T a() {
        return c().get();
    }

    @Override // xsna.yzt0
    public final void b(izs izsVar, f5z f5zVar) {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType threadType = ThreadType.MAIN;
        aVar.getClass();
        ThreadType.a.a(threadType);
        ThreadType.a.a(threadType);
        ug50<T> ug50Var = this.a;
        if (ug50Var.b.e > 0) {
            return;
        }
        aVar.getClass();
        ThreadType.a.a(threadType);
        if (this.c != null) {
            aVar.getClass();
            ThreadType.a.a(threadType);
            T t = this.c;
            aVar.getClass();
            ThreadType.a.a(threadType);
            this.c = null;
            this.d = t;
            this.a.k(t);
        }
        ug50Var.e(f5zVar, new a(new d8k(izsVar, 6)));
    }

    public final AtomicReference<T> c() {
        ThreadType.a aVar = ThreadType.Companion;
        ThreadType[] threadTypeArr = {ThreadType.MAIN, ThreadType.STATE};
        aVar.getClass();
        ThreadType.a.a(threadTypeArr);
        return this.b;
    }
}
