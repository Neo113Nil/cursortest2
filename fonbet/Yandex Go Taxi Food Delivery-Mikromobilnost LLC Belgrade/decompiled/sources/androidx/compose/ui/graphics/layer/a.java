package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.cjs0;
import defpackage.cma1;
import defpackage.dmm0;
import defpackage.eb2;
import defpackage.fwi;
import defpackage.fx80;
import defpackage.gx80;
import defpackage.hx80;
import defpackage.hxv;
import defpackage.i28;
import defpackage.ix80;
import defpackage.iz40;
import defpackage.jb2;
import defpackage.jy00;
import defpackage.k28;
import defpackage.kpb;
import defpackage.l28;
import defpackage.nb2;
import defpackage.nfh;
import defpackage.o0u;
import defpackage.ora1;
import defpackage.qam;
import defpackage.rq90;
import defpackage.rzo;
import defpackage.s72;
import defpackage.t72;
import defpackage.tls;
import defpackage.vez0;
import defpackage.w511;
import defpackage.wu60;
import defpackage.zii0;
import java.util.Locale;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes.dex */
public final class a {
    public final o0u a;
    public Outline f;
    public float j;
    public ix80 k;
    public rq90 l;
    public jb2 m;
    public boolean n;
    public k28 o;
    public eb2 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public fwi b = cma1.b;
    public LayoutDirection c = LayoutDirection.Ltr;
    public tls d = GraphicsLayer$drawBlock$1.w;
    public final tls e = new GraphicsLayer$clipDrawBlock$1(this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final kpb r = new kpb();

    static {
        Build.FINGERPRINT.toLowerCase(Locale.ROOT);
    }

    public a(o0u o0uVar) {
        this.a = o0uVar;
        o0uVar.u = false;
        o0uVar.a();
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        o0u o0uVar = this.a;
        RenderNode renderNode = o0uVar.d;
        if (this.g) {
            boolean z = this.w;
            if (z || o0uVar.o > 0.0f) {
                rq90 rq90Var = this.l;
                if (rq90Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = rq90Var instanceof jb2;
                    if (!z2) {
                        w511.x("Unable to obtain android.graphics.Path");
                        return;
                    }
                    jb2 jb2Var = (jb2) rq90Var;
                    jb2Var.k().computeBounds(rectF, false);
                    Outline outline = this.f;
                    if (outline == null) {
                        outline = new Outline();
                        this.f = outline;
                    }
                    if (Build.VERSION.SDK_INT >= 30) {
                        jy00.a(outline, rq90Var);
                    } else {
                        if (!z2) {
                            w511.x("Unable to obtain android.graphics.Path");
                            return;
                        }
                        outline.setConvexPath(jb2Var.k());
                    }
                    this.n = !outline.canClip();
                    this.l = rq90Var;
                    outline.setAlpha(o0uVar.i);
                    rectF.width();
                    rectF.height();
                    renderNode.setOutline(outline);
                    o0uVar.h = true;
                    o0uVar.a();
                    if (this.n && this.w) {
                        o0uVar.u = false;
                        o0uVar.a();
                        renderNode.discardDisplayList();
                    } else {
                        o0uVar.u = this.w;
                        o0uVar.a();
                    }
                } else {
                    o0uVar.u = z;
                    o0uVar.a();
                    Outline outline2 = this.f;
                    if (outline2 == null) {
                        outline2 = new Outline();
                        this.f = outline2;
                    }
                    Outline outline3 = outline2;
                    long a0 = rzo.a0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        a0 = j2;
                    }
                    int i = (int) (j >> 32);
                    int round = Math.round(Float.intBitsToFloat(i));
                    int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    int round2 = Math.round(Float.intBitsToFloat(i2));
                    int i3 = (int) (a0 >> 32);
                    int round3 = Math.round(Float.intBitsToFloat(i3) + Float.intBitsToFloat(i));
                    float intBitsToFloat = Float.intBitsToFloat(i2);
                    int i4 = (int) (a0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                    outline3.setRoundRect(round, round2, round3, Math.round(Float.intBitsToFloat(i4) + intBitsToFloat), this.j);
                    outline3.setAlpha(o0uVar.i);
                    Float.intBitsToFloat(i3);
                    Float.intBitsToFloat(i4);
                    renderNode.setOutline(outline3);
                    o0uVar.h = true;
                    o0uVar.a();
                }
            } else {
                o0uVar.u = false;
                o0uVar.a();
                renderNode.setOutline(null);
                o0uVar.h = false;
                o0uVar.a();
            }
        }
        this.g = false;
    }

    public final void b() {
        if (this.s && this.q == 0) {
            kpb kpbVar = this.r;
            a aVar = kpbVar.a;
            if (aVar != null) {
                aVar.q--;
                aVar.b();
                kpbVar.a = null;
            }
            iz40 iz40Var = kpbVar.c;
            if (iz40Var != null) {
                Object[] objArr = iz40Var.b;
                long[] jArr = iz40Var.a;
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
                                    ((a) objArr[(i << 3) + i3]).b();
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
                iz40Var.b();
            }
            this.a.d.discardDisplayList();
        }
    }

    public final void c(i28 i28Var, a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        float f;
        o0u o0uVar = this.a;
        RenderNode renderNode = o0uVar.d;
        if (this.s) {
            return;
        }
        a();
        if (!renderNode.hasDisplayList()) {
            try {
                f();
            } catch (Throwable unused) {
            }
        }
        boolean z5 = o0uVar.o > 0.0f;
        if (z5) {
            i28Var.o();
        }
        Canvas canvas = t72.a;
        Canvas canvas2 = ((s72) i28Var).a;
        boolean isHardwareAccelerated = canvas2.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            z = isHardwareAccelerated;
        } else {
            long j = this.t;
            float f2 = (int) (j >> 32);
            float f3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
            z = isHardwareAccelerated;
            long j2 = this.u;
            float f4 = f2 + ((int) (j2 >> 32));
            float f5 = ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + f3;
            float f6 = o0uVar.i;
            int i = o0uVar.j;
            if (f6 < 1.0f || i != 3 || o0uVar.x == 1) {
                eb2 eb2Var = this.p;
                if (eb2Var == null) {
                    eb2Var = new eb2();
                    this.p = eb2Var;
                }
                eb2Var.c(f6);
                eb2Var.e(i);
                eb2Var.g(null);
                Paint B = vez0.B(eb2Var);
                f = f2;
                canvas2.saveLayer(f, f3, f4, f5, B);
            } else {
                canvas2.save();
                f = f2;
            }
            canvas2.translate(f, f3);
            Matrix matrix = o0uVar.g;
            if (matrix == null) {
                matrix = new Matrix();
                o0uVar.g = matrix;
            }
            renderNode.getMatrix(matrix);
            canvas2.concat(matrix);
        }
        boolean z6 = !z && this.w;
        if (z6) {
            i28Var.save();
            ix80 e = e();
            if (e instanceof gx80) {
                i28.g(i28Var, ((gx80) e).a);
            } else if (e instanceof hx80) {
                jb2 jb2Var = this.m;
                if (jb2Var != null) {
                    jb2Var.p();
                } else {
                    jb2Var = nb2.a();
                    this.m = jb2Var;
                }
                jb2Var.f(((hx80) e).b(), Path$Direction.CounterClockwise);
                i28Var.k(jb2Var);
            } else {
                if (!(e instanceof fx80)) {
                    w511.b();
                    return;
                }
                i28Var.k(((fx80) e).b());
            }
        }
        if (aVar != null) {
            kpb kpbVar = aVar.r;
            if (!kpbVar.e) {
                hxv.a("Only add dependencies during a tracking");
            }
            iz40 iz40Var = kpbVar.c;
            if (iz40Var != null) {
                iz40Var.a(this);
            } else if (kpbVar.a != null) {
                iz40 a = dmm0.a();
                a.a(kpbVar.a);
                a.a(this);
                kpbVar.c = a;
                kpbVar.a = null;
            } else {
                kpbVar.a = this;
            }
            iz40 iz40Var2 = kpbVar.d;
            if (iz40Var2 != null) {
                z4 = !iz40Var2.l(this);
            } else if (kpbVar.b != this) {
                z4 = true;
            } else {
                kpbVar.b = null;
                z4 = false;
            }
            if (z4) {
                this.q++;
            }
        }
        s72 s72Var = (s72) i28Var;
        if (s72Var.a.isHardwareAccelerated()) {
            z2 = z5;
            z3 = z6;
            s72Var.a.drawRenderNode(renderNode);
        } else {
            k28 k28Var = this.o;
            if (k28Var == null) {
                k28Var = new k28();
                this.o = k28Var;
            }
            nfh nfhVar = k28Var.b;
            fwi fwiVar = this.b;
            LayoutDirection layoutDirection = this.c;
            long a0 = rzo.a0(this.u);
            fwi r = nfhVar.r();
            LayoutDirection t = nfhVar.t();
            i28 q = nfhVar.q();
            z3 = z6;
            long v = nfhVar.v();
            z2 = z5;
            a aVar2 = (a) nfhVar.b;
            nfhVar.B(fwiVar);
            nfhVar.D(layoutDirection);
            nfhVar.A(i28Var);
            nfhVar.E(a0);
            nfhVar.b = this;
            i28Var.save();
            try {
                d(k28Var);
            } finally {
                i28Var.n();
                nfhVar.B(r);
                nfhVar.D(t);
                nfhVar.A(q);
                nfhVar.E(v);
                nfhVar.b = aVar2;
            }
        }
        if (z3) {
            i28Var.n();
        }
        if (z2) {
            i28Var.f();
        }
        if (z) {
            return;
        }
        canvas2.restore();
    }

