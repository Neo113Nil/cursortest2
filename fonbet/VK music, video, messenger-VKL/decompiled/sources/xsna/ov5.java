package xsna;

import android.graphics.RenderEffect;
import android.graphics.RuntimeShader;
import android.os.Build;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.compose.blur.GradientDirection;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.er9;
import xsna.q630;
import xsna.yk8;

/* compiled from: BackdropBlur.kt */
/* loaded from: classes17.dex */
public final class ov5 extends q630.c implements lio, o1u {
    public zb2 A;
    public boolean C;
    public rv5 p;
    public float q;
    public boolean r;
    public GradientDirection s;
    public yk8 t;
    public yk8 u;
    public mdu v;
    public mdu w;
    public qg7 y;
    public long x = 0;
    public float z = -1.0f;
    public float B = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public final s5 F = new s5(this, 6);

    public ov5(rv5 rv5Var, float f, boolean z, GradientDirection gradientDirection, yk8 yk8Var, yk8 yk8Var2) {
        this.p = rv5Var;
        this.q = f;
        this.r = z;
        this.s = gradientDirection;
        this.t = yk8Var;
        this.u = yk8Var2;
    }

    @Override // xsna.o1u
    public final void T1(androidx.compose.ui.node.o oVar) {
        this.x = oVar.D(0L);
        mio.a(this);
    }

    @Override // xsna.q630.c
    public final void a2() {
        this.v = itl.g(this).getGraphicsContext().a();
        rv5 rv5Var = this.p;
        rv5Var.d.add(this.F);
    }

