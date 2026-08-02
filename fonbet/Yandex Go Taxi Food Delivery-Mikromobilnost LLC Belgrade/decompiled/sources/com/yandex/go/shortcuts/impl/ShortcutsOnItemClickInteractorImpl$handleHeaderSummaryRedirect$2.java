package com.yandex.go.shortcuts.impl;

import com.yandex.go.models.SummaryRedirectActionModel;
import defpackage.awr0;
import defpackage.b64;
import defpackage.cl7;
import defpackage.cx60;
import defpackage.dvw;
import defpackage.dx60;
import defpackage.g3s0;
import defpackage.h3s0;
import defpackage.j18;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.yyr0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.shortcuts.impl.ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2", f = "ShortcutsOnItemClickInteractorImpl.kt", l = {376}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryRedirectActionModel $action;
    final /* synthetic */ yyr0 $model;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2(b bVar, SummaryRedirectActionModel summaryRedirectActionModel, yyr0 yyr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = summaryRedirectActionModel;
        this.$model = yyr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2(this.this$0, this.$action, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, g3s0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            SummaryRedirectActionModel summaryRedirectActionModel = this.$action;
            yyr0 yyr0Var = this.$model;
            this.L$0 = bVar;
            this.L$1 = summaryRedirectActionModel;
            this.L$2 = yyr0Var;
            this.label = 1;
            j18 j18Var = new j18(1, dvw.b(this));
            Ref$ObjectRef y = b64.y(j18Var);
            cx60 cx60Var = new cx60(7, y);
            cl7 cl7Var = new cl7(j18Var, cx60Var);
            y.element = new g3s0(bVar.d.b(new awr0(summaryRedirectActionModel, yyr0Var, new h3s0(0, new ShortcutsOnItemClickInteractorImpl$handleHeaderSummaryRedirect$2$invokeSuspend$$inlined$suspendCallbackApi$2(1, cl7Var, cl7.class, "success", "success(Ljava/lang/Object;)V", 0)))), 0);
            if (cl7Var.c()) {
                cx60Var.invoke();
            } else {
                j18Var.w(new dx60(cl7Var, 8));
            }
            if (j18Var.s() == coroutineSingletons) {
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
