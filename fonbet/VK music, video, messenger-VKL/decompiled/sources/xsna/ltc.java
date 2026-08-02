package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.dto.common.id.UserId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zsc;

/* compiled from: ClipEditSdkMviTaskExecutor.kt */
@b6l(c = "com.vk.clips.viewer.edit.presentation.feature.executor.ClipEditSdkMviTaskExecutor$loadPrivacyInfo$1", f = "ClipEditSdkMviTaskExecutor.kt", l = {95}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ltc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ntc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ltc(ntc ntcVar, spj<? super ltc> spjVar) {
        super(2, spjVar);
        this.this$0 = ntcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ltc(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ltc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            ntc ntcVar = this.this$0;
            tsc tscVar = ntcVar.g;
            UserId userId = ((ClipEditSdkMviState) ntcVar.b.getCurrentState()).i.c;
            UserId userId2 = ((ClipEditSdkMviState) this.this$0.b.getCurrentState()).i.d;
            this.label = 1;
            b = tscVar.b(userId, userId2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            b = ((Result) obj).d();
        }
        ntc ntcVar2 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            ntc.t(ntcVar2, ((Boolean) b).booleanValue());
        }
        ntc ntcVar3 = this.this$0;
        if (Result.a(b) != null) {
            ntcVar3.e(new zsc.k(oad.a((ClipEditSdkMviState) ntcVar3.b.getCurrentState())));
        }
        return s3q0.a;
    }
}
