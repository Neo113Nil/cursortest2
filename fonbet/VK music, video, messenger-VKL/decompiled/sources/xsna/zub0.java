package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ConnectionPoolImpl.kt */
@b6l(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class zub0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<p4j> $connection;
    Object L$0;
    int label;
    final /* synthetic */ cvb0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zub0(Ref$ObjectRef<p4j> ref$ObjectRef, cvb0 cvb0Var, spj<? super zub0> spjVar) {
        super(2, spjVar);
        this.$connection = ref$ObjectRef;
        this.this$0 = cvb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new zub0(this.$connection, this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((zub0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef<p4j> ref$ObjectRef;
        T t;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            Ref$ObjectRef<p4j> ref$ObjectRef2 = this.$connection;
            cvb0 cvb0Var = this.this$0;
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object a = cvb0Var.a(this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            ref$ObjectRef = ref$ObjectRef2;
            t = a;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.a.a(obj);
            t = obj;
        }
        ref$ObjectRef.element = t;
        return s3q0.a;
    }
}
