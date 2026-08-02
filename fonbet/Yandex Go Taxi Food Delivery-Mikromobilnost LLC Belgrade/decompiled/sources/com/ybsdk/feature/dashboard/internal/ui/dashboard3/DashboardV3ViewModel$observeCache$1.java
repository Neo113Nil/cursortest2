package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.mvg;
import defpackage.nmg;
import defpackage.ny61;
import defpackage.r8j0;
import defpackage.t8j0;
import defpackage.u8j0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu8j0;", "Lez8;", "productRequestStatus", "Lnmg;", ClidProvider.STATE, "<anonymous>", "(Lu8j0;Lnmg;)Lu8j0;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ViewModel$observeCache$1", f = "DashboardV3ViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3ViewModel$observeCache$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DashboardV3ViewModel$observeCache$1 dashboardV3ViewModel$observeCache$1 = new DashboardV3ViewModel$observeCache$1(3, (Continuation) obj3);
        dashboardV3ViewModel$observeCache$1.L$0 = (u8j0) obj;
        dashboardV3ViewModel$observeCache$1.L$1 = (nmg) obj2;
        return dashboardV3ViewModel$observeCache$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        u8j0 u8j0Var = (u8j0) this.L$0;
        if (((nmg) this.L$1).l) {
            return u8j0Var;
        }
        u8j0Var.getClass();
        return ((u8j0Var instanceof r8j0) && ((r8j0) u8j0Var).c) ? u8j0Var : new t8j0();
    }
}
