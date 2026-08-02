package xsna;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: TimePicker.kt */
/* loaded from: classes11.dex */
public final class fvf extends ytl implements cmb0, nvi, ony {
    public qw1 r;
    public boolean s;
    public int t;
    public iq2<Float> u;
    public float v;
    public float w;
    public final wh50 x;
    public final tkn0 y;
    public final tkn0 z;

    /* compiled from: TimePicker.kt */
    public static final class a implements PointerInputEventHandler {

        /* compiled from: TimePicker.kt */
        @b6l(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1", f = "TimePicker.kt", l = {1532}, m = "invokeSuspend")
        /* renamed from: xsna.fvf$a$a, reason: collision with other inner class name */
        public static final class C2895a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            int label;
            final /* synthetic */ fvf this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2895a(fvf fvfVar, spj<? super C2895a> spjVar) {
                super(2, spjVar);
                this.this$0 = fvfVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2895a(this.this$0, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2895a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    fvf fvfVar = this.this$0;
                    if (fvfVar.s) {
                        fvfVar.r.d(1);
                    }
                    fvf fvfVar2 = this.this$0;
                    qw1 qw1Var = fvfVar2.r;
                    iq2<Float> iq2Var = fvfVar2.u;
                    this.label = 1;
                    Object b = qw1Var.g.b(MutatePriority.PreventUserInput, new ow1(qw1Var, qw1Var.h(qw1Var.a.a() == 0 ? qw1Var.d : qw1Var.e), iq2Var, null), this);
                    if (b != coroutineSingletons) {
                        b = s3q0.a;
                    }
                    if (b == coroutineSingletons) {
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

        /* compiled from: TimePicker.kt */
        @b6l(c = "androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1", f = "TimePicker.kt", l = {1539}, m = "invokeSuspend")
        public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ ov70 $dragAmount;
            int label;
            final /* synthetic */ fvf this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(fvf fvfVar, ov70 ov70Var, spj<? super b> spjVar) {
                super(2, spjVar);
                this.this$0 = fvfVar;
                this.$dragAmount = ov70Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new b(this.this$0, this.$dragAmount, spjVar);
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
                    fvf fvfVar = this.this$0;
                    fvfVar.v = Float.intBitsToFloat((int) (this.$dragAmount.a >> 32)) + fvfVar.v;
                    fvf fvfVar2 = this.this$0;
                    fvfVar2.w = Float.intBitsToFloat((int) (this.$dragAmount.a & 4294967295L)) + fvfVar2.w;
                    fvf fvfVar3 = this.this$0;
                    qw1 qw1Var = fvfVar3.r;
                    float f = fvfVar3.w - ((int) (((h9x) ((zak0) fvfVar3.x).getValue()).a & 4294967295L));
                    float f2 = this.this$0.v - ((int) (((h9x) ((zak0) r15.x).getValue()).a >> 32));
                    float f3 = kuo0.a;
                    float atan2 = ((float) Math.atan2(f, f2)) - 1.5707964f;
                    if (atan2 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        atan2 += 6.2831855f;
                    }
                    iq2<Float> iq2Var = this.this$0.u;
                    this.label = 1;
                    qw1Var.b.a = Boolean.FALSE;
                    Object b = qw1Var.g.b(MutatePriority.UserInput, new pw1(qw1Var, atan2, false, iq2Var, null), this);
                    if (b != coroutineSingletons) {
                        b = s3q0.a;
                    }
                    if (b == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                fvf fvfVar4 = this.this$0;
                kuo0.s(fvfVar4.r, fvfVar4.v, fvfVar4.w, fvf.l2(fvfVar4), ((h9x) ((zak0) this.this$0.x).getValue()).a);
                return s3q0.a;
            }
        }

        public a() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            fvf fvfVar = fvf.this;
            Object g = lgo.g(dmb0Var, null, new com.vk.movika.sdk.base.ui.t(fvfVar, 29), new qw6(fvfVar, 3), spjVar, 5);
            return g == CoroutineSingletons.COROUTINE_SUSPENDED ? g : s3q0.a;
        }
    }

    /* compiled from: TimePicker.kt */
    public static final class b implements PointerInputEventHandler {

        /* compiled from: TimePicker.kt */
        @b6l(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$1", f = "TimePicker.kt", l = {}, m = "invokeSuspend")
        public static final class a extends SuspendLambda implements yzs<j2d0, ov70, spj<? super s3q0>, Object> {
            /* synthetic */ long J$0;
            int label;
            final /* synthetic */ fvf this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(fvf fvfVar, spj<? super a> spjVar) {
                super(3, spjVar);
                this.this$0 = fvfVar;
            }

            @Override // xsna.yzs
            public final Object invoke(j2d0 j2d0Var, ov70 ov70Var, spj<? super s3q0> spjVar) {
                long j = ov70Var.a;
                a aVar = new a(this.this$0, spjVar);
                aVar.J$0 = j;
                return aVar.invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                long j = this.J$0;
                this.this$0.v = Float.intBitsToFloat((int) (j >> 32));
                this.this$0.w = Float.intBitsToFloat((int) (j & 4294967295L));
                return s3q0.a;
            }
        }

        /* compiled from: TimePicker.kt */
        @b6l(c = "androidx.compose.material3.ClockDialNode$pointerInputTapNode$1$2$1", f = "TimePicker.kt", l = {1509}, m = "invokeSuspend")
        /* renamed from: xsna.fvf$b$b, reason: collision with other inner class name */
        public static final class C2896b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ ov70 $it;
            int label;
            final /* synthetic */ fvf this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2896b(fvf fvfVar, ov70 ov70Var, spj<? super C2896b> spjVar) {
                super(2, spjVar);
                this.this$0 = fvfVar;
                this.$it = ov70Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C2896b(this.this$0, this.$it, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C2896b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    qw1 qw1Var = this.this$0.r;
                    float intBitsToFloat = Float.intBitsToFloat((int) (this.$it.a >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (this.$it.a & 4294967295L));
                    float l2 = fvf.l2(this.this$0);
                    fvf fvfVar = this.this$0;
                    boolean z = fvfVar.s;
                    long j = ((h9x) ((zak0) fvfVar.x).getValue()).a;
                    iq2<Float> iq2Var = this.this$0.u;
                    this.label = 1;
                    if (kuo0.p(qw1Var, intBitsToFloat, intBitsToFloat2, l2, z, j, iq2Var, this) == coroutineSingletons) {
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

        public b() {
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(dmb0 dmb0Var, spj<? super s3q0> spjVar) {
            fvf fvfVar = fvf.this;
            Object e = z2o0.e(dmb0Var, null, new a(fvfVar, null), new wl0(fvfVar, 22), spjVar, 3);
            return e == CoroutineSingletons.COROUTINE_SUSPENDED ? e : s3q0.a;
        }
    }

    public fvf() {
        throw null;
    }

    public fvf(qw1 qw1Var, boolean z, int i, iq2 iq2Var) {
        this.r = qw1Var;
        this.s = z;
        this.t = i;
        this.u = iq2Var;
        this.x = androidx.compose.runtime.k.b(new h9x(0L));
        xkn0 a2 = skn0.a(new b());
        i2(a2);
        this.y = a2;
        xkn0 a3 = skn0.a(new a());
        i2(a3);
        this.z = a3;
    }

    public static final float l2(fvf fvfVar) {
        fvfVar.getClass();
        return (itl.f(fvfVar).z.I0(kuo0.f) * r0.r0(fvfVar.r.i())) / r0.r0(vuo0.b);
    }

    @Override // xsna.cmb0
    public final void H(plb0 plb0Var, PointerEventPass pointerEventPass, long j) {
        this.y.H(plb0Var, pointerEventPass, j);
        this.z.H(plb0Var, pointerEventPass, j);
    }

    @Override // xsna.ony, xsna.lp10
    public final void e(long j) {
        ((zak0) this.x).setValue(new h9x(pli.n(j)));
        qw1 qw1Var = this.r;
        float j1 = itl.f(this).z.j1((int) (j >> 32));
        ((zak0) qw1Var.c).setValue(new pco(j1));
    }

    @Override // xsna.cmb0
    public final void h1() {
        this.y.h1();
        this.z.h1();
    }
}
