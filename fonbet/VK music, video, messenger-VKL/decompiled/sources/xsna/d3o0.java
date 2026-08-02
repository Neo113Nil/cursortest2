package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: TapGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", l = {274}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class d3o0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ yzs<j2d0, ov70, spj<? super s3q0>, Object> $onPress;
    final /* synthetic */ izs<ov70, s3q0> $onTap;
    final /* synthetic */ n2d0 $pressScope;
    final /* synthetic */ dmb0 $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* compiled from: TapGestureDetector.kt */
    @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", l = {277, 283}, m = "invokeSuspend", v = 1)
    public static final class a extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
        final /* synthetic */ yvj $$this$coroutineScope;
        final /* synthetic */ yzs<j2d0, ov70, spj<? super s3q0>, Object> $onPress;
        final /* synthetic */ izs<ov70, s3q0> $onTap;
        final /* synthetic */ n2d0 $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* compiled from: TapGestureDetector.kt */
        @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", l = {280}, m = "invokeSuspend", v = 1)
        /* renamed from: xsna.d3o0$a$a, reason: collision with other inner class name */
        public static final class C2702a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ xlb0 $down;
            final /* synthetic */ yzs<j2d0, ov70, spj<? super s3q0>, Object> $onPress;
            final /* synthetic */ n2d0 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C2702a(yzs<? super j2d0, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar, n2d0 n2d0Var, xlb0 xlb0Var, spj<? super C2702a> spjVar) {
                super(2, spjVar);
                this.$onPress = yzsVar;
                this.$pressScope = n2d0Var;
                this.$down = xlb0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2702a(this.$onPress, this.$pressScope, this.$down, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2702a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    yzs<j2d0, ov70, spj<? super s3q0>, Object> yzsVar = this.$onPress;
                    n2d0 n2d0Var = this.$pressScope;
                    ov70 ov70Var = new ov70(this.$down.c);
                    this.label = 1;
                    if (yzsVar.invoke(n2d0Var, ov70Var, this) == coroutineSingletons) {
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

        /* compiled from: TapGestureDetector.kt */
        @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ n2d0 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(n2d0 n2d0Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.$pressScope = n2d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.$pressScope, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$pressScope.c();
                return s3q0.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
        public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ n2d0 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(n2d0 n2d0Var, spj<? super c> spjVar) {
                super(2, spjVar);
                this.$pressScope = n2d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new c(this.$pressScope, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                this.$pressScope.e();
                return s3q0.a;
            }
        }

        /* compiled from: TapGestureDetector.kt */
        @b6l(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1", f = "TapGestureDetector.kt", l = {275}, m = "invokeSuspend", v = 1)
        public static final class d extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ n2d0 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(n2d0 n2d0Var, spj<? super d> spjVar) {
                super(2, spjVar);
                this.$pressScope = n2d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new d(this.$pressScope, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((d) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    n2d0 n2d0Var = this.$pressScope;
                    this.label = 1;
                    if (n2d0Var.k(this) == coroutineSingletons) {
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
        /* JADX WARN: Multi-variable type inference failed */
        public a(yvj yvjVar, yzs<? super j2d0, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar, izs<? super ov70, s3q0> izsVar, n2d0 n2d0Var, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$$this$coroutineScope = yvjVar;
            this.$onPress = yzsVar;
            this.$onTap = izsVar;
            this.$pressScope = n2d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
            return ((a) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            eyx h;
            eu5 eu5Var;
            eyx eyxVar;
            xlb0 xlb0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                eu5 eu5Var2 = (eu5) this.L$0;
                h = myc0.h(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new d(this.$pressScope, null), 1);
                this.L$0 = eu5Var2;
                this.L$1 = h;
                this.label = 1;
                Object b2 = z2o0.b(eu5Var2, null, this, 3);
                if (b2 != coroutineSingletons) {
                    eu5Var = eu5Var2;
                    obj = b2;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eyxVar = (eyx) this.L$0;
                kotlin.a.a(obj);
                xlb0Var = (xlb0) obj;
                if (xlb0Var != null) {
                    z2o0.g(this.$$this$coroutineScope, eyxVar, new b(this.$pressScope, null));
                } else {
                    xlb0Var.a();
                    z2o0.g(this.$$this$coroutineScope, eyxVar, new c(this.$pressScope, null));
                    izs<ov70, s3q0> izsVar = this.$onTap;
                    if (izsVar != null) {
                        izsVar.invoke(new ov70(xlb0Var.c));
                    }
                }
                return s3q0.a;
            }
            h = (eyx) this.L$1;
            eu5Var = (eu5) this.L$0;
            kotlin.a.a(obj);
            xlb0 xlb0Var2 = (xlb0) obj;
            xlb0Var2.a();
            yzs<j2d0, ov70, spj<? super s3q0>, Object> yzsVar = this.$onPress;
            if (yzsVar != z2o0.a) {
                z2o0.g(this.$$this$coroutineScope, h, new C2702a(yzsVar, this.$pressScope, xlb0Var2, null));
            }
            this.L$0 = h;
            this.L$1 = null;
            this.label = 2;
            obj = z2o0.j(eu5Var, PointerEventPass.Main, this);
            if (obj != coroutineSingletons) {
                eyxVar = h;
                xlb0Var = (xlb0) obj;
                if (xlb0Var != null) {
                }
                return s3q0.a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d3o0(dmb0 dmb0Var, yzs<? super j2d0, ? super ov70, ? super spj<? super s3q0>, ? extends Object> yzsVar, izs<? super ov70, s3q0> izsVar, n2d0 n2d0Var, spj<? super d3o0> spjVar) {
        super(2, spjVar);
        this.$this_detectTapAndPress = dmb0Var;
        this.$onPress = yzsVar;
        this.$onTap = izsVar;
        this.$pressScope = n2d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        d3o0 d3o0Var = new d3o0(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, spjVar);
        d3o0Var.L$0 = obj;
        return d3o0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((d3o0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            yvj yvjVar = (yvj) this.L$0;
            dmb0 dmb0Var = this.$this_detectTapAndPress;
            a aVar = new a(yvjVar, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (d7s.c(dmb0Var, aVar, this) == coroutineSingletons) {
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