    @Override // xsna.q630.c
    public final void b2() {
        rv5 rv5Var = this.p;
        rv5Var.d.remove(this.F);
        kdu graphicsContext = itl.g(this).getGraphicsContext();
        mdu mduVar = this.v;
        if (mduVar != null) {
            graphicsContext.b(mduVar);
        }
        mdu mduVar2 = this.w;
        if (mduVar2 != null) {
            graphicsContext.b(mduVar2);
        }
        this.v = null;
        this.w = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r11 == null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ba, code lost:
    
        if (r11 == 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10, types: [xsna.gyf0] */
    /* JADX WARN: Type inference failed for: r11v12, types: [xsna.qg7] */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r26v0, types: [xsna.oio, xsna.toy] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, xsna.mdu] */
    @Override // xsna.lio
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(toy toyVar) {
        RenderEffect createRuntimeShaderEffect;
        RenderEffect createRuntimeShaderEffect2;
        RenderEffect createChainEffect;
        ?? r11;
        qg7 qg7Var;
        float f;
        long j;
        er9 er9Var = toyVar.b;
        if (!this.r) {
            toyVar.s1();
            return;
        }
        float I0 = toyVar.I0(this.q);
        ?? r4 = this.v;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 || I0 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || r4 == 0) {
            yk8 yk8Var = this.u;
            if (yk8Var != null) {
                oio.x1(toyVar, yk8Var, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
            }
            toyVar.s1();
            return;
        }
        final float intBitsToFloat = Float.intBitsToFloat((int) (this.p.b >> 32)) - Float.intBitsToFloat((int) (this.x >> 32));
        final float intBitsToFloat2 = Float.intBitsToFloat((int) (this.p.b & 4294967295L)) - Float.intBitsToFloat((int) (this.x & 4294967295L));
        if (this.s == null || i >= 33) {
            int intBitsToFloat3 = (int) (Float.intBitsToFloat((int) (er9Var.d() >> 32)) * 0.5f);
            if (intBitsToFloat3 < 1) {
                intBitsToFloat3 = 1;
            }
            int intBitsToFloat4 = (int) (Float.intBitsToFloat((int) (er9Var.d() & 4294967295L)) * 0.5f);
            if (intBitsToFloat4 < 1) {
                intBitsToFloat4 = 1;
            }
            float f2 = I0 * 0.5f;
            if (f2 < 1.0f) {
                f2 = 1.0f;
            }
            toyVar.N1((intBitsToFloat3 << 32) | (intBitsToFloat4 & 4294967295L), new izs() { // from class: xsna.nv5
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    float f3 = intBitsToFloat;
                    float f4 = intBitsToFloat2;
                    oio oioVar = (oio) obj;
                    ov5 ov5Var = ov5.this;
                    oio.P(oioVar, ov5Var.p.c, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    er9.b a0 = oioVar.a0();
                    long d = a0.d();
                    a0.a().e();
                    try {
                        a0.a.i(0L, 0.5f, 0.5f);
                        oioVar.a0().a.l(f3, f4);
                        try {
                            qdu.a(oioVar, ov5Var.p.a);
                            oioVar.a0().a.l(-f3, -f4);
                            nq.b(a0, d);
                            return s3q0.a;
                        } catch (Throwable th) {
                            oioVar.a0().a.l(-f3, -f4);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        nq.b(a0, d);
                        throw th2;
                    }
                }
            }, r4);
            GradientDirection gradientDirection = this.s;
            if (gradientDirection == null) {
                qg7 qg7Var2 = this.y;
                if (qg7Var2 != null) {
                    r11 = this.z == f2 ? qg7Var2 : 0;
                }
                r11 = new qg7(f2, f2, 0);
                this.y = r11;
                this.z = f2;
            } else {
                boolean z = gradientDirection == GradientDirection.BottomTop;
                float f3 = intBitsToFloat3;
                float f4 = intBitsToFloat4;
                zb2 zb2Var = this.A;
                if (zb2Var != null && this.B == f2 && this.C == z && this.D == f3 && this.E == f4) {
                    r11 = zb2Var;
                } else {
                    float f5 = f2 / 1.5f;
                    float f6 = z ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    bi4.d();
                    RuntimeShader b = xa0.b();
                    b.setFloatUniform("u_resolution", f3, f4);
                    b.setFloatUniform("u_direction", 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    b.setFloatUniform("u_sigma", f5);
                    b.setFloatUniform("u_flipGradient", f6);
                    bi4.d();
                    RuntimeShader b2 = xa0.b();
                    b2.setFloatUniform("u_resolution", f3, f4);
                    b2.setFloatUniform("u_direction", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                    b2.setFloatUniform("u_sigma", f5);
                    b2.setFloatUniform("u_flipGradient", f6);
                    createRuntimeShaderEffect = RenderEffect.createRuntimeShaderEffect(b2, "u_input");
                    createRuntimeShaderEffect2 = RenderEffect.createRuntimeShaderEffect(b, "u_input");
                    createChainEffect = RenderEffect.createChainEffect(createRuntimeShaderEffect, createRuntimeShaderEffect2);
                    zb2 zb2Var2 = new zb2(createChainEffect);
                    this.A = zb2Var2;
                    this.B = f2;
                    this.C = z;
                    this.D = f3;
                    this.E = f4;
                    r11 = zb2Var2;
                }
            }
            r4.g(r11);
            float intBitsToFloat5 = Float.intBitsToFloat((int) (er9Var.d() >> 32));
            float intBitsToFloat6 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
            er9.b bVar = er9Var.c;
            long d = bVar.d();
            bVar.a().e();
            try {
                bVar.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat5, intBitsToFloat6, 1);
                er9.b bVar2 = er9Var.c;
                long d2 = bVar2.d();
                bVar2.a().e();
                try {
                    bVar2.a.i(0L, 2.0f, 2.0f);
                    qdu.a(toyVar, r4);
                } finally {
                    bVar2.a().a();
                    bVar2.h(d2);
                }
            } finally {
                nq.b(bVar, d);
            }
        } else {
            r4.g(null);
            oio.G1(toyVar, r4, new izs() { // from class: xsna.mv5
                @Override // xsna.izs
                public final Object invoke(Object obj) {
                    oio oioVar = (oio) obj;
                    ov5 ov5Var = ov5.this;
                    oio.P(oioVar, ov5Var.p.c, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    fr9 fr9Var = oioVar.a0().a;
                    float f7 = intBitsToFloat;
                    float f8 = intBitsToFloat2;
                    fr9Var.l(f7, f8);
                    try {
                        qdu.a(oioVar, ov5Var.p.a);
                        oioVar.a0().a.l(-f7, -f8);
                        return s3q0.a;
                    } catch (Throwable th) {
                        oioVar.a0().a.l(-f7, -f8);
                        throw th;
                    }
                }
            });
            boolean z2 = this.s == GradientDirection.BottomTop;
            mdu mduVar = this.w;
            if (mduVar == null) {
                mduVar = itl.g(this).getGraphicsContext().a();
                this.w = mduVar;
            }
            qg7 qg7Var3 = this.y;
            if (qg7Var3 != null) {
                qg7Var = this.z == I0 ? qg7Var3 : null;
            }
            qg7Var = new qg7(I0, I0, 0);
            this.y = qg7Var;
            this.z = I0;
            oio.G1(toyVar, mduVar, new j9((Object) r4, 6));
            mduVar.g(qg7Var);
            float intBitsToFloat7 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
            if (z2) {
                f = 0.55f * intBitsToFloat7;
            } else {
                f = 0.45f * intBitsToFloat7;
                intBitsToFloat7 = 0.0f;
            }
            y7z f7 = yk8.a.f(new Pair[]{new Pair(Float.valueOf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), new l5g(l5g.b)), new Pair(Float.valueOf(1.0f), new l5g(l5g.j))}, intBitsToFloat7, f);
            float intBitsToFloat8 = Float.intBitsToFloat((int) (er9Var.d() >> 32));
            float intBitsToFloat9 = Float.intBitsToFloat((int) (er9Var.d() & 4294967295L));
            er9.b bVar3 = er9Var.c;
            long d3 = bVar3.d();
            bVar3.a().e();
            try {
                bVar3.a.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, intBitsToFloat8, intBitsToFloat9, 1);
                qdu.a(toyVar, mduVar);
                er9Var.c.a().r(new zhf0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat((int) (er9Var.d() >> 32)), Float.intBitsToFloat((int) (er9Var.d() & 4294967295L))), new va2());
                qdu.a(toyVar, r4);
                try {
                    oio.x1(toyVar, f7, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 6, 62);
                    er9Var.c.a().a();
                    nq.b(bVar3, d3);
                } catch (Throwable th) {
                    th = th;
                    j = d3;
                    nq.b(bVar3, j);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                j = d3;
            }
        }
        yk8 yk8Var2 = this.t;
        if (yk8Var2 != null) {
            oio.x1(toyVar, yk8Var2, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        }
        toyVar.s1();
    }

    @Override // xsna.lio
    public final void i1() {
    }
}
