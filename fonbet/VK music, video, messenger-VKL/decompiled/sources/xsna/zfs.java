package xsna;

import android.view.Choreographer;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FrameRenderRepository.kt */
/* loaded from: classes11.dex */
public final class zfs implements yfs {
    public final ksr<Long> a;

    /* compiled from: FrameRenderRepository.kt */
    @b6l(c = "com.vk.video.focus.impl.FrameRenderRepositoryImpl$frameTimeMs$1", f = "FrameRenderRepository.kt", l = {25}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<zhd0<? super Long>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: FrameRenderRepository.kt */
        /* renamed from: xsna.zfs$a$a, reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class ChoreographerFrameCallbackC4178a implements Choreographer.FrameCallback {
            public final /* synthetic */ zhd0<Long> b;
            public final /* synthetic */ Choreographer c;

            /* JADX WARN: Multi-variable type inference failed */
            public ChoreographerFrameCallbackC4178a(zhd0<? super Long> zhd0Var, Choreographer choreographer) {
                this.b = zhd0Var;
                this.c = choreographer;
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                this.b.f(Long.valueOf(j / 1000000));
                this.c.postFrameCallback(this);
            }
        }

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(zhd0<? super Long> zhd0Var, spj<? super s3q0> spjVar) {
            return ((a) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            zhd0 zhd0Var = (zhd0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Choreographer choreographer = Choreographer.getInstance();
                ChoreographerFrameCallbackC4178a choreographerFrameCallbackC4178a = new ChoreographerFrameCallbackC4178a(zhd0Var, choreographer);
                choreographer.postFrameCallback(choreographerFrameCallbackC4178a);
                cg1 cg1Var = new cg1(14, choreographer, choreographerFrameCallbackC4178a);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (phd0.a(zhd0Var, cg1Var, this) == coroutineSingletons) {
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

    public zfs() {
        nb9 i = rsr.i(new a(2, null));
        bdn bdnVar = bdn.a;
        this.a = rsr.q(i, ie00.a);
    }

    @Override // xsna.yfs
    public final ksr<Long> a() {
        return this.a;
    }
}
