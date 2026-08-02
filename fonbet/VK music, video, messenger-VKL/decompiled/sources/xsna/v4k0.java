package xsna;

import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SmartCropInlineActor.kt */
@b6l(c = "com.vk.video.ui.smartcrop.impl.presentation.feature.store.SmartCropInlineActor$startCropVideo$1$1", f = "SmartCropInlineActor.kt", l = {168, 179}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class v4k0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ q500 $cropRangeMs;
    final /* synthetic */ boolean $isSmartCrop;
    long J$0;
    int label;
    final /* synthetic */ w4k0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4k0(w4k0 w4k0Var, q500 q500Var, boolean z, spj<? super v4k0> spjVar) {
        super(2, spjVar);
        this.this$0 = w4k0Var;
        this.$cropRangeMs = q500Var;
        this.$isSmartCrop = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new v4k0(this.this$0, this.$cropRangeMs, this.$isSmartCrop, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((v4k0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0065, code lost:
    
        if (xsna.w4k0.m(r7, r3, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r7 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rdi.y(this.this$0, new u9d(this.$isSmartCrop, 1));
            z4k0 z4k0Var = this.this$0.d;
            q500 q500Var = this.$cropRangeMs;
            boolean z = this.$isSmartCrop;
            this.label = 1;
            b = z4k0Var.b(q500Var, z, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        w4k0 w4k0Var = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            w4k0Var.q(a);
            return s3q0.a;
        }
        final long longValue = ((Number) b).longValue();
        rdi.y(this.this$0, new izs() { // from class: xsna.u4k0
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                SmartCropState smartCropState = (SmartCropState) obj2;
                SmartCropState.CropVideoProgress cropVideoProgress = smartCropState.i;
                return SmartCropState.a(smartCropState, null, null, null, null, 0L, false, cropVideoProgress != null ? SmartCropState.CropVideoProgress.a(cropVideoProgress, Long.valueOf(longValue), null, 14) : null, false, false, null, 1919);
            }
        });
        w4k0 w4k0Var2 = this.this$0;
        this.J$0 = longValue;
        this.label = 2;
    }
}
