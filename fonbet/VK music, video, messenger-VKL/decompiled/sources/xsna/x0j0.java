package xsna;

import java.util.LinkedHashMap;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uyc0;

/* compiled from: SettingsCache.kt */
/* loaded from: classes.dex */
public final class x0j0 {
    public static final uyc0.a<Boolean> c = new uyc0.a<>("firebase_sessions_enabled");
    public static final uyc0.a<Double> d = new uyc0.a<>("firebase_sessions_sampling_rate");
    public static final uyc0.a<Integer> e = new uyc0.a<>("firebase_sessions_restart_timeout");
    public static final uyc0.a<Integer> f = new uyc0.a<>("firebase_sessions_cache_duration");
    public static final uyc0.a<Long> g = new uyc0.a<>("firebase_sessions_cache_updated_time");
    public final fvk<uyc0> a;
    public ysi0 b;

    /* compiled from: SettingsCache.kt */
    @b6l(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {52}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return x0j0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            x0j0 x0j0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                x0j0 x0j0Var2 = x0j0.this;
                ksr<uyc0> data = x0j0Var2.a.getData();
                this.L$0 = x0j0Var2;
                this.label = 1;
                Object n = rsr.n(data, this);
                if (n == coroutineSingletons) {
                    return coroutineSingletons;
                }
                x0j0Var = x0j0Var2;
                obj = n;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                x0j0Var = (x0j0) this.L$0;
                kotlin.a.a(obj);
            }
            x0j0.a(x0j0Var, new nh50(new LinkedHashMap(((uyc0) obj).a()), true));
            return s3q0.a;
        }
    }

    public x0j0(fvk<uyc0> fvkVar) {
        this.a = fvkVar;
        myc0.i(EmptyCoroutineContext.b, new a(null));
    }

    public static final void a(x0j0 x0j0Var, uyc0 uyc0Var) {
        x0j0Var.getClass();
        x0j0Var.b = new ysi0((Boolean) uyc0Var.b(c), (Double) uyc0Var.b(d), (Integer) uyc0Var.b(e), (Integer) uyc0Var.b(f), (Long) uyc0Var.b(g));
    }

    public final boolean b() {
        ysi0 ysi0Var = this.b;
        Long l = (ysi0Var == null ? null : ysi0Var).e;
        if (ysi0Var == null) {
            ysi0Var = null;
        }
        Integer num = ysi0Var.d;
        return l == null || num == null || (System.currentTimeMillis() - l.longValue()) / ((long) 1000) >= ((long) num.intValue());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r6.toString();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(uyc0.a aVar, Object obj, ContinuationImpl continuationImpl) {
        y0j0 y0j0Var;
        int i;
        if (continuationImpl instanceof y0j0) {
            y0j0Var = (y0j0) continuationImpl;
            int i2 = y0j0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y0j0Var.label = i2 - Integer.MIN_VALUE;
                Object obj2 = y0j0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = y0j0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    fvk<uyc0> fvkVar = this.a;
                    z0j0 z0j0Var = new z0j0(obj, aVar, this, null);
                    y0j0Var.label = 1;
                    if (fvkVar.a(new xyc0(z0j0Var, null), y0j0Var) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj2);
                }
                return s3q0.a;
            }
        }
        y0j0Var = new y0j0(this, continuationImpl);
        Object obj22 = y0j0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = y0j0Var.label;
        if (i != 0) {
        }
        return s3q0.a;
    }
}
