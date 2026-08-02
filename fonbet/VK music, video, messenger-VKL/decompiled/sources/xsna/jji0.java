package xsna;

import android.os.Parcelable;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.test.TestPushPayload;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SendTestPushComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.SendTestPushComponentImpl$sendTestPush$1", f = "SendTestPushComponentImpl.kt", l = {31}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class jji0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<AidlResult<? extends Parcelable>, s3q0> $onResult;
    final /* synthetic */ String $pushToken;
    final /* synthetic */ TestPushPayload $testPushPayload;
    int label;
    final /* synthetic */ kji0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public jji0(kji0 kji0Var, String str, TestPushPayload testPushPayload, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar, spj<? super jji0> spjVar) {
        super(2, spjVar);
        this.this$0 = kji0Var;
        this.$pushToken = str;
        this.$testPushPayload = testPushPayload;
        this.$onResult = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new jji0(this.this$0, this.$pushToken, this.$testPushPayload, this.$onResult, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((jji0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            mji0 mji0Var = this.this$0.b;
            String str = this.$pushToken;
            TestPushPayload testPushPayload = this.$testPushPayload;
            this.label = 1;
            obj = mji0Var.a(str, testPushPayload, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        this.$onResult.invoke((AidlResult) obj);
        return s3q0.a;
    }
}
