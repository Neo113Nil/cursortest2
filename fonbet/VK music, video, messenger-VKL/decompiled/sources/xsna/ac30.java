package xsna;

import com.unity3d.services.UnityAdsConstants;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.xb30;

/* compiled from: MouseWheelScrollingLogic.kt */
@b6l(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollingLogic.kt", l = {228, 241, 261}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ac30 extends SuspendLambda implements wzs<n160, spj<? super s3q0>, Object> {
    final /* synthetic */ Ref$ObjectRef<kq2<Float, sq2>> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ Ref$ObjectRef<xb30.a> $targetScrollDelta;
    final /* synthetic */ Ref$FloatRef $targetValue;
    final /* synthetic */ zhh0 $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ xb30 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac30(Ref$FloatRef ref$FloatRef, Ref$ObjectRef<kq2<Float, sq2>> ref$ObjectRef, Ref$ObjectRef<xb30.a> ref$ObjectRef2, float f, xb30 xb30Var, float f2, zhh0 zhh0Var, spj<? super ac30> spjVar) {
        super(2, spjVar);
        this.$targetValue = ref$FloatRef;
        this.$animationState = ref$ObjectRef;
        this.$targetScrollDelta = ref$ObjectRef2;
        this.$threshold = f;
        this.this$0 = xb30Var;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = zhh0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ac30 ac30Var = new ac30(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, spjVar);
        ac30Var.L$0 = obj;
        return ac30Var;
    }

    @Override // xsna.wzs
    public final Object invoke(n160 n160Var, spj<? super s3q0> spjVar) {
        return ((ac30) create(n160Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Type inference failed for: r1v12, types: [T, xsna.kq2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0185 -> B:7:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0192 -> B:9:0x0063). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n160 n160Var;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        n160 n160Var2;
        int i;
        n160 n160Var3;
        ac30 ac30Var = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ac30Var.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            n160Var = (n160) ac30Var.L$0;
            Ref$BooleanRef ref$BooleanRef3 = new Ref$BooleanRef();
            ref$BooleanRef3.element = true;
            ref$BooleanRef = ref$BooleanRef3;
            if (!ref$BooleanRef.element) {
            }
        } else if (i2 == 1) {
            Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) ac30Var.L$2;
            Ref$BooleanRef ref$BooleanRef5 = (Ref$BooleanRef) ac30Var.L$1;
            n160Var3 = (n160) ac30Var.L$0;
            kotlin.a.a(obj);
            ref$BooleanRef = ref$BooleanRef5;
            ref$BooleanRef4.element = ((Boolean) obj).booleanValue();
            ac30Var = this;
            n160Var = n160Var3;
            if (!ref$BooleanRef.element) {
            }
        } else if (i2 == 2) {
            i = ac30Var.I$0;
            Ref$BooleanRef ref$BooleanRef6 = (Ref$BooleanRef) ac30Var.L$1;
            n160 n160Var4 = (n160) ac30Var.L$0;
            kotlin.a.a(obj);
            ref$BooleanRef2 = ref$BooleanRef6;
            n160Var2 = n160Var4;
            if (ref$BooleanRef2.element) {
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Ref$BooleanRef ref$BooleanRef7 = (Ref$BooleanRef) ac30Var.L$2;
            Ref$BooleanRef ref$BooleanRef8 = (Ref$BooleanRef) ac30Var.L$1;
            n160Var3 = (n160) ac30Var.L$0;
            kotlin.a.a(obj);
            ref$BooleanRef2 = ref$BooleanRef7;
            ref$BooleanRef = ref$BooleanRef8;
            Object d = obj;
            ref$BooleanRef2.element = ((Boolean) d).booleanValue();
            n160Var = n160Var3;
            if (!ref$BooleanRef.element) {
                ref$BooleanRef.element = false;
                float floatValue = ac30Var.$targetValue.element - ((Number) ((zak0) ac30Var.$animationState.element.c).getValue()).floatValue();
                if (ac30Var.$targetScrollDelta.element.c || Math.abs(floatValue) < ac30Var.$threshold) {
                    n160 n160Var5 = n160Var;
                    ac30Var.this$0.e(n160Var5, floatValue);
                    xb30 xb30Var = ac30Var.this$0;
                    Ref$ObjectRef<xb30.a> ref$ObjectRef = ac30Var.$targetScrollDelta;
                    Ref$FloatRef ref$FloatRef = ac30Var.$targetValue;
                    zhh0 zhh0Var = ac30Var.$this_dispatchMouseWheelScroll;
                    Ref$ObjectRef<kq2<Float, sq2>> ref$ObjectRef2 = ac30Var.$animationState;
                    ac30Var.L$0 = n160Var5;
                    ac30Var.L$1 = ref$BooleanRef;
                    ac30Var.L$2 = ref$BooleanRef;
                    ac30Var.label = 1;
                    Ref$BooleanRef ref$BooleanRef9 = ref$BooleanRef;
                    Object d2 = xb30.d(xb30Var, ref$ObjectRef, ref$FloatRef, zhh0Var, ref$ObjectRef2, 50L, ac30Var);
                    if (d2 != coroutineSingletons) {
                        n160Var3 = n160Var5;
                        ref$BooleanRef = ref$BooleanRef9;
                        ref$BooleanRef9.element = ((Boolean) d2).booleanValue();
                        ac30Var = this;
                        n160Var = n160Var3;
                        if (!ref$BooleanRef.element) {
                            return s3q0.a;
                        }
                    }
                } else {
                    float signum = Math.signum(floatValue) * ac30Var.$threshold;
                    ac30Var.this$0.e(n160Var, signum);
                    Ref$ObjectRef<kq2<Float, sq2>> ref$ObjectRef3 = ac30Var.$animationState;
                    kq2<Float, sq2> kq2Var = ref$ObjectRef3.element;
                    ref$ObjectRef3.element = s1v.c(kq2Var, ((Number) ((zak0) kq2Var.c).getValue()).floatValue() + signum, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 30);
                    int b = an10.b(Math.abs(ac30Var.$targetValue.element - ((Number) ((zak0) ac30Var.$animationState.element.c).getValue()).floatValue()) / ac30Var.$speed);
                    int i3 = b > 100 ? 100 : b;
                    xb30 xb30Var2 = ac30Var.this$0;
                    kq2<Float, sq2> kq2Var2 = ac30Var.$animationState.element;
                    Ref$FloatRef ref$FloatRef2 = ac30Var.$targetValue;
                    float f = ref$FloatRef2.element;
                    zb30 zb30Var = new zb30(xb30Var2, ac30Var.$targetScrollDelta, ref$FloatRef2, ac30Var.$this_dispatchMouseWheelScroll, ref$BooleanRef);
                    ac30Var.L$0 = n160Var;
                    ac30Var.L$1 = ref$BooleanRef;
                    ac30Var.L$2 = null;
                    ac30Var.I$0 = i3;
                    ac30Var.label = 2;
                    xb30Var2.getClass();
                    Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                    ref$FloatRef3.element = ((Number) ((zak0) kq2Var2.c).getValue()).floatValue();
                    int i4 = i3;
                    n160 n160Var6 = n160Var;
                    n160Var2 = n160Var6;
                    Object e = nkn0.e(kq2Var2, new Float(f), jq2.d(i3, 0, luo.d, 2), true, new wb30(0, ref$FloatRef3, xb30Var2, n160Var6, zb30Var), ac30Var);
                    if (e != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        e = s3q0.a;
                    }
                    if (e != coroutineSingletons) {
                        ref$BooleanRef2 = ref$BooleanRef;
                        i = i4;
                        if (ref$BooleanRef2.element) {
                            ac30Var.L$0 = n160Var2;
                            ac30Var.L$1 = ref$BooleanRef2;
                            ac30Var.L$2 = ref$BooleanRef2;
                            ac30Var.label = 3;
                            d = xb30.d(ac30Var.this$0, ac30Var.$targetScrollDelta, ac30Var.$targetValue, ac30Var.$this_dispatchMouseWheelScroll, ac30Var.$animationState, 50 - i, ac30Var);
                            if (d != coroutineSingletons) {
                                n160Var3 = n160Var2;
                                ref$BooleanRef = ref$BooleanRef2;
                                ref$BooleanRef2.element = ((Boolean) d).booleanValue();
                                n160Var = n160Var3;
                                if (!ref$BooleanRef.element) {
                                }
                            }
                        } else {
                            n160Var = n160Var2;
                            ref$BooleanRef = ref$BooleanRef2;
                            if (!ref$BooleanRef.element) {
                            }
                        }
                    }
                }
                return coroutineSingletons;
            }
        }
    }
}
