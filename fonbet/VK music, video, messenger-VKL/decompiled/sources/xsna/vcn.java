package xsna;

import io.reactivex.rxjava3.core.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: RxScheduler.kt */
/* loaded from: classes8.dex */
public final class vcn extends io.reactivex.rxjava3.core.w {
    public static final /* synthetic */ AtomicLongFieldUpdater b = AtomicLongFieldUpdater.newUpdater(vcn.class, "workerCounter$volatile");
    private volatile /* synthetic */ long workerCounter$volatile;

    /* compiled from: RxScheduler.kt */
    public static final class a extends w.c {
        public final long b;
        public final vhn0 c;
        public final yvj d;
        public final nm8 e;

        public a(long j) {
            this.b = j;
            vhn0 vhn0Var = new vhn0(null);
            this.c = vhn0Var;
            hpj a = zvj.a(d.a.a(vhn0Var, null));
            this.d = a;
            this.e = w0b.a(Integer.MAX_VALUE, null, null, 6);
            myc0.h(a, null, null, new ucn(this, null), 3);
        }

        @Override // io.reactivex.rxjava3.core.w.c
        public final io.reactivex.rxjava3.disposables.c b(Runnable runnable, long j, TimeUnit timeUnit) {
            return edi.j(this.d, runnable, timeUnit.toMillis(j), new tcn(this, 0));
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final void dispose() {
            this.e.B(null);
            this.c.b(null);
        }

        @Override // io.reactivex.rxjava3.disposables.c
        public final boolean h() {
            return !zvj.f(this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("null (worker ");
            sb.append(this.b);
            sb.append(", ");
            return ho8.a(sb, h() ? "disposed" : SignalingProtocol.KEY_ACTIVE, ')');
        }
    }

    /* compiled from: RxScheduler.kt */
    @b6l(c = "kotlinx.coroutines.rx3.DispatcherScheduler$scheduleDirect$1$1$1", f = "RxScheduler.kt", l = {56}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ izs<spj<? super s3q0>, Object> $task;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$task = izsVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new b(this.$task, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                izs<spj<? super s3q0>, Object> izsVar = this.$task;
                this.label = 1;
                if (izsVar.invoke(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    @Override // io.reactivex.rxjava3.core.w
    public final w.c a() {
        return new a(b.getAndIncrement(this));
    }

    @Override // io.reactivex.rxjava3.core.w
    public final io.reactivex.rxjava3.disposables.c d(Runnable runnable, long j, TimeUnit timeUnit) {
        edi.j(null, runnable, timeUnit.toMillis(j), new vam(this, 5));
        throw null;
    }

    @Override // io.reactivex.rxjava3.core.w
    public final void f() {
        throw null;
    }

    public final String toString() {
        throw null;
    }
}
