package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$snapTo$2", f = "AnchoredDraggable.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class c02 extends SuspendLambda implements zzs<fz1, vgo<Object>, Object, spj<? super s3q0>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // xsna.zzs
    public final Object invoke(fz1 fz1Var, vgo<Object> vgoVar, Object obj, spj<? super s3q0> spjVar) {
        c02 c02Var = new c02(4, spjVar);
        c02Var.L$0 = fz1Var;
        c02Var.L$1 = vgoVar;
        c02Var.L$2 = obj;
        return c02Var.invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        fz1 fz1Var = (fz1) this.L$0;
        float c = ((vgo) this.L$1).c(this.L$2);
        if (!Float.isNaN(c)) {
            fz1Var.a(c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        return s3q0.a;
    }
}
