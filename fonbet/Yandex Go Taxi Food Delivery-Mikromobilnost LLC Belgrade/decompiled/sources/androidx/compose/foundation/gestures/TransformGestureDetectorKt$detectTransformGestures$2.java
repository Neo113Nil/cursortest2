package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.bms;
import defpackage.kx91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tvd0;
import defpackage.wls;
import defpackage.wu60;
import defpackage.zvd0;
import defpackage.zy11;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {60, 62}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class TransformGestureDetectorKt$detectTransformGestures$2 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ bms $onGesture;
    final /* synthetic */ boolean $panZoomLock;
    float F$0;
    float F$1;
    float F$2;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformGestureDetectorKt$detectTransformGestures$2(boolean z, bms bmsVar, Continuation continuation) {
        super(2, continuation);
        this.$panZoomLock = z;
        this.$onGesture = bmsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TransformGestureDetectorKt$detectTransformGestures$2 transformGestureDetectorKt$detectTransformGestures$2 = new TransformGestureDetectorKt$detectTransformGestures$2(this.$panZoomLock, this.$onGesture, continuation);
        transformGestureDetectorKt$detectTransformGestures$2.L$0 = obj;
        return transformGestureDetectorKt$detectTransformGestures$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransformGestureDetectorKt$detectTransformGestures$2) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0227, code lost:
    
        if (defpackage.wu60.c(r2, 0) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0095, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14, types: [int] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v45 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0095 -> B:6:0x0098). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        androidx.compose.ui.input.pointer.f fVar;
        float f;
        long j;
        float f2;
        float f3;
        int i;
        int i2;
        ?? r11;
        androidx.compose.ui.input.pointer.f fVar2;
        float f4;
        float f5;
        long j2;
        ?? r2;
        float f6;
        Object a;
        boolean z;
        boolean z2;
        boolean z3;
        CoroutineSingletons coroutineSingletons;
        float f7;
        androidx.compose.ui.input.pointer.f fVar3;
        boolean z4;
        boolean z5;
        boolean z6;
        long j3;
        boolean z7;
        boolean z8;
        float f8;
        float f9;
        float f10;
        float f11;
        boolean z9;
        float f12;
        float f13;
        boolean z10;
        long e;
        boolean z11;
        boolean z12;
        boolean z13;
        long j4;
        boolean z14;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        float f14 = 1.0f;
        float f15 = 0.0f;
        boolean z15 = true;
        boolean z16 = false;
        if (i3 == 0) {
            kotlin.b.b(obj);
            fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
            float c = fVar.g().c();
            this.L$0 = fVar;
            this.F$0 = 0.0f;
            this.F$1 = 1.0f;
            this.J$0 = 0L;
            this.I$0 = 0;
            this.F$2 = c;
            this.I$1 = 0;
            this.label = 1;
            if (z.b(fVar, null, this, 2) != coroutineSingletons2) {
                f = c;
                j = 0;
                f2 = 1.0f;
                f3 = 0.0f;
                i = 0;
                i2 = 0;
            }
            return coroutineSingletons2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ?? r22 = this.I$1;
            f = this.F$2;
            ?? r112 = this.I$0;
            j2 = this.J$0;
            f5 = this.F$1;
            f4 = this.F$0;
            fVar2 = (androidx.compose.ui.input.pointer.f) this.L$0;
            kotlin.b.b(obj);
            f6 = 1.0f;
            a = obj;
            z2 = r22;
            z = r112;
            tvd0 tvd0Var = (tvd0) a;
            float f16 = f15;
            ?? r8 = tvd0Var.a;
            int size = ((Collection) r8).size();
            ?? r6 = z16;
            while (true) {
                if (r6 >= size) {
                    z3 = z16;
                    break;
                }
                if (((zvd0) r8.get(r6)).j()) {
                    z3 = z15;
                    break;
                }
                r6++;
            }
            if (z3) {
                coroutineSingletons = coroutineSingletons2;
                boolean z17 = z2 ? 1 : 0;
                f7 = f;
                fVar3 = fVar2;
                z4 = z3;
                z5 = z15;
                z6 = z16;
                j3 = 0;
                z8 = z2;
                z7 = z;
            } else {
                float n = c.n(tvd0Var, z15);
                float n2 = c.n(tvd0Var, z16);
                float f17 = (n == f16 || n2 == f16) ? f6 : n / n2;
                Collection collection = (Collection) r8;
                int size2 = collection.size();
                coroutineSingletons = coroutineSingletons2;
                int i4 = 0;
                int i5 = 0;
                boolean z18 = z2;
                while (i5 < size2) {
                    boolean z19 = z18;
                    zvd0 zvd0Var = (zvd0) r8.get(i5);
                    float f18 = f;
                    i4 += (zvd0Var.h && zvd0Var.d) ? 1 : 0;
                    i5++;
                    z18 = z19;
                    f = f18;
                }
                boolean z20 = z18;
                f7 = f;
                if (i4 < 2) {
                    fVar3 = fVar2;
                    z4 = z3;
                    f9 = f5;
                    f10 = f4;
                    f11 = f16;
                    z5 = true;
                    f8 = 180.0f;
                } else {
                    long m = c.m(tvd0Var, true);
                    f8 = 180.0f;
                    long m2 = c.m(tvd0Var, false);
                    int size3 = collection.size();
                    fVar3 = fVar2;
                    float f19 = f16;
                    float f20 = f19;
                    int i6 = 0;
                    while (i6 < size3) {
                        int i7 = size3;
                        zvd0 zvd0Var2 = (zvd0) r8.get(i6);
                        int i8 = i6;
                        if (zvd0Var2.d && zvd0Var2.h) {
                            z9 = z3;
                            long j5 = zvd0Var2.c;
                            f12 = f5;
                            f13 = f4;
                            long e2 = wu60.e(zvd0Var2.g, m2);
                            long e3 = wu60.e(j5, m);
                            float f21 = c.f(e3) - c.f(e2);
                            float d = wu60.d(wu60.f(e3, e2)) / 2.0f;
                            if (f21 > 180.0f) {
                                f21 -= 360.0f;
                            } else if (f21 < -180.0f) {
                                f21 += 360.0f;
                            }
                            f20 = (f21 * d) + f20;
                            f19 += d;
                        } else {
                            z9 = z3;
                            f12 = f5;
                            f13 = f4;
                        }
                        i6 = i8 + 1;
                        size3 = i7;
                        z3 = z9;
                        f5 = f12;
                        f4 = f13;
                    }
                    z4 = z3;
                    f9 = f5;
                    f10 = f4;
                    f11 = f19 == f16 ? f16 : f20 / f19;
                    z5 = true;
                }
                long m3 = c.m(tvd0Var, z5);
                if (wu60.c(m3, 9205357640488583168L)) {
                    e = 0;
                    z10 = false;
                } else {
                    z10 = false;
                    e = wu60.e(m3, c.m(tvd0Var, false));
                }
                if (z) {
                    z11 = z20;
                    f5 = f9;
                    f4 = f10;
                    z12 = z;
                } else {
                    f5 = f9 * f17;
                    f4 = f10 + f11;
                    j2 = wu60.f(j2, e);
                    float n3 = c.n(tvd0Var, z10);
                    float abs = Math.abs(f6 - f5) * n3;
                    float abs2 = Math.abs(((3.1415927f * f4) * n3) / f8);
                    float d2 = wu60.d(j2);
                    if (abs > f7 || abs2 > f7 || d2 > f7) {
                        z11 = (!this.$panZoomLock || abs2 >= f7) ? false : z5;
                        z12 = z5;
                    } else {
                        z11 = z20;
                        z12 = z;
                    }
                }
                if (z12) {
                    long m4 = c.m(tvd0Var, false);
                    float f22 = z11 ? f16 : f11;
                    if (f22 == f16 && f17 == f6) {
                        boolean z21 = z12;
                        j4 = j2;
                        z13 = z21;
                        z14 = z21;
                    } else {
                        z14 = z12;
                        j4 = j2;
                    }
                    this.$onGesture.invoke(new wu60(m4), new wu60(e), new Float(f17), new Float(f22));
                    z13 = z14;
                    int size4 = collection.size();
                    for (int i9 = 0; i9 < size4; i9++) {
                        zvd0 zvd0Var3 = (zvd0) r8.get(i9);
                        if (!wu60.c(kx91.g(zvd0Var3, false), 0L)) {
                            zvd0Var3.a();
                        }
                    }
                } else {
                    z13 = z12;
                    j4 = j2;
                }
                z6 = false;
                z8 = z11;
                j3 = 0;
                j2 = j4;
                z7 = z13;
            }
            if (!z4) {
                int size5 = ((Collection) r8).size();
                for (?? r4 = z6; r4 < size5; r4++) {
                    if (((zvd0) r8.get(r4)).d) {
                        z15 = z5;
                        z16 = z6;
                        f14 = f6;
                        f15 = f16;
                        coroutineSingletons2 = coroutineSingletons;
                        f = f7;
                        fVar2 = fVar3;
                        r2 = z8;
                        r11 = z7;
                        this.L$0 = fVar2;
                        this.F$0 = f4;
                        this.F$1 = f5;
                        this.J$0 = j2;
                        this.I$0 = r11;
                        this.F$2 = f;
                        this.I$1 = r2;
                        f6 = f14;
                        this.label = 2;
                        a = fVar2.a(PointerEventPass.Main, this);
                        z2 = r2;
                        z = r11;
                    }
                }
            }
            return zy11.a;
        }
        int i10 = this.I$1;
        f = this.F$2;
        i2 = this.I$0;
        j = this.J$0;
        f2 = this.F$1;
        f3 = this.F$0;
        fVar = (androidx.compose.ui.input.pointer.f) this.L$0;
        kotlin.b.b(obj);
        i = i10;
        long j6 = j;
        r11 = i2;
        fVar2 = fVar;
        f4 = f3;
        f5 = f2;
        j2 = j6;
        r2 = i;
        this.L$0 = fVar2;
        this.F$0 = f4;
        this.F$1 = f5;
        this.J$0 = j2;
        this.I$0 = r11;
        this.F$2 = f;
        this.I$1 = r2;
        f6 = f14;
        this.label = 2;
        a = fVar2.a(PointerEventPass.Main, this);
        z2 = r2;
        z = r11;
    }
}
