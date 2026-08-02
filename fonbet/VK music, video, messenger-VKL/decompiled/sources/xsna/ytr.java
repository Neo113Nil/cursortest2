package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: Transform.kt */
/* loaded from: classes8.dex */
public final class ytr<T> implements lsr {
    public final /* synthetic */ Ref$ObjectRef<Object> b;
    public final /* synthetic */ SuspendLambda c;
    public final /* synthetic */ lsr<Object> d;

    /* compiled from: Transform.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1", f = "Transform.kt", l = {105, Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE}, m = "emit")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ ytr<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ytr<? super T> ytrVar, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = ytrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.emit(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ytr(Ref$ObjectRef<Object> ref$ObjectRef, yzs<Object, ? super T, ? super spj<Object>, ? extends Object> yzsVar, lsr<Object> lsrVar) {
        this.b = ref$ObjectRef;
        this.c = (SuspendLambda) yzsVar;
        this.d = lsrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r6.emit(r7, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r4v1, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    @Override // xsna.lsr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        a aVar;
        int i;
        Ref$ObjectRef<Object> ref$ObjectRef;
        ytr<T> ytrVar;
        if (spjVar instanceof a) {
            aVar = (a) spjVar;
            int i2 = aVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.label = i2 - Integer.MIN_VALUE;
                T t2 = (T) aVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aVar.label;
                if (i != 0) {
                    kotlin.a.a(t2);
                    Ref$ObjectRef<Object> ref$ObjectRef2 = this.b;
                    Object obj = ref$ObjectRef2.element;
                    aVar.L$0 = this;
                    aVar.L$1 = ref$ObjectRef2;
                    aVar.label = 1;
                    Object invoke = this.c.invoke(obj, t, aVar);
                    if (invoke != coroutineSingletons) {
                        t2 = (T) invoke;
                        ref$ObjectRef = ref$ObjectRef2;
                        ytrVar = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(t2);
                    return s3q0.a;
                }
                ref$ObjectRef = (Ref$ObjectRef) aVar.L$1;
                ytrVar = (ytr) aVar.L$0;
                kotlin.a.a(t2);
                ref$ObjectRef.element = t2;
                lsr<Object> lsrVar = ytrVar.d;
                Object obj2 = ytrVar.b.element;
                aVar.L$0 = null;
                aVar.L$1 = null;
                aVar.label = 2;
            }
        }
        aVar = new a(this, spjVar);
        T t22 = (T) aVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
        if (i != 0) {
        }
        ref$ObjectRef.element = t22;
        lsr<Object> lsrVar2 = ytrVar.d;
        Object obj22 = ytrVar.b.element;
        aVar.L$0 = null;
        aVar.L$1 = null;
        aVar.label = 2;
    }
}
