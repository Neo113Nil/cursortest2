package com.yandex.messaging.ui.calllist;

import defpackage.ems;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ti7;
import defpackage.tz10;
import defpackage.wh7;
import defpackage.xh7;
import defpackage.yh7;
import defpackage.zh7;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"", "orgVisibility", "", "Lqh7;", "callsWithDisplayNames", "Lwh7;", "error", "isYaTeam", "isFabVisible", "Lti7;", "<anonymous>", "(ZLjava/util/List;Lwh7;ZZ)Lti7;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.ui.calllist.CallListViewModel$state$3", f = "CallListViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CallListViewModel$state$3 extends SuspendLambda implements ems {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallListViewModel$state$3(d dVar, Continuation continuation) {
        super(6, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj4).booleanValue();
        boolean booleanValue3 = ((Boolean) obj5).booleanValue();
        CallListViewModel$state$3 callListViewModel$state$3 = new CallListViewModel$state$3(this.this$0, (Continuation) obj6);
        callListViewModel$state$3.Z$0 = booleanValue;
        callListViewModel$state$3.L$0 = (List) obj2;
        callListViewModel$state$3.L$1 = (wh7) obj3;
        callListViewModel$state$3.Z$1 = booleanValue2;
        callListViewModel$state$3.Z$2 = booleanValue3;
        return callListViewModel$state$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        boolean z = this.Z$0;
        List list = (List) this.L$0;
        zh7 zh7Var = (wh7) this.L$1;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        boolean a = this.this$0.y.a(tz10.k);
        if (zh7Var == null) {
            zh7Var = list != null ? new xh7(list) : yh7.a;
        }
        return new ti7(z, a, !z2, zh7Var, z3);
    }
}
