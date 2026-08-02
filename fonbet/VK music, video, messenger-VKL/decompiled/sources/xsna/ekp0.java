package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* compiled from: TransformGestureDetector.kt */
@b6l(c = "androidx.compose.foundation.gestures.TransformGestureDetectorKt$detectTransformGestures$2", f = "TransformGestureDetector.kt", l = {60, 62}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ekp0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ zzs<ov70, ov70, Float, Float, s3q0> $onGesture;
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
    /* JADX WARN: Multi-variable type inference failed */
    public ekp0(boolean z, zzs<? super ov70, ? super ov70, ? super Float, ? super Float, s3q0> zzsVar, spj<? super ekp0> spjVar) {
        super(2, spjVar);
        this.$panZoomLock = z;
        this.$onGesture = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ekp0 ekp0Var = new ekp0(this.$panZoomLock, this.$onGesture, spjVar);
        ekp0Var.L$0 = obj;
        return ekp0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((ekp0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0176, code lost:
    
        if (xsna.ov70.c(r1, 0) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0099, code lost:
    
        if (r5 != r1) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0099 -> B:6:0x009c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        float e;
        long j;
        float f;
        float f2;
        int i;
        int i2;
        float f3;
        eu5 eu5Var2;
        float f4;
        float f5;
        long j2;
        int i3;
        float f6;
        Object I1;
        boolean z;
        CoroutineSingletons coroutineSingletons;
        eu5 eu5Var3;
        float f7;
        long j3;
        boolean z2;
        long e2;
        int i4;
        int i5;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i6 = this.label;
        float f8 = 1.0f;
        float f9 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z3 = false;
        boolean z4 = true;
        if (i6 == 0) {
            kotlin.a.a(obj);
            eu5Var = (eu5) this.L$0;
            e = eu5Var.getViewConfiguration().e();
            this.L$0 = eu5Var;
            this.F$0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.F$1 = 1.0f;
            this.J$0 = 0L;
            this.I$0 = 0;
            this.F$2 = e;
            this.I$1 = 0;
            this.label = 1;
            if (z2o0.b(eu5Var, null, this, 2) != coroutineSingletons2) {
                j = 0;
                f = 1.0f;
                f2 = 0.0f;
                i = 0;
                i2 = 0;
            }
            return coroutineSingletons2;
        }
        if (i6 != 1) {
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            f3 = this.F$2;
            i3 = this.I$0;
            j2 = this.J$0;
            f5 = this.F$1;
            f4 = this.F$0;
            eu5Var2 = (eu5) this.L$0;
            kotlin.a.a(obj);
            f6 = 1.0f;
            I1 = obj;
            plb0 plb0Var = (plb0) I1;
            float f10 = f9;
            List<xlb0> list = plb0Var.a;
            int size = list.size();
            ?? r4 = z3;
            while (true) {
                if (r4 >= size) {
                    z = z3;
                    break;
                }
                if (list.get(r4).c()) {
                    z = z4;
                    break;
                }
                r4++;
            }
            if (z) {
                coroutineSingletons = coroutineSingletons2;
                eu5Var3 = eu5Var2;
                f7 = f3;
                j3 = 0;
            } else {
                float g = n34.g(plb0Var, z4);
                float g2 = n34.g(plb0Var, z3);
                float f11 = (g == f10 || g2 == f10) ? f6 : g / g2;
                float h = n34.h(plb0Var);
                coroutineSingletons = coroutineSingletons2;
                int i7 = i;
                long f12 = n34.f(plb0Var, z4, new wyn0(2));
                f7 = f3;
                if (ov70.c(f12, 9205357640488583168L)) {
                    e2 = 0;
                    z2 = false;
                } else {
                    z2 = false;
                    e2 = ov70.e(f12, n34.f(plb0Var, false, new wyn0(2)));
                }
                if (i3 == 0) {
                    f5 *= f11;
                    f4 += h;
                    j2 = ov70.f(j2, e2);
                    float g3 = n34.g(plb0Var, z2);
                    float abs = Math.abs(1 - f5) * g3;
                    float abs2 = Math.abs(((3.1415927f * f4) * g3) / 180.0f);
                    float d = ov70.d(j2);
                    if (abs > f7 || abs2 > f7 || d > f7) {
                        i4 = (!this.$panZoomLock || abs2 >= f7) ? 0 : 1;
                        i3 = 1;
                        if (i3 == 0) {
                            eu5Var3 = eu5Var2;
                            long f13 = n34.f(plb0Var, false, new wyn0(2));
                            float f14 = i4 != 0 ? f10 : h;
                            if (f14 == f10 && f11 == f6) {
                                i5 = i3;
                            } else {
                                i5 = i3;
                            }
                            this.$onGesture.invoke(new ov70(f13), new ov70(e2), new Float(f11), new Float(f14));
                            int size2 = list.size();
                            int i8 = 0;
                            while (i8 < size2) {
                                xlb0 xlb0Var = list.get(i8);
                                int i9 = i8;
                                if (!ov70.c(fdi.E(xlb0Var, false), 0L)) {
                                    xlb0Var.a();
                                }
                                i8 = i9 + 1;
                            }
                        } else {
                            eu5Var3 = eu5Var2;
                            i5 = i3;
                        }
                        j3 = 0;
                        i3 = i5;
                        i = i4;
                    }
                }
                i4 = i7;
                if (i3 == 0) {
                }
                j3 = 0;
                i3 = i5;
                i = i4;
            }
            if (!z) {
                int size3 = list.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    if (list.get(i10).d) {
                        f8 = f6;
                        f9 = f10;
                        coroutineSingletons2 = coroutineSingletons;
                        f3 = f7;
                        eu5Var2 = eu5Var3;
                        z3 = false;
                        z4 = true;
                        this.L$0 = eu5Var2;
                        this.F$0 = f4;
                        this.F$1 = f5;
                        this.J$0 = j2;
                        this.I$0 = i3;
                        this.F$2 = f3;
                        this.I$1 = i;
                        f6 = f8;
                        this.label = 2;
                        I1 = eu5Var2.I1(PointerEventPass.Main, this);
                    }
                }
            }
            return s3q0.a;
        }
        i = this.I$1;
        e = this.F$2;
        i2 = this.I$0;
        j = this.J$0;
        f = this.F$1;
        f2 = this.F$0;
        eu5Var = (eu5) this.L$0;
        kotlin.a.a(obj);
        int i11 = i2;
        f3 = e;
        eu5Var2 = eu5Var;
        f4 = f2;
        f5 = f;
        j2 = j;
        i3 = i11;
        this.L$0 = eu5Var2;
        this.F$0 = f4;
        this.F$1 = f5;
        this.J$0 = j2;
        this.I$0 = i3;
        this.F$2 = f3;
        this.I$1 = i;
        f6 = f8;
        this.label = 2;
        I1 = eu5Var2.I1(PointerEventPass.Main, this);
    }
}
