package com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.topup;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import defpackage.fp51;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vm50;
import defpackage.vwz0;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.card.pay.topup.TopUpPayCardActionHandler$handle$1", f = "TopUpPayCardActionHandler.kt", l = {29}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class TopUpPayCardActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ FragmentActivity $activity;
    final /* synthetic */ ViewGroup $container;
    final /* synthetic */ jh5 $context;
    final /* synthetic */ fp51 $ybAdapter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopUpPayCardActionHandler$handle$1(ig5 ig5Var, fp51 fp51Var, ViewGroup viewGroup, FragmentActivity fragmentActivity, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.$action = ig5Var;
        this.$ybAdapter = fp51Var;
        this.$container = viewGroup;
        this.$activity = fragmentActivity;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TopUpPayCardActionHandler$handle$1(this.$action, this.$ybAdapter, this.$container, this.$activity, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TopUpPayCardActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            Double d = ((vwz0) this.$action).a;
            BigDecimal bigDecimal = d != null ? new BigDecimal(String.valueOf(d.doubleValue())) : null;
            fp51 fp51Var = this.$ybAdapter;
            ViewGroup viewGroup = this.$container;
            FragmentActivity fragmentActivity = this.$activity;
            this.label = 1;
            c cVar = (c) fp51Var;
            cVar.getClass();
            Object b = cVar.b(fragmentActivity, viewGroup, Uri.parse(String.format("ybapp://screen.open/topup?&amount=%s&as_root=true", Arrays.copyOf(new Object[]{bigDecimal}, 1))), this);
            if (b != coroutineSingletons) {
                b = zy11Var;
            }
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        vm50 vm50Var = ((vwz0) this.$action).c;
        if (vm50Var != null) {
            this.$context.a.dispatch(vm50Var);
        }
        return zy11Var;
    }
}
