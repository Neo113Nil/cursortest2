package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ams0;

/* compiled from: VideoFocusInteractorImpl.kt */
@b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$recalculateVideoFocusInternal$2", f = "VideoFocusInteractorImpl.kt", l = {173}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class wls0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ u8f0 $reason;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ vls0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wls0(vls0 vls0Var, u8f0 u8f0Var, spj<? super wls0> spjVar) {
        super(2, spjVar);
        this.this$0 = vls0Var;
        this.$reason = u8f0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new wls0(this.this$0, this.$reason, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((wls0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ams0.a aVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            iht0 iht0Var = (iht0) this.this$0.c.getValue();
            int size = this.this$0.i.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    ams0 ams0Var = (ams0) this.this$0.i.get(size);
                    u8f0 u8f0Var = this.$reason;
                    vls0 vls0Var = this.this$0;
                    ams0.a a = ams0Var.a(u8f0Var, vls0Var.g, vls0Var.h, iht0Var);
                    if (!(a instanceof ams0.a.C2550a)) {
                        if (epx.f(a, ams0.a.b.a)) {
                            break;
                        }
                        if (!epx.f(a, ams0.a.c.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (i2 < 0) {
                            break;
                        }
                        size = i2;
                    } else {
                        caj0 caj0Var = this.this$0.d;
                        bms0 bms0Var = ((ams0.a.C2550a) a).a;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = a;
                        this.I$0 = size;
                        this.label = 1;
                        if (caj0Var.emit(bms0Var, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        aVar = a;
                    }
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        aVar = (ams0.a) this.L$2;
        kotlin.a.a(obj);
        this.this$0.c.setValue(((ams0.a.C2550a) aVar).a.b);
        return s3q0.a;
    }
}
