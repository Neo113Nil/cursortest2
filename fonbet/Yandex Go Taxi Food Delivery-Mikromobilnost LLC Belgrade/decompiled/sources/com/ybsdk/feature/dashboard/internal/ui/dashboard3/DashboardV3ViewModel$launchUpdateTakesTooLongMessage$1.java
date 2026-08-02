package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import com.ybsdk.core.utils.text.Text;
import defpackage.dzh0;
import defpackage.em3;
import defpackage.g8e;
import defpackage.mvg;
import defpackage.n0t0;
import defpackage.ny61;
import defpackage.rmg;
import defpackage.tse;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zlg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.dashboard.internal.ui.dashboard3.DashboardV3ViewModel$launchUpdateTakesTooLongMessage$1", f = "DashboardV3ViewModel.kt", l = {375}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class DashboardV3ViewModel$launchUpdateTakesTooLongMessage$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $delayLength;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardV3ViewModel$launchUpdateTakesTooLongMessage$1(long j, d dVar, Continuation continuation) {
        super(2, continuation);
        this.$delayLength = j;
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DashboardV3ViewModel$launchUpdateTakesTooLongMessage$1(this.$delayLength, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DashboardV3ViewModel$launchUpdateTakesTooLongMessage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$delayLength;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        zlg zlgVar = this.this$0.C;
        em3 em3Var = zlgVar.b.s;
        em3Var.a.a("dashboard.insta.slow_load_snackbar.shown", g8e.w(1, "product_id", zlgVar.a.getProductId()));
        this.this$0.Z(new rmg(new n0t0(unr0.h(Text.Companion, dzh0.ybsdk_common_update_takes_too_long_title), new Text.Resource(dzh0.ybsdk_common_update_takes_too_long_subtitle)), false));
        return zy11.a;
    }
}
