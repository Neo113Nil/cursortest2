package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.SafeCollector;
import xsna.b6l;
import xsna.cso0;
import xsna.f0q;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.yzs;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ SuspendLambda c;

    @b6l(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1$1, reason: invalid class name */
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
            return FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(ksr ksrVar, yzs yzsVar) {
        this.b = ksrVar;
        this.c = (SuspendLambda) yzsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    /* JADX WARN: Type inference failed for: r9v6, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.yzs] */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        AnonymousClass1 anonymousClass1;
        CoroutineSingletons coroutineSingletons;
        int i;
        FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
        cso0 cso0Var;
        ?? r2;
        SafeCollector safeCollector;
        Throwable th;
        SafeCollector safeCollector2;
        ?? r9;
        try {
            if (spjVar instanceof AnonymousClass1) {
                anonymousClass1 = (AnonymousClass1) spjVar;
                int i2 = anonymousClass1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    anonymousClass1.label = i2 - Integer.MIN_VALUE;
                    Object obj = anonymousClass1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                        a.a(obj);
                        try {
                            ksr ksrVar = this.b;
                            anonymousClass1.L$0 = this;
                            anonymousClass1.L$1 = lsrVar;
                            anonymousClass1.label = 1;
                            if (ksrVar.collect(lsrVar, anonymousClass1) != coroutineSingletons) {
                                flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = this;
                            cso0Var = new cso0(th);
                            r2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.c;
                            anonymousClass1.L$0 = th;
                            anonymousClass1.L$1 = null;
                            anonymousClass1.label = 2;
                            if (f0q.b(cso0Var, r2, th, anonymousClass1) != coroutineSingletons) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            Throwable th3 = (Throwable) anonymousClass1.L$0;
                            a.a(obj);
                            throw th3;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        safeCollector2 = (SafeCollector) anonymousClass1.L$0;
                        try {
                            a.a(obj);
                            safeCollector2.releaseIntercepted();
                            return s3q0.a;
                        } catch (Throwable th4) {
                            th = th4;
                            safeCollector2.releaseIntercepted();
                            throw th;
                        }
                    }
                    lsrVar = (lsr) anonymousClass1.L$1;
                    flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 = (FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    try {
                        a.a(obj);
                    } catch (Throwable th5) {
                        th = th5;
                        cso0Var = new cso0(th);
                        r2 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.c;
                        anonymousClass1.L$0 = th;
                        anonymousClass1.L$1 = null;
                        anonymousClass1.label = 2;
                        if (f0q.b(cso0Var, r2, th, anonymousClass1) != coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        throw th;
                    }
                    safeCollector = new SafeCollector(lsrVar, anonymousClass1.getContext());
                    r9 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.c;
                    anonymousClass1.L$0 = safeCollector;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (r9.invoke(safeCollector, null, anonymousClass1) != coroutineSingletons) {
                        safeCollector2 = safeCollector;
                        safeCollector2.releaseIntercepted();
                        return s3q0.a;
                    }
                    return coroutineSingletons;
                }
            }
            r9 = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1.c;
            anonymousClass1.L$0 = safeCollector;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            if (r9.invoke(safeCollector, null, anonymousClass1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th6) {
            th = th6;
            safeCollector2 = safeCollector;
            safeCollector2.releaseIntercepted();
            throw th;
        }
        anonymousClass1 = new AnonymousClass1(spjVar);
        Object obj2 = anonymousClass1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.label;
        if (i != 0) {
        }
        safeCollector = new SafeCollector(lsrVar, anonymousClass1.getContext());
    }
}
