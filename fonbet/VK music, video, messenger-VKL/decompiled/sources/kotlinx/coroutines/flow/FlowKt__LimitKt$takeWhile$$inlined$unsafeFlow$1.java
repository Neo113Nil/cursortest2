package kotlinx.coroutines.flow;

import androidx.datastore.core.DataStoreImpl$data$1;
import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import xsna.b6l;
import xsna.iyx;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 implements ksr<Object> {
    public final /* synthetic */ FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 b;
    public final /* synthetic */ DataStoreImpl$data$1.b c;

    @b6l(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1$1, reason: invalid class name */
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
            return FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, DataStoreImpl$data$1.b bVar) {
        this.b = flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
        this.c = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super Object> lsrVar, spj<? super s3q0> spjVar) {
        AnonymousClass1 anonymousClass1;
        int i;
        FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1;
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
                    FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = this.b;
                    FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12 = new FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1(this.c, lsrVar);
                    try {
                        anonymousClass1.L$0 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                        anonymousClass1.label = 1;
                        if (flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1.collect(flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12, anonymousClass1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } catch (AbortFlowException e) {
                        e = e;
                        flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$12;
                        if (e.b == flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) {
                            throw e;
                        }
                        iyx.e(anonymousClass1.getContext());
                        return s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1 = (FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) anonymousClass1.L$0;
                    try {
                        a.a(obj);
                    } catch (AbortFlowException e2) {
                        e = e2;
                        if (e.b == flowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1) {
                        }
                    }
                }
                return s3q0.a;
            }
        }
        anonymousClass1 = new AnonymousClass1(spjVar);
        Object obj2 = anonymousClass1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = anonymousClass1.label;
        if (i != 0) {
        }
        return s3q0.a;
    }
}
