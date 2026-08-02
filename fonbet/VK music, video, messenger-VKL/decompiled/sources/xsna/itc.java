package xsna;

import android.util.Log;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.zsc;

/* compiled from: ClipEditSdkMviTaskExecutor.kt */
@b6l(c = "com.vk.clips.viewer.edit.presentation.feature.executor.ClipEditSdkMviTaskExecutor$getTrendingHashtags$1", f = "ClipEditSdkMviTaskExecutor.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class itc extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ ntc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itc(ntc ntcVar, spj<? super itc> spjVar) {
        super(2, spjVar);
        this.this$0 = ntcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new itc(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((itc) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            tsc tscVar = this.this$0.g;
            this.label = 1;
            c = tscVar.c(this);
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
        ntc ntcVar = this.this$0;
        if (!(c instanceof Result.Failure)) {
            ntcVar.e(new zsc.f((List) c));
        }
        Throwable a = Result.a(c);
        if (a != null) {
            Log.e("MviLogger", "", a);
        }
        return s3q0.a;
    }
}
