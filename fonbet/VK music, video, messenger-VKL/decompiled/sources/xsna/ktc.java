package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.htc;
import xsna.zsc;

/* compiled from: ClipEditSdkMviTaskExecutor.kt */
@b6l(c = "com.vk.clips.viewer.edit.presentation.feature.executor.ClipEditSdkMviTaskExecutor$loadAttachedVideoInfo$1", f = "ClipEditSdkMviTaskExecutor.kt", l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class ktc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ htc.a $task;
    int label;
    final /* synthetic */ ntc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ktc(ntc ntcVar, htc.a aVar, spj<? super ktc> spjVar) {
        super(2, spjVar);
        this.this$0 = ntcVar;
        this.$task = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ktc(this.this$0, this.$task, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ktc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            tsc tscVar = this.this$0.g;
            String str = this.$task.b;
            this.label = 1;
            a = tscVar.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            a = ((Result) obj).d();
        }
        ntc ntcVar = this.this$0;
        if (!(a instanceof Result.Failure)) {
            ntcVar.e(new zsc.q((e2s0) a));
        }
        ntc ntcVar2 = this.this$0;
        if (Result.a(a) != null) {
            ntcVar2.e(new zsc.q(null));
            ntcVar2.e(zsc.h.a);
        }
        return s3q0.a;
    }
}
