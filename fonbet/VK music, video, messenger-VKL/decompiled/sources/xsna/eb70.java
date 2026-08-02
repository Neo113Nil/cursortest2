package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$sendMarkAsRead$1", f = "NotificationListFeatureV2.kt", l = {540}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class eb70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ int $lastViewed;
    int I$0;
    int I$1;
    Object L$0;
    int label;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb70(wa70 wa70Var, int i, spj<? super eb70> spjVar) {
        super(2, spjVar);
        this.this$0 = wa70Var;
        this.$lastViewed = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new eb70(this.this$0, this.$lastViewed, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((eb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wa70 wa70Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                wa70 wa70Var2 = this.this$0;
                int i2 = this.$lastViewed;
                s101 s101Var = wa70Var2.l;
                wa70Var2.Y().getClass();
                iz2 A = yfb.A(s101Var.C(he70.a(), String.valueOf(i2)));
                this.L$0 = wa70Var2;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                if (evj.p(A, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wa70Var = wa70Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                wa70Var = (wa70) this.L$0;
                try {
                    kotlin.a.a(obj);
                } catch (Throwable unused) {
                }
            }
            wa70Var.Y().getClass();
            if (he70.a() == null) {
                g620.w(0);
            }
            s3q0 s3q0Var = s3q0.a;
            return s3q0.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
