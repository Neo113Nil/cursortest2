package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Combine.kt */
/* loaded from: classes11.dex */
public final class t9g {

    /* compiled from: Combine.kt */
    @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {51, TokenParametersOuterClass$TokenParameters.APPSETID_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ gzs<Object[]> $arrayFactory;
        final /* synthetic */ ksr<Object>[] $flows;
        final /* synthetic */ lsr<Object> $this_combineInternal;
        final /* synthetic */ yzs<lsr<Object>, Object[], spj<? super s3q0>, Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* compiled from: Combine.kt */
        @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        /* renamed from: xsna.t9g$a$a, reason: collision with other inner class name */
        public static final class C3729a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ ksr<Object>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ qta<xtw<Object>> $resultChannel;
            int label;

            /* compiled from: Combine.kt */
            /* renamed from: xsna.t9g$a$a$a, reason: collision with other inner class name */
            public static final class C3730a<T> implements lsr {
                public final /* synthetic */ qta<xtw<Object>> b;
                public final /* synthetic */ int c;

                /* compiled from: Combine.kt */
                @b6l(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1", f = "Combine.kt", l = {29, 30}, m = "emit")
                /* renamed from: xsna.t9g$a$a$a$a, reason: collision with other inner class name */
                public static final class C3731a extends ContinuationImpl {
                    int label;
                    /* synthetic */ Object result;
                    final /* synthetic */ C3730a<T> this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C3731a(C3730a<? super T> c3730a, spj<? super C3731a> spjVar) {
                        super(spjVar);
                        this.this$0 = c3730a;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return this.this$0.emit(null, this);
                    }
                }

                public C3730a(qta<xtw<Object>> qtaVar, int i) {
                    this.b = qtaVar;
                    this.c = i;
                }

                /* JADX WARN: Code restructure failed: missing block: B:18:0x0051, code lost:
                
                    if (xsna.n5y0.a(r0) != r1) goto L22;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
                
                    return r1;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
                
                    if (r5.b.t(r7, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
                @Override // xsna.lsr
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(T t, spj<? super s3q0> spjVar) {
                    C3731a c3731a;
                    int i;
                    if (spjVar instanceof C3731a) {
                        c3731a = (C3731a) spjVar;
                        int i2 = c3731a.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            c3731a.label = i2 - Integer.MIN_VALUE;
                            Object obj = c3731a.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = c3731a.label;
                            if (i != 0) {
                                kotlin.a.a(obj);
                                xtw<Object> xtwVar = new xtw<>(this.c, t);
                                c3731a.label = 1;
                            } else {
                                if (i != 1) {
                                    if (i != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    kotlin.a.a(obj);
                                    return s3q0.a;
                                }
                                kotlin.a.a(obj);
                            }
                            c3731a.label = 2;
                        }
                    }
                    c3731a = new C3731a(this, spjVar);
                    Object obj2 = c3731a.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = c3731a.label;
                    if (i != 0) {
                    }
                    c3731a.label = 2;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3729a(ksr<Object>[] ksrVarArr, int i, AtomicInteger atomicInteger, qta<xtw<Object>> qtaVar, spj<? super C3729a> spjVar) {
                super(2, spjVar);
                this.$flows = ksrVarArr;
                this.$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = qtaVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3729a(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3729a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                AtomicInteger atomicInteger;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.a.a(obj);
                        ksr<Object>[] ksrVarArr = this.$flows;
                        int i2 = this.$i;
                        ksr<Object> ksrVar = ksrVarArr[i2];
                        C3730a c3730a = new C3730a(this.$resultChannel, i2);
                        this.label = 1;
                        if (ksrVar.collect(c3730a, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.$resultChannel.B(null);
                    }
                    return s3q0.a;
                } finally {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        this.$resultChannel.B(null);
                    }
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(spj spjVar, lsr lsrVar, gzs gzsVar, yzs yzsVar, ksr[] ksrVarArr) {
            super(2, spjVar);
            this.$flows = ksrVarArr;
            this.$arrayFactory = gzsVar;
            this.$transform = yzsVar;
            this.$this_combineInternal = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            ksr<Object>[] ksrVarArr = this.$flows;
            a aVar = new a(spjVar, this.$this_combineInternal, this.$arrayFactory, this.$transform, ksrVarArr);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x009f, code lost:
        
            if (r12 == r2) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00ec, code lost:
        
            if (r12.invoke(r13, r9, r19) == r2) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0108, code lost:
        
            if (r13.invoke(r14, r12, r19) == r2) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        
            if (r8 != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x010a, code lost:
        
            return r2;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00ad A[LOOP_START, PHI: r8 r12
          0x00ad: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:13:0x00a8, B:31:?] A[DONT_GENERATE, DONT_INLINE]
          0x00ad: PHI (r12v4 xsna.xtw) = (r12v3 xsna.xtw), (r12v10 xsna.xtw) binds: [B:13:0x00a8, B:31:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Type inference failed for: r3v6, types: [int] */
        /* JADX WARN: Type inference failed for: r3v8, types: [int] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ec -> B:10:0x008d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0108 -> B:10:0x008d). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            Object[] objArr;
            byte[] bArr;
            byte b;
            qta qtaVar;
            Object obj2;
            con0 con0Var = tyx.i;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                length = this.$flows.length;
                if (length == 0) {
                    return s3q0.a;
                }
                objArr = new Object[length];
                Arrays.fill(objArr, 0, length, con0Var);
                nm8 a = w0b.a(length, null, null, 6);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i2 = 0; i2 < length; i2++) {
                    myc0.h(yvjVar, null, null, new C3729a(this.$flows, i2, atomicInteger, a, null), 3);
                }
                bArr = new byte[length];
                b = 0;
                qtaVar = a;
            } else if (i == 1) {
                ?? r3 = this.I$1;
                length = this.I$0;
                byte[] bArr2 = (byte[]) this.L$2;
                qtaVar = (qta) this.L$1;
                Object[] objArr2 = (Object[]) this.L$0;
                kotlin.a.a(obj);
                obj2 = ((kbb) obj).a;
                b = r3;
                bArr = bArr2;
                objArr = objArr2;
                xtw xtwVar = (xtw) kbb.b(obj2);
                if (xtwVar != null) {
                    return s3q0.a;
                }
                while (true) {
                    int i3 = xtwVar.a;
                    Object obj3 = objArr[i3];
                    objArr[i3] = xtwVar.b;
                    if (obj3 == con0Var) {
                        length--;
                    }
                    if (bArr[i3] != b) {
                        bArr[i3] = b;
                        xtwVar = (xtw) kbb.b(qtaVar.l());
                        if (xtwVar != null) {
                        }
                    }
                    if (length == 0) {
                        Object[] invoke = this.$arrayFactory.invoke();
                        if (invoke == null) {
                            yzs<lsr<Object>, Object[], spj<? super s3q0>, Object> yzsVar = this.$transform;
                            lsr<Object> lsrVar = this.$this_combineInternal;
                            this.L$0 = objArr;
                            this.L$1 = qtaVar;
                            this.L$2 = bArr;
                            this.I$0 = length;
                            this.I$1 = b;
                            this.label = 2;
                        } else {
                            jw5.k(objArr, 0, invoke, 0, 14);
                            yzs<lsr<Object>, Object[], spj<? super s3q0>, Object> yzsVar2 = this.$transform;
                            lsr<Object> lsrVar2 = this.$this_combineInternal;
                            this.L$0 = objArr;
                            this.L$1 = qtaVar;
                            this.L$2 = bArr;
                            this.I$0 = length;
                            this.I$1 = b;
                            this.label = 3;
                        }
                        xtw xtwVar2 = (xtw) kbb.b(obj2);
                        if (xtwVar2 != null) {
                        }
                    }
                }
            } else {
                if (i != 2 && i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ?? r32 = this.I$1;
                length = this.I$0;
                byte[] bArr3 = (byte[]) this.L$2;
                qtaVar = (qta) this.L$1;
                Object[] objArr3 = (Object[]) this.L$0;
                kotlin.a.a(obj);
                b = r32;
                bArr = bArr3;
                objArr = objArr3;
            }
            b = (byte) (b + 1);
            this.L$0 = objArr;
            this.L$1 = qtaVar;
            this.L$2 = bArr;
            this.I$0 = length;
            this.I$1 = b;
            this.label = 1;
            obj2 = qtaVar.u(this);
        }
    }

    public static final Object a(spj spjVar, lsr lsrVar, gzs gzsVar, yzs yzsVar, ksr[] ksrVarArr) {
        a aVar = new a(null, lsrVar, gzsVar, yzsVar, ksrVarArr);
        osr osrVar = new osr(spjVar, spjVar.getContext());
        Object c = e2l.c(osrVar, true, osrVar, aVar);
        return c == CoroutineSingletons.COROUTINE_SUSPENDED ? c : s3q0.a;
    }
}
