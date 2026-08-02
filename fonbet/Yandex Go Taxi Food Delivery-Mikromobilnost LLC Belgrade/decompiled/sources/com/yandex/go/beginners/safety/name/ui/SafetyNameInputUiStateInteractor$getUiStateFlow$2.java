package com.yandex.go.beginners.safety.name.ui;

import com.yandex.go.beginners.safety.experiments.SafetyNewbiesVerificationExperiment;
import defpackage.bwl0;
import defpackage.cwl0;
import defpackage.ewl0;
import defpackage.fwl0;
import defpackage.gwl0;
import defpackage.iwl0;
import defpackage.jlh;
import defpackage.jwl0;
import defpackage.kwl0;
import defpackage.m2h0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uvl0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Luvl0;", "Ljwl0;", "<destruct>", "Liwl0;", "<anonymous>", "(Lkotlin/Pair;)Liwl0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.safety.name.ui.SafetyNameInputUiStateInteractor$getUiStateFlow$2", f = "SafetyNameInputUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class SafetyNameInputUiStateInteractor$getUiStateFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyNameInputUiStateInteractor$getUiStateFlow$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SafetyNameInputUiStateInteractor$getUiStateFlow$2 safetyNameInputUiStateInteractor$getUiStateFlow$2 = new SafetyNameInputUiStateInteractor$getUiStateFlow$2(this.this$0, continuation);
        safetyNameInputUiStateInteractor$getUiStateFlow$2.L$0 = obj;
        return safetyNameInputUiStateInteractor$getUiStateFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyNameInputUiStateInteractor$getUiStateFlow$2) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        uvl0 uvl0Var = (uvl0) pair.getFirst();
        jwl0 jwl0Var = (jwl0) pair.getSecond();
        b bVar = this.this$0;
        bVar.getClass();
        SafetyNewbiesVerificationExperiment.NameInputStep nameInputStep = jwl0Var.a;
        String a = jwl0Var.a(nameInputStep.a);
        String a2 = jwl0Var.a(nameInputStep.b);
        String a3 = jwl0Var.a(nameInputStep.c);
        String a4 = jwl0Var.a(nameInputStep.g);
        String str = uvl0Var.b;
        ((jlh) bVar.b).getClass();
        int i = m2h0.ic_default_logo;
        int i2 = m2h0.ic_default_logo_night;
        int i3 = kwl0.a[uvl0Var.a.ordinal()];
        gwl0 gwl0Var = gwl0.a;
        if (i3 == 1) {
            return new iwl0(a, a2, a3, str, gwl0Var, new bwl0(false, true, a4), new ewl0(i, i2));
        }
        if (i3 == 2) {
            return new iwl0(a, a2, a3, str, new fwl0(jwl0Var.a(nameInputStep.d)), new bwl0(false, false, a4), new ewl0(i, i2));
        }
        if (i3 == 3) {
            return new iwl0(a, a2, a3, str, gwl0Var, new bwl0(true, true, a4), new ewl0(i, i2));
        }
        if (i3 == 4) {
            return new iwl0(a, a2, a3, str, gwl0Var, new cwl0(jwl0Var.a(nameInputStep.e), jwl0Var.a(nameInputStep.f), jwl0Var.a(nameInputStep.h)), new ewl0(i, i2));
        }
        w511.b();
        return null;
    }
}
