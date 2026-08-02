package xsna;

import com.vk.toggle.features.CoreFeatures;
import java.io.File;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ij20;
import xsna.qr6;
import xsna.xgl0;

/* compiled from: ApiMethodExt.kt */
/* loaded from: classes2.dex */
public final class bz2 {
    public static final com.vk.movika.sdk.base.utils.b a = new com.vk.movika.sdk.base.utils.b(1);

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: ApiMethodExt.kt */
    @b6l(c = "com.vk.im.engine.utils.extensions.ApiMethodExtKt$executeViaWebSocketOrHttp$result$1$1", f = "ApiMethodExt.kt", l = {88}, m = "invokeSuspend")
    public static final class a<T> extends SuspendLambda implements wzs<yvj, spj<? super T>, Object> {
        final /* synthetic */ rhx0<T> $wsCall;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rhx0<T> rhx0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$wsCall = rhx0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$wsCall, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((a) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            izp izpVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            rhx0<T> rhx0Var = this.$wsCall;
            this.label = 1;
            jgp jgpVar = jgp.b;
            f25 f25Var = qhx0.a;
            if (f25Var == null || (izpVar = (izp) f25Var.invoke()) == null) {
                throw new IllegalStateException("EventHubApiService is not registered");
            }
            Object a = izpVar.a(rhx0Var, jgpVar, this);
            return a == coroutineSingletons ? coroutineSingletons : a;
        }
    }

    public static final void a() {
        xgl0.a.getClass();
        if (epx.f(xgl0.a.b.get(), Boolean.TRUE)) {
            x19.N(com.vk.metrics.eventtracking.b.a, new IllegalStateException("A network request is about to run inside transaction, deadlock is possible. Get rid of calling this method!"));
        }
    }

    public static final File b(o8o o8oVar, s14 s14Var) {
        a();
        vx2.a.getClass();
        return vx2.b().m(o8oVar, s14Var);
    }

    public static final <T> T c(nx2<T> nx2Var, String str) {
        a();
        pz2 pz2Var = pz2.b;
        if (str == null) {
            str = "unknown";
        }
        pz2Var.D(str);
        vx2.a.getClass();
        return nx2Var.f(vx2.b());
    }

    public static final <T> T d(xy2<T> xy2Var) {
        a();
        pz2.b.D(xy2Var.b());
        kcp n = n(xy2Var, a);
        vx2.a.getClass();
        return (T) ((az2) n.c).invoke(vx2.b());
    }

    public static final <T> T e(akv akvVar, m7r0 m7r0Var, k7r0<T> k7r0Var) {
        a();
        vx2.a.getClass();
        wy2 b = vx2.b();
        return (T) b.h(b.l(akvVar, b.b(akvVar, m7r0Var, k7r0Var)));
    }

    public static final <T> T f(ij20 ij20Var, k7r0<T> k7r0Var) {
        a();
        pz2.b.D(ij20Var.c);
        vx2.a.getClass();
        return (T) vx2.b().d(ij20Var, k7r0Var);
    }

    public static final ieg0 g(eeg0 eeg0Var, qr6.a aVar) {
        String str = eeg0Var.a;
        a();
        vx2.a.getClass();
        wy2 b = vx2.b();
        long incrementAndGet = wy2.q.incrementAndGet();
        ara i = iyx.i(new geg0(b, b.i(), incrementAndGet, eeg0Var, aVar), b.r(), "Resumable", null);
        int i2 = eeg0Var.b;
        ara i3 = iyx.i(new fjr0(b, i2, i, b.d), b.r(), "Validation", null);
        if (i2 > 0) {
            i3 = iyx.i(new qwp(i2, i3, b), b.r(), "ErrorRetry", null);
        }
        ara i4 = iyx.i(new d0g(b, str, b.k, i3), b.r(), "ColdStart", null);
        if (eeg0Var.j) {
            i4 = iyx.i(new g260(b, i4), b.r(), "NetworkAwait", null);
        }
        return (ieg0) b.h(new jz80(b, b.r(), eeg0Var.a, incrementAndGet, "upload", iyx.i(new rsk0(b, eeg0Var.a, incrementAndGet, b.s(str, i4)), b.r(), "Stat", null)));
    }

    public static final void h(ij20 ij20Var) {
        a();
        pz2.b.D(ij20Var.c);
        vx2.a.getClass();
        vx2.b().f(ij20Var);
    }

    public static final <T> T k(ij20 ij20Var, k7r0<T> k7r0Var, gzs<? extends T> gzsVar) {
        f25 f25Var;
        izp izpVar;
        T t;
        CoreFeatures coreFeatures = CoreFeatures.COMMON_WEBSOCKET_API;
        coreFeatures.getClass();
        if (com.vk.toggle.b.A.a(coreFeatures) && qhx0.a != null && (f25Var = qhx0.a) != null && (izpVar = (izp) f25Var.invoke()) != null && izpVar.isConnected()) {
            try {
                t = (T) myc0.i(EmptyCoroutineContext.b, new a(new rhx0(ij20Var.c, ij20Var.d, ij20Var.e, ij20Var.f, new h7(k7r0Var, 1)), null));
            } catch (Throwable th) {
                t = (T) new Result.Failure(th);
            }
            Throwable a2 = Result.a(t);
            InterruptedException interruptedException = a2 instanceof InterruptedException ? (InterruptedException) a2 : null;
            if (interruptedException != null) {
                throw interruptedException;
            }
            if (!(t instanceof Result.Failure)) {
                kotlin.a.a(t);
                return t;
            }
        }
        return gzsVar.invoke();
    }

    public static final <T> T l(xy2<T> xy2Var, boolean z) {
        a();
        pz2.b.D(xy2Var.b());
        kcp n = n(xy2Var, new zy2(z, 0));
        vx2.a.getClass();
        return (T) ((az2) n.c).invoke(vx2.b());
    }

    public static final String m() {
        vx2.a.getClass();
        return vx2.b().a.g;
    }

    public static final kcp n(xy2 xy2Var, izs izsVar) {
        a();
        return new kcp(new az2(0, (Object) xy2Var, (Object) izsVar));
    }

    public static final <T> ij20.a o(xy2<T> xy2Var, String str) {
        a();
        ij20.a aVar = new ij20.a();
        aVar.c = xy2Var.b();
        aVar.d = str;
        aVar.k(xy2Var.getParamsMap());
        return aVar;
    }
}
