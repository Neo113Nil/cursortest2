package com.yandex.go.beginners.presentation;

import defpackage.dl5;
import defpackage.fl5;
import defpackage.hh5;
import defpackage.j24;
import defpackage.lx4;
import defpackage.m950;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ok5;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wls;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.cprocsp.ACSP.tools.common.ACSPConstants;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.beginners.presentation.BeginnersOnboardingPresenter$openAuthRouter$1", f = "BeginnersOnboardingPresenter.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class BeginnersOnboardingPresenter$openAuthRouter$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ dl5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeginnersOnboardingPresenter$openAuthRouter$1(dl5 dl5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dl5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BeginnersOnboardingPresenter$openAuthRouter$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BeginnersOnboardingPresenter$openAuthRouter$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            dl5 dl5Var = this.this$0;
            dl5Var.C = true;
            v7j0 v7j0Var = dl5Var.z;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) v7j0Var).d(12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        i d = ((j) ((lx4) this.this$0.A.b)).d("ServicesInfoOnboarding.pushNotificationsPermissionChecked");
        d.d(ACSPConstants.STATUS, booleanValue ? "allowed" : "notAllowed");
        d.m();
        dl5 dl5Var2 = this.this$0;
        hh5 hh5Var = dl5Var2.x;
        j24 j24Var = new j24(23, dl5Var2);
        fl5 fl5Var = (fl5) hh5Var.b;
        fl5Var.z((m950) ((yvf0) fl5Var.G).get(), new ok5(fl5Var, j24Var));
        return zy11.a;
    }
}
