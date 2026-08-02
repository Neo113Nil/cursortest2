package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: AnalyticsWebSocketListener.kt */
@b6l(c = "com.vk.push.pushsdk.notifier.websocket.listener.AnalyticsWebSocketListener$withLock$1", f = "AnalyticsWebSocketListener.kt", l = {129, 97}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class ty1 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<spj<? super s3q0>, Object> $action;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oy1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ty1(oy1 oy1Var, izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super ty1> spjVar) {
        super(2, spjVar);
        this.this$0 = oy1Var;
        this.$action = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ty1(this.this$0, this.$action, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ty1) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003f, code lost:
    
        if (r7.b(r6) == r0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.ui50] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wi50 wi50Var;
        izs<spj<? super s3q0>, Object> izsVar;
        ui50 ui50Var;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                wi50Var = this.this$0.h;
                izsVar = this.$action;
                this.L$0 = wi50Var;
                this.L$1 = izsVar;
                this.label = 1;
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ui50Var = (ui50) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        s3q0 s3q0Var = s3q0.a;
                        ui50Var.c(null);
                        return s3q0.a;
                    } catch (Throwable th2) {
                        th = th2;
                        ui50Var.c(null);
                        throw th;
                    }
                }
                izsVar = (izs) this.L$1;
                ?? r3 = (ui50) this.L$0;
                kotlin.a.a(obj);
                wi50Var = r3;
            }
            this.L$0 = wi50Var;
            this.L$1 = null;
            this.label = 2;
            if (izsVar.invoke(this) != coroutineSingletons) {
                ui50Var = wi50Var;
                s3q0 s3q0Var2 = s3q0.a;
                ui50Var.c(null);
                return s3q0.a;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            ui50Var = wi50Var;
            th = th3;
            ui50Var.c(null);
            throw th;
        }
    }
}
