package xsna;

import android.graphics.DashPathEffect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.er9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jtk implements izs {
    public final /* synthetic */ r5j0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ yk8 g;

    public /* synthetic */ jtk(r5j0 r5j0Var, float f, float f2, float f3, float f4, yk8 yk8Var) {
        this.b = r5j0Var;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = yk8Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2, types: [T, xsna.frm0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [T, androidx.compose.ui.graphics.c] */
    /* JADX WARN: Type inference failed for: r6v17, types: [T, xsna.frm0] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        T t;
        kw8 kw8Var = (kw8) obj;
        long d = kw8Var.b.d();
        LayoutDirection layoutDirection = kw8Var.b.getLayoutDirection();
        r5j0 r5j0Var = this.b;
        androidx.compose.ui.graphics.c a = r5j0Var.a(d, layoutDirection, kw8Var);
        float f = this.c;
        float density = pco.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 1.0f : f * kw8Var.getDensity();
        final Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef3 = new Ref$ObjectRef();
        final Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        Ref$ObjectRef ref$ObjectRef5 = new Ref$ObjectRef();
        if (density <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || mxj0.c(kw8Var.b.d()) <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            ref$ObjectRef = ref$ObjectRef5;
        } else {
            boolean z = a instanceof c.b;
            float f2 = this.d;
            float f3 = this.e;
            float f4 = this.f;
            if (z) {
                ref$ObjectRef = ref$ObjectRef5;
                ref$ObjectRef3.element = new frm0(density, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, new db2(new DashPathEffect(new float[]{kw8Var.getDensity() * f2, kw8Var.getDensity() * f3}, kw8Var.getDensity() * f4)), 14);
            } else {
                ref$ObjectRef = ref$ObjectRef5;
                float f5 = density * 1.2f;
                ref$FloatRef.element = density - (f5 / 2);
                ref$ObjectRef2.element = r5j0Var.a((Float.floatToRawIntBits(Float.intBitsToFloat((int) (kw8Var.b.d() & 4294967295L)) - (ref$FloatRef.element * r6)) & 4294967295L) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (kw8Var.b.d() >> 32)) - (ref$FloatRef.element * r6)) << 32), kw8Var.b.getLayoutDirection(), kw8Var);
                ref$ObjectRef3.element = new frm0(f5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, new db2(new DashPathEffect(new float[]{kw8Var.getDensity() * f2, kw8Var.getDensity() * f3}, kw8Var.getDensity() * f4)), 14);
                T t2 = 0;
                if (a instanceof c.C0013c) {
                    androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
                    a2.q(((c.C0013c) a).a, Path.Direction.CounterClockwise);
                    t = a2;
                } else {
                    t = a instanceof c.a ? ((c.a) a).a : 0;
                }
                ref$ObjectRef4.element = t;
                androidx.compose.ui.graphics.c cVar = (androidx.compose.ui.graphics.c) ref$ObjectRef2.element;
                float f6 = ref$FloatRef.element;
                if (cVar instanceof c.C0013c) {
                    c.C0013c c0013c = (c.C0013c) cVar;
                    if (!ne7.z(c0013c.a)) {
                        androidx.compose.ui.graphics.a a3 = androidx.compose.ui.graphics.b.a();
                        a3.q(c0013c.a, Path.Direction.CounterClockwise);
                        a3.e((Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
                        t2 = a3;
                        ref$ObjectRef.element = t2;
                    }
                }
                if (cVar instanceof c.a) {
                    androidx.compose.ui.graphics.a a4 = androidx.compose.ui.graphics.b.a();
                    a4.w(((c.a) cVar).a, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
                    t2 = a4;
                }
                ref$ObjectRef.element = t2;
            }
        }
        final yk8 yk8Var = this.g;
        final Ref$ObjectRef ref$ObjectRef6 = ref$ObjectRef;
        return kw8Var.e(new izs() { // from class: xsna.ktk
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.izs
            public final Object invoke(Object obj2) {
                long j;
                long j2;
                ggj ggjVar = (ggj) obj2;
                ggjVar.s1();
                frm0 frm0Var = (frm0) Ref$ObjectRef.this.element;
                androidx.compose.ui.graphics.c cVar2 = (androidx.compose.ui.graphics.c) ref$ObjectRef2.element;
                Path path = (Path) ref$ObjectRef4.element;
                float f7 = ref$FloatRef.element;
                Path path2 = (Path) ref$ObjectRef6.element;
                if (frm0Var != null) {
                    yk8 yk8Var2 = yk8Var;
                    if (cVar2 == null || path == null) {
                        float f8 = frm0Var.a;
                        float f9 = f8 / 2;
                        float intBitsToFloat = Float.intBitsToFloat((int) (ggjVar.d() >> 32)) - f8;
                        oio.x1(ggjVar, yk8Var2, (Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ggjVar.d() & 4294967295L)) - f8) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, null, 0, 104);
                    } else {
                        boolean z2 = (cVar2 instanceof c.C0013c) && ne7.z(((c.C0013c) cVar2).a);
                        er9.b a0 = ggjVar.a0();
                        boolean z3 = z2;
                        long d2 = a0.d();
                        a0.a().e();
                        try {
                            fr9 fr9Var = a0.a;
                            fr9Var.b(path, 1);
                            if (z3) {
                                fr9Var.l(f7, f7);
                            }
                            try {
                                if (z3) {
                                    try {
                                        j2 = d2;
                                        oio.r1(ggjVar, yk8Var2, (Float.floatToRawIntBits(r0.a) << 32) | (Float.floatToRawIntBits(r0.b) & 4294967295L), (Float.floatToRawIntBits(r0.b()) << 32) | (Float.floatToRawIntBits(r0.a()) & 4294967295L), ((c.C0013c) cVar2).a.e, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, null, Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE);
                                    } catch (Throwable th) {
                                        th = th;
                                        j2 = d2;
                                        j = j2;
                                        nq.b(a0, j);
                                        throw th;
                                    }
                                } else {
                                    j2 = d2;
                                    if (path2 != null) {
                                        oio.u1(ggjVar, path2, yk8Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, frm0Var, null, 52);
                                    }
                                    nq.b(a0, j2);
                                }
                                nq.b(a0, j2);
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j = d2;
                        }
                    }
                }
                return s3q0.a;
            }
        });
    }
}
