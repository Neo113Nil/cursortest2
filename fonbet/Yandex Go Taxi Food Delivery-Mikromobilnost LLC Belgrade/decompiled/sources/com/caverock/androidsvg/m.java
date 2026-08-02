package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Base64;
import android.util.Log;
import defpackage.anl0;
import defpackage.bml0;
import defpackage.bnl0;
import defpackage.cml0;
import defpackage.cwa1;
import defpackage.dml0;
import defpackage.dnl0;
import defpackage.fml0;
import defpackage.fnl0;
import defpackage.gml0;
import defpackage.gnl0;
import defpackage.hml0;
import defpackage.hnl0;
import defpackage.hxe0;
import defpackage.iml0;
import defpackage.inl0;
import defpackage.jml0;
import defpackage.jnl0;
import defpackage.kdd0;
import defpackage.kml0;
import defpackage.lml0;
import defpackage.lnl0;
import defpackage.mml0;
import defpackage.mnl0;
import defpackage.nml0;
import defpackage.oml0;
import defpackage.onl0;
import defpackage.pml0;
import defpackage.pnl0;
import defpackage.pt3;
import defpackage.qml0;
import defpackage.rml0;
import defpackage.rnl0;
import defpackage.sml0;
import defpackage.snl0;
import defpackage.tml0;
import defpackage.tnl0;
import defpackage.uml0;
import defpackage.unl0;
import defpackage.vml0;
import defpackage.vnl0;
import defpackage.w97;
import defpackage.wll0;
import defpackage.wnl0;
import defpackage.xll0;
import defpackage.xml0;
import defpackage.xnl0;
import defpackage.yll0;
import defpackage.yml0;
import defpackage.ynl0;
import defpackage.zll0;
import defpackage.zml0;
import defpackage.znl0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.Stack;

/* loaded from: classes10.dex */
public final class m {
    public static HashSet g;
    public final Canvas a;
    public l b;
    public ynl0 c;
    public Stack d;
    public Stack e;
    public Stack f;

    public m(Canvas canvas) {
        this.a = canvas;
    }

    public static void N(ynl0 ynl0Var, boolean z, bnl0 bnl0Var) {
        int i;
        k kVar = ynl0Var.a;
        float floatValue = (z ? kVar.w : kVar.y).floatValue();
        if (bnl0Var instanceof yll0) {
            i = ((yll0) bnl0Var).a;
        } else if (!(bnl0Var instanceof zll0)) {
            return;
        } else {
            i = ynl0Var.a.G.a;
        }
        int i2 = i(floatValue, i);
        if (z) {
            ynl0Var.d.setColor(i2);
        } else {
            ynl0Var.e.setColor(i2);
        }
    }

