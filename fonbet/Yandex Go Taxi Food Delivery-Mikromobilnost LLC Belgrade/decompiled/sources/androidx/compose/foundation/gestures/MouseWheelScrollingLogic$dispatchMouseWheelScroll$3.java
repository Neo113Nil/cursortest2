package androidx.compose.foundation.gestures;

import defpackage.clp0;
import defpackage.hb30;
import defpackage.kj2;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.ssl.cl_88;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lclp0;", "Lzy11;", "<anonymous>", "(Lclp0;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollingLogic.kt", l = {228, 241, cl_88.n}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 extends SuspendLambda implements wls {
    final /* synthetic */ Ref$ObjectRef<kj2> $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ Ref$ObjectRef<hb30> $targetScrollDelta;
    final /* synthetic */ Ref$FloatRef $targetValue;
    final /* synthetic */ y $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ q this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(Ref$FloatRef ref$FloatRef, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, float f, q qVar, float f2, y yVar, Continuation continuation) {
        super(2, continuation);
        this.$targetValue = ref$FloatRef;
        this.$animationState = ref$ObjectRef;
        this.$targetScrollDelta = ref$ObjectRef2;
        this.$threshold = f;
        this.this$0 = qVar;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = new MouseWheelScrollingLogic$dispatchMouseWheelScroll$3(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, continuation);
        mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = obj;
        return mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$dispatchMouseWheelScroll$3) create((clp0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0099, code lost:
    
        r3 = java.lang.Math.signum(r3) * r7.$threshold;
        r7.this$0.e(r0, r3);
        r4 = r7.$animationState;
        r5 = r4.element;
        r4.element = defpackage.uh6.l(r5, ((java.lang.Number) r5.b.getValue()).floatValue() + r3, 0.0f, 30);
        r3 = defpackage.m810.b(java.lang.Math.abs(r7.$targetValue.element - ((java.lang.Number) r7.$animationState.element.b.getValue()).floatValue()) / r7.$speed);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e5, code lost:
    
        if (r3 <= 100) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e7, code lost:
    
        r3 = 100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e8, code lost:
    
        r14 = r7.this$0;
        r4 = r7.$animationState.element;
        r5 = r7.$targetValue;
        r13 = r5.element;
        r18 = r1;
        r17 = new defpackage.u50(r14, r7.$targetScrollDelta, r5, r7.$this_dispatchMouseWheelScroll, r18, 13);
        r12 = r18;
        r7.L$0 = r0;
        r7.L$1 = r12;
        r7.L$2 = null;
        r7.I$0 = r3;
        r7.label = 2;
        r14.getClass();
        r14 = new kotlin.jvm.internal.Ref$FloatRef();
        r14.element = ((java.lang.Number) r4.b.getValue()).floatValue();
        r16 = r0;
        r1 = r3;
        r13 = r16;
        r5 = r7;
        r0 = androidx.compose.animation.core.e.e(r4, new java.lang.Float(r13), defpackage.sb2.K(r3, 0, defpackage.ubn.d, 2), true, new defpackage.vqy(r14, r14, r16, r17, 6), r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0153, code lost:
    
        if (r0 != kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0155, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0156, code lost:
    
        if (r6 != r8) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x015a, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Type inference failed for: r3v9, types: [T, kj2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0184 -> B:7:0x0186). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0192 -> B:8:0x018f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        clp0 clp0Var;
        Ref$BooleanRef ref$BooleanRef;
        Ref$BooleanRef ref$BooleanRef2;
        Object d;
        clp0 clp0Var2;
        MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label;
        if (i == 0) {
            kotlin.b.b(obj);
            clp0Var = (clp0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            ref$BooleanRef = new Ref$BooleanRef();
            ref$BooleanRef.element = true;
        } else if (i == 1) {
            Ref$BooleanRef ref$BooleanRef3 = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            ref$BooleanRef = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            clp0 clp0Var3 = (clp0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            kotlin.b.b(obj);
            ref$BooleanRef3.element = ((Boolean) obj).booleanValue();
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            clp0Var = clp0Var3;
        } else if (i == 2) {
            int i2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.I$0;
            Ref$BooleanRef ref$BooleanRef4 = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            clp0 clp0Var4 = (clp0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            kotlin.b.b(obj);
            ref$BooleanRef2 = ref$BooleanRef4;
            clp0 clp0Var5 = clp0Var4;
            MouseWheelScrollingLogic$dispatchMouseWheelScroll$3 mouseWheelScrollingLogic$dispatchMouseWheelScroll$32 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3;
            if (!ref$BooleanRef2.element) {
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.L$0 = clp0Var5;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.L$1 = ref$BooleanRef2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.L$2 = ref$BooleanRef2;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.label = 3;
                mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$32;
                d = q.d(mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.this$0, mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.$targetScrollDelta, mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.$targetValue, mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.$this_dispatchMouseWheelScroll, mouseWheelScrollingLogic$dispatchMouseWheelScroll$32.$animationState, 50 - i2, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
                if (d != coroutineSingletons) {
                    ref$BooleanRef = ref$BooleanRef2;
                    clp0Var2 = clp0Var5;
                    ref$BooleanRef2.element = ((Boolean) d).booleanValue();
                    clp0Var = clp0Var2;
                }
                return coroutineSingletons;
            }
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$32;
            ref$BooleanRef = ref$BooleanRef2;
            clp0Var = clp0Var5;
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Ref$BooleanRef ref$BooleanRef5 = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2;
            ref$BooleanRef = (Ref$BooleanRef) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1;
            clp0Var2 = (clp0) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0;
            kotlin.b.b(obj);
            ref$BooleanRef2 = ref$BooleanRef5;
            d = obj;
            ref$BooleanRef2.element = ((Boolean) d).booleanValue();
            clp0Var = clp0Var2;
        }
        while (true) {
            boolean z = ref$BooleanRef.element;
            Object obj2 = zy11.a;
            if (!z) {
                return obj2;
            }
            ref$BooleanRef.element = false;
            float floatValue = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue.element - ((Number) mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState.element.b.getValue()).floatValue();
            if (!mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta.element.c && Math.abs(floatValue) >= mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$threshold) {
                break;
            }
            clp0 clp0Var6 = clp0Var;
            Ref$BooleanRef ref$BooleanRef6 = ref$BooleanRef;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0.e(clp0Var6, floatValue);
            q qVar = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.this$0;
            Ref$ObjectRef<hb30> ref$ObjectRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetScrollDelta;
            Ref$FloatRef ref$FloatRef = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$targetValue;
            y yVar = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$this_dispatchMouseWheelScroll;
            Ref$ObjectRef<kj2> ref$ObjectRef2 = mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.$animationState;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$0 = clp0Var6;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$1 = ref$BooleanRef6;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.L$2 = ref$BooleanRef6;
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3.label = 1;
            Object d2 = q.d(qVar, ref$ObjectRef, ref$FloatRef, yVar, ref$ObjectRef2, 50L, mouseWheelScrollingLogic$dispatchMouseWheelScroll$3);
            if (d2 == coroutineSingletons) {
                break;
            }
            ref$BooleanRef = ref$BooleanRef6;
            ref$BooleanRef6.element = ((Boolean) d2).booleanValue();
            mouseWheelScrollingLogic$dispatchMouseWheelScroll$3 = this;
            clp0Var = clp0Var6;
        }
    }
}
