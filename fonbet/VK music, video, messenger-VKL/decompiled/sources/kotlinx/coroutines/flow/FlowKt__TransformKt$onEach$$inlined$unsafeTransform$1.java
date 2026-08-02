package kotlinx.coroutines.flow;

import kotlin.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.ksr;
import xsna.lsr;
import xsna.s3q0;
import xsna.spj;
import xsna.wzs;

/* compiled from: SafeCollector.common.kt */
/* loaded from: classes11.dex */
public final class FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 implements ksr<Object> {
    public final /* synthetic */ ksr b;
    public final /* synthetic */ Object c;

    /* compiled from: Emitters.kt */
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2, reason: invalid class name */
    public static final class AnonymousClass2<T> implements lsr {
        public final /* synthetic */ lsr b;
        public final /* synthetic */ Object c;

        @b6l(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {50, 51}, m = "emit")
        /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(lsr lsrVar, wzs wzsVar) {
            this.b = lsrVar;
            this.c = wzsVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005d, code lost:
        
            if (r6.emit(r2, r0) != r1) goto L23;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, xsna.wzs] */
        @Override // xsna.lsr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, spj<? super s3q0> spjVar) {
            AnonymousClass1 anonymousClass1;
            int i;
            Object obj;
            lsr lsrVar;
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
                        anonymousClass1.L$0 = t;
                        lsr lsrVar2 = this.b;
                        anonymousClass1.L$1 = lsrVar2;
                        anonymousClass1.label = 1;
                        if (this.c.invoke(t, anonymousClass1) != coroutineSingletons) {
                            obj = t;
                            lsrVar = lsrVar2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        a.a(obj2);
                        return s3q0.a;
                    }
                    lsr lsrVar3 = (lsr) anonymousClass1.L$1;
                    obj = anonymousClass1.L$0;
                    a.a(obj2);
                    lsrVar = lsrVar3;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                }
            }
            anonymousClass1 = new AnonymousClass1(spjVar);
            Object obj22 = anonymousClass1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = anonymousClass1.label;
            if (i != 0) {
            }
            anonymousClass1.L$0 = null;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 2;
        }
    }

    public FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(ksr ksrVar, wzs wzsVar) {
        this.b = ksrVar;
        this.c = wzsVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, xsna.wzs] */
    @Override // xsna.ksr
    public final Object collect(lsr<? super Object> lsrVar, spj spjVar) {
        Object collect = this.b.collect(new AnonymousClass2(lsrVar, this.c), spjVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
    }
}
