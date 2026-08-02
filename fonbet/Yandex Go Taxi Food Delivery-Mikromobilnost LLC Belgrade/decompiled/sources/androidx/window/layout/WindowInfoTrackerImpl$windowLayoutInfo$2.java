package androidx.window.layout;

import android.app.Activity;
import defpackage.b43;
import defpackage.hh31;
import defpackage.k9b;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "Lv751;", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {62}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class WindowInfoTrackerImpl$windowLayoutInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ Activity $activity;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$2(a aVar, Activity activity, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        WindowInfoTrackerImpl$windowLayoutInfo$2 windowInfoTrackerImpl$windowLayoutInfo$2 = new WindowInfoTrackerImpl$windowLayoutInfo$2(this.this$0, this.$activity, continuation);
        windowInfoTrackerImpl$windowLayoutInfo$2.L$0 = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$2) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            y6f0 y6f0Var = (y6f0) this.L$0;
            k9b k9bVar = new k9b(19, y6f0Var);
            this.this$0.a.a(this.$activity, new b43(1), k9bVar);
            hh31 hh31Var = new hh31(17, this.this$0, k9bVar);
            this.label = 1;
            if (kotlinx.coroutines.channels.b.a(y6f0Var, hh31Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
