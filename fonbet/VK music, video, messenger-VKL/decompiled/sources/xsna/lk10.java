package xsna;

import android.os.Parcelable;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.domain.model.CallingAppIds;
import com.vk.push.pushsdk.masterhost.ipc.MasterHostIPCResult;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MasterSelectionComponentImpl.kt */
@b6l(c = "com.vk.push.pushsdk.domain.component.MasterSelectionComponentImpl$sendRequestToInitiateElections$1", f = "MasterSelectionComponentImpl.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class lk10 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ CallingAppIds $callingAppIds;
    final /* synthetic */ izs<AidlResult<? extends Parcelable>, s3q0> $onResult;
    int label;
    final /* synthetic */ nk10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public lk10(nk10 nk10Var, CallingAppIds callingAppIds, izs<? super AidlResult<? extends Parcelable>, s3q0> izsVar, spj<? super lk10> spjVar) {
        super(2, spjVar);
        this.this$0 = nk10Var;
        this.$callingAppIds = callingAppIds;
        this.$onResult = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new lk10(this.this$0, this.$callingAppIds, this.$onResult, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((lk10) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        AidlResult<AidlException> failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nj10 nj10Var = this.this$0.c;
            CallingAppIds callingAppIds = this.$callingAppIds;
            this.label = 1;
            c = nj10Var.c(callingAppIds, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            c = ((Result) obj).d();
        }
        Throwable a = Result.a(c);
        if (a == null) {
            failure = AidlResult.Companion.success(MasterHostIPCResult.ELECTIONS_STARTED);
        } else {
            failure = AidlResult.Companion.failure(a);
        }
        this.$onResult.invoke(failure);
        this.this$0.g(failure.isSuccess(), false);
        return s3q0.a;
    }
}
