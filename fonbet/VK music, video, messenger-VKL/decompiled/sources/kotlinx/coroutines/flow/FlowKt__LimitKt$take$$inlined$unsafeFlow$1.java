package kotlinx.coroutines.flow;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import xsna.b6l;
import xsna.jtr;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes8.dex */
public final class FlowKt__LimitKt$take$$inlined$unsafeFlow$1 implements ksr<Object> {
    public final /* synthetic */ ksr b;

    @b6l(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(spj spjVar) {
            super(spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt$take$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$take$$inlined$unsafeFlow$1(ksr ksrVar) {
        this.b = ksrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        AnonymousClass1 anonymousClass1;
        int i;
        AbortFlowException e;
        Object obj;
        if (spjVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) spjVar;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                    a.a(obj2);
                    Object obj3 = new Object();
                    Ref$IntRef ref$IntRef = new Ref$IntRef();
                    try {
                        ksr ksrVar = this.b;
                        jtr jtrVar = new jtr(ref$IntRef, lsrVar, obj3);
                        anonymousClass1.L$0 = obj3;
                        anonymousClass1.label = 1;
                        if (ksrVar.collect(jtrVar, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        obj = obj3;
                        if (e.b != obj) {
                            throw e;
                        }
                        return s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = anonymousClass1.L$0;
                    try {
                        a.a(obj2);
                    } catch (AbortFlowException e3) {
                        e = e3;
                        if (e.b != obj) {
                        }
                        return s3q0.a;
                    }
                }
                return s3q0.a;
            }
        }
        anonymousClass1 = new AnonymousClass1(spjVar);
        Object obj22 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.label;
        if (i != 0) {
        }
        return s3q0.a;
    }
}
