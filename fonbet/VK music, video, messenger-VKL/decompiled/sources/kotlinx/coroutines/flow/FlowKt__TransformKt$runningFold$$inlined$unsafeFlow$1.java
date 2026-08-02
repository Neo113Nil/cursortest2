package kotlinx.coroutines.flow;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.ytr;
import xsna.yzs;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes8.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 implements ksr<Object> {
    public final /* synthetic */ Object b;
    public final /* synthetic */ ksr c;
    public final /* synthetic */ SuspendLambda d;

    @b6l(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 111}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(spj spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(Object obj, ksr ksrVar, yzs yzsVar) {
        this.b = obj;
        this.c = ksrVar;
        this.d = (SuspendLambda) yzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
    
        if (r8.collect(r5, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        AnonymousClass1 anonymousClass1;
        int i;
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1;
        lsr<? super Object> lsrVar2;
        Ref$ObjectRef ref$ObjectRef;
        if (spjVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) spjVar;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                    a.a(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    ?? r2 = this.b;
                    ref$ObjectRef2.element = r2;
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = lsrVar;
                    anonymousClass1.L$2 = ref$ObjectRef2;
                    anonymousClass1.label = 1;
                    if (lsrVar.emit(r2, anonymousClass1) != coroutineSingletons) {
                        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = this;
                        lsrVar2 = lsrVar;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    return s3q0.a;
                }
                ref$ObjectRef = (Ref$ObjectRef) anonymousClass1.L$2;
                lsrVar2 = (lsr) anonymousClass1.L$1;
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                a.a(obj);
                ksr ksrVar = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.c;
                ytr ytrVar = new ytr(ref$ObjectRef, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.d, lsrVar2);
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.L$2 = null;
                anonymousClass1.label = 2;
            }
        }
        anonymousClass1 = new AnonymousClass1(spjVar);
        Object obj2 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.label;
        if (i != 0) {
        }
        ksr ksrVar2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.c;
        ytr ytrVar2 = new ytr(ref$ObjectRef, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.d, lsrVar2);
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.L$2 = null;
        anonymousClass1.label = 2;
    }
}
