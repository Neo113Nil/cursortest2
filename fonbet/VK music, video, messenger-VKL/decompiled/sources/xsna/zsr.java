package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.kbb;

/* compiled from: Delay.kt */
@b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {413}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class zsr extends SuspendLambda implements yzs<yvj, lsr<Object>, spj<? super s3q0>, Object> {
    final /* synthetic */ ksr<Object> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<kbb<Object>, spj<? super Boolean>, Object> {
        final /* synthetic */ lsr<Object> $downStream;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lsr<Object> lsrVar, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$downStream = lsrVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$downStream, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(kbb<Object> kbbVar, spj<? super Boolean> spjVar) {
            return ((a) create(new kbb(kbbVar.a), spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0038  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                obj2 = ((kbb) this.L$0).a;
                lsr<Object> lsrVar = this.$downStream;
                if (!(obj2 instanceof kbb.b)) {
                    this.L$0 = obj2;
                    this.label = 1;
                    if (lsrVar.emit(obj2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj3 = obj2;
                }
                if (obj2 instanceof kbb.a) {
                    return Boolean.TRUE;
                }
                Throwable a = kbb.a(obj2);
                if (a == null) {
                    return Boolean.FALSE;
                }
                throw a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj3 = this.L$0;
            kotlin.a.a(obj);
            obj2 = obj3;
            if (obj2 instanceof kbb.a) {
            }
        }
    }

    /* compiled from: Delay.kt */
    @b6l(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements izs<spj<?>, Object> {
        final /* synthetic */ long $timeout;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, spj<? super b> spjVar) {
            super(1, spjVar);
            this.$timeout = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(spj<?> spjVar) {
            return new b(this.$timeout, spjVar);
        }

        @Override // xsna.izs
        public final Object invoke(spj<?> spjVar) {
            ((b) create(spjVar)).invokeSuspend(s3q0.a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            throw new TimeoutCancellationException("Timed out waiting for " + ((Object) zno.m(this.$timeout)), null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zsr(long j, ksr<Object> ksrVar, spj<? super zsr> spjVar) {
        super(3, spjVar);
        this.$timeout = j;
        this.$this_timeoutInternal = ksrVar;
    }

    @Override // xsna.yzs
    public final Object invoke(yvj yvjVar, lsr<Object> lsrVar, spj<? super s3q0> spjVar) {
        zsr zsrVar = new zsr(this.$timeout, this.$this_timeoutInternal, spjVar);
        zsrVar.L$0 = yvjVar;
        zsrVar.L$1 = lsrVar;
        return zsrVar.invokeSuspend(s3q0.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00a6 -> B:5:0x00a9). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L26
            if (r2 != r4) goto L1e
            long r6 = r0.J$0
            java.lang.Object r2 = r0.L$1
            xsna.b9f0 r2 = (xsna.b9f0) r2
            java.lang.Object r8 = r0.L$0
            xsna.lsr r8 = (xsna.lsr) r8
            kotlin.a.a(r20)
            r9 = r20
            goto La9
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L26:
            kotlin.a.a(r20)
            java.lang.Object r2 = r0.L$0
            xsna.yvj r2 = (xsna.yvj) r2
            java.lang.Object r6 = r0.L$1
            xsna.lsr r6 = (xsna.lsr) r6
            long r7 = r0.$timeout
            r9 = 0
            int r7 = xsna.zno.c(r7, r9)
            if (r7 <= 0) goto Lb4
            xsna.ksr<java.lang.Object> r7 = r0.$this_timeoutInternal
            xsna.ksr r9 = xsna.rsr.h(r7, r3)
            boolean r7 = r9 instanceof xsna.sya
            if (r7 == 0) goto L49
            r7 = r9
            xsna.sya r7 = (xsna.sya) r7
            goto L4a
        L49:
            r7 = r5
        L4a:
            if (r7 != 0) goto L57
            xsna.wya r8 = new xsna.wya
            r12 = 0
            r13 = 14
            r10 = 0
            r11 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r7 = r8
        L57:
            xsna.b9f0 r2 = r7.i(r2)
            long r7 = r0.$timeout
            r17 = r7
            r8 = r6
            r6 = r17
        L62:
            xsna.v8i0 r10 = new xsna.v8i0
            kotlin.coroutines.d r9 = r0.getContext()
            r10.<init>(r9)
            xsna.a7i0 r9 = r2.g()
            xsna.zsr$a r11 = new xsna.zsr$a
            r11.<init>(r8, r5)
            r10.j(r9, r11)
            xsna.zsr$b r15 = new xsna.zsr$b
            r15.<init>(r6, r5)
            long r11 = xsna.qsl.e(r6)
            xsna.ic80 r9 = new xsna.ic80
            r9.<init>(r11)
            xsna.hc80 r12 = xsna.hc80.b
            r11 = 3
            xsna.ttp0.d(r11, r12)
            r11 = r9
            xsna.v8i0$a r9 = new xsna.v8i0$a
            xsna.con0 r14 = xsna.y8i0.e
            r16 = 0
            xsna.y8i0$a r13 = xsna.y8i0.a.b
            r9.<init>(r11, r12, r13, r14, r15, r16)
            r10.k(r9, r3)
            r0.L$0 = r8
            r0.L$1 = r2
            r0.J$0 = r6
            r0.label = r4
            java.lang.Object r9 = r10.g(r0)
            if (r9 != r1) goto La9
            return r1
        La9:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L62
            xsna.s3q0 r1 = xsna.s3q0.a
            return r1
        Lb4:
            kotlinx.coroutines.TimeoutCancellationException r1 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r2 = "Timed out immediately"
            r1.<init>(r2, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xsna.zsr.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
