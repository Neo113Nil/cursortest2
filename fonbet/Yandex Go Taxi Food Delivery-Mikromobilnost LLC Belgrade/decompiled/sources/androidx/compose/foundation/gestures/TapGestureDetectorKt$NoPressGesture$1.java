package androidx.compose.foundation.gestures;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wu60;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/foundation/gestures/s;", "Lwu60;", "it", "Lzy11;", "<anonymous>", "(Landroidx/compose/foundation/gestures/s;Lwu60;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TapGestureDetectorKt$NoPressGesture$1 extends SuspendLambda implements zls {
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((wu60) obj2).a;
        TapGestureDetectorKt$NoPressGesture$1 tapGestureDetectorKt$NoPressGesture$1 = new TapGestureDetectorKt$NoPressGesture$1(3, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        tapGestureDetectorKt$NoPressGesture$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
