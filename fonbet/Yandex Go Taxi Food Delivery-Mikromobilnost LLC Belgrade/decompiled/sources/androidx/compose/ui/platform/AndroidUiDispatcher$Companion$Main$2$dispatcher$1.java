package androidx.compose.ui.platform;

import android.view.Choreographer;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Landroid/view/Choreographer;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Landroid/view/Choreographer;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.ui.platform.AndroidUiDispatcher$Companion$Main$2$dispatcher$1", f = "AndroidUiDispatcher.android.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AndroidUiDispatcher$Companion$Main$2$dispatcher$1 extends SuspendLambda implements wls {
    int label;

    public AndroidUiDispatcher$Companion$Main$2$dispatcher$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AndroidUiDispatcher$Companion$Main$2$dispatcher$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Choreographer.getInstance();
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
