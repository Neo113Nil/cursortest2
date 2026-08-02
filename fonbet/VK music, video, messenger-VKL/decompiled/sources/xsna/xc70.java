package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListViewKt$MilkshakeNotificationCategoryTabs$1$1$1$1$1", f = "NotificationListView.kt", l = {436}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class xc70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $index;
    final /* synthetic */ mc90 $vkPagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc70(mc90 mc90Var, int i, spj<? super xc70> spjVar) {
        super(2, spjVar);
        this.$vkPagerState = mc90Var;
        this.$index = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xc70(this.$vkPagerState, this.$index, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xc70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mc90 mc90Var = this.$vkPagerState;
            int i2 = this.$index;
            this.label = 1;
            if (mc90.g(mc90Var, i2, null, this, 6) == coroutineSingletons) {
                return coroutineSingletons;
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
