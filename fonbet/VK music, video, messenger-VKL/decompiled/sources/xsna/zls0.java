package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoFocusInteractor.kt */
/* loaded from: classes6.dex */
public final class zls0<T> implements lsr {
    public final /* synthetic */ iht0 b;
    public final /* synthetic */ SuspendLambda c;
    public final /* synthetic */ SuspendLambda d;

    /* compiled from: VideoFocusInteractor.kt */
    @b6l(c = "com.vk.video.focus.api.VideoFocusInteractorKt$collectSlotChanges$2", f = "VideoFocusInteractor.kt", l = {113, Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE}, m = "emit")
    public static final class a extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ zls0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zls0<? super T> zls0Var, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = zls0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public zls0(iht0 iht0Var, wzs<? super bms0, ? super spj<? super s3q0>, ? extends Object> wzsVar, wzs<? super bms0, ? super spj<? super s3q0>, ? extends Object> wzsVar2) {
        this.b = iht0Var;
        this.c = (SuspendLambda) wzsVar;
        this.d = (SuspendLambda) wzsVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r6.d.invoke(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        if (r6.c.invoke(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    /* JADX WARN: Type inference failed for: r8v9, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    @Override // xsna.lsr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(bms0 bms0Var, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        iht0 iht0Var;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                Object obj = aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                iht0Var = this.b;
                if (i != 0) {
                    kotlin.a.a(obj);
                    if (epx.f(bms0Var.a, iht0Var)) {
                        aVar.L$0 = bms0Var;
                        aVar.label = 1;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    bms0Var = (bms0) aVar.L$0;
                    kotlin.a.a(obj);
                }
                if (epx.f(bms0Var.b, iht0Var)) {
                    return s3q0.a;
                }
                aVar.L$0 = null;
                aVar.label = 2;
            }
        }
        aVar = new a(this, spjVar);
        Object obj2 = aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        iht0Var = this.b;
        if (i != 0) {
        }
        if (epx.f(bms0Var.b, iht0Var)) {
        }
    }
}
