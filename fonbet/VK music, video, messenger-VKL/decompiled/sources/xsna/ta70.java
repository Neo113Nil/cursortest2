package xsna;

import com.vk.api.generated.notifications.dto.NotificationsCategoriesVectorResponseDto;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListCategoryTabsFeatureDelegate.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.delegate.NotificationListCategoryTabsFeatureDelegate$loadCategories$2", f = "NotificationListCategoryTabsFeatureDelegate.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class ta70 extends SuspendLambda implements wzs<yvj, spj<? super NotificationsCategoriesVectorResponseDto>, Object> {
    int label;
    final /* synthetic */ ua70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta70(ua70 ua70Var, spj<? super ta70> spjVar) {
        super(2, spjVar);
        this.this$0 = ua70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ta70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super NotificationsCategoriesVectorResponseDto> spjVar) {
        return ((ta70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        ua70 ua70Var = this.this$0;
        s101 s101Var = ua70Var.a;
        ua70Var.b.getClass();
        Long a = he70.a();
        s101Var.getClass();
        tfx tfxVar = new tfx("notifications.getCategories", new sr(21), new tr(19));
        if (a != null) {
            tfx.m(tfxVar, "group_id", a.longValue(), 1L, 8);
        }
        iz2 A = yfb.A(tfxVar);
        this.label = 1;
        Object p = evj.p(A, this);
        return p == coroutineSingletons ? coroutineSingletons : p;
    }
}
