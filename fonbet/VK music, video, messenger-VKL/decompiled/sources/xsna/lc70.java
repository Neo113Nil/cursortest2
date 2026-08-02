package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.yb70;

/* compiled from: NotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView$NotificationListPagerSynchronizationEffects$1$1", f = "NotificationListView.kt", l = {233}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class lc70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yb70.f $pagesState;
    final /* synthetic */ mc90 $vkPagerState;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc70(yb70.f fVar, mc90 mc90Var, spj<? super lc70> spjVar) {
        super(2, spjVar);
        this.$pagesState = fVar;
        this.$vkPagerState = mc90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lc70(this.$pagesState, this.$vkPagerState, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lc70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yb70.f fVar = this.$pagesState;
            int i2 = fVar.c;
            if (i2 >= 0 && i2 < fVar.b.size() && this.$vkPagerState.k() != i2) {
                mc90 mc90Var = this.$vkPagerState;
                this.I$0 = i2;
                this.label = 1;
                if (mc90Var.w(i2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
