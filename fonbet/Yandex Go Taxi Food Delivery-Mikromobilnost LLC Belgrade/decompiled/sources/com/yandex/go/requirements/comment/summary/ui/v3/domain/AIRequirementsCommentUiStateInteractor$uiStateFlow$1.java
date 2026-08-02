package com.yandex.go.requirements.comment.summary.ui.v3.domain;

import com.yandex.go.requirements.comment.summary.ui.v3.ui.model.ButtonUiState$LoadingState;
import defpackage.avj0;
import defpackage.bms;
import defpackage.c47;
import defpackage.f7v0;
import defpackage.g4v0;
import defpackage.jl40;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p5v0;
import defpackage.pmc;
import defpackage.q5v0;
import defpackage.qmc;
import defpackage.r5v0;
import defpackage.rmc;
import defpackage.s5v0;
import defpackage.ski0;
import defpackage.smc;
import defpackage.t5v0;
import defpackage.tcc;
import defpackage.tmc;
import defpackage.u5v0;
import defpackage.vki0;
import defpackage.w511;
import defpackage.wki0;
import defpackage.xki0;
import defpackage.z0;
import defpackage.zki0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lu5v0;", "suggestLoading", "", "userInput", "Ltmc;", "commentValidationState", "Lz0;", "<anonymous>", "(Lu5v0;Ljava/lang/String;Ltmc;)Lz0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.comment.summary.ui.v3.domain.AIRequirementsCommentUiStateInteractor$uiStateFlow$1", f = "AIRequirementsCommentUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AIRequirementsCommentUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIRequirementsCommentUiStateInteractor$uiStateFlow$1(b bVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        AIRequirementsCommentUiStateInteractor$uiStateFlow$1 aIRequirementsCommentUiStateInteractor$uiStateFlow$1 = new AIRequirementsCommentUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj4);
        aIRequirementsCommentUiStateInteractor$uiStateFlow$1.L$0 = (u5v0) obj;
        aIRequirementsCommentUiStateInteractor$uiStateFlow$1.L$1 = (String) obj2;
        aIRequirementsCommentUiStateInteractor$uiStateFlow$1.L$2 = (tmc) obj3;
        return aIRequirementsCommentUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0122, code lost:
    
        if (r3 == null) goto L75;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r5v0 r5v0Var;
        String str;
        String str2;
        ButtonUiState$LoadingState buttonUiState$LoadingState;
        String h;
        String str3;
        u5v0 u5v0Var = (u5v0) this.L$0;
        String str4 = (String) this.L$1;
        tmc tmcVar = (tmc) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String h2 = ((avj0) this.this$0.a).h(kyh0.comment_to_driver);
        String h3 = ((avj0) this.this$0.a).h(kyh0.requirements_comment_input_hint);
        this.this$0.getClass();
        if (u5v0Var instanceof s5v0) {
            List<g4v0> list = ((s5v0) u5v0Var).a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (g4v0 g4v0Var : list) {
                arrayList.add(new f7v0(g4v0Var.b, g4v0Var.a));
            }
            r5v0Var = new p5v0(arrayList);
        } else {
            if (!jl40.l(u5v0Var, t5v0.a)) {
                w511.b();
                return null;
            }
            r5v0Var = q5v0.a;
        }
        r5v0 r5v0Var2 = r5v0Var;
        this.this$0.getClass();
        boolean z = tmcVar instanceof rmc;
        qmc qmcVar = qmc.a;
        smc smcVar = smc.a;
        if (z) {
            str = ((rmc) tmcVar).a.a;
        } else {
            if (!jl40.l(tmcVar, smcVar) && !jl40.l(tmcVar, qmcVar)) {
                w511.b();
                return null;
            }
            str = "";
        }
        this.this$0.getClass();
        if (z) {
            str2 = ((rmc) tmcVar).a.b;
        } else {
            if (!jl40.l(tmcVar, smcVar) && !jl40.l(tmcVar, qmcVar)) {
                w511.b();
                return null;
            }
            str2 = null;
        }
        b bVar = this.this$0;
        bVar.getClass();
        rmc rmcVar = z ? (rmc) tmcVar : null;
        pmc pmcVar = rmcVar != null ? rmcVar.a : null;
        if (jl40.l(tmcVar, smcVar) || jl40.l(tmcVar, qmcVar)) {
            buttonUiState$LoadingState = ButtonUiState$LoadingState.LOADING;
        } else {
            if (!z) {
                w511.b();
                return null;
            }
            zki0 zki0Var = ((rmc) tmcVar).a.d;
            if (jl40.l(zki0Var, vki0.a)) {
                buttonUiState$LoadingState = ButtonUiState$LoadingState.DISABLED;
            } else {
                if (!(zki0Var instanceof wki0) && !jl40.l(zki0Var, ski0.a) && !jl40.l(zki0Var, xki0.a)) {
                    w511.b();
                    return null;
                }
                buttonUiState$LoadingState = ButtonUiState$LoadingState.ENABLED;
            }
        }
        if (pmcVar != null && (str3 = pmcVar.c) != null) {
            h = str3.length() > 0 ? str3 : null;
        }
        h = ((avj0) bVar.a).h(kyh0.common_done);
        return new z0(h2, str4, h3, r5v0Var2, str, str2, new c47(buttonUiState$LoadingState, h));
    }
}
