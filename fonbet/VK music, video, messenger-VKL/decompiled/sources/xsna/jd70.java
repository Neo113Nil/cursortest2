package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationMenuModalBottomSheet.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.fragment.menu.NotificationMenuModalBottomSheet$closeBottomSheet$1", f = "NotificationMenuModalBottomSheet.kt", l = {138}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class jd70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ id70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd70(id70 id70Var, spj<? super jd70> spjVar) {
        super(2, spjVar);
        this.this$0 = id70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jd70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jd70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            this.label = 1;
            if (qsl.b(300L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.this$0.dismiss();
        return s3q0.a;
    }
}
