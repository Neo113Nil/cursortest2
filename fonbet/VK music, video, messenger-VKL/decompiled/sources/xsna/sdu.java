package xsna;

import android.os.Build;
import android.view.ViewParent;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import xsna.er9;

/* compiled from: GraphicsLayerOwnerLayer.android.kt */
/* loaded from: classes11.dex */
public final class sdu implements m490 {
    public mdu b;
    public final kdu c;
    public final p52 d;
    public wzs<? super yq9, ? super mdu, s3q0> e;
    public gzs<s3q0> f;
    public long g;
    public boolean h;
    public float[] j;
    public boolean k;
    public int o;
    public androidx.compose.ui.graphics.c q;
    public boolean r;
    public boolean s;
    public boolean u;
    public final float[] i = en10.a();
    public azl l = d370.k();
    public LayoutDirection m = LayoutDirection.Ltr;
    public final er9 n = new er9();
    public long p = lkp0.b;
    public boolean t = true;
    public final a v = new a();

    /* compiled from: GraphicsLayerOwnerLayer.android.kt */
    public static final class a extends Lambda implements izs<oio, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            oio oioVar2 = oioVar;
            sdu sduVar = sdu.this;
            yq9 a = oioVar2.a0().a();
            wzs<? super yq9, ? super mdu, s3q0> wzsVar = sduVar.e;
            if (wzsVar != null) {
                wzsVar.invoke(a, oioVar2.a0().b);
            }
            return s3q0.a;
        }
    }

    public sdu(mdu mduVar, kdu kduVar, p52 p52Var, wzs<? super yq9, ? super mdu, s3q0> wzsVar, gzs<s3q0> gzsVar) {
        this.b = mduVar;
        this.c = kduVar;
        this.d = p52Var;
        this.e = wzsVar;
        this.f = gzsVar;
        long j = Integer.MAX_VALUE;
        this.g = (j & 4294967295L) | (j << 32);
    }

    @Override // xsna.m490
    public final void a(oh50 oh50Var, boolean z) {
        float[] l = z ? l() : m();
        if (this.t) {
            return;
        }
        if (l != null) {
            en10.d(l, oh50Var);
            return;
        }
        oh50Var.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        oh50Var.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.m490
    public final void b(gzs gzsVar, wzs wzsVar) {
        kdu kduVar = this.c;
        if (kduVar == null) {
            throw pm0.f("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.b.s) {
            uzw.a("layer should have been released before reuse");
        }
        this.b = kduVar.a();
        this.h = false;
        this.e = wzsVar;
        this.f = gzsVar;
        this.r = false;
        this.s = false;
        this.t = true;
        en10.e(this.i);
        float[] fArr = this.j;
        if (fArr != null) {
            en10.e(fArr);
        }
        this.p = lkp0.b;
        this.u = false;
        long j = Integer.MAX_VALUE;
        this.g = (j & 4294967295L) | (j << 32);
        this.q = null;
        this.o = 0;
    }

    @Override // xsna.m490
    public final void c(yq9 yq9Var, mdu mduVar) {
        i();
        this.u = this.b.a.F() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        er9 er9Var = this.n;
        er9.b bVar = er9Var.c;
        bVar.e(yq9Var);
        bVar.b = mduVar;
        qdu.a(er9Var, this.b);
    }

    @Override // xsna.m490
    public final void d(float[] fArr) {
        en10.h(fArr, m());
    }

    @Override // xsna.m490
    public final void destroy() {
        ci50 ci50Var;
        Reference poll;
        this.e = null;
        this.f = null;
        this.h = true;
        boolean z = this.k;
        p52 p52Var = this.d;
        if (z) {
            this.k = false;
            p52Var.U(this, false);
        }
        kdu kduVar = this.c;
        if (kduVar != null) {
            kduVar.b(this.b);
            ah3 ah3Var = p52Var.z0;
            do {
                ReferenceQueue referenceQueue = (ReferenceQueue) ah3Var.c;
                ci50Var = (ci50) ah3Var.b;
                poll = referenceQueue.poll();
                if (poll != null) {
                    ci50Var.j(poll);
                }
            } while (poll != null);
            ci50Var.b(new WeakReference(this, (ReferenceQueue) ah3Var.c));
            p52Var.F.n(this);
        }
    }

    @Override // xsna.m490
    public final long e(long j, boolean z) {
        float[] m;
        if (z) {
            m = l();
            if (m == null) {
                return 9187343241974906880L;
            }
        } else {
            m = m();
        }
        return this.t ? j : en10.b(j, m);
    }

    @Override // xsna.m490
    public final boolean f(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        mdu mduVar = this.b;
        if (!mduVar.w) {
            return true;
        }
        androidx.compose.ui.graphics.c d = mduVar.d();
        if (d instanceof c.b) {
            zhf0 zhf0Var = ((c.b) d).a;
            return zhf0Var.a <= intBitsToFloat && intBitsToFloat < zhf0Var.c && zhf0Var.b <= intBitsToFloat2 && intBitsToFloat2 < zhf0Var.d;
        }
        if (!(d instanceof c.C0013c)) {
            if (d instanceof c.a) {
                return t5j0.a(((c.a) d).a, intBitsToFloat, intBitsToFloat2);
            }
            throw new NoWhenBranchMatchedException();
        }
        aog0 aog0Var = ((c.C0013c) d).a;
        float f = aog0Var.a;
        long j2 = aog0Var.f;
        long j3 = aog0Var.h;
        long j4 = aog0Var.g;
        float f2 = aog0Var.d;
        float f3 = aog0Var.b;
        float f4 = aog0Var.c;
        long j5 = aog0Var.e;
        if (intBitsToFloat >= f && intBitsToFloat < f4 && intBitsToFloat2 >= f3 && intBitsToFloat2 < f2) {
            int i = (int) (j5 >> 32);
            float intBitsToFloat3 = Float.intBitsToFloat(i);
            int i2 = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i2) + intBitsToFloat3 <= aog0Var.b()) {
                int i3 = (int) (j3 >> 32);
                float intBitsToFloat4 = Float.intBitsToFloat(i3);
                int i4 = (int) (j4 >> 32);
                if (Float.intBitsToFloat(i4) + intBitsToFloat4 <= aog0Var.b()) {
                    int i5 = (int) (j5 & 4294967295L);
                    int i6 = (int) (j3 & 4294967295L);
                    if (Float.intBitsToFloat(i6) + Float.intBitsToFloat(i5) <= aog0Var.a()) {
                        int i7 = (int) (j2 & 4294967295L);
                        int i8 = (int) (j4 & 4294967295L);
                        if (Float.intBitsToFloat(i8) + Float.intBitsToFloat(i7) <= aog0Var.a()) {
                            float intBitsToFloat5 = Float.intBitsToFloat(i) + f;
                            float intBitsToFloat6 = Float.intBitsToFloat(i5) + f3;
                            float intBitsToFloat7 = f4 - Float.intBitsToFloat(i2);
                            float intBitsToFloat8 = Float.intBitsToFloat(i7) + f3;
                            float intBitsToFloat9 = f4 - Float.intBitsToFloat(i4);
                            float intBitsToFloat10 = f2 - Float.intBitsToFloat(i8);
                            float intBitsToFloat11 = f2 - Float.intBitsToFloat(i6);
                            float intBitsToFloat12 = Float.intBitsToFloat(i3) + f;
                            if (intBitsToFloat < intBitsToFloat5 && intBitsToFloat2 < intBitsToFloat6) {
                                return t5j0.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat5, intBitsToFloat6, aog0Var.e);
                            }
                            if (intBitsToFloat < intBitsToFloat12 && intBitsToFloat2 > intBitsToFloat11) {
                                return t5j0.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat12, intBitsToFloat11, aog0Var.h);
                            }
                            if (intBitsToFloat > intBitsToFloat7 && intBitsToFloat2 < intBitsToFloat8) {
                                return t5j0.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat7, intBitsToFloat8, aog0Var.f);
                            }
                            if (intBitsToFloat > intBitsToFloat9 && intBitsToFloat2 > intBitsToFloat10) {
                                return t5j0.b(intBitsToFloat, intBitsToFloat2, intBitsToFloat9, intBitsToFloat10, aog0Var.g);
                            }
                        }
                    }
                }
            }
            androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
            a2.q(aog0Var, Path.Direction.CounterClockwise);
            return t5j0.a(a2, intBitsToFloat, intBitsToFloat2);
        }
    }

    @Override // xsna.m490
    public final void g(float[] fArr) {
        float[] l = l();
        if (l != null) {
            en10.h(fArr, l);
        }
    }

    @Override // xsna.m490
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public final float[] mo409getUnderlyingMatrixsQKQjiQ() {
        return m();
    }

    @Override // xsna.m490
    public final void h(long j) {
        boolean P = p52.P();
        p52 p52Var = this.d;
        if (P) {
            p52Var.s(-4.0f);
        }
        mdu mduVar = this.b;
        if (!h9x.b(mduVar.t, j)) {
            mduVar.t = j;
            mduVar.a.R((int) (j >> 32), (int) (j & 4294967295L), mduVar.u);
        }
        ViewParent parent = p52Var.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(p52Var, p52Var);
        }
    }

    @Override // xsna.m490
    public final void i() {
        p52.P();
        if (this.k) {
            if (!lkp0.a(this.p, lkp0.b) && !q9x.b(this.b.u, this.g)) {
                mdu mduVar = this.b;
                float b = lkp0.b(this.p) * ((int) (this.g >> 32));
                float c = lkp0.c(this.p) * ((int) (this.g & 4294967295L));
                long floatToRawIntBits = (Float.floatToRawIntBits(c) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
                if (!ov70.c(mduVar.v, floatToRawIntBits)) {
                    mduVar.v = floatToRawIntBits;
                    mduVar.a.K(floatToRawIntBits);
                }
            }
            this.b.e(this.l, this.m, this.g, this.v);
            if (this.k) {
                this.k = false;
                this.d.U(this, false);
            }
        }
    }

    @Override // xsna.m490
    public final void invalidate() {
        if (this.k || this.h) {
            return;
        }
        p52 p52Var = this.d;
        p52Var.invalidate();
        if (true != this.k) {
            this.k = true;
            p52Var.U(this, true);
        }
    }

    @Override // xsna.m490
    public final void j(sfg0 sfg0Var) {
        gzs<s3q0> gzsVar;
        int i;
        gzs<s3q0> gzsVar2;
        int i2 = sfg0Var.b | this.o;
        this.m = sfg0Var.u;
        this.l = sfg0Var.t;
        int i3 = i2 & 4096;
        if (i3 != 0) {
            this.p = sfg0Var.o;
        }
        if ((i2 & 1) != 0) {
            mdu mduVar = this.b;
            float f = sfg0Var.c;
            pdu pduVar = mduVar.a;
            if (pduVar.J() != f) {
                pduVar.A(f);
            }
        }
        if ((i2 & 2) != 0) {
            mdu mduVar2 = this.b;
            float f2 = sfg0Var.d;
            pdu pduVar2 = mduVar2.a;
            if (pduVar2.M() != f2) {
                pduVar2.B(f2);
            }
        }
        if ((i2 & 4) != 0) {
            this.b.f(sfg0Var.e);
        }
        if ((i2 & 8) != 0) {
            mdu mduVar3 = this.b;
            float f3 = sfg0Var.f;
            pdu pduVar3 = mduVar3.a;
            if (pduVar3.q() != f3) {
                pduVar3.o(f3);
            }
        }
        if ((i2 & 16) != 0) {
            mdu mduVar4 = this.b;
            float f4 = sfg0Var.g;
            pdu pduVar4 = mduVar4.a;
            if (pduVar4.p() != f4) {
                pduVar4.n(f4);
            }
        }
        boolean z = true;
        if ((i2 & 32) != 0) {
            mdu mduVar5 = this.b;
            float f5 = sfg0Var.h;
            pdu pduVar5 = mduVar5.a;
            if (pduVar5.F() != f5) {
                pduVar5.i(f5);
                mduVar5.g = true;
                mduVar5.a();
            }
            if (sfg0Var.h > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !this.u && (gzsVar2 = this.f) != null) {
                gzsVar2.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            mdu mduVar6 = this.b;
            long j = sfg0Var.i;
            pdu pduVar6 = mduVar6.a;
            if (!l5g.d(j, pduVar6.S())) {
                pduVar6.m(j);
            }
        }
        if ((i2 & 128) != 0) {
            mdu mduVar7 = this.b;
            long j2 = sfg0Var.j;
            pdu pduVar7 = mduVar7.a;
            if (!l5g.d(j2, pduVar7.N())) {
                pduVar7.r(j2);
            }
        }
        if ((i2 & 1024) != 0) {
            mdu mduVar8 = this.b;
            float f6 = sfg0Var.m;
            pdu pduVar8 = mduVar8.a;
            if (pduVar8.I() != f6) {
                pduVar8.j(f6);
            }
        }
        if ((i2 & 256) != 0) {
            mdu mduVar9 = this.b;
            float f7 = sfg0Var.k;
            pdu pduVar9 = mduVar9.a;
            if (pduVar9.L() != f7) {
                pduVar9.g(f7);
            }
        }
        if ((i2 & 512) != 0) {
            mdu mduVar10 = this.b;
            float f8 = sfg0Var.l;
            pdu pduVar10 = mduVar10.a;
            if (pduVar10.H() != f8) {
                pduVar10.h(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            mdu mduVar11 = this.b;
            float f9 = sfg0Var.n;
            pdu pduVar11 = mduVar11.a;
            if (pduVar11.O() != f9) {
                pduVar11.u(f9);
            }
        }
        if (i3 != 0) {
            if (lkp0.a(this.p, lkp0.b)) {
                mdu mduVar12 = this.b;
                if (!ov70.c(mduVar12.v, 9205357640488583168L)) {
                    mduVar12.v = 9205357640488583168L;
                    mduVar12.a.K(9205357640488583168L);
                }
            } else {
                mdu mduVar13 = this.b;
                float b = lkp0.b(this.p) * ((int) (this.g >> 32));
                long floatToRawIntBits = (Float.floatToRawIntBits(lkp0.c(this.p) * ((int) (this.g & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(b) << 32);
                if (!ov70.c(mduVar13.v, floatToRawIntBits)) {
                    mduVar13.v = floatToRawIntBits;
                    mduVar13.a.K(floatToRawIntBits);
                }
            }
        }
        if ((i2 & 16384) != 0) {
            mdu mduVar14 = this.b;
            boolean z2 = sfg0Var.q;
            if (mduVar14.w != z2) {
                mduVar14.w = z2;
                mduVar14.g = true;
                mduVar14.a();
            }
        }
        if ((131072 & i2) != 0) {
            this.b.g(sfg0Var.v);
        }
        if ((262144 & i2) != 0) {
            pdu pduVar12 = this.b.a;
            if (!epx.f(pduVar12.c(), null)) {
                pduVar12.t();
            }
        }
        if ((524288 & i2) != 0) {
            mdu mduVar15 = this.b;
            int i4 = sfg0Var.w;
            pdu pduVar13 = mduVar15.a;
            if (pduVar13.U() != i4) {
                pduVar13.l(i4);
            }
        }
        if ((32768 & i2) != 0) {
            mdu mduVar16 = this.b;
            int i5 = sfg0Var.r;
            if (i5 == 0) {
                i = 0;
            } else if (i5 == 1) {
                i = 1;
            } else {
                i = 2;
                if (i5 != 2) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            pdu pduVar14 = mduVar16.a;
            if (pduVar14.Q() != i) {
                pduVar14.W(i);
            }
        }
        if ((i2 & 7963) != 0) {
            this.r = true;
            this.s = true;
        }
        if (epx.f(this.q, sfg0Var.x)) {
            z = false;
        } else {
            androidx.compose.ui.graphics.c cVar = sfg0Var.x;
            this.q = cVar;
            if (cVar != null) {
                mdu mduVar17 = this.b;
                if (cVar instanceof c.b) {
                    zhf0 zhf0Var = ((c.b) cVar).a;
                    float f10 = zhf0Var.a;
                    float f11 = zhf0Var.b;
                    mduVar17.h((Float.floatToRawIntBits(f10) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(zhf0Var.c - zhf0Var.a) << 32) | (Float.floatToRawIntBits(zhf0Var.d - f11) & 4294967295L), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                } else if (cVar instanceof c.a) {
                    Path path = ((c.a) cVar).a;
                    mduVar17.k = null;
                    mduVar17.i = 9205357640488583168L;
                    mduVar17.h = 0L;
                    mduVar17.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    mduVar17.g = true;
                    mduVar17.n = false;
                    mduVar17.l = path;
                    mduVar17.a();
                } else {
                    if (!(cVar instanceof c.C0013c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c.C0013c c0013c = (c.C0013c) cVar;
                    androidx.compose.ui.graphics.a aVar = c0013c.b;
                    if (aVar != null) {
                        mduVar17.k = null;
                        mduVar17.i = 9205357640488583168L;
                        mduVar17.h = 0L;
                        mduVar17.j = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        mduVar17.g = true;
                        mduVar17.n = false;
                        mduVar17.l = aVar;
                        mduVar17.a();
                    } else {
                        mduVar17.h((Float.floatToRawIntBits(r7.a) << 32) | (Float.floatToRawIntBits(r7.b) & 4294967295L), (Float.floatToRawIntBits(r7.b()) << 32) | (Float.floatToRawIntBits(r7.a()) & 4294967295L), Float.intBitsToFloat((int) (c0013c.a.h >> 32)));
                    }
                }
                if (Build.VERSION.SDK_INT < 33 && (((cVar instanceof c.a) || ((cVar instanceof c.C0013c) && !ne7.z(((c.C0013c) cVar).a))) && (gzsVar = this.f) != null)) {
                    gzsVar.invoke();
                }
            }
        }
        this.o = sfg0Var.b;
        if (i2 != 0 || z) {
            p52 p52Var = this.d;
            ViewParent parent = p52Var.getParent();
            if (parent != null) {
                parent.onDescendantInvalidated(p52Var, p52Var);
            }
            if (p52.P()) {
                p52Var.s(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            }
        }
    }

    @Override // xsna.m490
    public final void k(long j) {
        if (q9x.b(j, this.g)) {
            return;
        }
        boolean P = p52.P();
        p52 p52Var = this.d;
        if (P) {
            p52Var.s(-4.0f);
        }
        this.g = j;
        if (this.k || this.h) {
            return;
        }
        p52Var.invalidate();
        if (true != this.k) {
            this.k = true;
            p52Var.U(this, true);
        }
    }

    public final float[] l() {
        float[] fArr = this.j;
        if (fArr == null) {
            fArr = en10.a();
            this.j = fArr;
        }
        if (this.s) {
            this.s = false;
            float[] m = m();
            if (this.t) {
                return m;
            }
            if (!s101.s(m, fArr)) {
                fArr[0] = Float.NaN;
                return null;
            }
        } else if (Float.isNaN(fArr[0])) {
            return null;
        }
        return fArr;
    }

    public final float[] m() {
        boolean z = this.r;
        float[] fArr = this.i;
        if (z) {
            mdu mduVar = this.b;
            long j = mduVar.v;
            pdu pduVar = mduVar.a;
            if ((9223372034707292159L & j) == 9205357640488583168L) {
                j = egi.j(pli.w(this.g));
            }
            float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            float q = pduVar.q();
            float p = pduVar.p();
            float L = pduVar.L();
            float H = pduVar.H();
            float I = pduVar.I();
            float J = pduVar.J();
            float M = pduVar.M();
            double d = L * 0.017453292519943295d;
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            float f = -sin;
            float f2 = (p * cos) - (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * sin);
            float f3 = (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * cos) + (p * sin);
            double d2 = H * 0.017453292519943295d;
            float sin2 = (float) Math.sin(d2);
            float cos2 = (float) Math.cos(d2);
            float f4 = -sin2;
            float f5 = sin * sin2;
            float f6 = sin * cos2;
            float f7 = cos * sin2;
            float f8 = cos * cos2;
            float f9 = (f3 * sin2) + (q * cos2);
            float f10 = (f3 * cos2) + ((-q) * sin2);
            double d3 = I * 0.017453292519943295d;
            float sin3 = (float) Math.sin(d3);
            float cos3 = (float) Math.cos(d3);
            float f11 = -sin3;
            float f12 = (cos3 * f5) + (f11 * cos2);
            float f13 = ((f5 * sin3) + (cos2 * cos3)) * J;
            float f14 = sin3 * cos * J;
            float f15 = ((sin3 * f6) + (cos3 * f4)) * J;
            float f16 = f12 * M;
            float f17 = cos * cos3 * M;
            float f18 = ((cos3 * f6) + (f11 * f4)) * M;
            float f19 = f7 * 1.0f;
            float f20 = f * 1.0f;
            float f21 = f8 * 1.0f;
            if (fArr.length >= 16) {
                fArr[0] = f13;
                fArr[1] = f14;
                fArr[2] = f15;
                fArr[3] = 0.0f;
                fArr[4] = f16;
                fArr[5] = f17;
                fArr[6] = f18;
                fArr[7] = 0.0f;
                fArr[8] = f19;
                fArr[9] = f20;
                fArr[10] = f21;
                fArr[11] = 0.0f;
                float f22 = -intBitsToFloat;
                fArr[12] = ((f13 * f22) - (intBitsToFloat2 * f16)) + f9 + intBitsToFloat;
                fArr[13] = ((f14 * f22) - (intBitsToFloat2 * f17)) + f2 + intBitsToFloat2;
                fArr[14] = ((f22 * f15) - (intBitsToFloat2 * f18)) + f10;
                fArr[15] = 1.0f;
            }
            this.r = false;
            this.t = fco0.e(fArr);
        }
        return fArr;
    }
}
