package androidx.compose.ui.platform;

import android.graphics.Paint;
import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cma1;
import defpackage.fwi;
import defpackage.fx80;
import defpackage.gx80;
import defpackage.gz40;
import defpackage.hx80;
import defpackage.i28;
import defpackage.ix80;
import defpackage.ixv;
import defpackage.j390;
import defpackage.jb2;
import defpackage.jl40;
import defpackage.jw01;
import defpackage.k28;
import defpackage.k6w;
import defpackage.kp50;
import defpackage.l0u;
import defpackage.ldc;
import defpackage.m2k0;
import defpackage.mbb1;
import defpackage.n810;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.o0u;
import defpackage.ooc;
import defpackage.ora1;
import defpackage.qam;
import defpackage.qje;
import defpackage.rq90;
import defpackage.rzo;
import defpackage.sls;
import defpackage.sta1;
import defpackage.tja1;
import defpackage.tls;
import defpackage.vng;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4e;
import defpackage.z5w;
import defpackage.zii0;
import defpackage.zy11;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class k implements j390 {
    public float[] B;
    public boolean C;
    public int G;
    public ix80 I;
    public boolean J;
    public boolean K;
    public boolean M;
    public androidx.compose.ui.graphics.layer.a a;
    public final l0u b;
    public final AndroidComposeView c;
    public wls w;
    public sls x;
    public boolean z;
    public long y = 9223372034707292159L;
    public final float[] A = n810.a();
    public fwi D = vng.a();
    public LayoutDirection E = LayoutDirection.Ltr;
    public final k28 F = new k28();
    public long H = jw01.b;
    public boolean L = true;
    public final tls N = new tls() { // from class: androidx.compose.ui.platform.GraphicsLayerOwnerLayer$recordLambda$1
        {
            super(1);
        }

        @Override // defpackage.tls
        public final Object invoke(Object obj) {
            qam qamVar = (qam) obj;
            k kVar = k.this;
            i28 q = qamVar.N().q();
            wls wlsVar = kVar.w;
            if (wlsVar != null) {
                wlsVar.invoke(q, (androidx.compose.ui.graphics.layer.a) qamVar.N().b);
            }
            return zy11.a;
        }
    };

    public k(androidx.compose.ui.graphics.layer.a aVar, l0u l0uVar, AndroidComposeView androidComposeView, wls wlsVar, sls slsVar) {
        this.a = aVar;
        this.b = l0uVar;
        this.c = androidComposeView;
        this.w = wlsVar;
        this.x = slsVar;
    }

    public final float[] a() {
        float[] fArr = this.B;
        if (fArr == null) {
            fArr = n810.a();
            this.B = fArr;
        }
        if (this.K) {
            this.K = false;
            float[] b = b();
            if (this.L) {
                return b;
            }
            if (!kp50.B(b, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] b() {
        boolean z = this.J;
        float[] fArr = this.A;
        if (z) {
            androidx.compose.ui.graphics.layer.a aVar = this.a;
            long j = aVar.v;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = cma1.Q(rzo.a0(this.y));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            o0u o0uVar = aVar.a;
            float f = o0uVar.m;
            float f2 = o0uVar.n;
            float f3 = o0uVar.r;
            float f4 = o0uVar.s;
            float f5 = o0uVar.k;
            float f6 = o0uVar.l;
            double d = f3 * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f7 = -sin;
            float f8 = (f2 * cos) - (0.0f * sin);
            float f9 = (0.0f * cos) + (f2 * sin);
            float sin2 = (float) Math.sin(0.0d);
            float cos2 = (float) Math.cos(0.0d);
            float f10 = -sin2;
            float f11 = sin * sin2;
            float f12 = sin * cos2;
            float f13 = cos * sin2;
            float f14 = cos * cos2;
            float f15 = (f9 * sin2) + (f * cos2);
            float f16 = (f9 * cos2) + ((-f) * sin2);
            double d2 = f4 * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d2);
            float cos3 = (float) Math.cos(d2);
            float f17 = -sin3;
            float f18 = (cos3 * f11) + (f17 * cos2);
            float f19 = (f11 * sin3) + (cos2 * cos3);
            float f20 = f19 * f5;
            float f21 = sin3 * cos * f5;
            float f22 = ((sin3 * f12) + (cos3 * f10)) * f5;
            float f23 = f18 * f6;
            float f24 = cos * cos3 * f6;
            float f25 = ((cos3 * f12) + (f17 * f10)) * f6;
            float f26 = f13 * 1.0f;
            float f27 = f7 * 1.0f;
            float f28 = f14 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f20;
                fArr[1] = f21;
                fArr[2] = f22;
                fArr[3] = 0.0f;
                fArr[4] = f23;
                fArr[5] = f24;
                fArr[6] = f25;
                fArr[7] = 0.0f;
                fArr[8] = f26;
                fArr[9] = f27;
                fArr[10] = f28;
                fArr[11] = 0.0f;
                float f29 = -intBitsToFloat;
                fArr[12] = ((f20 * f29) - (intBitsToFloat2 * f23)) + f15 + intBitsToFloat;
                fArr[13] = ((f21 * f29) - (intBitsToFloat2 * f24)) + f8 + intBitsToFloat2;
                fArr[14] = ((f29 * f22) - (intBitsToFloat2 * f25)) + f16;
                fArr[15] = 1.0f;
            }
            this.J = false;
            this.L = ooc.s(fArr);
        }
        return fArr;
    }

    @Override // defpackage.j390
    public final void destroy() {
        this.w = null;
        this.x = null;
        this.z = true;
        boolean z = this.C;
        AndroidComposeView androidComposeView = this.c;
        if (z) {
            this.C = false;
            androidComposeView.notifyLayerIsDirty$ui(this, false);
        }
        l0u l0uVar = this.b;
        if (l0uVar != null) {
            l0uVar.b(this.a);
            androidComposeView.recycle$ui(this);
        }
    }

    @Override // defpackage.j390
    public final void drawLayer(i28 i28Var, androidx.compose.ui.graphics.layer.a aVar) {
        updateDisplayList();
        this.M = this.a.a.o > 0.0f;
        k28 k28Var = this.F;
        nfh nfhVar = k28Var.b;
        nfhVar.A(i28Var);
        nfhVar.b = aVar;
        qje.i(k28Var, this.a);
    }

    @Override // defpackage.j390
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo78getUnderlyingMatrixsQKQjiQ() {
        return b();
    }

    @Override // defpackage.j390
    public final void invalidate() {
        if (this.C || this.z) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.invalidate();
        if (true != this.C) {
            this.C = true;
            androidComposeView.notifyLayerIsDirty$ui(this, true);
        }
    }

    @Override // defpackage.j390
    /* renamed from: inverseTransform-58bKbWc */
    public final void mo79inverseTransform58bKbWc(float[] fArr) {
        float[] a = a();
        if (a != null) {
            n810.f(fArr, a);
        }
    }

    @Override // defpackage.j390
    /* renamed from: isInLayer-k-4lQ0M */
    public final boolean mo80isInLayerk4lQ0M(long j) {
        boolean g;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (!aVar.w) {
            return true;
        }
        g = mbb1.g(aVar.e(), intBitsToFloat, intBitsToFloat2);
        return g;
    }

    @Override // defpackage.j390
    public final void mapBounds(gz40 gz40Var, boolean z) {
        float[] a = z ? a() : b();
        if (this.L) {
            return;
        }
        if (a == null) {
            gz40Var.c(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            n810.c(a, gz40Var);
        }
    }

    @Override // defpackage.j390
    /* renamed from: mapOffset-8S9VItk */
    public final long mo81mapOffset8S9VItk(long j, boolean z) {
        float[] b;
        if (z) {
            b = a();
            if (b == null) {
                return 9187343241974906880L;
            }
        } else {
            b = b();
        }
        return this.L ? j : n810.b(j, b);
    }

    @Override // defpackage.j390
    /* renamed from: move--gyyYBs */
    public final void mo82movegyyYBs(long j) {
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.isArrEnabled$ui()) {
            androidComposeView.voteFrameRate(-4.0f);
        }
        androidx.compose.ui.graphics.layer.a aVar = this.a;
        if (!z5w.a(aVar.t, j)) {
            aVar.t = j;
            aVar.i(j, aVar.u);
        }
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }

    @Override // defpackage.j390
    /* renamed from: resize-ozmzZPI */
    public final void mo83resizeozmzZPI(long j) {
        if (k6w.a(j, this.y)) {
            return;
        }
        AndroidComposeView androidComposeView = this.c;
        if (androidComposeView.isArrEnabled$ui()) {
            androidComposeView.voteFrameRate(-4.0f);
        }
        this.y = j;
        if (this.C || this.z) {
            return;
        }
        androidComposeView.invalidate();
        if (true != this.C) {
            this.C = true;
            androidComposeView.notifyLayerIsDirty$ui(this, true);
        }
    }

    @Override // defpackage.j390
    public final void reuseLayer(wls wlsVar, sls slsVar) {
        l0u l0uVar = this.b;
        if (l0uVar == null) {
            throw x4e.v("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.a.s) {
            ixv.a("layer should have been released before reuse");
        }
        this.a = l0uVar.a();
        this.z = false;
        this.w = wlsVar;
        this.x = slsVar;
        this.J = false;
        this.K = false;
        this.L = true;
        n810.d(this.A);
        float[] fArr = this.B;
        if (fArr != null) {
            n810.d(fArr);
        }
        this.H = jw01.b;
        this.M = false;
        this.y = 9223372034707292159L;
        this.I = null;
        this.G = 0;
    }

    @Override // defpackage.j390
    /* renamed from: transform-58bKbWc */
    public final void mo84transform58bKbWc(float[] fArr) {
        n810.f(fArr, b());
    }

    @Override // defpackage.j390
    public final void updateDisplayList() {
        AndroidComposeView androidComposeView = this.c;
        androidComposeView.isArrEnabled$ui();
        if (this.C) {
            if (!jw01.a(this.H, jw01.b) && !k6w.a(this.a.u, this.y)) {
                androidx.compose.ui.graphics.layer.a aVar = this.a;
                float intBitsToFloat = Float.intBitsToFloat((int) (this.H >> 32)) * ((int) (this.y >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (this.H & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * ((int) (this.y & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
                aVar.h((Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            }
            androidx.compose.ui.graphics.layer.a aVar2 = this.a;
            fwi fwiVar = this.D;
            LayoutDirection layoutDirection = this.E;
            long j = this.y;
            if (!k6w.a(aVar2.u, j)) {
                aVar2.u = j;
                aVar2.i(aVar2.t, j);
                if (aVar2.i == 9205357640488583168L) {
                    aVar2.g = true;
                    aVar2.a();
                }
            }
            aVar2.b = fwiVar;
            aVar2.c = layoutDirection;
            aVar2.d = this.N;
            aVar2.f();
            if (this.C) {
                this.C = false;
                androidComposeView.notifyLayerIsDirty$ui(this, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f0  */
    @Override // defpackage.j390
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateLayerProperties(m2k0 m2k0Var) {
        long j;
        AndroidComposeView androidComposeView;
        ViewParent parent;
        sls slsVar;
        int i;
        sls slsVar2;
        int i2 = m2k0Var.a | this.G;
        this.E = m2k0Var.L;
        this.D = m2k0Var.K;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.H = m2k0Var.F;
        }
        if ((i2 & 1) != 0) {
            androidx.compose.ui.graphics.layer.a aVar = this.a;
            float f = m2k0Var.b;
            o0u o0uVar = aVar.a;
            if (o0uVar.k != f) {
                o0uVar.k = f;
                o0uVar.d.setScaleX(f);
            }
        }
        if ((i2 & 2) != 0) {
            androidx.compose.ui.graphics.layer.a aVar2 = this.a;
            float f2 = m2k0Var.c;
            o0u o0uVar2 = aVar2.a;
            if (o0uVar2.l != f2) {
                o0uVar2.l = f2;
                o0uVar2.d.setScaleY(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.a.g(m2k0Var.w);
        }
        if ((i2 & 8) != 0) {
            androidx.compose.ui.graphics.layer.a aVar3 = this.a;
            float f3 = m2k0Var.x;
            o0u o0uVar3 = aVar3.a;
            if (o0uVar3.m != f3) {
                o0uVar3.m = f3;
                o0uVar3.d.setTranslationX(f3);
            }
        }
        if ((i2 & 16) != 0) {
            androidx.compose.ui.graphics.layer.a aVar4 = this.a;
            float f4 = m2k0Var.y;
            o0u o0uVar4 = aVar4.a;
            if (o0uVar4.n != f4) {
                o0uVar4.n = f4;
                o0uVar4.d.setTranslationY(f4);
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            androidx.compose.ui.graphics.layer.a aVar5 = this.a;
            float f5 = m2k0Var.z;
            o0u o0uVar5 = aVar5.a;
            if (o0uVar5.o != f5) {
                o0uVar5.o = f5;
                o0uVar5.d.setElevation(f5);
                aVar5.g = true;
                aVar5.a();
            }
            if (m2k0Var.z > 0.0f && !this.M && (slsVar2 = this.x) != null) {
                slsVar2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            androidx.compose.ui.graphics.layer.a aVar6 = this.a;
            long j2 = m2k0Var.A;
            o0u o0uVar6 = aVar6.a;
            if (!ldc.c(j2, o0uVar6.p)) {
                o0uVar6.p = j2;
                o0uVar6.d.setAmbientShadowColor(rzo.X(j2));
            }
        }
        if ((i2 & 128) != 0) {
            androidx.compose.ui.graphics.layer.a aVar7 = this.a;
            long j3 = m2k0Var.B;
            o0u o0uVar7 = aVar7.a;
            if (!ldc.c(j3, o0uVar7.q)) {
                o0uVar7.q = j3;
                o0uVar7.d.setSpotShadowColor(rzo.X(j3));
            }
        }
        if ((i2 & 1024) != 0) {
            androidx.compose.ui.graphics.layer.a aVar8 = this.a;
            float f6 = m2k0Var.D;
            o0u o0uVar8 = aVar8.a;
            if (o0uVar8.s != f6) {
                o0uVar8.s = f6;
                o0uVar8.d.setRotationZ(f6);
            }
        }
        if ((i2 & 256) != 0) {
            androidx.compose.ui.graphics.layer.a aVar9 = this.a;
            float f7 = m2k0Var.C;
            o0u o0uVar9 = aVar9.a;
            if (o0uVar9.r != f7) {
                o0uVar9.r = f7;
                o0uVar9.d.setRotationX(f7);
            }
        }
        if ((i2 & 512) != 0) {
            o0u o0uVar10 = this.a.a;
        }
        if ((i2 & 2048) != 0) {
            androidx.compose.ui.graphics.layer.a aVar10 = this.a;
            float f8 = m2k0Var.E;
            o0u o0uVar11 = aVar10.a;
            if (o0uVar11.t != f8) {
                o0uVar11.t = f8;
                o0uVar11.d.setCameraDistance(f8);
            }
        }
        if (i3 != 0) {
            boolean a = jw01.a(this.H, jw01.b);
            androidx.compose.ui.graphics.layer.a aVar11 = this.a;
            if (!a) {
                float intBitsToFloat = Float.intBitsToFloat((int) (this.H >> 32)) * ((int) (this.y >> 32));
                j = 4294967295L;
                aVar11.h((Float.floatToRawIntBits(Float.intBitsToFloat((int) (this.H & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * ((int) (this.y & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
                if ((i2 & 16384) != 0) {
                    androidx.compose.ui.graphics.layer.a aVar12 = this.a;
                    boolean z2 = m2k0Var.H;
                    if (aVar12.w != z2) {
                        aVar12.w = z2;
                        aVar12.g = true;
                        aVar12.a();
                    }
                }
                if ((131072 & i2) != 0) {
                    o0u o0uVar12 = this.a.a;
                    if (!jl40.l(null, null) && Build.VERSION.SDK_INT >= 31) {
                        tja1.d(o0uVar12.d, null);
                    }
                }
                if ((262144 & i2) != 0) {
                    o0u o0uVar13 = this.a.a;
                }
                if ((524288 & i2) != 0) {
                    androidx.compose.ui.graphics.layer.a aVar13 = this.a;
                    int i4 = m2k0Var.M;
                    o0u o0uVar14 = aVar13.a;
                    if (o0uVar14.j != i4) {
                        o0uVar14.j = i4;
                        Paint paint = o0uVar14.f;
                        if (paint == null) {
                            paint = new Paint();
                            o0uVar14.f = paint;
                        }
                        paint.setBlendMode(sta1.b(i4));
                        o0uVar14.c();
                    }
                }
                if ((32768 & i2) != 0) {
                    androidx.compose.ui.graphics.layer.a aVar14 = this.a;
                    int i5 = m2k0Var.I;
                    if (i5 == 0) {
                        i = 0;
                    } else if (i5 == 1) {
                        i = 1;
                    } else {
                        i = 2;
                        if (i5 != 2) {
                            ny61.r("Not supported composition strategy");
                            return;
                        }
                    }
                    o0u o0uVar15 = aVar14.a;
                    if (o0uVar15.x != i) {
                        o0uVar15.x = i;
                        o0uVar15.c();
                    }
                }
                if ((i2 & 7963) != 0) {
                    this.J = true;
                    this.K = true;
                }
                if (jl40.l(this.I, m2k0Var.N)) {
                    ix80 ix80Var = m2k0Var.N;
                    this.I = ix80Var;
                    if (ix80Var != null) {
                        androidx.compose.ui.graphics.layer.a aVar15 = this.a;
                        if (ix80Var instanceof gx80) {
                            zii0 zii0Var = ((gx80) ix80Var).a;
                            float f9 = zii0Var.a;
                            float f10 = zii0Var.b;
                            aVar15.j((Float.floatToRawIntBits(f9) << 32) | (Float.floatToRawIntBits(f10) & j), 0.0f, (Float.floatToRawIntBits(zii0Var.c - f9) << 32) | (Float.floatToRawIntBits(zii0Var.d - f10) & j));
                        } else if (ix80Var instanceof fx80) {
                            rq90 b = ((fx80) ix80Var).b();
                            aVar15.k = null;
                            aVar15.i = 9205357640488583168L;
                            aVar15.h = 0L;
                            aVar15.j = 0.0f;
                            aVar15.g = true;
                            aVar15.n = false;
                            aVar15.l = b;
                            aVar15.a();
                        } else {
                            if (!(ix80Var instanceof hx80)) {
                                w511.b();
                                return;
                            }
                            hx80 hx80Var = (hx80) ix80Var;
                            if (hx80Var.c() != null) {
                                jb2 c = hx80Var.c();
                                aVar15.k = null;
                                aVar15.i = 9205357640488583168L;
                                aVar15.h = 0L;
                                aVar15.j = 0.0f;
                                aVar15.g = true;
                                aVar15.n = false;
                                aVar15.l = c;
                                aVar15.a();
                            } else {
                                aVar15.j((Float.floatToRawIntBits(r5.d()) << 32) | (Float.floatToRawIntBits(r5.e()) & j), Float.intBitsToFloat((int) (hx80Var.b().a() >> 32)), (Float.floatToRawIntBits(r5.h()) << 32) | (Float.floatToRawIntBits(r5.c()) & j));
                            }
                        }
                        if (Build.VERSION.SDK_INT < 33 && (((ix80Var instanceof fx80) || ((ix80Var instanceof hx80) && !ora1.d(((hx80) ix80Var).b()))) && (slsVar = this.x) != null)) {
                            slsVar.invoke();
                        }
                    }
                } else {
                    z = false;
                }
                this.G = m2k0Var.a;
                if (i2 == 0 || z) {
                    androidComposeView = this.c;
                    parent = androidComposeView.getParent();
                    if (parent != null) {
                        parent.onDescendantInvalidated(androidComposeView, androidComposeView);
                    }
                    if (androidComposeView.isArrEnabled$ui()) {
                        return;
                    }
                    androidComposeView.voteFrameRate(0.0f);
                    return;
                }
                return;
            }
            aVar11.h(9205357640488583168L);
        }
        j = 4294967295L;
        if ((i2 & 16384) != 0) {
        }
        if ((131072 & i2) != 0) {
        }
        if ((262144 & i2) != 0) {
        }
        if ((524288 & i2) != 0) {
        }
        if ((32768 & i2) != 0) {
        }
        if ((i2 & 7963) != 0) {
        }
        if (jl40.l(this.I, m2k0Var.N)) {
        }
        this.G = m2k0Var.a;
        if (i2 == 0) {
        }
        androidComposeView = this.c;
        parent = androidComposeView.getParent();
        if (parent != null) {
        }
        if (androidComposeView.isArrEnabled$ui()) {
        }
    }
}
