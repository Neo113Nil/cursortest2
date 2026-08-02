package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;

/* compiled from: ReorderableState.kt */
@b6l(c = "com.vk.core.compose.reorder.ReorderableState$autoscroll$1", f = "ReorderableState.kt", l = {162}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class c0g0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ float $scrollOffset;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d0g0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0g0(float f, d0g0<Object> d0g0Var, spj<? super c0g0> spjVar) {
        super(2, spjVar);
        this.$scrollOffset = f;
        this.this$0 = d0g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new c0g0(this.$scrollOffset, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((c0g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0062 -> B:5:0x0065). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ref$LongRef ref$LongRef;
        Ref$FloatRef ref$FloatRef;
        yok0 yok0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
            ref$FloatRef2.element = this.$scrollOffset;
            ref$LongRef = new Ref$LongRef();
            ref$FloatRef = ref$FloatRef2;
            if (ref$FloatRef.element == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ref$LongRef = (Ref$LongRef) this.L$1;
        ref$FloatRef = (Ref$FloatRef) this.L$0;
        kotlin.a.a(obj);
        this.this$0.i.f(new Float(ref$FloatRef.element));
        if (ref$FloatRef.element == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (yok0Var = this.this$0.l) == null || !yok0Var.isActive()) {
            return s3q0.a;
        }
        ogd ogdVar = new ogd(ref$LongRef, ref$FloatRef, this.this$0, 6);
        this.L$0 = ref$FloatRef;
        this.L$1 = ref$LongRef;
        this.label = 1;
        if (i830.a(getContext()).k(new h830(ogdVar), this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        this.this$0.i.f(new Float(ref$FloatRef.element));
        if (ref$FloatRef.element == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ogd ogdVar2 = new ogd(ref$LongRef, ref$FloatRef, this.this$0, 6);
            this.L$0 = ref$FloatRef;
            this.L$1 = ref$LongRef;
            this.label = 1;
            if (i830.a(getContext()).k(new h830(ogdVar2), this) == coroutineSingletons) {
            }
            this.this$0.i.f(new Float(ref$FloatRef.element));
            if (ref$FloatRef.element == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            }
        }
        return s3q0.a;
    }
}
