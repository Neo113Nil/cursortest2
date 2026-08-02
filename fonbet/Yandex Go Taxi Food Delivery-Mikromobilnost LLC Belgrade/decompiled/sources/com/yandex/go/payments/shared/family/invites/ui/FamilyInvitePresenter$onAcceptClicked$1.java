package com.yandex.go.payments.shared.family.invites.ui;

import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import defpackage.abp;
import defpackage.bbp;
import defpackage.cap;
import defpackage.hxx;
import defpackage.kap;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pep0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.invites.ui.FamilyInvitePresenter$onAcceptClicked$1", f = "FamilyInvitePresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class FamilyInvitePresenter$onAcceptClicked$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ bbp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyInvitePresenter$onAcceptClicked$1(bbp bbpVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bbpVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyInvitePresenter$onAcceptClicked$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FamilyInvitePresenter$onAcceptClicked$1 familyInvitePresenter$onAcceptClicked$1 = (FamilyInvitePresenter$onAcceptClicked$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        familyInvitePresenter$onAcceptClicked$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.this$0.A.isEnabled()) {
            String str = ((FamilyGroupV2Experiment) this.this$0.A.a.b()).e;
            bbp bbpVar = this.this$0;
            kap kapVar = bbpVar.z;
            String str2 = bbpVar.x.b;
            kapVar.getClass();
            String a = kap.a(str, str2, true);
            bbp bbpVar2 = this.this$0;
            ((pep0) bbpVar2.C).f((m950) bbpVar2.y.get(), new cap(a), hxx.a);
        }
        ((abp) this.this$0.Dg()).close();
        return zy11.a;
    }
}