    public static void a(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2, float f6, float f7, mml0 mml0Var) {
        if (f == f6 && f2 == f7) {
            return;
        }
        if (f3 == 0.0f || f4 == 0.0f) {
            mml0Var.T(f6, f7);
            return;
        }
        float abs = Math.abs(f3);
        float abs2 = Math.abs(f4);
        double radians = Math.toRadians(f5 % 360.0d);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d = (f - f6) / 2.0d;
        double d2 = (f2 - f7) / 2.0d;
        double d3 = (sin * d2) + (cos * d);
        double d4 = (cos * d2) + ((-sin) * d);
        double d5 = abs * abs;
        double d6 = abs2 * abs2;
        double d7 = d3 * d3;
        double d8 = d4 * d4;
        double d9 = (d8 / d6) + (d7 / d5);
        if (d9 > 0.99999d) {
            double sqrt = Math.sqrt(d9) * 1.00001d;
            abs = (float) (abs * sqrt);
            abs2 = (float) (sqrt * abs2);
            d5 = abs * abs;
            d6 = abs2 * abs2;
        }
        double d10 = z == z2 ? -1.0d : 1.0d;
        double d11 = d5 * d6;
        double d12 = d5 * d8;
        double d13 = d6 * d7;
        double d14 = ((d11 - d12) - d13) / (d12 + d13);
        if (d14 < 0.0d) {
            d14 = 0.0d;
        }
        double sqrt2 = Math.sqrt(d14) * d10;
        double d15 = abs;
        double d16 = abs2;
        double d17 = ((d15 * d4) / d16) * sqrt2;
        double d18 = sqrt2 * (-((d16 * d3) / d15));
        double d19 = ((cos * d17) - (sin * d18)) + ((f + f6) / 2.0d);
        double d20 = (cos * d18) + (sin * d17) + ((f2 + f7) / 2.0d);
        double d21 = (d3 - d17) / d15;
        double d22 = (d4 - d18) / d16;
        double d23 = ((-d3) - d17) / d15;
        double d24 = ((-d4) - d18) / d16;
        double d25 = (d22 * d22) + (d21 * d21);
        double acos = Math.acos(d21 / Math.sqrt(d25)) * (d22 < 0.0d ? -1.0d : 1.0d);
        double sqrt3 = ((d22 * d24) + (d21 * d23)) / Math.sqrt(((d24 * d24) + (d23 * d23)) * d25);
        double acos2 = ((d21 * d24) - (d22 * d23) < 0.0d ? -1.0d : 1.0d) * (sqrt3 < -1.0d ? 3.141592653589793d : sqrt3 > 1.0d ? 0.0d : Math.acos(sqrt3));
        if (!z2 && acos2 > 0.0d) {
            acos2 -= 6.283185307179586d;
        } else if (z2 && acos2 < 0.0d) {
            acos2 += 6.283185307179586d;
        }
        double d26 = acos2 % 6.283185307179586d;
        double d27 = acos % 6.283185307179586d;
        int ceil = (int) Math.ceil((Math.abs(d26) * 2.0d) / 3.141592653589793d);
        double d28 = d26 / ceil;
        double d29 = d28 / 2.0d;
        double sin2 = (Math.sin(d29) * 1.3333333333333333d) / (Math.cos(d29) + 1.0d);
        int i = ceil * 6;
        float[] fArr = new float[i];
        int i2 = 0;
        int i3 = 0;
        while (i2 < ceil) {
            double d30 = d27;
            double d31 = (i2 * d28) + d30;
            double cos2 = Math.cos(d31);
            double sin3 = Math.sin(d31);
            int i4 = i2;
            int i5 = i3;
            fArr[i5] = (float) (cos2 - (sin2 * sin3));
            fArr[i3 + 1] = (float) ((cos2 * sin2) + sin3);
            double d32 = d31 + d28;
            double cos3 = Math.cos(d32);
            double sin4 = Math.sin(d32);
            fArr[i5 + 2] = (float) ((sin2 * sin4) + cos3);
            fArr[i5 + 3] = (float) (sin4 - (sin2 * cos3));
            fArr[i5 + 4] = (float) cos3;
            i3 = i5 + 6;
            fArr[i5 + 5] = (float) sin4;
            i2 = i4 + 1;
            d27 = d30;
            ceil = ceil;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(abs, abs2);
        matrix.postRotate(f5);
        matrix.postTranslate((float) d19, (float) d20);
        matrix.mapPoints(fArr);
        fArr[i - 2] = f6;
        fArr[i - 1] = f7;
        for (int i6 = 0; i6 < i; i6 += 6) {
            mml0Var.V(fArr[i6], fArr[i6 + 1], fArr[i6 + 2], fArr[i6 + 3], fArr[i6 + 4], fArr[i6 + 5]);
        }
    }

    public static pt3 c(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new pt3(rectF.left, rectF.top, rectF.width(), rectF.height(), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        if (r1 != 8) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Matrix e(pt3 pt3Var, pt3 pt3Var2, hxe0 hxe0Var) {
        PreserveAspectRatio$Alignment preserveAspectRatio$Alignment;
        float f;
        float f2;
        Matrix matrix = new Matrix();
        if (hxe0Var != null && (preserveAspectRatio$Alignment = hxe0Var.a) != null) {
            float f3 = pt3Var.d / pt3Var2.d;
            float f4 = pt3Var.e / pt3Var2.e;
            float f5 = -pt3Var2.b;
            float f6 = -pt3Var2.c;
            if (hxe0Var.equals(hxe0.c)) {
                matrix.preTranslate(pt3Var.b, pt3Var.c);
                matrix.preScale(f3, f4);
                matrix.preTranslate(f5, f6);
                return matrix;
            }
            float max = hxe0Var.b == PreserveAspectRatio$Scale.slice ? Math.max(f3, f4) : Math.min(f3, f4);
            float f7 = pt3Var.d / max;
            float f8 = pt3Var.e / max;
            int[] iArr = rnl0.a;
            switch (iArr[preserveAspectRatio$Alignment.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    f2 = (pt3Var2.d - f7) / 2.0f;
                    break;
                case 4:
                case 5:
                case 6:
                    f2 = pt3Var2.d - f7;
                    break;
            }
            f5 -= f2;
            int i = iArr[preserveAspectRatio$Alignment.ordinal()];
            if (i != 2) {
                if (i != 3) {
                    if (i != 5) {
                        if (i != 6) {
                            if (i != 7) {
                            }
                        }
                    }
                }
                f = pt3Var2.e - f8;
                f6 -= f;
                matrix.preTranslate(pt3Var.b, pt3Var.c);
                matrix.preScale(max, max);
                matrix.preTranslate(f5, f6);
            }
            f = (pt3Var2.e - f8) / 2.0f;
            f6 -= f;
            matrix.preTranslate(pt3Var.b, pt3Var.c);
            matrix.preScale(max, max);
            matrix.preTranslate(f5, f6);
        }
        return matrix;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r5.equals("sans-serif") == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface h(String str, Integer num, SVG$Style$FontStyle sVG$Style$FontStyle) {
        char c = 0;
        boolean z = sVG$Style$FontStyle == SVG$Style$FontStyle.Italic;
        int i = num.intValue() > 500 ? z ? 3 : 1 : z ? 2 : 0;
        str.getClass();
        switch (str.hashCode()) {
            case -1536685117:
                break;
            case -1431958525:
                if (str.equals("monospace")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1081737434:
                if (str.equals("fantasy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 109326717:
                if (str.equals("serif")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1126973893:
                if (str.equals("cursive")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return Typeface.create(Typeface.SANS_SERIF, i);
            case 1:
                return Typeface.create(Typeface.MONOSPACE, i);
            case 2:
                return Typeface.create(Typeface.SANS_SERIF, i);
            case 3:
                return Typeface.create(Typeface.SERIF, i);
            case 4:
                return Typeface.create(Typeface.SANS_SERIF, i);
            default:
                return null;
        }
    }

    public static int i(float f, int i) {
        int i2 = 255;
        int round = Math.round(((i >> 24) & 255) * f);
        if (round < 0) {
            i2 = 0;
        } else if (round <= 255) {
            i2 = round;
        }
        return (i2 << 24) | (i & 16777215);
    }

    public static void o(String str, Object... objArr) {
        Log.e("SVGAndroidRenderer", String.format(str, objArr));
    }

    public static void q(dnl0 dnl0Var, dnl0 dnl0Var2) {
        if (dnl0Var.m == null) {
            dnl0Var.m = dnl0Var2.m;
        }
        if (dnl0Var.n == null) {
            dnl0Var.n = dnl0Var2.n;
        }
        if (dnl0Var.o == null) {
            dnl0Var.o = dnl0Var2.o;
        }
        if (dnl0Var.p == null) {
            dnl0Var.p = dnl0Var2.p;
        }
        if (dnl0Var.q == null) {
            dnl0Var.q = dnl0Var2.q;
        }
    }

    public static void r(i iVar, String str) {
        yml0 h = iVar.a.h(str);
        if (h == null) {
            return;
        }
        if (!(h instanceof i)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (h == iVar) {
            o("Circular reference in gradient href attribute '%s'", str);
            return;
        }
        i iVar2 = (i) h;
        if (iVar.i == null) {
            iVar.i = iVar2.i;
        }
        if (iVar.j == null) {
            iVar.j = iVar2.j;
        }
        if (iVar.k == null) {
            iVar.k = iVar2.k;
        }
        if (iVar.h.isEmpty()) {
            iVar.h = iVar2.h;
        }
        try {
            if (iVar instanceof zml0) {
                zml0 zml0Var = (zml0) iVar;
                zml0 zml0Var2 = (zml0) h;
                if (zml0Var.m == null) {
                    zml0Var.m = zml0Var2.m;
                }
                if (zml0Var.n == null) {
                    zml0Var.n = zml0Var2.n;
                }
                if (zml0Var.o == null) {
                    zml0Var.o = zml0Var2.o;
                }
                if (zml0Var.p == null) {
                    zml0Var.p = zml0Var2.p;
                }
            } else {
                q((dnl0) iVar, (dnl0) h);
            }
        } catch (ClassCastException unused) {
        }
        String str2 = iVar2.l;
        if (str2 != null) {
            r(iVar, str2);
        }
    }

    public static void s(nml0 nml0Var, String str) {
        yml0 h = nml0Var.a.h(str);
        if (h == null) {
            return;
        }
        if (!(h instanceof nml0)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (h == nml0Var) {
            o("Circular reference in pattern href attribute '%s'", str);
            return;
        }
        nml0 nml0Var2 = (nml0) h;
        if (nml0Var.p == null) {
            nml0Var.p = nml0Var2.p;
        }
        if (nml0Var.q == null) {
            nml0Var.q = nml0Var2.q;
        }
        if (nml0Var.r == null) {
            nml0Var.r = nml0Var2.r;
        }
        if (nml0Var.s == null) {
            nml0Var.s = nml0Var2.s;
        }
        if (nml0Var.t == null) {
            nml0Var.t = nml0Var2.t;
        }
        if (nml0Var.u == null) {
            nml0Var.u = nml0Var2.u;
        }
        if (nml0Var.v == null) {
            nml0Var.v = nml0Var2.v;
        }
        if (nml0Var.i.isEmpty()) {
            nml0Var.i = nml0Var2.i;
        }
        if (nml0Var.o == null) {
            nml0Var.o = nml0Var2.o;
        }
        if (nml0Var.n == null) {
            nml0Var.n = nml0Var2.n;
        }
        String str2 = nml0Var2.w;
        if (str2 != null) {
            s(nml0Var, str2);
        }
    }

    public static boolean w(k kVar, long j) {
        return (kVar.a & j) != 0;
    }

    public static Path z(oml0 oml0Var) {
        Path path = new Path();
        float[] fArr = oml0Var.o;
        path.moveTo(fArr[0], fArr[1]);
        int i = 2;
        while (true) {
            float[] fArr2 = oml0Var.o;
            if (i >= fArr2.length) {
                break;
            }
            path.lineTo(fArr2[i], fArr2[i + 1]);
            i += 2;
        }
        if (oml0Var instanceof pml0) {
            path.close();
        }
        if (oml0Var.h == null) {
            oml0Var.h = c(path);
        }
        return path;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Path A(qml0 qml0Var) {
        float d;
        float e;
        float min;
        float d2;
        float e2;
        float f;
        float f2;
        Path path;
        j jVar = qml0Var.s;
        if (jVar == null && qml0Var.t == null) {
            d = 0.0f;
        } else {
            j jVar2 = qml0Var.t;
            if (jVar == null) {
                d = jVar2.e(this);
            } else {
                if (jVar2 != null) {
                    d = jVar.d(this);
                    e = qml0Var.t.e(this);
                    min = Math.min(d, qml0Var.q.d(this) / 2.0f);
                    float min2 = Math.min(e, qml0Var.r.e(this) / 2.0f);
                    j jVar3 = qml0Var.o;
                    d2 = jVar3 == null ? jVar3.d(this) : 0.0f;
                    j jVar4 = qml0Var.p;
                    e2 = jVar4 == null ? jVar4.e(this) : 0.0f;
                    float d3 = qml0Var.q.d(this);
                    float e3 = qml0Var.r.e(this);
                    if (qml0Var.h == null) {
                        float f3 = e2;
                        e2 = f3;
                        qml0Var.h = new pt3(d2, f3, d3, e3, 1);
                    }
                    f = d2 + d3;
                    f2 = e2 + e3;
                    path = new Path();
                    if (min != 0.0f || min2 == 0.0f) {
                        path.moveTo(d2, e2);
                        path.lineTo(f, e2);
                        path.lineTo(f, f2);
                        path.lineTo(d2, f2);
                        path.lineTo(d2, e2);
                    } else {
                        float f4 = min * 0.5522848f;
                        float f5 = 0.5522848f * min2;
                        float f6 = e2 + min2;
                        path.moveTo(d2, f6);
                        float f7 = f6 - f5;
                        float f8 = d2 + min;
                        float f9 = f8 - f4;
                        path.cubicTo(d2, f7, f9, e2, f8, e2);
                        float f10 = f - min;
                        path.lineTo(f10, e2);
                        float f11 = f10 + f4;
                        path.cubicTo(f11, e2, f, f7, f, f6);
                        float f12 = f2 - min2;
                        path.lineTo(f, f12);
                        float f13 = f12 + f5;
                        path.cubicTo(f, f13, f11, f2, f10, f2);
                        path.lineTo(f8, f2);
                        float f14 = d2;
                        path.cubicTo(f9, f2, f14, f13, d2, f12);
                        path.lineTo(f14, f6);
                    }
                    path.close();
                    return path;
                }
                d = jVar.d(this);
            }
        }
        e = d;
        min = Math.min(d, qml0Var.q.d(this) / 2.0f);
        float min22 = Math.min(e, qml0Var.r.e(this) / 2.0f);
        j jVar32 = qml0Var.o;
        if (jVar32 == null) {
        }
        j jVar42 = qml0Var.p;
        if (jVar42 == null) {
        }
        float d32 = qml0Var.q.d(this);
        float e32 = qml0Var.r.e(this);
        if (qml0Var.h == null) {
        }
        f = d2 + d32;
        f2 = e2 + e32;
        path = new Path();
        if (min != 0.0f) {
        }
        path.moveTo(d2, e2);
        path.lineTo(f, e2);
        path.lineTo(f, f2);
        path.lineTo(d2, f2);
        path.lineTo(d2, e2);
        path.close();
        return path;
    }

    public final pt3 B(j jVar, j jVar2, j jVar3, j jVar4) {
        float d = jVar != null ? jVar.d(this) : 0.0f;
        float e = jVar2 != null ? jVar2.e(this) : 0.0f;
        ynl0 ynl0Var = this.c;
        pt3 pt3Var = ynl0Var.g;
        if (pt3Var == null) {
            pt3Var = ynl0Var.f;
        }
        return new pt3(d, e, jVar3 != null ? jVar3.d(this) : pt3Var.d, jVar4 != null ? jVar4.e(this) : pt3Var.e, 1);
    }

    public final Path C(xml0 xml0Var, boolean z) {
        Path path;
        Path b;
        this.d.push(this.c);
        ynl0 ynl0Var = new ynl0(this.c);
        this.c = ynl0Var;
        T(ynl0Var, xml0Var);
        if (!k() || !V()) {
            this.c = (ynl0) this.d.pop();
            return null;
        }
        if (xml0Var instanceof pnl0) {
            if (!z) {
                o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
            }
            pnl0 pnl0Var = (pnl0) xml0Var;
            yml0 h = xml0Var.a.h(pnl0Var.o);
            if (h == null) {
                o("Use reference '%s' not found", pnl0Var.o);
                this.c = (ynl0) this.d.pop();
                return null;
            }
            if (!(h instanceof xml0)) {
                this.c = (ynl0) this.d.pop();
                return null;
            }
            path = C((xml0) h, false);
            if (path != null) {
                if (pnl0Var.h == null) {
                    pnl0Var.h = c(path);
                }
                Matrix matrix = pnl0Var.n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                if (this.c.a.Z != null && (b = b(xml0Var, xml0Var.h)) != null) {
                    path.op(b, Path.Op.INTERSECT);
                }
                this.c = (ynl0) this.d.pop();
                return path;
            }
            return null;
        }
        if (xml0Var instanceof cml0) {
            cml0 cml0Var = (cml0) xml0Var;
            if (xml0Var instanceof lml0) {
                path = (Path) new unl0(((lml0) xml0Var).o).c;
                if (xml0Var.h == null) {
                    xml0Var.h = c(path);
                }
            } else {
                path = xml0Var instanceof qml0 ? A((qml0) xml0Var) : xml0Var instanceof wll0 ? x((wll0) xml0Var) : xml0Var instanceof bml0 ? y((bml0) xml0Var) : xml0Var instanceof oml0 ? z((oml0) xml0Var) : null;
            }
            if (path != null) {
                if (cml0Var.h == null) {
                    cml0Var.h = c(path);
                }
                Matrix matrix2 = cml0Var.n;
                if (matrix2 != null) {
                    path.transform(matrix2);
                }
                SVG$Style$FillRule sVG$Style$FillRule = this.c.a.a0;
                path.setFillType((sVG$Style$FillRule == null || sVG$Style$FillRule != SVG$Style$FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
            }
            return null;
        }
        if (!(xml0Var instanceof jnl0)) {
            o("Invalid %s element found in clipPath definition", xml0Var.n());
            return null;
        }
        jnl0 jnl0Var = (jnl0) xml0Var;
        ArrayList arrayList = jnl0Var.n;
        float f = 0.0f;
        float d = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((j) jnl0Var.n.get(0)).d(this);
        ArrayList arrayList2 = jnl0Var.o;
        float e = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((j) jnl0Var.o.get(0)).e(this);
        ArrayList arrayList3 = jnl0Var.p;
        float d2 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((j) jnl0Var.p.get(0)).d(this);
        ArrayList arrayList4 = jnl0Var.q;
        if (arrayList4 != null && arrayList4.size() != 0) {
            f = ((j) jnl0Var.q.get(0)).e(this);
        }
        if (this.c.a.N != SVG$Style$TextAnchor.Start) {
            float d3 = d(jnl0Var);
            if (this.c.a.N == SVG$Style$TextAnchor.Middle) {
                d3 /= 2.0f;
            }
            d -= d3;
        }
        if (jnl0Var.h == null) {
            xnl0 xnl0Var = new xnl0(this, d, e);
            n(jnl0Var, xnl0Var);
            Object obj = xnl0Var.e;
            RectF rectF = (RectF) obj;
            jnl0Var.h = new pt3(rectF.left, rectF.top, rectF.width(), ((RectF) obj).height(), 1);
        }
        Path path2 = new Path();
        n(jnl0Var, new xnl0(this, d + d2, e + f, path2));
        Matrix matrix3 = jnl0Var.r;
        if (matrix3 != null) {
            path2.transform(matrix3);
        }
        SVG$Style$FillRule sVG$Style$FillRule2 = this.c.a.a0;
        path2.setFillType((sVG$Style$FillRule2 == null || sVG$Style$FillRule2 != SVG$Style$FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
        path = path2;
        if (this.c.a.Z != null) {
            path.op(b, Path.Op.INTERSECT);
        }
        this.c = (ynl0) this.d.pop();
        return path;
    }

    public final void D(pt3 pt3Var) {
        if (this.c.a.b0 != null) {
            Paint paint = new Paint();
            PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
            paint.setXfermode(new PorterDuffXfermode(mode));
            Canvas canvas = this.a;
            canvas.saveLayer(null, paint, 31);
            Paint paint2 = new Paint();
            paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f})));
            canvas.saveLayer(null, paint2, 31);
            iml0 iml0Var = (iml0) this.b.h(this.c.a.b0);
            L(iml0Var, pt3Var);
            canvas.restore();
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(mode));
            canvas.saveLayer(null, paint3, 31);
            L(iml0Var, pt3Var);
            canvas.restore();
            canvas.restore();
        }
        O();
    }

    public final boolean E() {
        yml0 h;
        int i = 0;
        if (this.c.a.F.floatValue() >= 1.0f && this.c.a.b0 == null) {
            return false;
        }
        int floatValue = (int) (this.c.a.F.floatValue() * 256.0f);
        if (floatValue >= 0) {
            i = 255;
            if (floatValue <= 255) {
                i = floatValue;
            }
        }
        this.a.saveLayerAlpha(null, i, 31);
        this.d.push(this.c);
        ynl0 ynl0Var = new ynl0(this.c);
        this.c = ynl0Var;
        String str = ynl0Var.a.b0;
        if (str != null && ((h = this.b.h(str)) == null || !(h instanceof iml0))) {
            o("Mask reference '%s' not found", this.c.a.b0);
            this.c.a.b0 = null;
        }
        return true;
    }

    public final void F(tml0 tml0Var, pt3 pt3Var, pt3 pt3Var2, hxe0 hxe0Var) {
        if (pt3Var.d == 0.0f || pt3Var.e == 0.0f) {
            return;
        }
        if (hxe0Var == null && (hxe0Var = tml0Var.n) == null) {
            hxe0Var = hxe0.d;
        }
        T(this.c, tml0Var);
        if (k()) {
            ynl0 ynl0Var = this.c;
            ynl0Var.f = pt3Var;
            if (!ynl0Var.a.O.booleanValue()) {
                pt3 pt3Var3 = this.c.f;
                M(pt3Var3.b, pt3Var3.c, pt3Var3.d, pt3Var3.e);
            }
            f(tml0Var, this.c.f);
            ynl0 ynl0Var2 = this.c;
            Canvas canvas = this.a;
            if (pt3Var2 != null) {
                canvas.concat(e(ynl0Var2.f, pt3Var2, hxe0Var));
                this.c.g = tml0Var.o;
            } else {
                pt3 pt3Var4 = ynl0Var2.f;
                canvas.translate(pt3Var4.b, pt3Var4.c);
            }
            boolean E = E();
            U();
            H(tml0Var, true);
            if (E) {
                D(tml0Var.h);
            }
            R(tml0Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void G(anl0 anl0Var) {
        j jVar;
        String str;
        int indexOf;
        Set e;
        j jVar2;
        Boolean bool;
        if (anl0Var instanceof jml0) {
            return;
        }
        P();
        if ((anl0Var instanceof yml0) && (bool = ((yml0) anl0Var).d) != null) {
            this.c.h = bool.booleanValue();
        }
        if (anl0Var instanceof tml0) {
            tml0 tml0Var = (tml0) anl0Var;
            F(tml0Var, B(tml0Var.p, tml0Var.q, tml0Var.r, tml0Var.s), tml0Var.o, tml0Var.n);
        } else {
            Bitmap bitmap = null;
            if (anl0Var instanceof pnl0) {
                pnl0 pnl0Var = (pnl0) anl0Var;
                Canvas canvas = this.a;
                j jVar3 = pnl0Var.r;
                if ((jVar3 == null || !jVar3.g()) && ((jVar2 = pnl0Var.s) == null || !jVar2.g())) {
                    T(this.c, pnl0Var);
                    if (k()) {
                        anl0 h = pnl0Var.a.h(pnl0Var.o);
                        if (h == null) {
                            o("Use reference '%s' not found", pnl0Var.o);
                        } else {
                            Matrix matrix = pnl0Var.n;
                            if (matrix != null) {
                                canvas.concat(matrix);
                            }
                            j jVar4 = pnl0Var.p;
                            float d = jVar4 != null ? jVar4.d(this) : 0.0f;
                            j jVar5 = pnl0Var.q;
                            canvas.translate(d, jVar5 != null ? jVar5.e(this) : 0.0f);
                            f(pnl0Var, pnl0Var.h);
                            boolean E = E();
                            this.e.push(pnl0Var);
                            this.f.push(this.a.getMatrix());
                            if (h instanceof tml0) {
                                tml0 tml0Var2 = (tml0) h;
                                pt3 B = B(null, null, pnl0Var.r, pnl0Var.s);
                                P();
                                F(tml0Var2, B, tml0Var2.o, tml0Var2.n);
                                O();
                            } else if (h instanceof gnl0) {
                                j jVar6 = pnl0Var.r;
                                if (jVar6 == null) {
                                    jVar6 = new j(100.0f, SVG$Unit.percent);
                                }
                                j jVar7 = pnl0Var.s;
                                if (jVar7 == null) {
                                    jVar7 = new j(100.0f, SVG$Unit.percent);
                                }
                                pt3 B2 = B(null, null, jVar6, jVar7);
                                P();
                                gnl0 gnl0Var = (gnl0) h;
                                if (B2.d != 0.0f && B2.e != 0.0f) {
                                    hxe0 hxe0Var = gnl0Var.n;
                                    if (hxe0Var == null) {
                                        hxe0Var = hxe0.d;
                                    }
                                    T(this.c, gnl0Var);
                                    ynl0 ynl0Var = this.c;
                                    ynl0Var.f = B2;
                                    if (!ynl0Var.a.O.booleanValue()) {
                                        pt3 pt3Var = this.c.f;
                                        M(pt3Var.b, pt3Var.c, pt3Var.d, pt3Var.e);
                                    }
                                    pt3 pt3Var2 = gnl0Var.o;
                                    ynl0 ynl0Var2 = this.c;
                                    if (pt3Var2 != null) {
                                        canvas.concat(e(ynl0Var2.f, pt3Var2, hxe0Var));
                                        this.c.g = gnl0Var.o;
                                    } else {
                                        pt3 pt3Var3 = ynl0Var2.f;
                                        canvas.translate(pt3Var3.b, pt3Var3.c);
                                    }
                                    boolean E2 = E();
                                    H(gnl0Var, true);
                                    if (E2) {
                                        D(gnl0Var.h);
                                    }
                                    R(gnl0Var);
                                }
                                O();
                            } else {
                                G(h);
                            }
                            this.e.pop();
                            this.f.pop();
                            if (E) {
                                D(pnl0Var.h);
                            }
                            R(pnl0Var);
                        }
                    }
                }
            } else if (anl0Var instanceof fnl0) {
                fnl0 fnl0Var = (fnl0) anl0Var;
                T(this.c, fnl0Var);
                if (k()) {
                    Matrix matrix2 = fnl0Var.n;
                    if (matrix2 != null) {
                        this.a.concat(matrix2);
                    }
                    f(fnl0Var, fnl0Var.h);
                    boolean E3 = E();
                    String language = Locale.getDefault().getLanguage();
                    Iterator it = fnl0Var.i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        anl0 anl0Var2 = (anl0) it.next();
                        if (anl0Var2 instanceof uml0) {
                            uml0 uml0Var = (uml0) anl0Var2;
                            if (uml0Var.a() == null && ((e = uml0Var.e()) == null || (!e.isEmpty() && e.contains(language)))) {
                                Set g2 = uml0Var.g();
                                if (g2 != null) {
                                    if (g == null) {
                                        synchronized (m.class) {
                                            HashSet hashSet = new HashSet();
                                            g = hashSet;
                                            hashSet.add("Structure");
                                            g.add("BasicStructure");
                                            g.add("ConditionalProcessing");
                                            g.add("Image");
                                            g.add("Style");
                                            g.add("ViewportAttribute");
                                            g.add("Shape");
                                            g.add("BasicText");
                                            g.add("PaintAttribute");
                                            g.add("BasicPaintAttribute");
                                            g.add("OpacityAttribute");
                                            g.add("BasicGraphicsAttribute");
                                            g.add("Marker");
                                            g.add("Gradient");
                                            g.add("Pattern");
                                            g.add("Clip");
                                            g.add("BasicClip");
                                            g.add("Mask");
                                            g.add("View");
                                        }
                                    }
                                    if (!g2.isEmpty() && g.containsAll(g2)) {
                                    }
                                }
                                Set d2 = uml0Var.d();
                                if (d2 == null) {
                                    Set m = uml0Var.m();
                                    if (m == null) {
                                        G(anl0Var2);
                                        break;
                                    }
                                    m.isEmpty();
                                } else {
                                    d2.isEmpty();
                                }
                            }
                        }
                    }
                    if (E3) {
                        D(fnl0Var.h);
                    }
                    R(fnl0Var);
                }
            } else if (anl0Var instanceof dml0) {
                dml0 dml0Var = (dml0) anl0Var;
                T(this.c, dml0Var);
                if (k()) {
                    Matrix matrix3 = dml0Var.n;
                    if (matrix3 != null) {
                        this.a.concat(matrix3);
                    }
                    f(dml0Var, dml0Var.h);
                    boolean E4 = E();
                    H(dml0Var, true);
                    if (E4) {
                        D(dml0Var.h);
                    }
                    R(dml0Var);
                }
            } else {
                if (anl0Var instanceof fml0) {
                    fml0 fml0Var = (fml0) anl0Var;
                    Canvas canvas2 = this.a;
                    j jVar8 = fml0Var.r;
                    if (jVar8 != null && !jVar8.g() && (jVar = fml0Var.s) != null && !jVar.g() && (str = fml0Var.o) != null) {
                        hxe0 hxe0Var2 = fml0Var.n;
                        if (hxe0Var2 == null) {
                            hxe0Var2 = hxe0.d;
                        }
                        hxe0 hxe0Var3 = hxe0Var2;
                        if (str.startsWith("data:") && str.length() >= 14 && (indexOf = str.indexOf(44)) >= 12 && ";base64".equals(str.substring(indexOf - 7, indexOf))) {
                            try {
                                byte[] decode = Base64.decode(str.substring(indexOf + 1), 0);
                                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                            } catch (Exception e2) {
                                Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", e2);
                            }
                        }
                        if (bitmap != null) {
                            pt3 pt3Var4 = new pt3(r6, r6, bitmap.getWidth(), bitmap.getHeight(), 1);
                            T(this.c, fml0Var);
                            if (k() && V()) {
                                Matrix matrix4 = fml0Var.t;
                                if (matrix4 != null) {
                                    canvas2.concat(matrix4);
                                }
                                j jVar9 = fml0Var.p;
                                float d3 = jVar9 != null ? jVar9.d(this) : 0.0f;
                                j jVar10 = fml0Var.q;
                                float e3 = jVar10 != null ? jVar10.e(this) : 0.0f;
                                float d4 = fml0Var.r.d(this);
                                float d5 = fml0Var.s.d(this);
                                ynl0 ynl0Var3 = this.c;
                                ynl0Var3.f = new pt3(d3, e3, d4, d5, 1);
                                if (!ynl0Var3.a.O.booleanValue()) {
                                    pt3 pt3Var5 = this.c.f;
                                    M(pt3Var5.b, pt3Var5.c, pt3Var5.d, pt3Var5.e);
                                }
                                fml0Var.h = this.c.f;
                                R(fml0Var);
                                f(fml0Var, fml0Var.h);
                                boolean E5 = E();
                                U();
                                canvas2.save();
                                canvas2.concat(e(this.c.f, pt3Var4, hxe0Var3));
                                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(this.c.a.h0 != SVG$Style$RenderQuality.optimizeSpeed ? 2 : 0));
                                canvas2.restore();
                                if (E5) {
                                    D(fml0Var.h);
                                }
                            }
                        }
                    }
                } else if (anl0Var instanceof lml0) {
                    lml0 lml0Var = (lml0) anl0Var;
                    if (lml0Var.o != null) {
                        T(this.c, lml0Var);
                        if (k() && V()) {
                            ynl0 ynl0Var4 = this.c;
                            if (ynl0Var4.c || ynl0Var4.b) {
                                Matrix matrix5 = lml0Var.n;
                                if (matrix5 != null) {
                                    this.a.concat(matrix5);
                                }
                                Path path = (Path) new unl0(lml0Var.o).c;
                                if (lml0Var.h == null) {
                                    lml0Var.h = c(path);
                                }
                                R(lml0Var);
                                g(lml0Var);
                                f(lml0Var, lml0Var.h);
                                boolean E6 = E();
                                ynl0 ynl0Var5 = this.c;
                                if (ynl0Var5.b) {
                                    SVG$Style$FillRule sVG$Style$FillRule = ynl0Var5.a.c;
                                    path.setFillType((sVG$Style$FillRule == null || sVG$Style$FillRule != SVG$Style$FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    l(lml0Var, path);
                                }
                                if (this.c.c) {
                                    m(path);
                                }
                                K(lml0Var);
                                if (E6) {
                                    D(lml0Var.h);
                                }
                            }
                        }
                    }
                } else if (anl0Var instanceof qml0) {
                    qml0 qml0Var = (qml0) anl0Var;
                    j jVar11 = qml0Var.q;
                    if (jVar11 != null && qml0Var.r != null && !jVar11.g() && !qml0Var.r.g()) {
                        T(this.c, qml0Var);
                        if (k() && V()) {
                            Matrix matrix6 = qml0Var.n;
                            if (matrix6 != null) {
                                this.a.concat(matrix6);
                            }
                            Path A = A(qml0Var);
                            R(qml0Var);
                            g(qml0Var);
                            f(qml0Var, qml0Var.h);
                            boolean E7 = E();
                            if (this.c.b) {
                                l(qml0Var, A);
                            }
                            if (this.c.c) {
                                m(A);
                            }
                            if (E7) {
                                D(qml0Var.h);
                            }
                        }
                    }
                } else if (anl0Var instanceof wll0) {
                    wll0 wll0Var = (wll0) anl0Var;
                    j jVar12 = wll0Var.q;
                    if (jVar12 != null && !jVar12.g()) {
                        T(this.c, wll0Var);
                        if (k() && V()) {
                            Matrix matrix7 = wll0Var.n;
                            if (matrix7 != null) {
                                this.a.concat(matrix7);
                            }
                            Path x = x(wll0Var);
                            R(wll0Var);
                            g(wll0Var);
                            f(wll0Var, wll0Var.h);
                            boolean E8 = E();
                            if (this.c.b) {
                                l(wll0Var, x);
                            }
                            if (this.c.c) {
                                m(x);
                            }
                            if (E8) {
                                D(wll0Var.h);
                            }
                        }
                    }
                } else if (anl0Var instanceof bml0) {
                    bml0 bml0Var = (bml0) anl0Var;
                    j jVar13 = bml0Var.q;
                    if (jVar13 != null && bml0Var.r != null && !jVar13.g() && !bml0Var.r.g()) {
                        T(this.c, bml0Var);
                        if (k() && V()) {
                            Matrix matrix8 = bml0Var.n;
                            if (matrix8 != null) {
                                this.a.concat(matrix8);
                            }
                            Path y = y(bml0Var);
                            R(bml0Var);
                            g(bml0Var);
                            f(bml0Var, bml0Var.h);
                            boolean E9 = E();
                            if (this.c.b) {
                                l(bml0Var, y);
                            }
                            if (this.c.c) {
                                m(y);
                            }
                            if (E9) {
                                D(bml0Var.h);
                            }
                        }
                    }
                } else if (anl0Var instanceof gml0) {
                    gml0 gml0Var = (gml0) anl0Var;
                    T(this.c, gml0Var);
                    if (k() && V() && this.c.c) {
                        Matrix matrix9 = gml0Var.n;
                        if (matrix9 != null) {
                            this.a.concat(matrix9);
                        }
                        j jVar14 = gml0Var.o;
                        float d6 = jVar14 == null ? 0.0f : jVar14.d(this);
                        j jVar15 = gml0Var.p;
                        float e4 = jVar15 == null ? 0.0f : jVar15.e(this);
                        j jVar16 = gml0Var.q;
                        float d7 = jVar16 == null ? 0.0f : jVar16.d(this);
                        j jVar17 = gml0Var.r;
                        r6 = jVar17 != null ? jVar17.e(this) : 0.0f;
                        if (gml0Var.h == null) {
                            gml0Var.h = new pt3(Math.min(d6, d7), Math.min(e4, r6), Math.abs(d7 - d6), Math.abs(r6 - e4), 1);
                        }
                        Path path2 = new Path();
                        path2.moveTo(d6, e4);
                        path2.lineTo(d7, r6);
                        R(gml0Var);
                        g(gml0Var);
                        f(gml0Var, gml0Var.h);
                        boolean E10 = E();
                        m(path2);
                        K(gml0Var);
                        if (E10) {
                            D(gml0Var.h);
                        }
                    }
                } else if (anl0Var instanceof pml0) {
                    pml0 pml0Var = (pml0) anl0Var;
                    T(this.c, pml0Var);
                    if (k() && V()) {
                        ynl0 ynl0Var6 = this.c;
                        if (ynl0Var6.c || ynl0Var6.b) {
                            Matrix matrix10 = pml0Var.n;
                            if (matrix10 != null) {
                                this.a.concat(matrix10);
                            }
                            if (pml0Var.o.length >= 2) {
                                Path z = z(pml0Var);
                                R(pml0Var);
                                g(pml0Var);
                                f(pml0Var, pml0Var.h);
                                boolean E11 = E();
                                if (this.c.b) {
                                    l(pml0Var, z);
                                }
                                if (this.c.c) {
                                    m(z);
                                }
                                K(pml0Var);
                                if (E11) {
                                    D(pml0Var.h);
                                }
                            }
                        }
                    }
                } else if (anl0Var instanceof oml0) {
                    oml0 oml0Var = (oml0) anl0Var;
                    T(this.c, oml0Var);
                    if (k() && V()) {
                        ynl0 ynl0Var7 = this.c;
                        if (ynl0Var7.c || ynl0Var7.b) {
                            Matrix matrix11 = oml0Var.n;
                            if (matrix11 != null) {
                                this.a.concat(matrix11);
                            }
                            if (oml0Var.o.length >= 2) {
                                Path z2 = z(oml0Var);
                                R(oml0Var);
                                SVG$Style$FillRule sVG$Style$FillRule2 = this.c.a.c;
                                z2.setFillType((sVG$Style$FillRule2 == null || sVG$Style$FillRule2 != SVG$Style$FillRule.EvenOdd) ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                g(oml0Var);
                                f(oml0Var, oml0Var.h);
                                boolean E12 = E();
                                if (this.c.b) {
                                    l(oml0Var, z2);
                                }
                                if (this.c.c) {
                                    m(z2);
                                }
                                K(oml0Var);
                                if (E12) {
                                    D(oml0Var.h);
                                }
                            }
                        }
                    }
                } else if (anl0Var instanceof jnl0) {
                    jnl0 jnl0Var = (jnl0) anl0Var;
                    T(this.c, jnl0Var);
                    if (k()) {
                        Matrix matrix12 = jnl0Var.r;
                        if (matrix12 != null) {
                            this.a.concat(matrix12);
                        }
                        ArrayList arrayList = jnl0Var.n;
                        float d8 = (arrayList == null || arrayList.size() == 0) ? 0.0f : ((j) jnl0Var.n.get(0)).d(this);
                        ArrayList arrayList2 = jnl0Var.o;
                        float e5 = (arrayList2 == null || arrayList2.size() == 0) ? 0.0f : ((j) jnl0Var.o.get(0)).e(this);
                        ArrayList arrayList3 = jnl0Var.p;
                        float d9 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((j) jnl0Var.p.get(0)).d(this);
                        ArrayList arrayList4 = jnl0Var.q;
                        if (arrayList4 != null && arrayList4.size() != 0) {
                            r6 = ((j) jnl0Var.q.get(0)).e(this);
                        }
                        SVG$Style$TextAnchor v = v();
                        if (v != SVG$Style$TextAnchor.Start) {
                            float d10 = d(jnl0Var);
                            if (v == SVG$Style$TextAnchor.Middle) {
                                d10 /= 2.0f;
                            }
                            d8 -= d10;
                        }
                        if (jnl0Var.h == null) {
                            xnl0 xnl0Var = new xnl0(this, d8, e5);
                            n(jnl0Var, xnl0Var);
                            RectF rectF = (RectF) xnl0Var.e;
                            jnl0Var.h = new pt3(rectF.left, rectF.top, rectF.width(), ((RectF) xnl0Var.e).height(), 1);
                        }
                        R(jnl0Var);
                        g(jnl0Var);
                        f(jnl0Var, jnl0Var.h);
                        boolean E13 = E();
                        n(jnl0Var, new wnl0(this, d8 + d9, e5 + r6));
                        if (E13) {
                            D(jnl0Var.h);
                        }
                    }
                }
            }
        }
        O();
    }

    public final void H(vml0 vml0Var, boolean z) {
        if (z) {
            this.e.push(vml0Var);
            this.f.push(this.a.getMatrix());
        }
        Iterator it = vml0Var.i.iterator();
        while (it.hasNext()) {
            G((anl0) it.next());
        }
        if (z) {
            this.e.pop();
            this.f.pop();
        }
    }

    public final void I(l lVar, g gVar) {
        w97 w97Var = lVar.b;
        this.b = lVar;
        tml0 tml0Var = lVar.a;
        if (tml0Var == null) {
            return;
        }
        pt3 pt3Var = tml0Var.o;
        hxe0 hxe0Var = tml0Var.n;
        w97 w97Var2 = gVar.a;
        if (w97Var2 != null) {
            ArrayList arrayList = w97Var2.b;
            if ((arrayList != null ? arrayList.size() : 0) > 0) {
                w97Var.b(gVar.a);
            }
        }
        this.c = new ynl0();
        this.d = new Stack();
        S(this.c, k.a());
        ynl0 ynl0Var = this.c;
        ynl0Var.f = null;
        ynl0Var.h = false;
        this.d.push(new ynl0(ynl0Var));
        this.f = new Stack();
        this.e = new Stack();
        Boolean bool = tml0Var.d;
        if (bool != null) {
            this.c.h = bool.booleanValue();
        }
        P();
        pt3 pt3Var2 = new pt3(gVar.b);
        j jVar = tml0Var.r;
        if (jVar != null) {
            pt3Var2.d = jVar.b(this, pt3Var2.d);
        }
        j jVar2 = tml0Var.s;
        if (jVar2 != null) {
            pt3Var2.e = jVar2.b(this, pt3Var2.e);
        }
        F(tml0Var, pt3Var2, pt3Var, hxe0Var);
        O();
        w97 w97Var3 = gVar.a;
        if (w97Var3 != null) {
            ArrayList arrayList2 = w97Var3.b;
            if ((arrayList2 != null ? arrayList2.size() : 0) > 0) {
                CSSParser$Source cSSParser$Source = CSSParser$Source.RenderOptions;
                ArrayList arrayList3 = w97Var.b;
                if (arrayList3 == null) {
                    return;
                }
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).c == cSSParser$Source) {
                        it.remove();
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f7, code lost:
    
        if (r8 != 8) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(hml0 hml0Var, tnl0 tnl0Var) {
        float f;
        pt3 pt3Var;
        boolean E;
        float f2;
        float f3;
        float f4;
        P();
        Float f5 = hml0Var.u;
        float f6 = 0.0f;
        if (f5 != null) {
            if (Float.isNaN(f5.floatValue())) {
                float f7 = tnl0Var.c;
                if (f7 != 0.0f || tnl0Var.d != 0.0f) {
                    f = (float) Math.toDegrees(Math.atan2(tnl0Var.d, f7));
                }
            } else {
                f = hml0Var.u.floatValue();
            }
            float c = !hml0Var.p ? 1.0f : this.c.a.z.c();
            this.c = t(hml0Var);
            Matrix matrix = new Matrix();
            matrix.preTranslate(tnl0Var.a, tnl0Var.b);
            matrix.preRotate(f);
            matrix.preScale(c, c);
            j jVar = hml0Var.q;
            float d = jVar == null ? jVar.d(this) : 0.0f;
            j jVar2 = hml0Var.r;
            float e = jVar2 == null ? jVar2.e(this) : 0.0f;
            j jVar3 = hml0Var.s;
            float d2 = jVar3 == null ? jVar3.d(this) : 3.0f;
            j jVar4 = hml0Var.t;
            float e2 = jVar4 != null ? jVar4.e(this) : 3.0f;
            pt3Var = hml0Var.o;
            Canvas canvas = this.a;
            if (pt3Var == null) {
                float f8 = d2 / pt3Var.d;
                float f9 = e2 / pt3Var.e;
                hxe0 hxe0Var = hml0Var.n;
                if (hxe0Var == null) {
                    hxe0Var = hxe0.d;
                }
                boolean equals = hxe0Var.equals(hxe0.c);
                PreserveAspectRatio$Alignment preserveAspectRatio$Alignment = hxe0Var.a;
                if (!equals) {
                    f8 = hxe0Var.b == PreserveAspectRatio$Scale.slice ? Math.max(f8, f9) : Math.min(f8, f9);
                    f9 = f8;
                }
                matrix.preTranslate((-d) * f8, (-e) * f9);
                canvas.concat(matrix);
                pt3 pt3Var2 = hml0Var.o;
                float f10 = pt3Var2.d * f8;
                float f11 = pt3Var2.e * f9;
                int[] iArr = rnl0.a;
                switch (iArr[preserveAspectRatio$Alignment.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                        f2 = (d2 - f10) / 2.0f;
                        f3 = 0.0f - f2;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        f2 = d2 - f10;
                        f3 = 0.0f - f2;
                        break;
                    default:
                        f3 = 0.0f;
                        break;
                }
                int i = iArr[preserveAspectRatio$Alignment.ordinal()];
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            if (i != 6) {
                                if (i != 7) {
                                }
                            }
                        }
                    }
                    f4 = e2 - f11;
                    f6 = 0.0f - f4;
                    if (!this.c.a.O.booleanValue()) {
                        M(f3, f6, d2, e2);
                    }
                    matrix.reset();
                    matrix.preScale(f8, f9);
                    canvas.concat(matrix);
                }
                f4 = (e2 - f11) / 2.0f;
                f6 = 0.0f - f4;
                if (!this.c.a.O.booleanValue()) {
                }
                matrix.reset();
                matrix.preScale(f8, f9);
                canvas.concat(matrix);
            } else {
                matrix.preTranslate(-d, -e);
                canvas.concat(matrix);
                if (!this.c.a.O.booleanValue()) {
                    M(0.0f, 0.0f, d2, e2);
                }
            }
            E = E();
            H(hml0Var, false);
            if (E) {
                D(hml0Var.h);
            }
            O();
        }
        f = 0.0f;
        if (!hml0Var.p) {
        }
        this.c = t(hml0Var);
        Matrix matrix2 = new Matrix();
        matrix2.preTranslate(tnl0Var.a, tnl0Var.b);
        matrix2.preRotate(f);
        matrix2.preScale(c, c);
        j jVar5 = hml0Var.q;
        if (jVar5 == null) {
        }
        j jVar22 = hml0Var.r;
        if (jVar22 == null) {
        }
        j jVar32 = hml0Var.s;
        if (jVar32 == null) {
        }
        j jVar42 = hml0Var.t;
        if (jVar42 != null) {
        }
        pt3Var = hml0Var.o;
        Canvas canvas2 = this.a;
        if (pt3Var == null) {
        }
        E = E();
        H(hml0Var, false);
        if (E) {
        }
        O();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void K(cml0 cml0Var) {
        hml0 hml0Var;
        String str;
        hml0 hml0Var2;
        String str2;
        hml0 hml0Var3;
        int i;
        float f;
        float f2;
        float f3;
        ArrayList arrayList;
        int size;
        int i2;
        k kVar = this.c.a;
        String str3 = kVar.Q;
        if (str3 == null && kVar.R == null && kVar.S == null) {
            return;
        }
        if (str3 != null) {
            yml0 h = cml0Var.a.h(str3);
            if (h != null) {
                hml0Var = (hml0) h;
                str = this.c.a.R;
                if (str != null) {
                    yml0 h2 = cml0Var.a.h(str);
                    if (h2 != null) {
                        hml0Var2 = (hml0) h2;
                        str2 = this.c.a.S;
                        if (str2 != null) {
                            yml0 h3 = cml0Var.a.h(str2);
                            if (h3 != null) {
                                hml0Var3 = (hml0) h3;
                                float f4 = 0.0f;
                                if (!(cml0Var instanceof lml0)) {
                                    arrayList = new snl0(this, ((lml0) cml0Var).o).a;
                                    f2 = 0.0f;
                                    i = 1;
                                } else if (cml0Var instanceof gml0) {
                                    gml0 gml0Var = (gml0) cml0Var;
                                    j jVar = gml0Var.o;
                                    float d = jVar != null ? jVar.d(this) : 0.0f;
                                    j jVar2 = gml0Var.p;
                                    float e = jVar2 != null ? jVar2.e(this) : 0.0f;
                                    j jVar3 = gml0Var.q;
                                    float d2 = jVar3 != null ? jVar3.d(this) : 0.0f;
                                    j jVar4 = gml0Var.r;
                                    float e2 = jVar4 != null ? jVar4.e(this) : 0.0f;
                                    ArrayList arrayList2 = new ArrayList(2);
                                    float f5 = d2 - d;
                                    i = 1;
                                    float f6 = e2 - e;
                                    arrayList2.add(new tnl0(d, e, f5, f6));
                                    arrayList2.add(new tnl0(d2, e2, f5, f6));
                                    f2 = 0.0f;
                                    arrayList = arrayList2;
                                } else {
                                    i = 1;
                                    oml0 oml0Var = (oml0) cml0Var;
                                    int length = oml0Var.o.length;
                                    if (length < 2) {
                                        arrayList = null;
                                        f2 = 0.0f;
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        float[] fArr = oml0Var.o;
                                        tnl0 tnl0Var = new tnl0(fArr[0], fArr[1], 0.0f, 0.0f);
                                        int i3 = 2;
                                        float f7 = 0.0f;
                                        float f8 = 0.0f;
                                        while (true) {
                                            f = tnl0Var.b;
                                            f2 = f4;
                                            f3 = tnl0Var.a;
                                            if (i3 >= length) {
                                                break;
                                            }
                                            float[] fArr2 = oml0Var.o;
                                            float f9 = fArr2[i3];
                                            float f10 = fArr2[i3 + 1];
                                            tnl0Var.a(f9, f10);
                                            arrayList3.add(tnl0Var);
                                            tnl0Var = new tnl0(f9, f10, f9 - f3, f10 - f);
                                            i3 += 2;
                                            f8 = f10;
                                            f7 = f9;
                                            f4 = f2;
                                        }
                                        if (oml0Var instanceof pml0) {
                                            float[] fArr3 = oml0Var.o;
                                            float f11 = fArr3[0];
                                            if (f7 != f11) {
                                                float f12 = fArr3[1];
                                                if (f8 != f12) {
                                                    tnl0Var.a(f11, f12);
                                                    arrayList3.add(tnl0Var);
                                                    tnl0 tnl0Var2 = new tnl0(f11, f12, f11 - f3, f12 - f);
                                                    tnl0Var2.b((tnl0) arrayList3.get(0));
                                                    arrayList3.add(tnl0Var2);
                                                    arrayList3.set(0, tnl0Var2);
                                                }
                                            }
                                        } else {
                                            arrayList3.add(tnl0Var);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                if (arrayList == null && (size = arrayList.size()) != 0) {
                                    k kVar2 = this.c.a;
                                    kVar2.S = null;
                                    kVar2.R = null;
                                    kVar2.Q = null;
                                    if (hml0Var != null) {
                                        J(hml0Var, (tnl0) arrayList.get(0));
                                    }
                                    if (hml0Var2 != null && arrayList.size() > 2) {
                                        tnl0 tnl0Var3 = (tnl0) arrayList.get(0);
                                        tnl0 tnl0Var4 = (tnl0) arrayList.get(i);
                                        i2 = 1;
                                        while (i2 < size - 1) {
                                            i2++;
                                            tnl0 tnl0Var5 = (tnl0) arrayList.get(i2);
                                            if (tnl0Var4.e) {
                                                float f13 = tnl0Var4.c;
                                                float f14 = tnl0Var4.d;
                                                float f15 = tnl0Var4.a;
                                                float f16 = f15 - tnl0Var3.a;
                                                float f17 = tnl0Var4.b;
                                                float f18 = ((f17 - tnl0Var3.b) * f14) + (f16 * f13);
                                                if (f18 == f2) {
                                                    f18 = ((tnl0Var5.a - f15) * f13) + ((tnl0Var5.b - f17) * f14);
                                                }
                                                if (f18 <= f2 && (f18 != f2 || (f13 <= f2 && f14 < f2))) {
                                                    tnl0Var4.c = -f13;
                                                    tnl0Var4.d = -f14;
                                                }
                                            }
                                            J(hml0Var2, tnl0Var4);
                                            tnl0Var3 = tnl0Var4;
                                            tnl0Var4 = tnl0Var5;
                                        }
                                    }
                                    if (hml0Var3 == null) {
                                        J(hml0Var3, (tnl0) arrayList.get(size - 1));
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            o("Marker reference '%s' not found", this.c.a.S);
                        }
                        hml0Var3 = null;
                        float f42 = 0.0f;
                        if (!(cml0Var instanceof lml0)) {
                        }
                        if (arrayList == null) {
                            return;
                        }
                        k kVar22 = this.c.a;
                        kVar22.S = null;
                        kVar22.R = null;
                        kVar22.Q = null;
                        if (hml0Var != null) {
                        }
                        if (hml0Var2 != null) {
                            tnl0 tnl0Var32 = (tnl0) arrayList.get(0);
                            tnl0 tnl0Var42 = (tnl0) arrayList.get(i);
                            i2 = 1;
                            while (i2 < size - 1) {
                            }
                        }
                        if (hml0Var3 == null) {
                        }
                    } else {
                        o("Marker reference '%s' not found", this.c.a.R);
                    }
                }
                hml0Var2 = null;
                str2 = this.c.a.S;
                if (str2 != null) {
                }
                hml0Var3 = null;
                float f422 = 0.0f;
                if (!(cml0Var instanceof lml0)) {
                }
                if (arrayList == null) {
                }
            } else {
                o("Marker reference '%s' not found", this.c.a.Q);
            }
        }
        hml0Var = null;
        str = this.c.a.R;
        if (str != null) {
        }
        hml0Var2 = null;
        str2 = this.c.a.S;
        if (str2 != null) {
        }
        hml0Var3 = null;
        float f4222 = 0.0f;
        if (!(cml0Var instanceof lml0)) {
        }
        if (arrayList == null) {
        }
    }

    public final void L(iml0 iml0Var, pt3 pt3Var) {
        float f;
        float f2;
        Boolean bool = iml0Var.n;
        if (bool == null || !bool.booleanValue()) {
            j jVar = iml0Var.p;
            float b = jVar != null ? jVar.b(this, 1.0f) : 1.2f;
            j jVar2 = iml0Var.q;
            float b2 = jVar2 != null ? jVar2.b(this, 1.0f) : 1.2f;
            f = b * pt3Var.d;
            f2 = b2 * pt3Var.e;
        } else {
            j jVar3 = iml0Var.p;
            f = jVar3 != null ? jVar3.d(this) : pt3Var.d;
            j jVar4 = iml0Var.q;
            f2 = jVar4 != null ? jVar4.e(this) : pt3Var.e;
        }
        if (f == 0.0f || f2 == 0.0f) {
            return;
        }
        P();
        ynl0 t = t(iml0Var);
        this.c = t;
        t.a.F = Float.valueOf(1.0f);
        boolean E = E();
        Canvas canvas = this.a;
        canvas.save();
        Boolean bool2 = iml0Var.o;
        if (bool2 != null && !bool2.booleanValue()) {
            canvas.translate(pt3Var.b, pt3Var.c);
            canvas.scale(pt3Var.d, pt3Var.e);
        }
        H(iml0Var, false);
        canvas.restore();
        if (E) {
            D(pt3Var);
        }
        O();
    }

    public final void M(float f, float f2, float f3, float f4) {
        float f5 = f3 + f;
        float f6 = f4 + f2;
        kdd0 kdd0Var = this.c.a.P;
        if (kdd0Var != null) {
            f += ((j) kdd0Var.d).d(this);
            f2 += ((j) this.c.a.P.a).e(this);
            f5 -= ((j) this.c.a.P.b).d(this);
            f6 -= ((j) this.c.a.P.c).e(this);
        }
        this.a.clipRect(f, f2, f5, f6);
    }

    public final void O() {
        this.a.restore();
        this.c = (ynl0) this.d.pop();
    }

    public final void P() {
        this.a.save();
        this.d.push(this.c);
        this.c = new ynl0(this.c);
    }

    public final String Q(String str, boolean z, boolean z2) {
        if (this.c.h) {
            return str.replaceAll("[\\n\\t]", " ");
        }
        String replaceAll = str.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (z) {
            replaceAll = replaceAll.replaceAll("^\\s+", "");
        }
        if (z2) {
            replaceAll = replaceAll.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }

    public final void R(xml0 xml0Var) {
        if (xml0Var.b == null || xml0Var.h == null) {
            return;
        }
        Matrix matrix = new Matrix();
        if (((Matrix) this.f.peek()).invert(matrix)) {
            pt3 pt3Var = xml0Var.h;
            float f = pt3Var.b;
            float f2 = pt3Var.c;
            float a = pt3Var.a();
            pt3 pt3Var2 = xml0Var.h;
            float f3 = pt3Var2.c;
            float a2 = pt3Var2.a();
            float b = xml0Var.h.b();
            pt3 pt3Var3 = xml0Var.h;
            float[] fArr = {f, f2, a, f3, a2, b, pt3Var3.b, pt3Var3.b()};
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(fArr);
            float f4 = fArr[0];
            float f5 = fArr[1];
            RectF rectF = new RectF(f4, f5, f4, f5);
            for (int i = 2; i <= 6; i += 2) {
                float f6 = fArr[i];
                if (f6 < rectF.left) {
                    rectF.left = f6;
                }
                if (f6 > rectF.right) {
                    rectF.right = f6;
                }
                float f7 = fArr[i + 1];
                if (f7 < rectF.top) {
                    rectF.top = f7;
                }
                if (f7 > rectF.bottom) {
                    rectF.bottom = f7;
                }
            }
            xml0 xml0Var2 = (xml0) this.e.peek();
            pt3 pt3Var4 = xml0Var2.h;
            float f8 = rectF.left;
            float f9 = rectF.top;
            if (pt3Var4 == null) {
                xml0Var2.h = new pt3(f8, f9, rectF.right - f8, rectF.bottom - f9, 1);
                return;
            }
            float f10 = rectF.right - f8;
            float f11 = rectF.bottom - f9;
            if (f8 < pt3Var4.b) {
                pt3Var4.b = f8;
            }
            if (f9 < pt3Var4.c) {
                pt3Var4.c = f9;
            }
            if (f8 + f10 > pt3Var4.a()) {
                pt3Var4.d = (f8 + f10) - pt3Var4.b;
            }
            if (f9 + f11 > pt3Var4.b()) {
                pt3Var4.e = (f9 + f11) - pt3Var4.c;
            }
        }
    }

    public final void S(ynl0 ynl0Var, k kVar) {
        if (w(kVar, PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM)) {
            ynl0Var.a.G = kVar.G;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH)) {
            ynl0Var.a.F = kVar.F;
        }
        boolean w = w(kVar, 1L);
        yll0 yll0Var = yll0.c;
        if (w) {
            ynl0Var.a.b = kVar.b;
            bnl0 bnl0Var = kVar.b;
            ynl0Var.b = (bnl0Var == null || bnl0Var == yll0Var) ? false : true;
        }
        if (w(kVar, 4L)) {
            ynl0Var.a.w = kVar.w;
        }
        if (w(kVar, 6149L)) {
            N(ynl0Var, true, ynl0Var.a.b);
        }
        if (w(kVar, 2L)) {
            ynl0Var.a.c = kVar.c;
        }
        if (w(kVar, 8L)) {
            ynl0Var.a.x = kVar.x;
            bnl0 bnl0Var2 = kVar.x;
            ynl0Var.c = (bnl0Var2 == null || bnl0Var2 == yll0Var) ? false : true;
        }
        if (w(kVar, 16L)) {
            ynl0Var.a.y = kVar.y;
        }
        if (w(kVar, 6168L)) {
            N(ynl0Var, false, ynl0Var.a.x);
        }
        if (w(kVar, 34359738368L)) {
            ynl0Var.a.g0 = kVar.g0;
        }
        if (w(kVar, 32L)) {
            k kVar2 = ynl0Var.a;
            j jVar = kVar.z;
            kVar2.z = jVar;
            ynl0Var.e.setStrokeWidth(jVar.a(this));
        }
        if (w(kVar, 64L)) {
            k kVar3 = ynl0Var.a;
            Paint paint = ynl0Var.e;
            kVar3.A = kVar.A;
            int i = rnl0.b[kVar.A.ordinal()];
            if (i == 1) {
                paint.setStrokeCap(Paint.Cap.BUTT);
            } else if (i == 2) {
                paint.setStrokeCap(Paint.Cap.ROUND);
            } else if (i == 3) {
                paint.setStrokeCap(Paint.Cap.SQUARE);
            }
        }
        if (w(kVar, 128L)) {
            k kVar4 = ynl0Var.a;
            Paint paint2 = ynl0Var.e;
            kVar4.B = kVar.B;
            int i2 = rnl0.c[kVar.B.ordinal()];
            if (i2 == 1) {
                paint2.setStrokeJoin(Paint.Join.MITER);
            } else if (i2 == 2) {
                paint2.setStrokeJoin(Paint.Join.ROUND);
            } else if (i2 == 3) {
                paint2.setStrokeJoin(Paint.Join.BEVEL);
            }
        }
        if (w(kVar, 256L)) {
            ynl0Var.a.C = kVar.C;
            ynl0Var.e.setStrokeMiter(kVar.C.floatValue());
        }
        if (w(kVar, 512L)) {
            ynl0Var.a.D = kVar.D;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID)) {
            ynl0Var.a.E = kVar.E;
        }
        Typeface typeface = null;
        if (w(kVar, 1536L)) {
            k kVar5 = ynl0Var.a;
            Paint paint3 = ynl0Var.e;
            j[] jVarArr = kVar5.D;
            if (jVarArr == null) {
                paint3.setPathEffect(null);
            } else {
                int length = jVarArr.length;
                int i3 = length % 2 == 0 ? length : length * 2;
                float[] fArr = new float[i3];
                float f = 0.0f;
                for (int i4 = 0; i4 < i3; i4++) {
                    float a = kVar5.D[i4 % length].a(this);
                    fArr[i4] = a;
                    f += a;
                }
                if (f == 0.0f) {
                    paint3.setPathEffect(null);
                } else {
                    float a2 = kVar5.E.a(this);
                    if (a2 < 0.0f) {
                        a2 = (a2 % f) + f;
                    }
                    paint3.setPathEffect(new DashPathEffect(fArr, a2));
                }
            }
        }
        if (w(kVar, PlaybackStateCompat.ACTION_PREPARE)) {
            float textSize = this.c.d.getTextSize();
            ynl0Var.a.I = kVar.I;
            ynl0Var.d.setTextSize(kVar.I.b(this, textSize));
            ynl0Var.e.setTextSize(kVar.I.b(this, textSize));
        }
        if (w(kVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
            ynl0Var.a.H = kVar.H;
        }
        if (w(kVar, 32768L)) {
            if (kVar.J.intValue() == -1 && ynl0Var.a.J.intValue() > 100) {
                k kVar6 = ynl0Var.a;
                kVar6.J = Integer.valueOf(kVar6.J.intValue() - 100);
            } else if (kVar.J.intValue() != 1 || ynl0Var.a.J.intValue() >= 900) {
                ynl0Var.a.J = kVar.J;
            } else {
                k kVar7 = ynl0Var.a;
                kVar7.J = Integer.valueOf(kVar7.J.intValue() + 100);
            }
        }
        if (w(kVar, PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH)) {
            ynl0Var.a.K = kVar.K;
        }
        if (w(kVar, 106496L)) {
            k kVar8 = ynl0Var.a;
            ArrayList arrayList = kVar8.H;
            if (arrayList != null && this.b != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext() && (typeface = h((String) it.next(), kVar8.J, kVar8.K)) == null) {
                }
            }
            if (typeface == null) {
                typeface = h("serif", kVar8.J, kVar8.K);
            }
            ynl0Var.d.setTypeface(typeface);
            ynl0Var.e.setTypeface(typeface);
        }
        if (w(kVar, PlaybackStateCompat.ACTION_PREPARE_FROM_URI)) {
            k kVar9 = ynl0Var.a;
            Paint paint4 = ynl0Var.e;
            Paint paint5 = ynl0Var.d;
            kVar9.L = kVar.L;
            SVG$Style$TextDecoration sVG$Style$TextDecoration = kVar.L;
            SVG$Style$TextDecoration sVG$Style$TextDecoration2 = SVG$Style$TextDecoration.LineThrough;
            paint5.setStrikeThruText(sVG$Style$TextDecoration == sVG$Style$TextDecoration2);
            SVG$Style$TextDecoration sVG$Style$TextDecoration3 = kVar.L;
            SVG$Style$TextDecoration sVG$Style$TextDecoration4 = SVG$Style$TextDecoration.Underline;
            paint5.setUnderlineText(sVG$Style$TextDecoration3 == sVG$Style$TextDecoration4);
            paint4.setStrikeThruText(kVar.L == sVG$Style$TextDecoration2);
            paint4.setUnderlineText(kVar.L == sVG$Style$TextDecoration4);
        }
        if (w(kVar, 68719476736L)) {
            ynl0Var.a.M = kVar.M;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_SET_REPEAT_MODE)) {
            ynl0Var.a.N = kVar.N;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED)) {
            ynl0Var.a.O = kVar.O;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE)) {
            ynl0Var.a.Q = kVar.Q;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED)) {
            ynl0Var.a.R = kVar.R;
        }
        if (w(kVar, 8388608L)) {
            ynl0Var.a.S = kVar.S;
        }
        if (w(kVar, 16777216L)) {
            ynl0Var.a.T = kVar.T;
        }
        if (w(kVar, 33554432L)) {
            ynl0Var.a.U = kVar.U;
        }
        if (w(kVar, PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED)) {
            ynl0Var.a.P = kVar.P;
        }
        if (w(kVar, 268435456L)) {
            ynl0Var.a.Z = kVar.Z;
        }
        if (w(kVar, 536870912L)) {
            ynl0Var.a.a0 = kVar.a0;
        }
        if (w(kVar, 1073741824L)) {
            ynl0Var.a.b0 = kVar.b0;
        }
        if (w(kVar, 67108864L)) {
            ynl0Var.a.V = kVar.V;
        }
        if (w(kVar, 134217728L)) {
            ynl0Var.a.W = kVar.W;
        }
        if (w(kVar, 8589934592L)) {
            ynl0Var.a.e0 = kVar.e0;
        }
        if (w(kVar, 17179869184L)) {
            ynl0Var.a.f0 = kVar.f0;
        }
        if (w(kVar, 137438953472L)) {
            ynl0Var.a.h0 = kVar.h0;
        }
    }

    public final void T(ynl0 ynl0Var, yml0 yml0Var) {
        boolean z = yml0Var.b == null;
        k kVar = ynl0Var.a;
        Float valueOf = Float.valueOf(1.0f);
        Boolean bool = Boolean.TRUE;
        kVar.T = bool;
        if (!z) {
            bool = Boolean.FALSE;
        }
        kVar.O = bool;
        kVar.P = null;
        kVar.Z = null;
        kVar.F = valueOf;
        kVar.V = yll0.b;
        kVar.W = valueOf;
        kVar.b0 = null;
        kVar.c0 = null;
        kVar.d0 = valueOf;
        kVar.e0 = null;
        kVar.f0 = valueOf;
        kVar.g0 = SVG$Style$VectorEffect.None;
        k kVar2 = yml0Var.e;
        if (kVar2 != null) {
            S(ynl0Var, kVar2);
        }
        ArrayList arrayList = this.b.b.b;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator it = this.b.b.b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (f.g(dVar.a, yml0Var)) {
                    S(ynl0Var, dVar.b);
                }
            }
        }
        k kVar3 = yml0Var.f;
        if (kVar3 != null) {
            S(ynl0Var, kVar3);
        }
    }

    public final void U() {
        int i;
        k kVar = this.c.a;
        bnl0 bnl0Var = kVar.e0;
        if (bnl0Var instanceof yll0) {
            i = ((yll0) bnl0Var).a;
        } else if (!(bnl0Var instanceof zll0)) {
            return;
        } else {
            i = kVar.G.a;
        }
        Float f = kVar.f0;
        if (f != null) {
            i = i(f.floatValue(), i);
        }
        this.a.drawColor(i);
    }

    public final boolean V() {
        Boolean bool = this.c.a.U;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final Path b(xml0 xml0Var, pt3 pt3Var) {
        Path C;
        yml0 h = xml0Var.a.h(this.c.a.Z);
        if (h == null) {
            o("ClipPath reference '%s' not found", this.c.a.Z);
            return null;
        }
        xll0 xll0Var = (xll0) h;
        this.d.push(this.c);
        this.c = t(xll0Var);
        Boolean bool = xll0Var.o;
        boolean z = bool == null || bool.booleanValue();
        Matrix matrix = new Matrix();
        if (!z) {
            matrix.preTranslate(pt3Var.b, pt3Var.c);
            matrix.preScale(pt3Var.d, pt3Var.e);
        }
        Matrix matrix2 = xll0Var.n;
        if (matrix2 != null) {
            matrix.preConcat(matrix2);
        }
        Path path = new Path();
        for (anl0 anl0Var : xll0Var.i) {
            if ((anl0Var instanceof xml0) && (C = C((xml0) anl0Var, true)) != null) {
                path.op(C, Path.Op.UNION);
            }
        }
        if (this.c.a.Z != null) {
            if (xll0Var.h == null) {
                xll0Var.h = c(path);
            }
            Path b = b(xll0Var, xll0Var.h);
            if (b != null) {
                path.op(b, Path.Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.c = (ynl0) this.d.pop();
        return path;
    }

    public final float d(lnl0 lnl0Var) {
        znl0 znl0Var = new znl0(this);
        n(lnl0Var, znl0Var);
        return znl0Var.a;
    }

    public final void f(xml0 xml0Var, pt3 pt3Var) {
        Path b;
        if (this.c.a.Z == null || (b = b(xml0Var, pt3Var)) == null) {
            return;
        }
        this.a.clipPath(b);
    }

    public final void g(xml0 xml0Var) {
        bnl0 bnl0Var = this.c.a.b;
        if (bnl0Var instanceof kml0) {
            j(true, xml0Var.h, (kml0) bnl0Var);
        }
        bnl0 bnl0Var2 = this.c.a.x;
        if (bnl0Var2 instanceof kml0) {
            j(false, xml0Var.h, (kml0) bnl0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(boolean z, pt3 pt3Var, kml0 kml0Var) {
        float f;
        float b;
        float f2;
        float f3;
        float b2;
        float b3;
        float b4;
        float b5;
        yml0 h = this.b.h(kml0Var.a);
        if (h == null) {
            o("%s reference '%s' not found", z ? "Fill" : "Stroke", kml0Var.a);
            bnl0 bnl0Var = kml0Var.b;
            ynl0 ynl0Var = this.c;
            if (bnl0Var != null) {
                N(ynl0Var, z, bnl0Var);
                return;
            } else if (z) {
                ynl0Var.b = false;
                return;
            } else {
                ynl0Var.c = false;
                return;
            }
        }
        boolean z2 = h instanceof zml0;
        yll0 yll0Var = yll0.b;
        if (z2) {
            zml0 zml0Var = (zml0) h;
            String str = zml0Var.l;
            if (str != null) {
                r(zml0Var, str);
            }
            Boolean bool = zml0Var.i;
            Object[] objArr = bool != null && bool.booleanValue();
            ynl0 ynl0Var2 = this.c;
            Paint paint = z ? ynl0Var2.d : ynl0Var2.e;
            if (objArr == true) {
                pt3 pt3Var2 = ynl0Var2.g;
                if (pt3Var2 == null) {
                    pt3Var2 = ynl0Var2.f;
                }
                j jVar = zml0Var.m;
                b2 = jVar != null ? jVar.d(this) : 0.0f;
                j jVar2 = zml0Var.n;
                b3 = jVar2 != null ? jVar2.e(this) : 0.0f;
                f3 = 256.0f;
                j jVar3 = zml0Var.o;
                b4 = jVar3 != null ? jVar3.d(this) : pt3Var2.d;
                j jVar4 = zml0Var.p;
                if (jVar4 != null) {
                    b5 = jVar4.e(this);
                }
                b5 = 0.0f;
            } else {
                f3 = 256.0f;
                j jVar5 = zml0Var.m;
                b2 = jVar5 != null ? jVar5.b(this, 1.0f) : 0.0f;
                j jVar6 = zml0Var.n;
                b3 = jVar6 != null ? jVar6.b(this, 1.0f) : 0.0f;
                j jVar7 = zml0Var.o;
                b4 = jVar7 != null ? jVar7.b(this, 1.0f) : 1.0f;
                j jVar8 = zml0Var.p;
                if (jVar8 != null) {
                    b5 = jVar8.b(this, 1.0f);
                }
                b5 = 0.0f;
            }
            float f4 = b4;
            float f5 = b5;
            float f6 = b2;
            float f7 = b3;
            P();
            this.c = t(zml0Var);
            Matrix matrix = new Matrix();
            if (objArr == false) {
                matrix.preTranslate(pt3Var.b, pt3Var.c);
                matrix.preScale(pt3Var.d, pt3Var.e);
            }
            Matrix matrix2 = zml0Var.j;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            int size = zml0Var.h.size();
            if (size == 0) {
                O();
                ynl0 ynl0Var3 = this.c;
                if (z) {
                    ynl0Var3.b = false;
                    return;
                } else {
                    ynl0Var3.c = false;
                    return;
                }
            }
            int[] iArr = new int[size];
            float[] fArr = new float[size];
            Iterator it = zml0Var.h.iterator();
            int i = 0;
            float f8 = -1.0f;
            while (it.hasNext()) {
                sml0 sml0Var = (sml0) ((anl0) it.next());
                Float f9 = sml0Var.h;
                float floatValue = f9 != null ? f9.floatValue() : 0.0f;
                if (i == 0 || floatValue >= f8) {
                    fArr[i] = floatValue;
                    f8 = floatValue;
                } else {
                    fArr[i] = f8;
                }
                P();
                T(this.c, sml0Var);
                k kVar = this.c.a;
                yll0 yll0Var2 = (yll0) kVar.V;
                if (yll0Var2 == null) {
                    yll0Var2 = yll0Var;
                }
                iArr[i] = i(kVar.W.floatValue(), yll0Var2.a);
                i++;
                O();
            }
            if ((f6 == f4 && f7 == f5) || size == 1) {
                O();
                paint.setColor(iArr[size - 1]);
                return;
            }
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            SVG$GradientSpread sVG$GradientSpread = zml0Var.k;
            if (sVG$GradientSpread != null) {
                if (sVG$GradientSpread == SVG$GradientSpread.reflect) {
                    tileMode = Shader.TileMode.MIRROR;
                } else if (sVG$GradientSpread == SVG$GradientSpread.repeat) {
                    tileMode = Shader.TileMode.REPEAT;
                }
            }
            Shader.TileMode tileMode2 = tileMode;
            O();
            LinearGradient linearGradient = new LinearGradient(f6, f7, f4, f5, iArr, fArr, tileMode2);
            linearGradient.setLocalMatrix(matrix);
            paint.setShader(linearGradient);
            int floatValue2 = (int) (this.c.a.w.floatValue() * f3);
            paint.setAlpha(floatValue2 >= 0 ? floatValue2 > 255 ? 255 : floatValue2 : 0);
            return;
        }
        if (!(h instanceof dnl0)) {
            if (h instanceof rml0) {
                rml0 rml0Var = (rml0) h;
                k kVar2 = rml0Var.e;
                if (z) {
                    if (w(kVar2, 2147483648L)) {
                        ynl0 ynl0Var4 = this.c;
                        k kVar3 = ynl0Var4.a;
                        bnl0 bnl0Var2 = rml0Var.e.c0;
                        kVar3.b = bnl0Var2;
                        ynl0Var4.b = bnl0Var2 != null;
                    }
                    if (w(rml0Var.e, 4294967296L)) {
                        this.c.a.w = rml0Var.e.d0;
                    }
                    if (w(rml0Var.e, 6442450944L)) {
                        ynl0 ynl0Var5 = this.c;
                        N(ynl0Var5, z, ynl0Var5.a.b);
                        return;
                    }
                    return;
                }
                if (w(kVar2, 2147483648L)) {
                    ynl0 ynl0Var6 = this.c;
                    k kVar4 = ynl0Var6.a;
                    bnl0 bnl0Var3 = rml0Var.e.c0;
                    kVar4.x = bnl0Var3;
                    ynl0Var6.c = bnl0Var3 != null;
                }
                if (w(rml0Var.e, 4294967296L)) {
                    this.c.a.y = rml0Var.e.d0;
                }
                if (w(rml0Var.e, 6442450944L)) {
                    ynl0 ynl0Var7 = this.c;
                    N(ynl0Var7, z, ynl0Var7.a.x);
                    return;
                }
                return;
            }
            return;
        }
        dnl0 dnl0Var = (dnl0) h;
        String str2 = dnl0Var.l;
        if (str2 != null) {
            r(dnl0Var, str2);
        }
        Boolean bool2 = dnl0Var.i;
        Object[] objArr2 = bool2 != null && bool2.booleanValue();
        ynl0 ynl0Var8 = this.c;
        Paint paint2 = z ? ynl0Var8.d : ynl0Var8.e;
        if (objArr2 == true) {
            j jVar9 = new j(50.0f, SVG$Unit.percent);
            j jVar10 = dnl0Var.m;
            float d = jVar10 != null ? jVar10.d(this) : jVar9.d(this);
            j jVar11 = dnl0Var.n;
            float e = jVar11 != null ? jVar11.e(this) : jVar9.e(this);
            j jVar12 = dnl0Var.o;
            b = jVar12 != null ? jVar12.a(this) : jVar9.a(this);
            f = d;
            f2 = e;
        } else {
            j jVar13 = dnl0Var.m;
            float b6 = jVar13 != null ? jVar13.b(this, 1.0f) : 0.5f;
            j jVar14 = dnl0Var.n;
            float b7 = jVar14 != null ? jVar14.b(this, 1.0f) : 0.5f;
            j jVar15 = dnl0Var.o;
            f = b6;
            b = jVar15 != null ? jVar15.b(this, 1.0f) : 0.5f;
            f2 = b7;
        }
        P();
        this.c = t(dnl0Var);
        Matrix matrix3 = new Matrix();
        if (objArr2 == false) {
            matrix3.preTranslate(pt3Var.b, pt3Var.c);
            matrix3.preScale(pt3Var.d, pt3Var.e);
        }
        Matrix matrix4 = dnl0Var.j;
        if (matrix4 != null) {
            matrix3.preConcat(matrix4);
        }
        int size2 = dnl0Var.h.size();
        if (size2 == 0) {
            O();
            ynl0 ynl0Var9 = this.c;
            if (z) {
                ynl0Var9.b = false;
                return;
            } else {
                ynl0Var9.c = false;
                return;
            }
        }
        int[] iArr2 = new int[size2];
        float[] fArr2 = new float[size2];
        Iterator it2 = dnl0Var.h.iterator();
        int i2 = 0;
        float f10 = -1.0f;
        while (it2.hasNext()) {
            sml0 sml0Var2 = (sml0) ((anl0) it2.next());
            Float f11 = sml0Var2.h;
            float floatValue3 = f11 != null ? f11.floatValue() : 0.0f;
            if (i2 == 0 || floatValue3 >= f10) {
                fArr2[i2] = floatValue3;
                f10 = floatValue3;
            } else {
                fArr2[i2] = f10;
            }
            P();
            T(this.c, sml0Var2);
            k kVar5 = this.c.a;
            yll0 yll0Var3 = (yll0) kVar5.V;
            if (yll0Var3 == null) {
                yll0Var3 = yll0Var;
            }
            iArr2[i2] = i(kVar5.W.floatValue(), yll0Var3.a);
            i2++;
            O();
        }
        if (b == 0.0f || size2 == 1) {
            O();
            paint2.setColor(iArr2[size2 - 1]);
            return;
        }
        Shader.TileMode tileMode3 = Shader.TileMode.CLAMP;
        SVG$GradientSpread sVG$GradientSpread2 = dnl0Var.k;
        if (sVG$GradientSpread2 != null) {
            if (sVG$GradientSpread2 == SVG$GradientSpread.reflect) {
                tileMode3 = Shader.TileMode.MIRROR;
            } else if (sVG$GradientSpread2 == SVG$GradientSpread.repeat) {
                tileMode3 = Shader.TileMode.REPEAT;
            }
        }
        Shader.TileMode tileMode4 = tileMode3;
        O();
        RadialGradient radialGradient = new RadialGradient(f, f2, b, iArr2, fArr2, tileMode4);
        radialGradient.setLocalMatrix(matrix3);
        paint2.setShader(radialGradient);
        int floatValue4 = (int) (this.c.a.w.floatValue() * 256.0f);
        paint2.setAlpha(floatValue4 >= 0 ? floatValue4 > 255 ? 255 : floatValue4 : 0);
    }

    public final boolean k() {
        Boolean bool = this.c.a.T;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(xml0 xml0Var, Path path) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        boolean z;
        boolean z2;
        float floor;
        float b;
        boolean E;
        float f7;
        float f8;
        bnl0 bnl0Var = this.c.a.b;
        boolean z3 = bnl0Var instanceof kml0;
        Canvas canvas = this.a;
        if (z3) {
            yml0 h = this.b.h(((kml0) bnl0Var).a);
            if (h instanceof nml0) {
                nml0 nml0Var = (nml0) h;
                Boolean bool = nml0Var.p;
                boolean z4 = bool != null && bool.booleanValue();
                String str = nml0Var.w;
                if (str != null) {
                    s(nml0Var, str);
                }
                j jVar = nml0Var.s;
                if (z4) {
                    f2 = jVar != null ? jVar.d(this) : 0.0f;
                    j jVar2 = nml0Var.t;
                    f3 = jVar2 != null ? jVar2.e(this) : 0.0f;
                    j jVar3 = nml0Var.u;
                    float d = jVar3 != null ? jVar3.d(this) : 0.0f;
                    j jVar4 = nml0Var.v;
                    f4 = d;
                    f = jVar4 != null ? jVar4.e(this) : 0.0f;
                } else {
                    float b2 = jVar != null ? jVar.b(this, 1.0f) : 0.0f;
                    j jVar5 = nml0Var.t;
                    float b3 = jVar5 != null ? jVar5.b(this, 1.0f) : 0.0f;
                    j jVar6 = nml0Var.u;
                    float b4 = jVar6 != null ? jVar6.b(this, 1.0f) : 0.0f;
                    j jVar7 = nml0Var.v;
                    float b5 = jVar7 != null ? jVar7.b(this, 1.0f) : 0.0f;
                    pt3 pt3Var = xml0Var.h;
                    float f9 = pt3Var.b;
                    float f10 = pt3Var.d;
                    float f11 = (b2 * f10) + f9;
                    float f12 = pt3Var.c;
                    float f13 = pt3Var.e;
                    float f14 = (b3 * f13) + f12;
                    f = b5 * f13;
                    f2 = f11;
                    f3 = f14;
                    f4 = b4 * f10;
                }
                if (f4 == 0.0f || f == 0.0f) {
                    return;
                }
                hxe0 hxe0Var = nml0Var.n;
                if (hxe0Var == null) {
                    hxe0Var = hxe0.d;
                }
                hxe0 hxe0Var2 = hxe0Var;
                P();
                canvas.clipPath(path);
                ynl0 ynl0Var = new ynl0();
                S(ynl0Var, k.a());
                ynl0Var.a.O = Boolean.FALSE;
                u(nml0Var, ynl0Var);
                this.c = ynl0Var;
                pt3 pt3Var2 = xml0Var.h;
                Matrix matrix = nml0Var.r;
                if (matrix != null) {
                    canvas.concat(matrix);
                    Matrix matrix2 = new Matrix();
                    if (nml0Var.r.invert(matrix2)) {
                        pt3 pt3Var3 = xml0Var.h;
                        float f15 = pt3Var3.b;
                        float f16 = pt3Var3.c;
                        float a = pt3Var3.a();
                        z = true;
                        pt3 pt3Var4 = xml0Var.h;
                        z2 = false;
                        float f17 = pt3Var4.c;
                        float a2 = pt3Var4.a();
                        f6 = 0.0f;
                        float b6 = xml0Var.h.b();
                        pt3 pt3Var5 = xml0Var.h;
                        f5 = f2;
                        float[] fArr = {f15, f16, a, f17, a2, b6, pt3Var5.b, pt3Var5.b()};
                        matrix2.mapPoints(fArr);
                        float f18 = fArr[0];
                        float f19 = fArr[1];
                        RectF rectF = new RectF(f18, f19, f18, f19);
                        for (int i = 2; i <= 6; i += 2) {
                            float f20 = fArr[i];
                            if (f20 < rectF.left) {
                                rectF.left = f20;
                            }
                            if (f20 > rectF.right) {
                                rectF.right = f20;
                            }
                            float f21 = fArr[i + 1];
                            if (f21 < rectF.top) {
                                rectF.top = f21;
                            }
                            if (f21 > rectF.bottom) {
                                rectF.bottom = f21;
                            }
                        }
                        float f22 = rectF.left;
                        float f23 = rectF.top;
                        pt3Var2 = new pt3(f22, f23, rectF.right - f22, rectF.bottom - f23, 1);
                        float floor2 = (((float) Math.floor((pt3Var2.b - f5) / f4)) * f4) + f5;
                        float a3 = pt3Var2.a();
                        b = pt3Var2.b();
                        pt3 pt3Var6 = new pt3(f6, f6, f4, f, 1);
                        E = E();
                        for (floor = (((float) Math.floor((pt3Var2.c - f3) / f)) * f) + f3; floor < b; floor += f) {
                            float f24 = floor2;
                            while (f24 < a3) {
                                pt3Var6.b = f24;
                                pt3Var6.c = floor;
                                P();
                                if (this.c.a.O.booleanValue()) {
                                    f7 = b;
                                    f8 = floor2;
                                } else {
                                    f7 = b;
                                    f8 = floor2;
                                    M(pt3Var6.b, pt3Var6.c, pt3Var6.d, pt3Var6.e);
                                }
                                pt3 pt3Var7 = nml0Var.o;
                                if (pt3Var7 != null) {
                                    canvas.concat(e(pt3Var6, pt3Var7, hxe0Var2));
                                } else {
                                    Boolean bool2 = nml0Var.q;
                                    boolean z5 = (bool2 == null || bool2.booleanValue()) ? z : z2;
                                    canvas.translate(f24, floor);
                                    if (!z5) {
                                        pt3 pt3Var8 = xml0Var.h;
                                        canvas.scale(pt3Var8.d, pt3Var8.e);
                                    }
                                }
                                Iterator it = nml0Var.i.iterator();
                                while (it.hasNext()) {
                                    G((anl0) it.next());
                                }
                                O();
                                f24 += f4;
                                b = f7;
                                floor2 = f8;
                            }
                        }
                        if (E) {
                            D(nml0Var.h);
                        }
                        O();
                        return;
                    }
                }
                f5 = f2;
                f6 = 0.0f;
                z = true;
                z2 = false;
                float floor22 = (((float) Math.floor((pt3Var2.b - f5) / f4)) * f4) + f5;
                float a32 = pt3Var2.a();
                b = pt3Var2.b();
                pt3 pt3Var62 = new pt3(f6, f6, f4, f, 1);
                E = E();
                while (floor < b) {
                }
                if (E) {
                }
                O();
                return;
            }
        }
        canvas.drawPath(path, this.c.d);
    }

    public final void m(Path path) {
        ynl0 ynl0Var = this.c;
        SVG$Style$VectorEffect sVG$Style$VectorEffect = ynl0Var.a.g0;
        SVG$Style$VectorEffect sVG$Style$VectorEffect2 = SVG$Style$VectorEffect.NonScalingStroke;
        Canvas canvas = this.a;
        if (sVG$Style$VectorEffect != sVG$Style$VectorEffect2) {
            canvas.drawPath(path, ynl0Var.e);
            return;
        }
        Matrix matrix = canvas.getMatrix();
        Path path2 = new Path();
        path.transform(matrix, path2);
        canvas.setMatrix(new Matrix());
        Shader shader = this.c.e.getShader();
        Matrix matrix2 = new Matrix();
        if (shader != null) {
            shader.getLocalMatrix(matrix2);
            Matrix matrix3 = new Matrix(matrix2);
            matrix3.postConcat(matrix);
            shader.setLocalMatrix(matrix3);
        }
        canvas.drawPath(path2, this.c.e);
        canvas.setMatrix(matrix);
        if (shader != null) {
            shader.setLocalMatrix(matrix2);
        }
    }

    public final void n(lnl0 lnl0Var, cwa1 cwa1Var) {
        float f;
        float f2;
        float f3;
        SVG$Style$TextAnchor v;
        if (k()) {
            Iterator it = lnl0Var.i.iterator();
            boolean z = true;
            while (it.hasNext()) {
                anl0 anl0Var = (anl0) it.next();
                if (anl0Var instanceof onl0) {
                    cwa1Var.c(Q(((onl0) anl0Var).c, z, !it.hasNext()));
                } else if (cwa1Var.b((lnl0) anl0Var)) {
                    if (anl0Var instanceof mnl0) {
                        P();
                        mnl0 mnl0Var = (mnl0) anl0Var;
                        T(this.c, mnl0Var);
                        if (k() && V()) {
                            yml0 h = mnl0Var.a.h(mnl0Var.n);
                            if (h == null) {
                                o("TextPath reference '%s' not found", mnl0Var.n);
                            } else {
                                lml0 lml0Var = (lml0) h;
                                Path path = (Path) new unl0(lml0Var.o).c;
                                Matrix matrix = lml0Var.n;
                                if (matrix != null) {
                                    path.transform(matrix);
                                }
                                PathMeasure pathMeasure = new PathMeasure(path, false);
                                j jVar = mnl0Var.o;
                                r5 = jVar != null ? jVar.b(this, pathMeasure.getLength()) : 0.0f;
                                SVG$Style$TextAnchor v2 = v();
                                if (v2 != SVG$Style$TextAnchor.Start) {
                                    float d = d(mnl0Var);
                                    if (v2 == SVG$Style$TextAnchor.Middle) {
                                        d /= 2.0f;
                                    }
                                    r5 -= d;
                                }
                                g(mnl0Var.p);
                                boolean E = E();
                                n(mnl0Var, new vnl0(this, path, r5));
                                if (E) {
                                    D(mnl0Var.h);
                                }
                            }
                        }
                        O();
                    } else if (anl0Var instanceof inl0) {
                        P();
                        inl0 inl0Var = (inl0) anl0Var;
                        T(this.c, inl0Var);
                        if (k()) {
                            ArrayList arrayList = inl0Var.n;
                            boolean z2 = arrayList != null && arrayList.size() > 0;
                            boolean z3 = cwa1Var instanceof wnl0;
                            if (z3) {
                                float d2 = !z2 ? ((wnl0) cwa1Var).a : ((j) inl0Var.n.get(0)).d(this);
                                ArrayList arrayList2 = inl0Var.o;
                                f2 = (arrayList2 == null || arrayList2.size() == 0) ? ((wnl0) cwa1Var).b : ((j) inl0Var.o.get(0)).e(this);
                                ArrayList arrayList3 = inl0Var.p;
                                f3 = (arrayList3 == null || arrayList3.size() == 0) ? 0.0f : ((j) inl0Var.p.get(0)).d(this);
                                ArrayList arrayList4 = inl0Var.q;
                                if (arrayList4 != null && arrayList4.size() != 0) {
                                    r5 = ((j) inl0Var.q.get(0)).e(this);
                                }
                                float f4 = d2;
                                f = r5;
                                r5 = f4;
                            } else {
                                f = 0.0f;
                                f2 = 0.0f;
                                f3 = 0.0f;
                            }
                            if (z2 && (v = v()) != SVG$Style$TextAnchor.Start) {
                                float d3 = d(inl0Var);
                                if (v == SVG$Style$TextAnchor.Middle) {
                                    d3 /= 2.0f;
                                }
                                r5 -= d3;
                            }
                            g(inl0Var.r);
                            if (z3) {
                                wnl0 wnl0Var = (wnl0) cwa1Var;
                                wnl0Var.a = r5 + f3;
                                wnl0Var.b = f2 + f;
                            }
                            boolean E2 = E();
                            n(inl0Var, cwa1Var);
                            if (E2) {
                                D(inl0Var.h);
                            }
                        }
                        O();
                    } else if (anl0Var instanceof hnl0) {
                        P();
                        hnl0 hnl0Var = (hnl0) anl0Var;
                        T(this.c, hnl0Var);
                        if (k()) {
                            g(hnl0Var.o);
                            yml0 h2 = anl0Var.a.h(hnl0Var.n);
                            if (h2 == null || !(h2 instanceof lnl0)) {
                                o("Tref reference '%s' not found", hnl0Var.n);
                            } else {
                                StringBuilder sb = new StringBuilder();
                                p((lnl0) h2, sb);
                                if (sb.length() > 0) {
                                    cwa1Var.c(sb.toString());
                                }
                            }
                        }
                        O();
                    }
                }
                z = false;
            }
        }
    }

    public final void p(lnl0 lnl0Var, StringBuilder sb) {
        Iterator it = lnl0Var.i.iterator();
        boolean z = true;
        while (it.hasNext()) {
            anl0 anl0Var = (anl0) it.next();
            if (anl0Var instanceof lnl0) {
                p((lnl0) anl0Var, sb);
            } else if (anl0Var instanceof onl0) {
                sb.append(Q(((onl0) anl0Var).c, z, !it.hasNext()));
            }
            z = false;
        }
    }

    public final ynl0 t(yml0 yml0Var) {
        ynl0 ynl0Var = new ynl0();
        S(ynl0Var, k.a());
        u(yml0Var, ynl0Var);
        return ynl0Var;
    }

    public final void u(anl0 anl0Var, ynl0 ynl0Var) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (anl0Var instanceof yml0) {
                arrayList.add(0, (yml0) anl0Var);
            }
            Object obj = anl0Var.b;
            if (obj == null) {
                break;
            } else {
                anl0Var = (anl0) obj;
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            T(ynl0Var, (yml0) it.next());
        }
        ynl0 ynl0Var2 = this.c;
        ynl0Var.g = ynl0Var2.g;
        ynl0Var.f = ynl0Var2.f;
    }

    public final SVG$Style$TextAnchor v() {
        SVG$Style$TextAnchor sVG$Style$TextAnchor;
        k kVar = this.c.a;
        if (kVar.M == SVG$Style$TextDirection.LTR || (sVG$Style$TextAnchor = kVar.N) == SVG$Style$TextAnchor.Middle) {
            return kVar.N;
        }
        SVG$Style$TextAnchor sVG$Style$TextAnchor2 = SVG$Style$TextAnchor.Start;
        return sVG$Style$TextAnchor == sVG$Style$TextAnchor2 ? SVG$Style$TextAnchor.End : sVG$Style$TextAnchor2;
    }

    public final Path x(wll0 wll0Var) {
        j jVar = wll0Var.o;
        float d = jVar != null ? jVar.d(this) : 0.0f;
        j jVar2 = wll0Var.p;
        float e = jVar2 != null ? jVar2.e(this) : 0.0f;
        float a = wll0Var.q.a(this);
        float f = d - a;
        float f2 = e - a;
        float f3 = d + a;
        float f4 = e + a;
        if (wll0Var.h == null) {
            float f5 = 2.0f * a;
            wll0Var.h = new pt3(f, f2, f5, f5, 1);
        }
        float f6 = a * 0.5522848f;
        Path path = new Path();
        path.moveTo(d, f2);
        float f7 = d + f6;
        float f8 = e - f6;
        path.cubicTo(f7, f2, f3, f8, f3, e);
        float f9 = e + f6;
        path.cubicTo(f3, f9, f7, f4, d, f4);
        float f10 = d - f6;
        path.cubicTo(f10, f4, f, f9, f, e);
        path.cubicTo(f, f8, f10, f2, d, f2);
        path.close();
        return path;
    }

    public final Path y(bml0 bml0Var) {
        float f;
        j jVar = bml0Var.o;
        float d = jVar != null ? jVar.d(this) : 0.0f;
        j jVar2 = bml0Var.p;
        float e = jVar2 != null ? jVar2.e(this) : 0.0f;
        float d2 = bml0Var.q.d(this);
        float e2 = bml0Var.r.e(this);
        float f2 = d - d2;
        float f3 = e - e2;
        float f4 = d + d2;
        float f5 = e + e2;
        if (bml0Var.h == null) {
            f = f2;
            bml0Var.h = new pt3(f2, f3, d2 * 2.0f, 2.0f * e2, 1);
        } else {
            f = f2;
        }
        float f6 = d2 * 0.5522848f;
        float f7 = e2 * 0.5522848f;
        Path path = new Path();
        path.moveTo(d, f3);
        float f8 = d + f6;
        float f9 = e - f7;
        path.cubicTo(f8, f3, f4, f9, f4, e);
        float f10 = e + f7;
        path.cubicTo(f4, f10, f8, f5, d, f5);
        float f11 = d - f6;
        path.cubicTo(f11, f5, f, f10, f, e);
        path.cubicTo(f, f9, f11, f3, d, f3);
        path.close();
        return path;
    }
}
