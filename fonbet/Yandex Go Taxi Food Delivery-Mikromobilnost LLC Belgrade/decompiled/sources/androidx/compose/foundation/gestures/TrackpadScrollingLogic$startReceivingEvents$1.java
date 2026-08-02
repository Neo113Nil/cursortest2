package androidx.compose.foundation.gestures;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.p801;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TrackpadScrollingLogic$startReceivingEvents$1", f = "TrackpadScrollingLogic.kt", l = {99, 99}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TrackpadScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ a0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackpadScrollingLogic$startReceivingEvents$1(a0 a0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackpadScrollingLogic$startReceivingEvents$1 trackpadScrollingLogic$startReceivingEvents$1 = new TrackpadScrollingLogic$startReceivingEvents$1(this.this$0, continuation);
        trackpadScrollingLogic$startReceivingEvents$1.L$0 = obj;
        return trackpadScrollingLogic$startReceivingEvents$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackpadScrollingLogic$startReceivingEvents$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006b -> B:9:0x0035). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        tse tseVar2;
        a0 a0Var;
        y yVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tseVar = (tse) this.L$0;
            } else {
                if (i == 1) {
                    yVar = (y) this.L$2;
                    a0Var = (a0) this.L$1;
                    tseVar2 = (tse) this.L$0;
                    kotlin.b.b(obj);
                    this.L$0 = tseVar2;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (a0.c(a0Var, yVar, (p801) obj, this) != coroutineSingletons) {
                        tseVar = tseVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tse tseVar3 = (tse) this.L$0;
                kotlin.b.b(obj);
                tseVar = tseVar3;
            }
            boolean p = kotlinx.coroutines.a.p(tseVar.getCoroutineContext());
            a0Var = this.this$0;
            if (!p) {
                a0Var.g = null;
                return zy11.a;
            }
            yVar = a0Var.a;
            kotlinx.coroutines.channels.a aVar = a0Var.f;
            this.L$0 = tseVar;
            this.L$1 = a0Var;
            this.L$2 = yVar;
            this.label = 1;
            aVar.getClass();
            Object J = kotlinx.coroutines.channels.a.J(aVar, this);
            if (J == coroutineSingletons) {
                return coroutineSingletons;
            }
            tseVar2 = tseVar;
            obj = J;
            this.L$0 = tseVar2;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            if (a0.c(a0Var, yVar, (p801) obj, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            this.this$0.g = null;
            throw th;
        }
    }
}
