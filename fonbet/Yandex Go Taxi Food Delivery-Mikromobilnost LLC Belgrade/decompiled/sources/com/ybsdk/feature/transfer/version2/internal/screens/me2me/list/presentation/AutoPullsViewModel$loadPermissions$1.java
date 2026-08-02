package com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation;

import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult;
import com.ybsdk.core.utils.ext.c;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.v5;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.presentation.AutoPullsViewModel$loadPermissions$1", f = "AutoPullsViewModel.kt", l = {HProv.PP_CONTAINER_DEFAULT}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoPullsViewModel$loadPermissions$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoPullsViewModel$loadPermissions$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoPullsViewModel$loadPermissions$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoPullsViewModel$loadPermissions$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.list.data.a aVar = this.this$0.C;
            this.label = 1;
            b = aVar.b(this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            aVar2.a0(new v5(23, (dqg) b, aVar2));
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            x4c.g("[me2me debit] Can't load subscriptions list", a, null, null, 12);
            aVar3.D.n(EmptyList.a, c.b(a) ? Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult.ERROR : Me2mePullDebitEvents$Me2mePullDebitPermissionListLoadedResult.UNKNOWN);
            pz40 Y = aVar3.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new s8j0(a)));
        }
        return zy11.a;
    }
}
