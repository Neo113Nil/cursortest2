package com.yandex.go.multimodal_route.ui.onboarding;

import com.yandex.go.multimodal_route.analytics.MultimodalRouteAnalytics$MultimodalRouteButtonType;
import defpackage.agd;
import defpackage.au40;
import defpackage.bu40;
import defpackage.es40;
import defpackage.fl10;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.tt40;
import defpackage.ut40;
import defpackage.vt40;
import defpackage.w511;
import defpackage.wls;
import defpackage.yfd;
import defpackage.zt40;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.multimodal_route.ui.onboarding.MultimodalRouteOnboardingRouter$content$1$2$1", f = "MultimodalRouteOnboardingRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class MultimodalRouteOnboardingRouter$content$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ bu40 $action;
    final /* synthetic */ tt40 $navigator;
    final /* synthetic */ yfd $this_buildContent;
    int label;
    final /* synthetic */ ut40 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultimodalRouteOnboardingRouter$content$1$2$1(ut40 ut40Var, yfd yfdVar, bu40 bu40Var, tt40 tt40Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = ut40Var;
        this.$this_buildContent = yfdVar;
        this.$action = bu40Var;
        this.$navigator = tt40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MultimodalRouteOnboardingRouter$content$1$2$1(this.this$0, this.$this_buildContent, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        MultimodalRouteOnboardingRouter$content$1$2$1 multimodalRouteOnboardingRouter$content$1$2$1 = (MultimodalRouteOnboardingRouter$content$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        multimodalRouteOnboardingRouter$content$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        fl10 fl10Var = this.this$0.F;
        Object obj2 = ((agd) this.$this_buildContent).a;
        String str = ((vt40) obj2).a;
        String str2 = ((vt40) obj2).b;
        bu40 bu40Var = this.$action;
        tt40 tt40Var = this.$navigator;
        es40 es40Var = (es40) fl10Var.a;
        if (jl40.l(bu40Var, zt40.a)) {
            if (str == null) {
                str = "";
            }
            es40Var.e(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.Close);
            tt40Var.a.r(new qu(9));
        } else {
            if (!jl40.l(bu40Var, au40.a)) {
                w511.b();
                return null;
            }
            if (str == null) {
                str = "";
            }
            es40Var.e(str, str2, MultimodalRouteAnalytics$MultimodalRouteButtonType.Done);
            tt40Var.a.r(new qu(9));
        }
        return zy11.a;
    }
}
