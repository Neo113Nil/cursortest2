package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import android.util.DisplayMetrics;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.Arrays;
import java.util.function.DoubleUnaryOperator;

/* loaded from: classes11.dex */
public abstract class f4b1 {
    public static final void a(a aVar, f530 f530Var, float f, float f2, a aVar2, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        a aVar3;
        a aVar4;
        float f3;
        float f4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2077847262);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i | (btsVar.k(f530Var2) ? 32 : 16);
        }
        int i5 = i3 | 3456;
        if (btsVar.V(i5 & 1, (i5 & 9363) != 9362)) {
            c530 c530Var = c530.a;
            if (i4 != 0) {
                f530Var2 = c530Var;
            }
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new vn4(4.0f, 4.0f);
                btsVar.o0(Q);
            }
            z910 z910Var = (z910) Q;
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, z910Var);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 h = pj91.h(c530Var, "content");
            uo5 uo5Var = x4c.y;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, h);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            cj6 cj6Var = cj6.a;
            aVar4 = aVar2;
            aVar4.invoke(cj6Var, btsVar, 54);
            btsVar.t(true);
            f530 h2 = pj91.h(c530Var, "badge");
            z910 d4 = pi6.d(uo5Var, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d5 = b.d(btsVar, h2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d5);
            aVar3 = aVar;
            aVar3.invoke(cj6Var, btsVar, 54);
            btsVar.t(true);
            btsVar.t(true);
            f3 = 4.0f;
            f4 = 4.0f;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            btsVar.Y();
            f3 = f;
            f4 = f2;
        }
        f530 f530Var3 = f530Var2;
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn4(aVar3, f530Var3, f3, f4, aVar4, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0132, code lost:
    
        if (r0 != null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static u92 b(int i, int i2, int i3, int i4) {
        ColorSpace colorSpace;
        int i5;
        androidx.compose.ui.graphics.colorspace.a aVar;
        ColorSpace rgb;
        ColorSpace.Named named;
        ColorSpace.Named named2;
        int i6 = (i4 & 4) != 0 ? 0 : i3;
        androidx.compose.ui.graphics.colorspace.a aVar2 = wgc.e;
        hua1.h(i6);
        Bitmap.Config h = hua1.h(i6);
        if (jl40.l(aVar2, aVar2)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        } else if (jl40.l(aVar2, wgc.q)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACES);
        } else if (jl40.l(aVar2, wgc.r)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ACESCG);
        } else if (jl40.l(aVar2, wgc.o)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        } else if (jl40.l(aVar2, wgc.j)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT2020);
        } else if (jl40.l(aVar2, wgc.i)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.BT709);
        } else if (jl40.l(aVar2, wgc.t)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_LAB);
        } else if (jl40.l(aVar2, wgc.s)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        } else if (jl40.l(aVar2, wgc.k)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DCI_P3);
        } else if (jl40.l(aVar2, wgc.l)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        } else if (jl40.l(aVar2, wgc.g)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        } else if (jl40.l(aVar2, wgc.h)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        } else if (jl40.l(aVar2, wgc.f)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        } else if (jl40.l(aVar2, wgc.m)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.NTSC_1953);
        } else if (jl40.l(aVar2, wgc.p)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        } else if (jl40.l(aVar2, wgc.n)) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SMPTE_C);
        } else {
            ColorSpace.Rgb.TransferParameters transferParameters = null;
            if (Build.VERSION.SDK_INT >= 34) {
                if (jl40.l(aVar2, wgc.v)) {
                    named2 = ColorSpace.Named.BT2020_HLG;
                    colorSpace = ColorSpace.get(named2);
                } else if (jl40.l(aVar2, wgc.w)) {
                    named = ColorSpace.Named.BT2020_PQ;
                    colorSpace = ColorSpace.get(named);
                } else {
                    colorSpace = null;
                }
            }
            if (aVar2 != null) {
                String str = aVar2.a;
                float[] a = aVar2.d.a();
                wm01 wm01Var = aVar2.g;
                if (wm01Var != null) {
                    i5 = 0;
                    ColorSpace.Rgb.TransferParameters transferParameters2 = new ColorSpace.Rgb.TransferParameters(wm01Var.b, wm01Var.c, wm01Var.d, wm01Var.e, wm01Var.f, wm01Var.g, wm01Var.a);
                    aVar = aVar2;
                    transferParameters = transferParameters2;
                } else {
                    i5 = 0;
                    aVar = aVar2;
                }
                float[] fArr = aVar.i;
                if (transferParameters != null) {
                    ColorSpace.Rgb rgb2 = new ColorSpace.Rgb(str, aVar.h, a, transferParameters);
                    if (Float.isNaN(fArr[i5]) || Arrays.equals(rgb2.getTransform(), fArr)) {
                        rgb = rgb2;
                    } else {
                        colorSpace = new ColorSpace.Rgb(str, fArr, transferParameters);
                    }
                } else {
                    float[] fArr2 = aVar.h;
                    final tls tlsVar = aVar.l;
                    final int i7 = i5;
                    DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: vgc
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            int i8 = i7;
                            tls tlsVar2 = tlsVar;
                            switch (i8) {
                            }
                            return ((Number) tlsVar2.invoke(Double.valueOf(d))).doubleValue();
                        }
                    };
                    final tls tlsVar2 = aVar.o;
                    final int i8 = 1;
                    rgb = new ColorSpace.Rgb(str, fArr2, a, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: vgc
                        @Override // java.util.function.DoubleUnaryOperator
                        public final double applyAsDouble(double d) {
                            int i82 = i8;
                            tls tlsVar22 = tlsVar2;
                            switch (i82) {
                            }
                            return ((Number) tlsVar22.invoke(Double.valueOf(d))).doubleValue();
                        }
                    }, aVar.e, aVar.f);
                }
                return new u92(Bitmap.createBitmap((DisplayMetrics) null, i, i2, h, true, rgb));
            }
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        rgb = colorSpace;
        return new u92(Bitmap.createBitmap((DisplayMetrics) null, i, i2, h, true, rgb));
    }

    public static final String c(zuo0 zuo0Var) {
        if (zuo0Var instanceof ea90) {
            return "paid_reservation";
        }
        if (zuo0Var instanceof se90) {
            return "parking";
        }
        if (zuo0Var instanceof lrj0) {
            return "reservation";
        }
        if (zuo0Var instanceof nrk0) {
            return "riding";
        }
        w511.b();
        return null;
    }

    public static final boolean d(zuo0 zuo0Var) {
        return (zuo0Var instanceof nrk0) || (zuo0Var instanceof se90);
    }
}