    public final void d(qam qamVar) {
        kpb kpbVar = this.r;
        kpbVar.b = kpbVar.a;
        iz40 iz40Var = kpbVar.c;
        if (iz40Var != null && iz40Var.h()) {
            iz40 iz40Var2 = kpbVar.d;
            if (iz40Var2 == null) {
                iz40Var2 = dmm0.a();
                kpbVar.d = iz40Var2;
            }
            iz40Var2.j(iz40Var);
            iz40Var.b();
        }
        kpbVar.e = true;
        this.d.invoke(qamVar);
        kpbVar.e = false;
        a aVar = kpbVar.b;
        if (aVar != null) {
            aVar.q--;
            aVar.b();
        }
        iz40 iz40Var3 = kpbVar.d;
        if (iz40Var3 == null || !iz40Var3.h()) {
            return;
        }
        Object[] objArr = iz40Var3.b;
        long[] jArr = iz40Var3.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            r9.q--;
                            ((a) objArr[(i << 3) + i3]).b();
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
        iz40Var3.b();
    }

    public final ix80 e() {
        ix80 gx80Var;
        ix80 ix80Var = this.k;
        rq90 rq90Var = this.l;
        if (ix80Var != null) {
            return ix80Var;
        }
        if (rq90Var != null) {
            fx80 fx80Var = new fx80(rq90Var);
            this.k = fx80Var;
            return fx80Var;
        }
        long a0 = rzo.a0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            a0 = j2;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (a0 >> 32)) + intBitsToFloat;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (a0 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + intBitsToFloat2;
        if (this.j > 0.0f) {
            gx80Var = new hx80(ora1.c(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4, (Float.floatToRawIntBits(r0) << 32) | (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & Float.floatToRawIntBits(r0))));
        } else {
            gx80Var = new gx80(new zii0(intBitsToFloat, intBitsToFloat2, intBitsToFloat3, intBitsToFloat4));
        }
        this.k = gx80Var;
        return gx80Var;
    }

