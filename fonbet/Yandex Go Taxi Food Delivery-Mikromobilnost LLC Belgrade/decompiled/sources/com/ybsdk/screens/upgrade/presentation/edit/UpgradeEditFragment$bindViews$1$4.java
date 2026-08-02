package com.ybsdk.screens.upgrade.presentation.edit;

import defpackage.i861;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sf11;
import defpackage.tse;
import defpackage.w921;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.screens.upgrade.presentation.edit.UpgradeEditFragment$bindViews$1$4", f = "UpgradeEditFragment.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class UpgradeEditFragment$bindViews$1$4 extends SuspendLambda implements wls {
    final /* synthetic */ i861 $this_run;
    int label;
    final /* synthetic */ UpgradeEditFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeEditFragment$bindViews$1$4(i861 i861Var, UpgradeEditFragment upgradeEditFragment, Continuation continuation) {
        super(2, continuation);
        this.$this_run = i861Var;
        this.this$0 = upgradeEditFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeEditFragment$bindViews$1$4(this.$this_run, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeEditFragment$bindViews$1$4) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h K = e.K(com.ybsdk.core.utils.ext.view.b.B(((w921) this.$this_run.d.getCurrentView().getTag()).a.getEditText()), com.ybsdk.core.utils.ext.view.b.B(((w921) this.$this_run.d.getNextView().getTag()).a.getEditText()));
            sf11 sf11Var = new sf11(8, this.this$0);
            this.label = 1;
            if (K.collect(sf11Var, this) == coroutineSingletons) {
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
