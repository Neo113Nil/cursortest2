package com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.upgrade;

import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.yb.sdk.api.upgradesplit.UpgradeSplitResult$Status;
import defpackage.gb21;
import defpackage.hb21;
import defpackage.ib21;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vm50;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.upgrade.UpgradeSplitActionHandler$handle$1", f = "UpgradeSplitActionHandler.kt", l = {30}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class UpgradeSplitActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ jh5 $context;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeSplitActionHandler$handle$1(a aVar, ViewGroup viewGroup, ig5 ig5Var, FragmentActivity fragmentActivity, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$container = viewGroup;
        this.$action = ig5Var;
        this.$activity = fragmentActivity;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpgradeSplitActionHandler$handle$1(this.this$0, this.$container, this.$action, this.$activity, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpgradeSplitActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vm50 vm50Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            com.yandex.fintechsdk.logic.yb.impl.upgrade.internal.a aVar = this.this$0.c;
            ViewGroup viewGroup = this.$container;
            String str = ((gb21) this.$action).a;
            FragmentActivity fragmentActivity = this.$activity;
            this.label = 1;
            obj = aVar.a(viewGroup, str, fragmentActivity, this);
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
        ib21 ib21Var = (ib21) obj;
        UpgradeSplitResult$Status upgradeSplitResult$Status = ib21Var.a;
        UpgradeSplitResult$Status upgradeSplitResult$Status2 = UpgradeSplitResult$Status.FAILURE;
        zy11 zy11Var = zy11.a;
        if (upgradeSplitResult$Status != upgradeSplitResult$Status2 || !jl40.l(ib21Var.b, "yb_adapter_unavailable")) {
            int i2 = hb21.a[ib21Var.a.ordinal()];
            if (i2 == 1) {
                vm50Var = ((gb21) this.$action).e;
            } else if (i2 == 2) {
                vm50Var = ((gb21) this.$action).b;
            } else if (i2 == 3) {
                vm50Var = ((gb21) this.$action).d;
            } else {
                if (i2 != 4) {
                    w511.b();
                    return null;
                }
                vm50Var = ((gb21) this.$action).c;
            }
            if (vm50Var != null) {
                this.$context.a.dispatch(vm50Var);
            }
        }
        return zy11Var;
    }
}
