package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: SimpleActor.kt */
@b6l(c = "androidx.datastore.core.SimpleActor$offer$2", f = "SimpleActor.kt", l = {Sdk.SDKError.Reason.TPAT_ERROR_VALUE, Sdk.SDKError.Reason.TPAT_ERROR_VALUE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class xoj0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ yoj0<Object> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xoj0(yoj0<Object> yoj0Var, spj<? super xoj0> spjVar) {
        super(2, spjVar);
        this.this$0 = yoj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new xoj0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xoj0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0050, code lost:
    
        if (r1.invoke(r6, r5) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0044, code lost:
    
        if (r6 != r0) goto L15;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0050 -> B:6:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        wzs wzsVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            if (this.this$0.d.a.get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            zvj.e(this.this$0.a);
            yoj0<Object> yoj0Var = this.this$0;
            wzsVar = yoj0Var.b;
            nm8 nm8Var = yoj0Var.c;
            this.L$0 = wzsVar;
            this.label = 1;
            obj = nm8Var.a(this);
        } else if (i == 1) {
            wzsVar = (wzs) this.L$0;
            kotlin.a.a(obj);
            this.L$0 = null;
            this.label = 2;
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            if (this.this$0.d.a.decrementAndGet() == 0) {
                return s3q0.a;
            }
            zvj.e(this.this$0.a);
            yoj0<Object> yoj0Var2 = this.this$0;
            wzsVar = yoj0Var2.b;
            nm8 nm8Var2 = yoj0Var2.c;
            this.L$0 = wzsVar;
            this.label = 1;
            obj = nm8Var2.a(this);
        }
    }
}
