package com.yandex.payment.divkit.select;

import com.yandex.payment.sdk.feature.flags.FeatureFlag;
import defpackage.apa1;
import defpackage.avf;
import defpackage.i891;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ong0;
import defpackage.pwf;
import defpackage.raq0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zbq0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.select.DKSelectFragment$onCreate$1", f = "DKSelectFragment.kt", l = {HProv.PP_LICENSE}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class DKSelectFragment$onCreate$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ DKSelectFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DKSelectFragment$onCreate$1(DKSelectFragment dKSelectFragment, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dKSelectFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DKSelectFragment$onCreate$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DKSelectFragment$onCreate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        raq0 raq0Var;
        raq0 raq0Var2;
        raq0 raq0Var3;
        avf viewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
            this.this$0.requireContext();
            i891.h(this.this$0.requireContext().getTheme(), ong0.paymentsdk_is_light_theme, true);
            raq0Var = this.this$0.callbacks;
            if (raq0Var == null) {
                raq0Var = null;
            }
            ((pwf) ((zbq0) raq0Var).b).d().a.getIsDebug();
            raq0Var2 = this.this$0.callbacks;
            if (raq0Var2 == null) {
                raq0Var2 = null;
            }
            if (!((zbq0) raq0Var2).s()) {
                apa1.e(FeatureFlag.YB_PROMOTION_FLAG);
            }
            raq0Var3 = this.this$0.callbacks;
            if (!((zbq0) (raq0Var3 != null ? raq0Var3 : null)).s()) {
                apa1.e(FeatureFlag.IS_PAYMENT_START_AFTER_TOP_UP_FLAG);
            }
            this.label = 1;
            com.yandex.payment.sdk.core.utils.a.c();
            if (zy11Var == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        viewModel = this.this$0.getViewModel();
        viewModel.K();
        return zy11Var;
    }
}
