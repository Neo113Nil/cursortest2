package com.yandex.go.taxi.main.shortcuts.interactors;

import com.yandex.go.models.SummaryRedirectActionModel;
import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.bhv0;
import defpackage.bov0;
import defpackage.ghv0;
import defpackage.hhv0;
import defpackage.ihv0;
import defpackage.jhv0;
import defpackage.jjv0;
import defpackage.khv0;
import defpackage.m1s0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ynv0;
import defpackage.yyr0;
import defpackage.za31;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.main.shortcuts.interactors.ShortcutRootRouter$handleHeaderSummaryRedirect$1$job$1", f = "ShortcutRootRouter.kt", l = {233}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ShortcutRootRouter$handleHeaderSummaryRedirect$1$job$1 extends SuspendLambda implements wls {
    final /* synthetic */ SummaryRedirectActionModel $action;
    final /* synthetic */ yyr0 $model;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutRootRouter$handleHeaderSummaryRedirect$1$job$1(b bVar, SummaryRedirectActionModel summaryRedirectActionModel, yyr0 yyr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = summaryRedirectActionModel;
        this.$model = yyr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutRootRouter$handleHeaderSummaryRedirect$1$job$1(this.this$0, this.$action, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutRootRouter$handleHeaderSummaryRedirect$1$job$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (defpackage.gwk0.C(r10.a, r8.a) == false) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
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
        c cVar = this.this$0.i;
        SummaryRedirectActionModel summaryRedirectActionModel = this.$action;
        yyr0 yyr0Var = this.$model;
        this.label = 1;
        za31 e = cVar.f.e(summaryRedirectActionModel.b);
        boolean z = summaryRedirectActionModel.c == SummaryRedirectActionModel.State.EXPANDED;
        ihv0 hhv0Var = z ? new hhv0(SummaryExpandReason.AUTO_SHORTCUT_REDIRECT_ACTION) : ghv0.a;
        String str = (!summaryRedirectActionModel.d || e == null) ? null : summaryRedirectActionModel.b;
        bhv0 bhv0Var = new bhv0(new jhv0(hhv0Var, z));
        jjv0 jjv0Var = cVar.h;
        ynv0 ynv0Var = summaryRedirectActionModel.h;
        jjv0Var.getClass();
        m1s0 m1s0Var = new m1s0(cVar, new bov0(true, (khv0) bhv0Var, jjv0.a(ynv0Var), 8), str);
        SummaryRedirectActionModel.a aVar = summaryRedirectActionModel.e;
        if (aVar != null) {
            if (summaryRedirectActionModel.g) {
                if (e != null) {
                }
                obj2 = cVar.d(aVar, yyr0Var, summaryRedirectActionModel, m1s0Var, this);
            }
            obj2 = cVar.c(aVar, yyr0Var, summaryRedirectActionModel, m1s0Var, e, this);
        } else {
            cVar.e.a(summaryRedirectActionModel, e != null ? e.a : null, m1s0Var);
            obj2 = zy11Var;
        }
        return obj2 == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
