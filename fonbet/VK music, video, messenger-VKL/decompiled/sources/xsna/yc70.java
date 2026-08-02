package xsna;

import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListViewKt$NotificationCategoryTabs$1$1", f = "NotificationListView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class yc70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ List $categories;
    final /* synthetic */ int $selectedCategoryIndex;
    final /* synthetic */ wh50<Integer> $selectedIndexState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yc70(wh50 wh50Var, int i, List list, spj spjVar) {
        super(2, spjVar);
        this.$selectedIndexState = wh50Var;
        this.$selectedCategoryIndex = i;
        this.$categories = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new yc70(this.$selectedIndexState, this.$selectedCategoryIndex, this.$categories, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((yc70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        wh50<Integer> wh50Var = this.$selectedIndexState;
        int i = this.$selectedCategoryIndex;
        wh50Var.setValue(new Integer((i < 0 || i >= this.$categories.size()) ? 0 : this.$selectedCategoryIndex));
        return s3q0.a;
    }
}
