package androidx.compose.foundation.gestures.snapping;

import defpackage.iip0;
import defpackage.jj2;
import defpackage.kj2;
import defpackage.lxv;
import defpackage.mt71;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.uh6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lvi2;", "", "Loj2;", "<anonymous>", "(Ltse;)Lvi2;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL, 150}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class SnapFlingBehavior$fling$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ tls $onRemainingScrollOffsetUpdate;
    final /* synthetic */ iip0 $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(a aVar, float f, tls tlsVar, iip0 iip0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = tlsVar;
        this.$this_fling = iip0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SnapFlingBehavior$fling$result$1(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapFlingBehavior$fling$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r15 == r0) goto L22;
     */
    /* JADX WARN: Type inference failed for: r12v0, types: [h1t0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final Ref$FloatRef ref$FloatRef;
        SnapFlingBehavior$fling$result$1 snapFlingBehavior$fling$result$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            float b = this.this$0.a.b(this.$initialVelocity, mt71.k(this.this$0.b, 0.0f, this.$initialVelocity));
            if (Float.isNaN(b)) {
                lxv.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            ref$FloatRef = new Ref$FloatRef();
            float signum = Math.signum(this.$initialVelocity) * Math.abs(b);
            ref$FloatRef.element = signum;
            this.$onRemainingScrollOffsetUpdate.invoke(new Float(signum));
            a aVar = this.this$0;
            iip0 iip0Var = this.$this_fling;
            float f = ref$FloatRef.element;
            float f2 = this.$initialVelocity;
            final tls tlsVar = this.$onRemainingScrollOffsetUpdate;
            final int i3 = 0;
            ?? r12 = new tls() { // from class: h1t0
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i4 = i3;
                    zy11 zy11Var = zy11.a;
                    tls tlsVar2 = tlsVar;
                    Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                    float floatValue = ((Float) obj2).floatValue();
                    switch (i4) {
                        case 0:
                            float f3 = ref$FloatRef2.element - floatValue;
                            ref$FloatRef2.element = f3;
                            tlsVar2.invoke(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = ref$FloatRef2.element - floatValue;
                            ref$FloatRef2.element = f4;
                            tlsVar2.invoke(Float.valueOf(f4));
                            break;
                    }
                    return zy11Var;
                }
            };
            this.L$0 = ref$FloatRef;
            this.label = 1;
            obj = a.b(aVar, iip0Var, f, f2, r12, this);
            snapFlingBehavior$fling$result$1 = this;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ref$FloatRef = (Ref$FloatRef) this.L$0;
            kotlin.b.b(obj);
            snapFlingBehavior$fling$result$1 = this;
        }
        kj2 kj2Var = (kj2) obj;
        float a = snapFlingBehavior$fling$result$1.this$0.a.a(((Number) kj2Var.e()).floatValue());
        if (Float.isNaN(a)) {
            lxv.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        ref$FloatRef.element = a;
        iip0 iip0Var2 = snapFlingBehavior$fling$result$1.$this_fling;
        kj2 l = uh6.l(kj2Var, 0.0f, 0.0f, 30);
        jj2 jj2Var = snapFlingBehavior$fling$result$1.this$0.c;
        final tls tlsVar2 = snapFlingBehavior$fling$result$1.$onRemainingScrollOffsetUpdate;
        tls tlsVar3 = new tls() { // from class: h1t0
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                int i4 = i2;
                zy11 zy11Var = zy11.a;
                tls tlsVar22 = tlsVar2;
                Ref$FloatRef ref$FloatRef2 = ref$FloatRef;
                float floatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        float f3 = ref$FloatRef2.element - floatValue;
                        ref$FloatRef2.element = f3;
                        tlsVar22.invoke(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = ref$FloatRef2.element - floatValue;
                        ref$FloatRef2.element = f4;
                        tlsVar22.invoke(Float.valueOf(f4));
                        break;
                }
                return zy11Var;
            }
        };
        snapFlingBehavior$fling$result$1.L$0 = null;
        snapFlingBehavior$fling$result$1.label = 2;
        Object b2 = b.b(iip0Var2, a, a, l, jj2Var, tlsVar3, snapFlingBehavior$fling$result$1);
        return b2 == coroutineSingletons ? coroutineSingletons : b2;
    }
}