    public final void f() {
        fwi fwiVar = this.b;
        LayoutDirection layoutDirection = this.c;
        tls tlsVar = this.e;
        o0u o0uVar = this.a;
        k28 k28Var = o0uVar.c;
        RenderNode renderNode = o0uVar.d;
        RecordingCanvas beginRecording = renderNode.beginRecording();
        try {
            l28 l28Var = o0uVar.b;
            s72 s72Var = l28Var.a;
            Canvas canvas = s72Var.a;
            s72Var.a = beginRecording;
            nfh nfhVar = k28Var.b;
            nfhVar.B(fwiVar);
            nfhVar.D(layoutDirection);
            nfhVar.b = this;
            nfhVar.E(o0uVar.e);
            nfhVar.A(s72Var);
            ((GraphicsLayer$clipDrawBlock$1) tlsVar).invoke(k28Var);
            l28Var.a.a = canvas;
        } finally {
            renderNode.endRecording();
        }
    }

    public final void g(float f) {
        o0u o0uVar = this.a;
        if (o0uVar.i == f) {
            return;
        }
        o0uVar.i = f;
        o0uVar.d.setAlpha(f);
    }

    public final void h(long j) {
        if (wu60.c(this.v, j)) {
            return;
        }
        this.v = j;
        long j2 = 9223372034707292159L & j;
        RenderNode renderNode = this.a.d;
        if (j2 == 9205357640488583168L) {
            renderNode.resetPivot();
        } else {
            renderNode.setPivotX(Float.intBitsToFloat((int) (j >> 32)));
            renderNode.setPivotY(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)));
        }
    }

    public final void i(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        o0u o0uVar = this.a;
        o0uVar.d.setPosition(i, i2, ((int) (j2 >> 32)) + i, ((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j2)) + i2);
        o0uVar.e = rzo.a0(j2);
    }

    public final void j(long j, float f, long j2) {
        if (wu60.c(this.h, j) && cjs0.a(this.i, j2) && this.j == f && this.l == null) {
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
