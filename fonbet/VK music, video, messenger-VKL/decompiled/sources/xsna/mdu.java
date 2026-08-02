package xsna;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.c;
import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.Locale;
import kotlin.jvm.internal.Lambda;
import xsna.er9;

/* compiled from: AndroidGraphicsLayer.android.kt */
/* loaded from: classes11.dex */
public final class mdu {
    public final pdu a;
    public Outline f;
    public float j;
    public androidx.compose.ui.graphics.c k;
    public Path l;
    public androidx.compose.ui.graphics.a m;
    public boolean n;
    public er9 o;
    public va2 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public azl b = fto0.j;
    public LayoutDirection c = LayoutDirection.Ltr;
    public izs<? super oio, s3q0> d = b.i;
    public final a e = new a();
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final u9c r = new u9c();

    /* compiled from: AndroidGraphicsLayer.android.kt */
    public static final class a extends Lambda implements izs<oio, s3q0> {
        public a() {
            super(1);
        }

        @Override // xsna.izs
        public final s3q0 invoke(oio oioVar) {
            oio oioVar2 = oioVar;
            mdu mduVar = mdu.this;
            Path path = mduVar.l;
            if (mduVar.n && mduVar.w && path != null) {
                er9.b a0 = oioVar2.a0();
                long d = a0.d();
                a0.a().e();
                try {
                    a0.a.b(path, 1);
                    mduVar.c(oioVar2);
                } finally {
                    nq.b(a0, d);
                }
            } else {
                mduVar.c(oioVar2);
            }
            return s3q0.a;
        }
    }

    /* compiled from: AndroidGraphicsLayer.android.kt */
    public static final class b extends Lambda implements izs<oio, s3q0> {
        public static final b i = new b(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(oio oioVar) {
            return s3q0.a;
        }
    }

    static {
        Build.FINGERPRINT.toLowerCase(Locale.ROOT).equals("robolectric");
    }

    public mdu(pdu pduVar) {
        this.a = pduVar;
        pduVar.f(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            pdu pduVar = this.a;
            if (z || pduVar.F() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                Path path = this.l;
                if (path != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = path instanceof androidx.compose.ui.graphics.a;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    android.graphics.Path path2 = ((androidx.compose.ui.graphics.a) path).a;
                    path2.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.j()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setPath(path2);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(path2);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = path;
                    if (outline != null) {
                        outline.setAlpha(pduVar.a());
                        outline2 = outline;
                    }
                    pduVar.E(outline2, (4294967295L & Math.round(rectF.height())) | (Math.round(rectF.width()) << 32));
                    if (this.n && this.w) {
                        pduVar.f(false);
                        pduVar.G();
                    } else {
                        pduVar.f(this.w);
                    }
                } else {
                    pduVar.f(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long w = pli.w(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        w = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (w >> 32);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (w & 4294967295L)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(pduVar.a());
                    pduVar.E(outline5, (4294967295L & Math.round(Float.intBitsToFloat(r15))) | (Math.round(Float.intBitsToFloat(i4)) << 32));
                }
            } else {
                pduVar.f(false);
                pduVar.E(null, 0L);
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            u9c u9cVar = this.r;
            mdu mduVar = u9cVar.a;
            if (mduVar != null) {
                mduVar.q--;
                mduVar.b();
                u9cVar.a = null;
            }
            qh50<mdu> qh50Var = u9cVar.c;
            if (qh50Var != null) {
                Object[] objArr = qh50Var.b;
                long[] jArr = qh50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    r11.q--;
                                    ((mdu) objArr[(i << 3) + i3]).b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
                qh50Var.f();
            }
            this.a.G();
        }
    }

    public final void c(oio oioVar) {
        u9c u9cVar = this.r;
        u9cVar.b = u9cVar.a;
        qh50<mdu> qh50Var = u9cVar.c;
        if (qh50Var != null && qh50Var.d()) {
            qh50<mdu> qh50Var2 = u9cVar.d;
            if (qh50Var2 == null) {
                qh50Var2 = k5h0.a();
                u9cVar.d = qh50Var2;
            }
            qh50Var2.l(qh50Var);
            qh50Var.f();
        }
        u9cVar.e = true;
        this.d.invoke(oioVar);
        u9cVar.e = false;
        mdu mduVar = u9cVar.b;
        if (mduVar != null) {
            mduVar.q--;
            mduVar.b();
        }
        qh50<mdu> qh50Var3 = u9cVar.d;
        if (qh50Var3 == null || !qh50Var3.d()) {
            return;
        }
        Object[] objArr = qh50Var3.b;
        long[] jArr = qh50Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r10.q--;
                            ((mdu) objArr[(i << 3) + i3]).b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        qh50Var3.f();
    }

    public final androidx.compose.ui.graphics.c d() {
        androidx.compose.ui.graphics.c bVar;
        androidx.compose.ui.graphics.c cVar = this.k;
        Path path = this.l;
        if (cVar != null) {
            return cVar;
        }
        if (path != null) {
            c.a aVar = new c.a(path);
            this.k = aVar;
            return aVar;
        }
        long w = pli.w(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            w = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (w >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (w & 4294967295L)) + intBitsToFloat2;
        if (this.j > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            bVar = new c.C0013c(ne7.f(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (4294967295L & Float.floatToRawIntBits(r0))));
        } else {
            bVar = new c.b(new zhf0(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = bVar;
        return bVar;
    }

    public final void e(azl azlVar, LayoutDirection layoutDirection, long j, izs<? super oio, s3q0> izsVar) {
        boolean b2 = q9x.b(this.u, j);
        pdu pduVar = this.a;
        if (!b2) {
            this.u = j;
            long j2 = this.t;
            pduVar.R((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = azlVar;
        this.c = layoutDirection;
        this.d = izsVar;
        pduVar.T(azlVar, layoutDirection, this, this.e);
    }

    public final void f(float f) {
        pdu pduVar = this.a;
        if (pduVar.a() == f) {
            return;
        }
        pduVar.b(f);
    }

    public final void g(gyf0 gyf0Var) {
        pdu pduVar = this.a;
        if (epx.f(pduVar.C(), gyf0Var)) {
            return;
        }
        pduVar.s(gyf0Var);
    }

    public final void h(long j, long j2, float f) {
        if (ov70.c(this.h, j) && mxj0.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
