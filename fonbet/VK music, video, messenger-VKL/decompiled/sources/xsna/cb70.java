package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$loadNotifications$3$1", f = "NotificationListFeatureV2.kt", l = {681}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class cb70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb70(wa70 wa70Var, spj<? super cb70> spjVar) {
        super(2, spjVar);
        this.this$0 = wa70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new cb70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((cb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            wa70 wa70Var = this.this$0;
            this.label = 1;
            wa70Var.getClass();
            Object k = myc0.k(hqu0.b(), new db70(wa70Var, null, null), this);
            if (k != obj2) {
                k = s3q0.a;
            }
            if (k == obj2) {
                return obj2;
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
