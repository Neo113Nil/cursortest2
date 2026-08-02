package xsna;

import com.vk.push.core.backoff.BackOff;
import java.net.SocketTimeoutException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: RetryConnectionListener.kt */
/* loaded from: classes5.dex */
public final class efg0 extends uhx0 {
    public final BackOff b;
    public final s4w0 c;
    public final hpj d;

    /* compiled from: RetryConnectionListener.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.RetryConnectionListener$onClosing$1", f = "RetryConnectionListener.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return efg0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            efg0.this.c.n("Server says no more messages will be send", false);
            return s3q0.a;
        }
    }

    /* compiled from: RetryConnectionListener.kt */
    @b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.RetryConnectionListener$onFailure$1", f = "RetryConnectionListener.kt", l = {36}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ Throwable $t;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return efg0.this.new b(this.$t, spjVar);
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
                long nextBackOff = efg0.this.b.getNextBackOff();
                this.label = 1;
                if (qsl.b(nextBackOff, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            boolean z = this.$t instanceof SocketTimeoutException;
            efg0.this.c.n("Web socket has been closed with cause: " + this.$t.getCause() + " and message: " + this.$t.getMessage(), z);
            return s3q0.a;
        }
    }

    public efg0(BackOff backOff, s4w0 s4w0Var) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.b = backOff;
        this.c = s4w0Var;
        this.d = zvj.a(wglVar);
    }

    @Override // xsna.uhx0
    public final void onClosing(phx0 phx0Var, int i, String str) {
        myc0.h(this.d, null, null, new a(null), 3);
    }

    @Override // xsna.uhx0
    public final void onFailure(phx0 phx0Var, Throwable th, okhttp3.u uVar) {
        myc0.h(this.d, null, null, new b(th, null), 3);
    }

    @Override // xsna.uhx0
    public final void onOpen(phx0 phx0Var, okhttp3.u uVar) {
        this.b.resetBackOff();
        this.c.g();
    }
}
