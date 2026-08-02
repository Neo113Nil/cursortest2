package com.yandex.go.settings.mvp;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v7j0;
import defpackage.wbr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.settings.mvp.SettingsPresenter$processSharingActiveChanged$1", f = "SettingsPresenter.kt", l = {198}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class SettingsPresenter$processSharingActiveChanged$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ wbr0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsPresenter$processSharingActiveChanged$1(wbr0 wbr0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = wbr0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsPresenter$processSharingActiveChanged$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsPresenter$processSharingActiveChanged$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            v7j0 v7j0Var = this.this$0.G;
            this.label = 1;
            obj = ((com.yandex.go.permission.b) v7j0Var).d(1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        wbr0 wbr0Var = this.this$0;
        if (booleanValue) {
            wbr0Var.Kg(true);
        } else {
            wbr0Var.x.g();
        }
        return zy11.a;
    }
}
