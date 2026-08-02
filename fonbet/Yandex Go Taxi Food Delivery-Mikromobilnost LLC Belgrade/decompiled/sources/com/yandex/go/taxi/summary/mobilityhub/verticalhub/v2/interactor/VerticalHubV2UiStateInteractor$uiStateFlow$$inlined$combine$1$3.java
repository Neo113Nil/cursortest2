package com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.ActionButtonsState;
import defpackage.bpl0;
import defpackage.czs;
import defpackage.e0v;
import defpackage.hwc;
import defpackage.je31;
import defpackage.le31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rzu;
import defpackage.scc;
import defpackage.vom;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.interactor.VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3", f = "VerticalHubV2UiStateInteractor.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3 verticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3 = new VerticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3(3, (Continuation) obj3);
        verticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$0 = (vpr) obj;
        verticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return verticalHubV2UiStateInteractor$uiStateFlow$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            hwc hwcVar = (hwc) objArr[5];
            le31 le31Var = (le31) obj5;
            ActionButtonsState actionButtonsState = (ActionButtonsState) obj4;
            bpl0 b = com.yandex.go.design.compose.list.a.b(kotlin.collections.a.m0(le31Var.a, scc.g((rzu) obj2, new e0v((List) obj3))), vom.T);
            boolean z = le31Var.e;
            if (z && actionButtonsState == ActionButtonsState.BACK_AND_FOCUS_ROUTE) {
                actionButtonsState = ActionButtonsState.ONLY_BACK;
            }
            ActionButtonsState actionButtonsState2 = actionButtonsState;
            je31 je31Var = new je31(actionButtonsState2, b, le31Var.b, le31Var.c, le31Var.d, z, le31Var.f, le31Var.g, hwcVar, new czs(actionButtonsState2 == ActionButtonsState.ONLY_BACK && !hwcVar.a));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(je31Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
