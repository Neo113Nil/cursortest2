package xsna;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.q630;

/* compiled from: DetectReorder.kt */
/* loaded from: classes17.dex */
public final class e5m {

    /* compiled from: DetectReorder.kt */
    public static final class a implements PointerInputEventHandler {
        public final /* synthetic */ gzs<s3q0> a;
        public final /* synthetic */ d0g0<?> b;

        /* compiled from: DetectReorder.kt */
        @b6l(c = "com.vk.core.compose.reorder.DetectReorderKt$detectReorderAfterLongPress$1$1", f = "DetectReorder.kt", l = {36, 39}, m = "invokeSuspend")
        /* renamed from: xsna.e5m$a$a, reason: collision with other inner class name */
        public static final class C2778a extends SuspendLambda implements wzs<dmb0, spj<? super s3q0>, Object> {
            final /* synthetic */ gzs<s3q0> $onStartDrag;
            final /* synthetic */ d0g0<?> $state;
            private /* synthetic */ Object L$0;
            Object L$1;
            int label;

            /* compiled from: DetectReorder.kt */
            @b6l(c = "com.vk.core.compose.reorder.DetectReorderKt$detectReorderAfterLongPress$1$1$down$1", f = "DetectReorder.kt", l = {37}, m = "invokeSuspend")
            /* renamed from: xsna.e5m$a$a$a, reason: collision with other inner class name */
            public static final class C2779a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super xlb0>, Object> {
                private /* synthetic */ Object L$0;
                int label;

                public C2779a() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                    C2779a c2779a = new C2779a(2, spjVar);
                    c2779a.L$0 = obj;
                    return c2779a;
                }

                @Override // xsna.wzs
                public final Object invoke(eu5 eu5Var, spj<? super xlb0> spjVar) {
                    return ((C2779a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    eu5 eu5Var = (eu5) this.L$0;
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
                    this.L$0 = null;
                    this.label = 1;
                    Object b = z2o0.b(eu5Var, null, this, 2);
                    return b == coroutineSingletons ? coroutineSingletons : b;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2778a(gzs<s3q0> gzsVar, d0g0<?> d0g0Var, spj<? super C2778a> spjVar) {
                super(2, spjVar);
                this.$onStartDrag = gzsVar;
                this.$state = d0g0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                C2778a c2778a = new C2778a(this.$onStartDrag, this.$state, spjVar);
                c2778a.L$0 = obj;
                return c2778a;
            }

            @Override // xsna.wzs
            public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
                return ((C2778a) create(dmb0Var, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
            
                if (r8 == r1) goto L15;
             */
            /* JADX WARN: Removed duplicated region for block: B:8:0x004e  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                xlb0 xlb0Var;
                dmb0 dmb0Var = (dmb0) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    C2779a c2779a = new C2779a(2, null);
                    this.L$0 = dmb0Var;
                    this.label = 1;
                    obj = dmb0Var.Z0(c2779a, this);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        xlb0Var = (xlb0) this.L$1;
                        kotlin.a.a(obj);
                        if (((xlb0) obj) != null) {
                            gzs<s3q0> gzsVar = this.$onStartDrag;
                            d0g0<?> d0g0Var = this.$state;
                            if (gzsVar != null) {
                                gzsVar.invoke();
                            }
                            d0g0Var.h.f(new cqk0(xlb0Var.a));
                        }
                        return s3q0.a;
                    }
                    kotlin.a.a(obj);
                }
                xlb0 xlb0Var2 = (xlb0) obj;
                this.L$0 = null;
                this.L$1 = xlb0Var2;
                this.label = 2;
                Object c = gcd0.c(dmb0Var, xlb0Var2, this);
                if (c != coroutineSingletons) {
                    xlb0Var = xlb0Var2;
                    obj = c;
                    if (((xlb0) obj) != null) {
                    }
                    return s3q0.a;
                }
                return coroutineSingletons;
            }
        }

        public a(gzs<s3q0> gzsVar, d0g0<?> d0g0Var) {
            this.a = gzsVar;
            this.b = d0g0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            Object d = d7s.d(dmb0Var, new C2778a(this.a, this.b, null), spjVar);
            return d == CoroutineSingletons.COROUTINE_SUSPENDED ? d : s3q0.a;
        }
    }

    public static final q630 a(q630 q630Var, d0g0<?> d0g0Var, gzs<s3q0> gzsVar) {
        return q630Var.g(skn0.b(q630.a.a, s3q0.a, new a(gzsVar, d0g0Var)));
    }
}
