package kotlinx.coroutines.flow;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ SuspendLambda c;

    @b6l(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(spj spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(ksr ksrVar, yzs yzsVar) {
        this.b = ksrVar;
        this.c = (SuspendLambda) yzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.invoke(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        AnonymousClass1 anonymousClass1;
        int i;
        FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1;
        Throwable th;
        if (spjVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) spjVar;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                    a.a(obj);
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = lsrVar;
                    anonymousClass1.label = 1;
                    obj = rsr.j(this.b, lsrVar, anonymousClass1);
                    if (obj != obj2) {
                        flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = this;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.a(obj);
                    return s3q0.a;
                }
                lsrVar = (lsr) anonymousClass1.L$1;
                flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 = (FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                a.a(obj);
                th = (Throwable) obj;
                if (th != null) {
                    ?? r2 = flowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.c;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                }
                return s3q0.a;
            }
        }
        anonymousClass1 = new AnonymousClass1(spjVar);
        Object obj3 = anonymousClass1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.label;
        if (i != 0) {
        }
        th = (Throwable) obj3;
        if (th != null) {
        }
        return s3q0.a;
    }
}
