package xsna;

import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: NotificationListFeatureV2.kt */
@b6l(c = "com.vk.notifications.list.impl.presentation.base.mvi.list.feature.NotificationListFeatureV2$triggerProfileLoading$1", f = "NotificationListFeatureV2.kt", l = {Sdk.SDKError.Reason.AD_EXPIRED_VALUE}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class fb70 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int I$0;
    int I$1;
    int label;
    final /* synthetic */ wa70 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fb70(wa70 wa70Var, spj<? super fb70> spjVar) {
        super(2, spjVar);
        this.this$0 = wa70Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fb70(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fb70) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                io.reactivex.rxjava3.internal.operators.observable.a w = this.this$0.g.w(new com.vk.repository.data.api.a(o25.a().c(), new h2w(15), new vr0(22)));
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                obj = sd9.g(w, q230.FIRST, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    kotlin.a.a(obj);
                } catch (Throwable unused) {
                }
            }
            return s3q0.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
