package xsna;

import com.vk.log.L;
import com.vk.toggle.features.MusicFeatures;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.utils.Logger;
import xsna.pvj;

/* compiled from: MusicSubscriptionProviderImpl.kt */
/* loaded from: classes.dex */
public final class i950 implements g950 {
    public static final long k = TimeUnit.DAYS.toMillis(1);
    public static final String l = "hasMusicSubscription";
    public static final String m = "expiredDateSubscription";
    public static final String n = "MusicSubscriptionProviderImpl not initialize";
    public final t350 a;
    public final zkv b;
    public final hpj c;
    public final wi50 d;
    public volatile boolean e;
    public volatile long f;
    public final bpn0 g;
    public volatile boolean h;
    public volatile long i;
    public final yok0 j;

    /* compiled from: MusicSubscriptionProviderImpl.kt */
    @b6l(c = "com.vk.music.subscription.impl.MusicSubscriptionProviderImpl$clear$1", f = "MusicSubscriptionProviderImpl.kt", l = {172}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int I$0;
        Object L$0;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return i950.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                wi50 wi50Var = i950.this.d;
                this.L$0 = wi50Var;
                this.I$0 = 0;
                this.label = 1;
                if (wi50Var.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ui50Var = wi50Var;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ui50Var = (ui50) this.L$0;
                kotlin.a.a(obj);
            }
            try {
                hzg0 hzg0Var = pjp.a;
                pjp.c(i950.l, null);
                pjp.c(i950.m, null);
                s3q0 s3q0Var = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            } catch (Throwable th) {
                ui50Var.c(null);
                throw th;
            }
        }
    }

    /* compiled from: MusicSubscriptionProviderImpl.kt */
    @b6l(c = "com.vk.music.subscription.impl.MusicSubscriptionProviderImpl$updateMusicSubscription$1", f = "MusicSubscriptionProviderImpl.kt", l = {172}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ long $expiredDate;
        final /* synthetic */ boolean $hasSubscription;
        int I$0;
        long J$0;
        Object L$0;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, long j, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$hasSubscription = z;
            this.$expiredDate = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return i950.this.new b(this.$hasSubscription, this.$expiredDate, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            boolean z;
            long j;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ui50Var = i950.this.d;
                boolean z2 = this.$hasSubscription;
                long j2 = this.$expiredDate;
                this.L$0 = ui50Var;
                this.Z$0 = z2;
                this.J$0 = j2;
                this.I$0 = 0;
                this.label = 1;
                if (ui50Var.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                z = z2;
                j = j2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                z = this.Z$0;
                ui50Var = (ui50) this.L$0;
                kotlin.a.a(obj);
            }
            try {
                hzg0 hzg0Var = pjp.a;
                pjp.c(i950.l, String.valueOf(z));
                pjp.c(i950.m, String.valueOf(j));
                s3q0 s3q0Var = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            } catch (Throwable th) {
                ui50Var.c(null);
                throw th;
            }
        }
    }

    public i950(bpn0 bpn0Var, t350 t350Var, zkv zkvVar) {
        this.a = t350Var;
        this.b = zkvVar;
        hpj a2 = zvj.a(hqu0.b().plus(whn0.a()).plus(new k950(pvj.a.b)));
        this.c = a2;
        this.d = bay.a();
        this.g = bpn0Var;
        this.i = k;
        this.j = myc0.h(a2, null, null, new h950(this, null), 3);
    }

    @Override // xsna.g950
    public final io.reactivex.rxjava3.core.q<oe50> a() {
        return (io.reactivex.rxjava3.core.q) this.g.getValue();
    }

    @Override // xsna.g950
    public final boolean b() {
        if (!MusicFeatures.AUDIO_SUBSCRIPTION_STORAGE.h()) {
            return ((ms) this.b.invoke()).D && d();
        }
        yok0 yok0Var = this.j;
        if (yok0Var != null && !yok0Var.m()) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException(n));
        }
        return this.e && d();
    }

    @Override // xsna.g950
    public final boolean c() {
        if (!this.h) {
            synchronized (this) {
                if (!this.h) {
                    io.reactivex.rxjava3.core.q<oe50> a2 = a();
                    a.q qVar = io.reactivex.rxjava3.internal.functions.a.a;
                    a2.getClass();
                    new io.reactivex.rxjava3.internal.operators.observable.y(a2, qVar, io.reactivex.rxjava3.internal.functions.b.a).subscribe(new czz(new j67(this, 2), 1), new dgl(new j950(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 1));
                    this.h = true;
                    s3q0 s3q0Var = s3q0.a;
                }
            }
        }
        if (MusicFeatures.AUDIO_SUBSCRIPTION_STORAGE.h()) {
            return b();
        }
        if (((ms) this.b.invoke()).D) {
            return d();
        }
        return false;
    }

    @Override // xsna.g950
    public final void clear() {
        this.e = false;
        this.f = 0L;
        myc0.h(this.c, null, null, new a(null), 3);
    }

    public final boolean d() {
        long j;
        long longValue = ((Number) this.a.invoke()).longValue();
        if (MusicFeatures.AUDIO_SUBSCRIPTION_STORAGE.h()) {
            yok0 yok0Var = this.j;
            if (yok0Var != null && !yok0Var.m()) {
                com.vk.metrics.eventtracking.b.a.q(new IllegalStateException(n));
            }
            j = this.f;
        } else {
            j = ((ms) this.b.invoke()).G;
        }
        return longValue < j + this.i;
    }

    @Override // xsna.g950
    public final void k(long j, boolean z) {
        this.e = z;
        this.f = j;
        myc0.h(this.c, null, null, new b(z, j, null), 3);
    }
}
