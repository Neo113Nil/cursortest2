package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.nm8;
import xsna.vcn;

/* compiled from: RxScheduler.kt */
@b6l(c = "kotlinx.coroutines.rx3.DispatcherScheduler$DispatcherWorker$1", f = "RxScheduler.kt", l = {183, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class ucn extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ vcn.a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ucn(vcn.a aVar, spj<? super ucn> spjVar) {
        super(2, spjVar);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new ucn(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((ucn) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0066, code lost:
    
        if (r7.invoke(r6) == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056 A[Catch: all -> 0x0019, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:9:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x0069, B:26:0x002b, B:28:0x0036), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069 A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #1 {all -> 0x0019, blocks: (B:7:0x0014, B:9:0x003e, B:15:0x004e, B:17:0x0056, B:19:0x0069, B:26:0x002b, B:28:0x0036), top: B:2:0x0006 }] */
    /* JADX WARN: Type inference failed for: r1v6, types: [xsna.o0b] */
    /* JADX WARN: Type inference failed for: r1v8, types: [xsna.o0b] */
    /* JADX WARN: Type inference failed for: r4v6, types: [xsna.b9f0] */
    /* JADX WARN: Type inference failed for: r4v8, types: [xsna.b9f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0066 -> B:8:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm8.a aVar;
        nm8 nm8Var;
        nm8.a aVar2;
        nm8 nm8Var2;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.a(obj);
                nm8 nm8Var3 = this.this$0.e;
                nm8Var3.getClass();
                aVar = new nm8.a();
                nm8Var2 = nm8Var3;
                this.L$0 = nm8Var2;
                this.L$1 = aVar;
                this.label = 1;
                a = aVar.a(this);
                if (a != coroutineSingletons) {
                }
            } else if (i == 1) {
                ?? r1 = (o0b) this.L$1;
                ?? r4 = (b9f0) this.L$0;
                kotlin.a.a(obj);
                aVar2 = r1;
                nm8Var = r4;
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r12 = (o0b) this.L$1;
                ?? r42 = (b9f0) this.L$0;
                kotlin.a.a(obj);
                nm8.a aVar3 = r12;
                nm8 nm8Var4 = r42;
                aVar = aVar3;
                nm8Var2 = nm8Var4;
                this.L$0 = nm8Var2;
                this.L$1 = aVar;
                this.label = 1;
                a = aVar.a(this);
                if (a != coroutineSingletons) {
                    return coroutineSingletons;
                }
                aVar2 = aVar;
                obj = a;
                nm8Var = nm8Var2;
                if (((Boolean) obj).booleanValue()) {
                    s3q0 s3q0Var = s3q0.a;
                    nm8Var.b(null);
                    return s3q0.a;
                }
                izs izsVar = (izs) aVar2.next();
                this.L$0 = nm8Var;
                this.L$1 = aVar2;
                this.label = 2;
                aVar3 = aVar2;
                nm8Var4 = nm8Var;
            }
        } finally {
        }
    }
}
