package com.ybsdk.feature.divkit.api.ui.skeletons;

import com.ybsdk.feature.divkit.api.data.a;
import com.ybsdk.feature.divkit.api.ui.YbDivView;
import defpackage.eal;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r861;
import defpackage.rr51;
import defpackage.tse;
import defpackage.wls;
import defpackage.xls0;
import defpackage.ye0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.divkit.api.ui.skeletons.DivSkeletonsView$showShimmerOrFallback$1", f = "DivSkeletonsView.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DivSkeletonsView$showShimmerOrFallback$1 extends SuspendLambda implements wls {
    final /* synthetic */ eal $viewState;
    int label;
    final /* synthetic */ DivSkeletonsView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivSkeletonsView$showShimmerOrFallback$1(DivSkeletonsView divSkeletonsView, eal ealVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = divSkeletonsView;
        this.$viewState = ealVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DivSkeletonsView$showShimmerOrFallback$1(this.this$0, this.$viewState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DivSkeletonsView$showShimmerOrFallback$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r861 r861Var;
        r861 r861Var2;
        r861 r861Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xls0 skeletonStorage = this.this$0.getSkeletonStorage();
            ye0 ye0Var = this.$viewState.a;
            this.label = 1;
            obj = ((a) skeletonStorage).g(ye0Var, this);
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
        rr51 rr51Var = (rr51) obj;
        DivSkeletonsView divSkeletonsView = this.this$0;
        if (rr51Var != null) {
            divSkeletonsView.startShimmer();
            r861Var = divSkeletonsView.binding;
            r861Var.c.setVisibility(8);
            r861Var2 = divSkeletonsView.binding;
            YbDivView.setData$default(r861Var2.b, rr51Var, null, null, false, 14, null);
            r861Var3 = divSkeletonsView.binding;
            r861Var3.b.setVisibility(0);
        } else {
            divSkeletonsView.showFallback(this.$viewState.c);
        }
        return zy11.a;
    }
}
