package xsna;

import com.vk.push.common.Logger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VkpnsHttpMessagesReceiver.kt */
/* loaded from: classes5.dex */
public final class j4w0 implements zje0 {
    public final a2p0 a;
    public final q5w0 b;
    public final u8x0 c;
    public final nm8 d;
    public final hpj e;
    public final wi50 f;
    public final Logger g;

    /* compiled from: VkpnsHttpMessagesReceiver.kt */
    @b6l(c = "com.vk.push.pushsdk.pusher.VkpnsHttpMessagesReceiver$stopReceiveMessages$1", f = "VkpnsHttpMessagesReceiver.kt", l = {109}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public a(spj<? super a> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return j4w0.this.new a(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ui50 ui50Var;
            j4w0 j4w0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                j4w0 j4w0Var2 = j4w0.this;
                ui50Var = j4w0Var2.f;
                this.L$0 = ui50Var;
                this.L$1 = j4w0Var2;
                this.label = 1;
                if (ui50Var.b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                j4w0Var = j4w0Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j4w0Var = (j4w0) this.L$1;
                ui50Var = (ui50) this.L$0;
                kotlin.a.a(obj);
            }
            try {
                j4w0Var.d.B(null);
                zvj.c(j4w0Var.e, null);
                s3q0 s3q0Var = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            } catch (Throwable th) {
                ui50Var.c(null);
                throw th;
            }
        }
    }

    public j4w0() {
        throw null;
    }

    public j4w0(Logger logger, a2p0 a2p0Var, u8x0 u8x0Var) {
        q5w0 q5w0Var = new q5w0(0);
        nm8 a2 = w0b.a(-2, null, null, 6);
        bdn bdnVar = bdn.a;
        hpj a3 = zvj.a(wgl.c);
        this.a = a2p0Var;
        this.b = q5w0Var;
        this.c = u8x0Var;
        this.d = a2;
        this.e = a3;
        this.f = bay.a();
        this.g = logger.createLogger("PusherReceiver");
    }

    @Override // xsna.zje0
    public final b9f0 d() {
        return this.d;
    }

    @Override // xsna.zje0
    public final void e() {
        Logger.DefaultImpls.debug$default(this.g, "Stop receive messages", null, 2, null);
        myc0.h(this.e, null, null, new a(null), 3);
    }

    @Override // xsna.zje0
    public final void a() {
    }

    @Override // xsna.zje0
    public final void g() {
    }

    @Override // xsna.zje0
    public final void b(sj80 sj80Var) {
    }

    @Override // xsna.zje0
    public final void h(sj80 sj80Var) {
    }
}
