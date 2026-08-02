package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.s3v0;
import defpackage.y3v0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Ly3v0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Ltse;Ly3v0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.success.SuccessFragment$onViewCreated$3", f = "SuccessFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class SuccessFragment$onViewCreated$3 extends SuspendLambda implements zls {
    final /* synthetic */ s3v0 $successContentViewController;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SuccessFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuccessFragment$onViewCreated$3(SuccessFragment successFragment, s3v0 s3v0Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = successFragment;
        this.$successContentViewController = s3v0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SuccessFragment$onViewCreated$3 successFragment$onViewCreated$3 = new SuccessFragment$onViewCreated$3(this.this$0, this.$successContentViewController, (Continuation) obj3);
        successFragment$onViewCreated$3.L$0 = (y3v0) obj2;
        zy11 zy11Var = zy11.a;
        successFragment$onViewCreated$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        y3v0 y3v0Var = (y3v0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.setScreenState(y3v0Var, this.$successContentViewController);
        return zy11.a;
    }
}
