package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: AnchoredDraggable.kt */
@b6l(c = "androidx.compose.foundation.gestures.AnchoredDraggableKt$animateToWithDecay$2", f = "AnchoredDraggable.kt", l = {1425, 1443, 1467}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class tz1 extends SuspendLambda implements zzs<fz1, vgo<Object>, Object, spj<? super s3q0>, Object> {
    final /* synthetic */ l7l<Float> $decayAnimationSpec;
    final /* synthetic */ Ref$FloatRef $remainingVelocity;
    final /* synthetic */ iq2<Float> $snapAnimationSpec;
    final /* synthetic */ f12<Object> $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz1(f12<Object> f12Var, float f, iq2<Float> iq2Var, Ref$FloatRef ref$FloatRef, l7l<Float> l7lVar, spj<? super tz1> spjVar) {
        super(4, spjVar);
        this.$this_animateToWithDecay = f12Var;
        this.$velocity = f;
        this.$snapAnimationSpec = iq2Var;
        this.$remainingVelocity = ref$FloatRef;
        this.$decayAnimationSpec = l7lVar;
    }

    @Override // xsna.zzs
    public final Object invoke(fz1 fz1Var, vgo<Object> vgoVar, Object obj, spj<? super s3q0> spjVar) {
        tz1 tz1Var = new tz1(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, spjVar);
        tz1Var.L$0 = fz1Var;
        tz1Var.L$1 = vgoVar;
        tz1Var.L$2 = obj;
        return tz1Var.invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d9, code lost:
    
        if (xsna.lz1.b(r6, r7, r8, r9, r10, r11, r12) == r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tz1 tz1Var;
        tz1 tz1Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            final fz1 fz1Var = (fz1) this.L$0;
            vgo vgoVar = (vgo) this.L$1;
            Object obj2 = this.L$2;
            final float c = vgoVar.c(obj2);
            if (!Float.isNaN(c)) {
                final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                float floatValue = Float.isNaN(((vak0) this.$this_animateToWithDecay.j).getFloatValue()) ? 0.0f : ((vak0) this.$this_animateToWithDecay.j).getFloatValue();
                ref$FloatRef.element = floatValue;
                if (floatValue != c) {
                    float f = this.$velocity;
                    if ((c - floatValue) * f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        f12<Object> f12Var = this.$this_animateToWithDecay;
                        iq2<Float> iq2Var = this.$snapAnimationSpec;
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 1;
                        tz1Var = this;
                    } else {
                        float f2 = fto0.f(this.$decayAnimationSpec, floatValue, f);
                        float f3 = this.$velocity;
                        if (f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? f2 > c : f2 < c) {
                            f12<Object> f12Var2 = this.$this_animateToWithDecay;
                            iq2<Float> iq2Var2 = this.$snapAnimationSpec;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 3;
                            tz1Var2 = this;
                            if (lz1.b(f12Var2, f3, fz1Var, vgoVar, obj2, iq2Var2, this) == coroutineSingletons) {
                            }
                            tz1Var2.$remainingVelocity.element = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        } else {
                            kq2 a = s1v.a(ref$FloatRef.element, f3, 28);
                            l7l<Float> l7lVar = this.$decayAnimationSpec;
                            final Ref$FloatRef ref$FloatRef2 = this.$remainingVelocity;
                            izs izsVar = new izs() { // from class: xsna.sz1
                                @Override // xsna.izs
                                public final Object invoke(Object obj3) {
                                    gq2 gq2Var = (gq2) obj3;
                                    zak0 zak0Var = (zak0) gq2Var.e;
                                    float floatValue2 = ((Number) zak0Var.getValue()).floatValue();
                                    float f4 = c;
                                    Ref$FloatRef ref$FloatRef3 = ref$FloatRef;
                                    fz1 fz1Var2 = fz1Var;
                                    Ref$FloatRef ref$FloatRef4 = ref$FloatRef2;
                                    if ((floatValue2 >= f4 || ref$FloatRef3.element <= f4) && (((Number) zak0Var.getValue()).floatValue() <= f4 || ref$FloatRef3.element >= f4)) {
                                        fz1Var2.a(((Number) zak0Var.getValue()).floatValue(), ((Number) gq2Var.b()).floatValue());
                                        ref$FloatRef4.element = ((Number) gq2Var.b()).floatValue();
                                        ref$FloatRef3.element = ((Number) zak0Var.getValue()).floatValue();
                                    } else {
                                        float floatValue3 = ((Number) zak0Var.getValue()).floatValue();
                                        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        if (f4 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                                            f4 = 0.0f;
                                        } else if (f4 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? floatValue3 >= f4 : floatValue3 <= f4) {
                                            f4 = floatValue3;
                                        }
                                        fz1Var2.a(f4, ((Number) gq2Var.b()).floatValue());
                                        if (!Float.isNaN(((Number) gq2Var.b()).floatValue())) {
                                            f5 = ((Number) gq2Var.b()).floatValue();
                                        }
                                        ref$FloatRef4.element = f5;
                                        ref$FloatRef3.element = f4;
                                        gq2Var.a();
                                    }
                                    return s3q0.a;
                                }
                            };
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 2;
                            if (nkn0.d(a, l7lVar, false, izsVar, this) == coroutineSingletons) {
                            }
                        }
                    }
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            kotlin.a.a(obj);
            tz1Var = this;
            tz1Var.$remainingVelocity.element = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        } else if (i == 2) {
            kotlin.a.a(obj);
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            tz1Var2 = this;
            tz1Var2.$remainingVelocity.element = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        return s3q0.a;
    }
}
