package kotlinx.coroutines.flow;

import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.e3q0;
import xsna.ksr;
import xsna.lsr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ e3q0 c;

    @b6l(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, Sdk.SDKError.Reason.INVALID_INDEX_URL_VALUE}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        long J$0;
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
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(ksr ksrVar, e3q0 e3q0Var) {
        this.b = ksrVar;
        this.c = e3q0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0074 -> B:14:0x009d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008e -> B:11:0x0091). Please report as a decompilation issue!!! */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        AnonymousClass1 anonymousClass1;
        int i;
        long j;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
        int i2;
        FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
        lsr<? super Object> lsrVar2;
        Throwable th;
        Serializable j2;
        if (spjVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) spjVar;
            int i3 = anonymousClass1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i3 - Integer.MIN_VALUE;
                Object obj = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                    a.a(obj);
                    j = 0;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = this;
                    ksr ksrVar = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.b;
                    anonymousClass1.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                    anonymousClass1.L$1 = lsrVar;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.J$0 = j;
                    anonymousClass1.I$0 = 0;
                    anonymousClass1.label = 1;
                    j2 = rsr.j(ksrVar, lsrVar, anonymousClass1);
                    if (j2 != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    i2 = anonymousClass1.I$0;
                    j = anonymousClass1.J$0;
                    lsrVar2 = (lsr) anonymousClass1.L$1;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    a.a(obj);
                    th = (Throwable) obj;
                    if (th != null) {
                    }
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                    if (i2 == 0) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = anonymousClass1.J$0;
                    Throwable th2 = (Throwable) anonymousClass1.L$2;
                    lsrVar2 = (lsr) anonymousClass1.L$1;
                    flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = (FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) anonymousClass1.L$0;
                    a.a(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        j++;
                        i2 = 1;
                        flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                        if (i2 == 0) {
                            return s3q0.a;
                        }
                        lsrVar = lsrVar2;
                        ksr ksrVar2 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.b;
                        anonymousClass1.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                        anonymousClass1.L$1 = lsrVar;
                        anonymousClass1.L$2 = null;
                        anonymousClass1.J$0 = j;
                        anonymousClass1.I$0 = 0;
                        anonymousClass1.label = 1;
                        j2 = rsr.j(ksrVar2, lsrVar, anonymousClass1);
                        if (j2 != coroutineSingletons) {
                            lsrVar2 = lsrVar;
                            i2 = 0;
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1;
                            obj = j2;
                            th = (Throwable) obj;
                            if (th != null) {
                                e3q0 e3q0Var = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12.c;
                                Long l = new Long(j);
                                anonymousClass1.L$0 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                                anonymousClass1.L$1 = lsrVar2;
                                anonymousClass1.L$2 = th;
                                anonymousClass1.J$0 = j;
                                anonymousClass1.label = 2;
                                Object invoke = e3q0Var.invoke(lsrVar2, th, l, anonymousClass1);
                                if (invoke != coroutineSingletons) {
                                    obj = invoke;
                                    th2 = th;
                                    if (!((Boolean) obj).booleanValue()) {
                                        throw th2;
                                    }
                                }
                            }
                            flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 = flowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$12;
                            if (i2 == 0) {
                            }
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        anonymousClass1 = new AnonymousClass1(spjVar);
        Object obj2 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.label;
        if (i != 0) {
        }
    }
}
