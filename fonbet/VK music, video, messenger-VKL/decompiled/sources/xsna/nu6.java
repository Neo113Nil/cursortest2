package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: BasicTooltip.kt */
/* loaded from: classes11.dex */
public final class nu6 implements PointerInputEventHandler {
    public final /* synthetic */ h6p0 a;

    /* compiled from: BasicTooltip.kt */
    @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1", f = "BasicTooltip.kt", l = {203}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ h6p0 $state;
        final /* synthetic */ dmb0 $this_pointerInput;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: BasicTooltip.kt */
        @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1", f = "BasicTooltip.kt", l = {Sdk.SDKError.Reason.AD_NOT_LOADED_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 238}, m = "invokeSuspend")
        /* renamed from: xsna.nu6$a$a, reason: collision with other inner class name */
        public static final class C3416a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            final /* synthetic */ yvj $$this$coroutineScope;
            final /* synthetic */ h6p0 $state;
            long J$0;
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;

            /* compiled from: BasicTooltip.kt */
            @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$1", f = "BasicTooltip.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invokeSuspend")
            /* renamed from: xsna.nu6$a$a$a, reason: collision with other inner class name */
            public static final class C3417a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super xlb0>, Object> {
                final /* synthetic */ PointerEventPass $pass;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3417a(PointerEventPass pointerEventPass, spj<? super C3417a> spjVar) {
                    super(2, spjVar);
                    this.$pass = pointerEventPass;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    C3417a c3417a = new C3417a(this.$pass, spjVar);
                    c3417a.L$0 = obj;
                    return c3417a;
                }

                @Override // xsna.wzs
                public final Object invoke(eu5 eu5Var, spj<? super xlb0> spjVar) {
                    return ((C3417a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i != 0) {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return obj;
                    }
                    kotlin.a.a(obj);
                    eu5 eu5Var = (eu5) this.L$0;
                    PointerEventPass pointerEventPass = this.$pass;
                    this.label = 1;
                    Object j = z2o0.j(eu5Var, pointerEventPass, this);
                    return j == coroutineSingletons ? coroutineSingletons : j;
                }
            }

            /* compiled from: BasicTooltip.kt */
            @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3", f = "BasicTooltip.kt", l = {224, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE, Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE}, m = "invokeSuspend")
            /* renamed from: xsna.nu6$a$a$b */
            public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ xh50<Boolean> $isLongPressedFlow;
                final /* synthetic */ h6p0 $state;
                Object L$0;
                int label;

                /* compiled from: BasicTooltip.kt */
                @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$1$1$1$3$1", f = "BasicTooltip.kt", l = {}, m = "invokeSuspend")
                /* renamed from: xsna.nu6$a$a$b$a, reason: collision with other inner class name */
                public static final class C3418a extends SuspendLambda implements wzs<Boolean, spj<? super s3q0>, Object> {
                    final /* synthetic */ h6p0 $state;
                    /* synthetic */ boolean Z$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C3418a(h6p0 h6p0Var, spj<? super C3418a> spjVar) {
                        super(2, spjVar);
                        this.$state = h6p0Var;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                        C3418a c3418a = new C3418a(this.$state, spjVar);
                        c3418a.Z$0 = ((Boolean) obj).booleanValue();
                        return c3418a;
                    }

