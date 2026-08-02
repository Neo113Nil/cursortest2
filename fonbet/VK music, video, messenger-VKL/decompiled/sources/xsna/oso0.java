package xsna;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.o2d0;
import xsna.q630;
import xsna.tra0;

/* compiled from: Switch.kt */
/* loaded from: classes11.dex */
public final class oso0 extends q630.c implements noy {
    public wax p;
    public boolean q;
    public phr<Float> r;
    public boolean s;
    public if2<Float, sq2> t;
    public if2<Float, sq2> u;
    public float v;
    public float w;

    /* compiled from: Switch.kt */
    @b6l(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {272}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $size;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$size = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return oso0.this.new a(this.$size, spjVar);
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
                if2<Float, sq2> if2Var = oso0.this.u;
                if (if2Var != null) {
                    Float f = new Float(this.$size);
                    oso0 oso0Var = oso0.this;
                    iq2 iq2Var = oso0Var.s ? hnn0.f : oso0Var.r;
                    this.label = 1;
                    obj = if2.c(if2Var, f, iq2Var, null, this, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: Switch.kt */
    @b6l(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {278}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ float $offset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$offset = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return oso0.this.new b(this.$offset, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                if2<Float, sq2> if2Var = oso0.this.t;
                if (if2Var != null) {
                    Float f = new Float(this.$offset);
                    oso0 oso0Var = oso0.this;
                    iq2 iq2Var = oso0Var.s ? hnn0.f : oso0Var.r;
                    this.label = 1;
                    obj = if2.c(if2Var, f, iq2Var, null, this, 12);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return s3q0.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return s3q0.a;
        }
    }

    /* compiled from: Switch.kt */
    @b6l(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {Sdk.SDKError.Reason.INVALID_CSB_DATA_VALUE}, m = "invokeSuspend")
    public static final class c extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        int label;

        /* compiled from: Switch.kt */
        public static final class a<T> implements lsr {
            public final /* synthetic */ Ref$IntRef b;
            public final /* synthetic */ oso0 c;

            public a(Ref$IntRef ref$IntRef, oso0 oso0Var) {
                this.b = ref$IntRef;
                this.c = oso0Var;
            }

            @Override // xsna.lsr
            public final Object emit(Object obj, spj spjVar) {
                vax vaxVar = (vax) obj;
                boolean z = vaxVar instanceof o2d0.b;
                Ref$IntRef ref$IntRef = this.b;
                if (z) {
                    ref$IntRef.element++;
                } else if (vaxVar instanceof o2d0.c) {
                    ref$IntRef.element--;
                } else if (vaxVar instanceof o2d0.a) {
                    ref$IntRef.element--;
                }
                boolean z2 = ref$IntRef.element > 0;
                oso0 oso0Var = this.c;
                if (oso0Var.s != z2) {
                    oso0Var.s = z2;
                    itl.f(oso0Var).Q();
                }
                return s3q0.a;
            }
        }

        public c(spj<? super c> spjVar) {
            super(2, spjVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return oso0.this.new c(spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((c) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                Ref$IntRef ref$IntRef = new Ref$IntRef();
                caj0 b = oso0.this.p.b();
                a aVar = new a(ref$IntRef, oso0.this);
                this.label = 1;
                b.getClass();
                if (caj0.k(b, aVar, this) == coroutineSingletons) {
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

    public oso0() {
        throw null;
    }

    @Override // xsna.q630.c
    public final boolean X1() {
        return false;
    }

    @Override // xsna.q630.c
    public final void a2() {
        myc0.h(W1(), null, null, new c(null), 3);
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        float I0 = ep10Var.I0(this.s ? vnn0.f : ((zo10Var.Z(o6j.i(j)) != 0 && zo10Var.l0(o6j.h(j)) != 0) || this.q) ? hnn0.a : hnn0.b);
        if2<Float, sq2> if2Var = this.u;
        int floatValue = (int) (if2Var != null ? if2Var.d().floatValue() : I0);
        if (!((floatValue >= 0) & (floatValue >= 0))) {
            wzw.a("width and height must be >= 0");
        }
        final tra0 N = zo10Var.N(s6j.h(floatValue, floatValue, floatValue, floatValue));
        final float I02 = ep10Var.I0((hnn0.d - ep10Var.k1(I0)) / 2.0f);
        float I03 = ep10Var.I0((hnn0.c - hnn0.a) - hnn0.e);
        boolean z = this.s;
        if (z && this.q) {
            I02 = I03 - ep10Var.I0(vnn0.k);
        } else if (z && !this.q) {
            I02 = ep10Var.I0(vnn0.k);
        } else if (this.q) {
            I02 = I03;
        }
        if2<Float, sq2> if2Var2 = this.u;
        if (!epx.d(if2Var2 != null ? (Float) ((zak0) if2Var2.e).getValue() : null, I0)) {
            myc0.h(W1(), null, null, new a(I0, null), 3);
        }
        if2<Float, sq2> if2Var3 = this.t;
        if (!epx.d(if2Var3 != null ? (Float) ((zak0) if2Var3.e).getValue() : null, I02)) {
            myc0.h(W1(), null, null, new b(I02, null), 3);
        }
        if (Float.isNaN(this.w) && Float.isNaN(this.v)) {
            this.w = I0;
            this.v = I02;
        }
        return ep10Var.Q(floatValue, floatValue, jgp.b, new izs() { // from class: xsna.nso0
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                if2<Float, sq2> if2Var4 = this.t;
                tra0.a.x(aVar, tra0.this, (int) (if2Var4 != null ? if2Var4.d().floatValue() : I02), 0);
                return s3q0.a;
            }
        });
    }
}
