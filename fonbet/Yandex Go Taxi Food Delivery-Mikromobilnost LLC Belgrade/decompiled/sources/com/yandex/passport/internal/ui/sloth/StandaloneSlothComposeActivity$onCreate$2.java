package com.yandex.passport.internal.ui.sloth;

import com.yandex.passport.internal.report.reporters.WebAmReporter$Companion$EventPlace;
import com.yandex.passport.internal.report.reporters.i1;
import com.yandex.passport.sloth.i0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yandex/passport/sloth/i0;", "request", "Lzy11;", "<anonymous>", "(Lcom/yandex/passport/sloth/i0;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity$onCreate$2", f = "StandaloneSlothComposeActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class StandaloneSlothComposeActivity$onCreate$2 extends SuspendLambda implements wls {
    final /* synthetic */ i1 $webAmReporter;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ StandaloneSlothComposeActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StandaloneSlothComposeActivity$onCreate$2(StandaloneSlothComposeActivity standaloneSlothComposeActivity, i1 i1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = standaloneSlothComposeActivity;
        this.$webAmReporter = i1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        StandaloneSlothComposeActivity$onCreate$2 standaloneSlothComposeActivity$onCreate$2 = new StandaloneSlothComposeActivity$onCreate$2(this.this$0, this.$webAmReporter, continuation);
        standaloneSlothComposeActivity$onCreate$2.L$0 = obj;
        return standaloneSlothComposeActivity$onCreate$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        StandaloneSlothComposeActivity$onCreate$2 standaloneSlothComposeActivity$onCreate$2 = (StandaloneSlothComposeActivity$onCreate$2) create((i0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        standaloneSlothComposeActivity$onCreate$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        i0 i0Var = (i0) this.L$0;
        if (jl40.l(i0Var, com.yandex.passport.sloth.x.a)) {
            this.this$0.setResult(666);
            this.this$0.finish();
        } else {
            this.$webAmReporter.j(i0Var.toString(), WebAmReporter$Companion$EventPlace.STANDALONE);
        }
        return zy11.a;
    }
}
