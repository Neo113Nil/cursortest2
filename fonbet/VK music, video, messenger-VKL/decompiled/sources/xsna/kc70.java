package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListView.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.view.list.NotificationListView$ContentSurface$2$1", f = "NotificationListView.kt", l = {169}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class kc70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ boolean $hasContent;
    int label;
    final /* synthetic */ nc70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kc70(boolean z, nc70 nc70Var, spj<? super kc70> spjVar) {
        super(2, spjVar);
        this.$hasContent = z;
        this.this$0 = nc70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new kc70(this.$hasContent, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((kc70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.$hasContent) {
                this.label = 1;
                if (ktu.c(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return s3q0.a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        nc70 nc70Var = this.this$0;
        mzp0 mzp0Var = nc70Var.f;
        if (mzp0Var != null) {
            mzp0Var.d(nc70Var.c());
        }
        return s3q0.a;
    }
}
