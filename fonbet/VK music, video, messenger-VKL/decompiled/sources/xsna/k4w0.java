package xsna;

import io.requery.android.database.sqlite.SQLiteStatementType;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.uje0;

/* compiled from: VkpnsHttpMessagesReceiver.kt */
@b6l(c = "com.vk.push.pushsdk.pusher.VkpnsHttpMessagesReceiver$tryInvalidateToken$1", f = "VkpnsHttpMessagesReceiver.kt", l = {SQLiteStatementType.STATEMENT_OTHER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class k4w0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ uje0.a $errorResult;
    int label;
    final /* synthetic */ j4w0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4w0(j4w0 j4w0Var, uje0.a aVar, spj<? super k4w0> spjVar) {
        super(2, spjVar);
        this.this$0 = j4w0Var;
        this.$errorResult = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new k4w0(this.this$0, this.$errorResult, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((k4w0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a2p0 a2p0Var = this.this$0.a;
            String str = this.$errorResult.a;
            this.label = 1;
            if (a2p0Var.a(str, this) == coroutineSingletons) {
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
