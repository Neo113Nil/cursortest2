package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: BasicTooltip.kt */
/* loaded from: classes11.dex */
public final class ou6 implements PointerInputEventHandler {
    public final /* synthetic */ h6p0 a;

    /* compiled from: BasicTooltip.kt */
    @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1", f = "BasicTooltip.kt", l = {249}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ h6p0 $state;
        final /* synthetic */ dmb0 $this_pointerInput;
        private /* synthetic */ Object L$0;
        int label;

        /* compiled from: BasicTooltip.kt */
        @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1", f = "BasicTooltip.kt", l = {253}, m = "invokeSuspend")
        /* renamed from: xsna.ou6$a$a, reason: collision with other inner class name */
        public static final class C3472a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
            final /* synthetic */ yvj $$this$coroutineScope;
            final /* synthetic */ h6p0 $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* compiled from: BasicTooltip.kt */
            @b6l(c = "androidx.compose.material3.internal.BasicTooltipKt$handleGestures$2$1$1$1", f = "BasicTooltip.kt", l = {258}, m = "invokeSuspend")
            /* renamed from: xsna.ou6$a$a$a, reason: collision with other inner class name */
            public static final class C3473a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
                final /* synthetic */ h6p0 $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C3473a(h6p0 h6p0Var, spj<? super C3473a> spjVar) {
                    super(2, spjVar);
                    this.$state = h6p0Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    return new C3473a(this.$state, spjVar);
                }

                @Override // xsna.wzs
                public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                    return ((C3473a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        kotlin.a.a(obj);
                        h6p0 h6p0Var = this.$state;
                        MutatePriority mutatePriority = MutatePriority.UserInput;
                        this.label = 1;
                        if (h6p0Var.b(mutatePriority, this) == coroutineSingletons) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3472a(yvj yvjVar, h6p0 h6p0Var, spj<? super C3472a> spjVar) {
                super(2, spjVar);
                this.$$this$coroutineScope = yvjVar;
                this.$state = h6p0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C3472a c3472a = new C3472a(this.$$this$coroutineScope, this.$state, spjVar);
                c3472a.L$0 = obj;
                return c3472a;
            }

            @Override // xsna.wzs
            public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
                return ((C3472a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0033 A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0031 -> B:5:0x0034). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    r7 = this;
                    kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                    int r1 = r7.label
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L15
                    java.lang.Object r1 = r7.L$1
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                    java.lang.Object r3 = r7.L$0
                    xsna.eu5 r3 = (xsna.eu5) r3
                    kotlin.a.a(r8)
                    goto L34
                L15:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r0)
                    throw r8
                L1d:
                    kotlin.a.a(r8)
                    java.lang.Object r8 = r7.L$0
                    xsna.eu5 r8 = (xsna.eu5) r8
                    androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                    r3 = r8
                L27:
                    r7.L$0 = r3
                    r7.L$1 = r1
                    r7.label = r2
                    java.lang.Object r8 = r3.I1(r1, r7)
                    if (r8 != r0) goto L34
                    return r0
                L34:
                    xsna.plb0 r8 = (xsna.plb0) r8
                    java.util.List<xsna.xlb0> r4 = r8.a
                    r5 = 0
                    java.lang.Object r4 = r4.get(r5)
                    xsna.xlb0 r4 = (xsna.xlb0) r4
                    int r4 = r4.i
                    r5 = 2
                    if (r4 != r5) goto L27
                    int r8 = r8.f
                    r4 = 4
                    if (r8 != r4) goto L58
                    xsna.yvj r8 = r7.$$this$coroutineScope
                    xsna.ou6$a$a$a r4 = new xsna.ou6$a$a$a
                    xsna.h6p0 r5 = r7.$state
                    r6 = 0
                    r4.<init>(r5, r6)
                    r5 = 3
                    xsna.myc0.h(r8, r6, r6, r4, r5)
                    goto L27
                L58:
                    r4 = 5
                    if (r8 != r4) goto L27
                    xsna.h6p0 r8 = r7.$state
                    r8.dismiss()
                    goto L27
                */
                throw new UnsupportedOperationException("Method not decompiled: xsna.ou6.a.C3472a.invokeSuspend(java.lang.Object):java.lang.Object");
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
                C3472a c3472a = new C3472a(yvjVar, this.$state, null);
                this.label = 1;
                if (dmb0Var.Z0(c3472a, this) == coroutineSingletons) {
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

    public ou6(h6p0 h6p0Var) {
        this.a = h6p0Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
        Object d = zvj.d(new a(dmb0Var, this.a, null), spjVar);
        return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
    }
}