                    @Override // xsna.wzs
                    public final Object invoke(Boolean bool, spj<? super s3q0> spjVar) {
                        Boolean bool2 = bool;
                        bool2.booleanValue();
                        return ((C3418a) create(bool2, spjVar)).invokeSuspend(s3q0.a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        if (!this.Z$0) {
                            this.$state.dismiss();
                        }
                        return s3q0.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(xh50<Boolean> xh50Var, h6p0 h6p0Var, spj<? super b> spjVar) {
                    super(2, spjVar);
                    this.$isLongPressedFlow = xh50Var;
                    this.$state = h6p0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new b(this.$isLongPressedFlow, this.$state, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
                
                    if (xsna.rsr.k(r7, r1, r6) == r0) goto L30;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x003e, code lost:
                
                    if (r7.b(r1, r6) == r0) goto L30;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    Throwable th;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    try {
                    } catch (Throwable th2) {
                        if (!this.$state.isVisible()) {
                            throw th2;
                        }
                        xh50<Boolean> xh50Var = this.$isLongPressedFlow;
                        C3418a c3418a = new C3418a(this.$state, null);
                        this.L$0 = th2;
                        this.label = 3;
                        if (rsr.k(xh50Var, c3418a, this) != coroutineSingletons) {
                            th = th2;
                        }
                        return coroutineSingletons;
                    }
                    if (i == 0) {
                        kotlin.a.a(obj);
                        this.$isLongPressedFlow.e(Boolean.TRUE);
                        h6p0 h6p0Var = this.$state;
                        MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                        this.label = 1;
                    } else {
                        if (i != 1) {
                            if (i == 2) {
                                kotlin.a.a(obj);
                                return s3q0.a;
                            }
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th = (Throwable) this.L$0;
                            kotlin.a.a(obj);
                            throw th;
                        }
                        kotlin.a.a(obj);
                    }
                    if (this.$state.isVisible()) {
                        xh50<Boolean> xh50Var2 = this.$isLongPressedFlow;
                        C3418a c3418a2 = new C3418a(this.$state, null);
                        this.label = 2;
                    }
                    return s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3416a(yvj yvjVar, h6p0 h6p0Var, spj<? super C3416a> spjVar) {
                super(2, spjVar);
                this.$$this$coroutineScope = yvjVar;
                this.$state = h6p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3416a c3416a = new C3416a(this.$$this$coroutineScope, this.$state, spjVar);
                c3416a.L$0 = obj;
                return c3416a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C3416a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:11:0x00ca A[Catch: all -> 0x0019, TRY_LEAVE, TryCatch #4 {all -> 0x0019, blocks: (B:8:0x0014, B:9:0x00c6, B:11:0x00ca), top: B:7:0x0014 }] */
            /* JADX WARN: Removed duplicated region for block: B:31:0x00c5  */
            /* JADX WARN: Type inference failed for: r2v5, types: [xsna.xh50] */
            /* JADX WARN: Type inference failed for: r8v4, types: [xsna.xh50] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                utk0 a;
                PointerEventPass pointerEventPass;
                long j;
                eu5 eu5Var;
                utk0 utk0Var;
                xh50 xh50Var;
                xlb0 xlb0Var;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    eu5 eu5Var2 = (eu5) this.L$0;
                    a = vtk0.a(Boolean.FALSE);
                    long c = eu5Var2.getViewConfiguration().c();
                    pointerEventPass = PointerEventPass.Initial;
                    this.L$0 = eu5Var2;
                    this.L$1 = a;
                    this.L$2 = pointerEventPass;
                    this.J$0 = c;
                    this.label = 1;
                    Object b2 = z2o0.b(eu5Var2, pointerEventPass, this, 1);
                    if (b2 != coroutineSingletons) {
                        j = c;
                        eu5Var = eu5Var2;
                        obj = b2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xh50Var = (xh50) this.L$0;
                        try {
                            kotlin.a.a(obj);
                            xlb0Var = (xlb0) obj;
                            if (xlb0Var != null) {
                                xlb0Var.a();
                            }
                            xh50Var.e(Boolean.FALSE);
                            return s3q0.a;
                        } catch (Throwable th) {
                            th = th;
                            xh50Var.e(Boolean.FALSE);
                            throw th;
                        }
                    }
                    PointerEventPass pointerEventPass2 = (PointerEventPass) this.L$2;
                    ?? r2 = (xh50) this.L$1;
                    eu5Var = (eu5) this.L$0;
                    try {
                        kotlin.a.a(obj);
                        utk0Var = r2;
                        utk0Var.e(Boolean.FALSE);
                    } catch (PointerEventTimeoutCancellationException unused) {
                        pointerEventPass = pointerEventPass2;
                        a = r2;
                        myc0.h(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new b(a, this.$state, null), 1);
                        this.L$0 = a;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.label = 3;
                        obj = z2o0.j(eu5Var, pointerEventPass, this);
                        if (obj != coroutineSingletons) {
                        }
                        return coroutineSingletons;
                    } catch (Throwable th2) {
                        th = th2;
                        xh50Var = r2;
                        xh50Var.e(Boolean.FALSE);
                        throw th;
                    }
                    return s3q0.a;
                }
                long j2 = this.J$0;
                PointerEventPass pointerEventPass3 = (PointerEventPass) this.L$2;
                ?? r8 = (xh50) this.L$1;
                eu5 eu5Var3 = (eu5) this.L$0;
                kotlin.a.a(obj);
                pointerEventPass = pointerEventPass3;
                a = r8;
                j = j2;
                eu5Var = eu5Var3;
                long j3 = j;
                int i2 = ((xlb0) obj).i;
                if (i2 == 1 || i2 == 3) {
                    try {
                        try {
                            C3417a c3417a = new C3417a(pointerEventPass, null);
                            this.L$0 = eu5Var;
                            this.L$1 = a;
                            this.L$2 = pointerEventPass;
                            this.label = 2;
                            if (eu5Var.f0(j3, c3417a, this) != coroutineSingletons) {
                                utk0Var = a;
                                utk0Var.e(Boolean.FALSE);
                            }
                        } catch (PointerEventTimeoutCancellationException unused2) {
                            myc0.h(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new b(a, this.$state, null), 1);
                            this.L$0 = a;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 3;
                            obj = z2o0.j(eu5Var, pointerEventPass, this);
                            if (obj != coroutineSingletons) {
                                xh50Var = a;
                                xlb0Var = (xlb0) obj;
                                if (xlb0Var != null) {
                                }
                                xh50Var.e(Boolean.FALSE);
                                return s3q0.a;
                            }
                            return coroutineSingletons;
                        }
                        return coroutineSingletons;
                    } catch (Throwable th3) {
                        th = th3;
                        xh50Var = a;
                        xh50Var.e(Boolean.FALSE);
                        throw th;
                    }
                }
                return s3q0.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dmb0 dmb0Var, h6p0 h6p0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$this_pointerInput = dmb0Var;
            this.$state = h6p0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$this_pointerInput, this.$state, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                yvj yvjVar = (yvj) this.L$0;
                dmb0 dmb0Var = this.$this_pointerInput;
                C3416a c3416a = new C3416a(yvjVar, this.$state, null);
                this.label = 1;
                if (d7s.c(dmb0Var, c3416a, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    public nu6(h6p0 h6p0Var) {
        this.a = h6p0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(dmb0Var, this.a, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
