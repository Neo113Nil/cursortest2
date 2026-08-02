package com.yandex.plus.pay.ui.core.debug.internal.ui.log;

import defpackage.glz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tkz;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lglz;", "screenState", "Lzy11;", "<anonymous>", "(Ltse;Lglz;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.debug.internal.ui.log.LogsFragment$onViewCreated$3", f = "LogsFragment.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LogsFragment$onViewCreated$3 extends SuspendLambda implements zls {
    final /* synthetic */ tkz $logsAdapter;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LogsFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogsFragment$onViewCreated$3(LogsFragment logsFragment, tkz tkzVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = logsFragment;
        this.$logsAdapter = tkzVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LogsFragment$onViewCreated$3 logsFragment$onViewCreated$3 = new LogsFragment$onViewCreated$3(this.this$0, this.$logsAdapter, (Continuation) obj3);
        logsFragment$onViewCreated$3.L$0 = (glz) obj2;
        zy11 zy11Var = zy11.a;
        logsFragment$onViewCreated$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        glz glzVar = (glz) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        this.this$0.setScreenState(glzVar, this.$logsAdapter);
        return zy11.a;
    }
}
