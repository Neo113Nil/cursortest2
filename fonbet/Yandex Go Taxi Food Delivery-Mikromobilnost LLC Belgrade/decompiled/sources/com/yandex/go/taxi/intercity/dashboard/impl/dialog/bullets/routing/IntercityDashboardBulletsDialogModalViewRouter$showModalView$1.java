package com.yandex.go.taxi.intercity.dashboard.impl.dialog.bullets.routing;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.cu6;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.dialog.bullets.routing.IntercityDashboardBulletsDialogModalViewRouter$showModalView$1", f = "IntercityDashboardBulletsDialogModalViewRouter.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardBulletsDialogModalViewRouter$showModalView$1 extends SuspendLambda implements wls {
    final /* synthetic */ cu6 $model;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardBulletsDialogModalViewRouter$showModalView$1(a aVar, cu6 cu6Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = cu6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardBulletsDialogModalViewRouter$showModalView$1(this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardBulletsDialogModalViewRouter$showModalView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                a aVar = this.this$0;
                cu6 cu6Var = this.$model;
                this.label = 1;
                if (a.P(aVar, cu6Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.c(String.format("Error to show bullets popup on Intercity dashboard", Arrays.copyOf(new Object[]{th}, 1)));
        }
        return zy11.a;
    }
}
