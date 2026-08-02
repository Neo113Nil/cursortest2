package xsna;

import com.vk.push.common.Logger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: StartPushServiceInteractor.kt */
@b6l(c = "com.vk.push.pushsdk.domain.interactor.StartPushServiceInteractor$invoke$2", f = "StartPushServiceInteractor.kt", l = {46, 47, 48}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class nqk0 extends SuspendLambda implements wzs<s3q0, spj<? super s3q0>, Object> {
    final /* synthetic */ izs<spj<? super s3q0>, Object> $onStartPushService;
    boolean Z$0;
    int label;
    final /* synthetic */ oqk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nqk0(oqk0 oqk0Var, izs<? super spj<? super s3q0>, ? extends Object> izsVar, spj<? super nqk0> spjVar) {
        super(2, spjVar);
        this.this$0 = oqk0Var;
        this.$onStartPushService = izsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new nqk0(this.this$0, this.$onStartPushService, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(s3q0 s3q0Var, spj<? super s3q0> spjVar) {
        return ((nqk0) create(s3q0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (xsna.oqk0.a(r3, r7, r1, r4, r6) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005e, code lost:
    
        if (r7 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
    
        if (r7 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean booleanValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Logger.DefaultImpls.info$default(this.this$0.e, "onProcessStarted", null, 2, null);
            bk10 bk10Var = this.this$0.c;
            this.label = 1;
            obj = bk10Var.b(this);
        } else if (i == 1) {
            kotlin.a.a(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return s3q0.a;
            }
            booleanValue = this.Z$0;
            kotlin.a.a(obj);
            int intValue = ((Number) obj).intValue();
            oqk0 oqk0Var = this.this$0;
            izs<spj<? super s3q0>, Object> izsVar = this.$onStartPushService;
            this.label = 3;
        }
        booleanValue = ((Boolean) obj).booleanValue();
        ksr l = rsr.l(((ske0) this.this$0.b.c).k());
        this.Z$0 = booleanValue;
        this.label = 2;
        obj = rsr.n(l, this);
    }
}
