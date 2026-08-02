package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ReportViewModel.kt */
@b6l(c = "com.vk.overlaymenu.feature.report.ReportViewModel$sendMessage$2", f = "ReportViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class m6g0 extends SuspendLambda implements wzs<yvj, spj<? super Result<? extends Long>>, Object> {
    final /* synthetic */ String $description;
    final /* synthetic */ String $logsPath;
    int label;
    final /* synthetic */ n6g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6g0(String str, n6g0 n6g0Var, String str2, spj<? super m6g0> spjVar) {
        super(2, spjVar);
        this.$description = str;
        this.this$0 = n6g0Var;
        this.$logsPath = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new m6g0(this.$description, this.this$0, this.$logsPath, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Result<? extends Long>> spjVar) {
        return ((m6g0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        y290 y290Var = x290.j;
        if (y290Var == null) {
            y290Var = null;
        }
        y290 y290Var2 = y290Var;
        String str = this.$description;
        String str2 = (String) this.this$0.e.getValue();
        String str3 = this.$logsPath;
        y290Var2.getClass();
        try {
            long a = y290Var2.a();
            y290Var2.b(a, str, str2, str3);
            failure = Long.valueOf(a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return new Result(failure);
    }
}
