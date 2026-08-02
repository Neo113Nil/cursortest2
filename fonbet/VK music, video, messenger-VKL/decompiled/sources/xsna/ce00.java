package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MainContent.kt */
@b6l(c = "com.vk.clips.attachments.impl.publish.geolocation.presentation.view.MainContentKt$useDebounce$1$1$job$1", f = "MainContent.kt", l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes16.dex */
public final class ce00 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ long $delayMillis;
    final /* synthetic */ izs<Object, s3q0> $onChange;
    final /* synthetic */ mtk0<Object> $state$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ce00(long j, izs<Object, s3q0> izsVar, mtk0<Object> mtk0Var, spj<? super ce00> spjVar) {
        super(2, spjVar);
        this.$delayMillis = j;
        this.$onChange = izsVar;
        this.$state$delegate = mtk0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ce00(this.$delayMillis, this.$onChange, this.$state$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ce00) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            long j = this.$delayMillis;
            this.label = 1;
            if (qsl.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$onChange.invoke(this.$state$delegate.getValue());
        return s3q0.a;
    }
}
