package com.yandex.go.safety.center.instruction;

import defpackage.jst;
import defpackage.mo21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.po21;
import defpackage.tse;
import defpackage.wls;
import defpackage.wwg;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.instruction.SafetyCenterInstructionPresenter$updateLocation$1", f = "SafetyCenterInstructionPresenter.kt", l = {122}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterInstructionPresenter$updateLocation$1 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterInstructionPresenter$updateLocation$1(h hVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterInstructionPresenter$updateLocation$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterInstructionPresenter$updateLocation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar2 = this.this$0;
                po21 po21Var = hVar2.D;
                this.L$0 = hVar2;
                this.label = 1;
                Object h = ((ru.yandex.taxi.preorder.source.userposition.e) po21Var).h(this);
                if (h == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = h;
                hVar = hVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hVar = (h) this.L$0;
                kotlin.b.b(obj);
            }
            mo21 mo21Var = (mo21) obj;
            if (wwg.v(mo21Var)) {
                hVar.M = mo21Var;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            jst.e.k(th, "Can not get location to share");
        }
        return zy11.a;
    }
}
