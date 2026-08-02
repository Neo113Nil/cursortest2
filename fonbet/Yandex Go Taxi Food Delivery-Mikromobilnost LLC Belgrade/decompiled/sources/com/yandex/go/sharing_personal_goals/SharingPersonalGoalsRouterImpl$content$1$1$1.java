package com.yandex.go.sharing_personal_goals;

import com.yandex.go.sharing_personal_goals.api.domain.model.SharingPersonalGoalsServiceName;
import defpackage.agd;
import defpackage.isr0;
import defpackage.jl40;
import defpackage.jsr0;
import defpackage.ksr0;
import defpackage.lsr0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.orr0;
import defpackage.qu;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xrr0;
import defpackage.yfd;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.sharing_personal_goals.SharingPersonalGoalsRouterImpl$content$1$1$1", f = "SharingPersonalGoalsRouterImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharingPersonalGoalsRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ lsr0 $action;
    final /* synthetic */ xrr0 $innerNavigator;
    final /* synthetic */ yfd $this_buildContent;
    final /* synthetic */ c $uiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharingPersonalGoalsRouterImpl$content$1$1$1(c cVar, lsr0 lsr0Var, xrr0 xrr0Var, yfd yfdVar, Continuation continuation) {
        super(2, continuation);
        this.$uiActionInteractor = cVar;
        this.$action = lsr0Var;
        this.$innerNavigator = xrr0Var;
        this.$this_buildContent = yfdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharingPersonalGoalsRouterImpl$content$1$1$1(this.$uiActionInteractor, this.$action, this.$innerNavigator, this.$this_buildContent, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharingPersonalGoalsRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0063 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.$uiActionInteractor;
        lsr0 lsr0Var = this.$action;
        xrr0 xrr0Var = this.$innerNavigator;
        SharingPersonalGoalsServiceName sharingPersonalGoalsServiceName = ((orr0) ((agd) this.$this_buildContent).a).a;
        this.label = 1;
        if (lsr0Var instanceof ksr0) {
            cVar.c.a.l(((ksr0) lsr0Var).a);
        } else {
            if (lsr0Var instanceof isr0) {
                a = cVar.a(((isr0) lsr0Var).a, xrr0Var, sharingPersonalGoalsServiceName, this);
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            cVar.getClass();
            if (!jl40.l(lsr0Var, jsr0.a)) {
                w511.b();
                return null;
            }
            xrr0Var.a.r(new qu(9));
        }
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
