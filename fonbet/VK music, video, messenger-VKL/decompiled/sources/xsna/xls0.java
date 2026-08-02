package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.u8f0;

/* compiled from: VideoFocusInteractorImpl.kt */
@b6l(c = "com.vk.video.focus.impl.VideoFocusInteractorImpl$registerVideoSlot$1", f = "VideoFocusInteractorImpl.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class xls0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ jht0 $info;
    final /* synthetic */ iht0 $slot;
    int label;
    final /* synthetic */ vls0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xls0(vls0 vls0Var, iht0 iht0Var, jht0 jht0Var, spj<? super xls0> spjVar) {
        super(2, spjVar);
        this.this$0 = vls0Var;
        this.$slot = iht0Var;
        this.$info = jht0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xls0(this.this$0, this.$slot, this.$info, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xls0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0055, code lost:
    
        if (xsna.vls0.g(r8, r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.this$0.g.add(this.$slot);
            this.this$0.h.put(this.$slot, this.$info);
            caj0 caj0Var = this.this$0.e;
            jht0 jht0Var = this.$info;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
        }
        vls0 vls0Var = this.this$0;
        u8f0.b bVar = new u8f0.b(this.$slot, false, null, this.$info);
        this.label = 2;
    }
}
