package xsna;

import androidx.car.app.hardware.common.CarZone;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.jht0;
import xsna.u8f0;

/* compiled from: VideoFocusInteractorImpl.kt */
@b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$unregisterVideoSlot$1", f = "VideoFocusInteractorImpl.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER, 97}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class yls0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ iht0 $slot;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ vls0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yls0(vls0 vls0Var, iht0 iht0Var, spj<? super yls0> spjVar) {
        super(2, spjVar);
        this.this$0 = vls0Var;
        this.$slot = iht0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yls0(this.this$0, this.$slot, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((yls0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0094, code lost:
    
        if (xsna.vls0.g(r3, r5, r9) != r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jht0 jht0Var;
        jht0.b bVar;
        jht0 jht0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.g.remove(this.$slot);
            jht0Var = (jht0) this.this$0.h.get(this.$slot);
            bVar = jht0Var != null ? new jht0.b(this.$slot, jht0Var.a()) : null;
            if (bVar != null) {
                caj0 caj0Var = this.this$0.e;
                this.L$0 = jht0Var;
                this.L$1 = bVar;
                this.L$2 = null;
                this.I$0 = 0;
                this.label = 1;
                if (caj0Var.emit(bVar, this) != coroutineSingletons) {
                    jht0Var2 = jht0Var;
                }
                return coroutineSingletons;
            }
            vls0 vls0Var = this.this$0;
            u8f0.b bVar2 = new u8f0.b(this.$slot, epx.f(vls0Var.c.getValue(), this.$slot), jht0Var, bVar);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.this$0.h.remove(this.$slot);
                return s3q0.a;
            }
            bVar = (jht0.b) this.L$1;
            jht0Var2 = (jht0) this.L$0;
            kotlin.a.a(obj);
        }
        jht0Var = jht0Var2;
        vls0 vls0Var2 = this.this$0;
        u8f0.b bVar22 = new u8f0.b(this.$slot, epx.f(vls0Var2.c.getValue(), this.$slot), jht0Var, bVar);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
    }
}
