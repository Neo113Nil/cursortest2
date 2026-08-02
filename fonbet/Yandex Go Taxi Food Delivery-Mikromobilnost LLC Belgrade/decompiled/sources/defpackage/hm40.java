package defpackage;

import android.graphics.Matrix;
import android.graphics.Shader;
import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class hm40 {
    public final xv10 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final ArrayList g;
    public final ArrayList h;

    public hm40(xv10 xv10Var, long j, int i, int i2) {
        int i3;
        boolean z;
        int i4;
        int h;
        int i5;
        this.a = xv10Var;
        this.b = i;
        if (n8e.k(j) != 0 || n8e.j(j) != 0) {
            jxv.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) xv10Var.x;
        int size = arrayList2.size();
        float f = 0.0f;
        int i6 = 0;
        int i7 = 0;
        while (i6 < size) {
            dc90 dc90Var = (dc90) arrayList2.get(i6);
            ib2 ib2Var = dc90Var.a;
            int i8 = n8e.i(j);
            if (n8e.d(j)) {
                i4 = i6;
                h = n8e.h(j) - ((int) Math.ceil(f));
                if (h < 0) {
                    h = 0;
                }
            } else {
                i4 = i6;
                h = n8e.h(j);
            }
            i3 = 0;
            gb2 gb2Var = new gb2(ib2Var, this.b - i7, i2, p8e.b(0, i8, 0, h, 5));
            float b = gb2Var.b() + f;
            zqy0 zqy0Var = gb2Var.d;
            int i9 = i7 + zqy0Var.g;
            arrayList.add(new cc90(gb2Var, dc90Var.b, dc90Var.c, i7, i9, f, b));
            if (!zqy0Var.d) {
                if (i9 == this.b) {
                    i5 = i4;
                    if (i5 != scc.f((ArrayList) this.a.x)) {
                    }
                } else {
                    i5 = i4;
                }
                i6 = i5 + 1;
                i7 = i9;
                f = b;
            }
            z = true;
            i7 = i9;
            f = b;
            break;
        }
        i3 = 0;
        z = false;
        this.e = f;
        this.f = i7;
        this.c = z;
        this.h = arrayList;
        this.d = n8e.i(j);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i10 = i3; i10 < size2; i10++) {
            cc90 cc90Var = (cc90) arrayList.get(i10);
            List list = cc90Var.a.f;
            ArrayList arrayList4 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i11 = i3; i11 < size3; i11++) {
                zii0 zii0Var = (zii0) list.get(i11);
                arrayList4.add(zii0Var != null ? cc90Var.a(zii0Var) : null);
            }
            ycc.r(arrayList4, arrayList3);
        }
        if (arrayList3.size() < ((List) this.a.b).size()) {
            int size4 = ((List) this.a.b).size() - arrayList3.size();
            ArrayList arrayList5 = new ArrayList(size4);
            for (int i12 = i3; i12 < size4; i12++) {
                arrayList5.add(null);
            }
            arrayList3 = a.m0(arrayList5, arrayList3);
        }
        this.g = arrayList3;
    }

    public final void a(long j, float[] fArr) {
        k(asy0.f(j));
        l(asy0.e(j));
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = 0;
        cqb1.d(this.h, j, new sa6(j, fArr, ref$IntRef, new Ref$FloatRef()));
    }

    public final float b(int i) {
        m(i);
        ArrayList arrayList = this.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        return gb2Var.d.e(i - cc90Var.d) + cc90Var.f;
    }

    public final int c(int i, boolean z) {
        int f;
        m(i);
        ArrayList arrayList = this.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int i2 = i - cc90Var.d;
        zqy0 zqy0Var = gb2Var.d;
        if (z) {
            Layout layout = zqy0Var.f;
            ThreadLocal threadLocal = fry0.a;
            if (layout.getEllipsisCount(i2) <= 0 || zqy0Var.b != TextUtils.TruncateAt.END) {
                q4g c = zqy0Var.c();
                Layout layout2 = (Layout) c.b;
                f = c.l(layout2.getLineEnd(i2), layout2.getLineStart(i2));
            } else {
                f = layout.getEllipsisStart(i2) + layout.getLineStart(i2);
            }
        } else {
            f = zqy0Var.f(i2);
        }
        return f + cc90Var.b;
    }

    public final int d(int i) {
        int length = ((kk2) this.a.a).b.length();
        ArrayList arrayList = this.h;
        cc90 cc90Var = (cc90) arrayList.get(i >= length ? scc.f(arrayList) : i < 0 ? 0 : cqb1.a(i, arrayList));
        return cc90Var.a.d.f.getLineForOffset(cc90Var.d(i)) + cc90Var.d;
    }

    public final int e(float f) {
        ArrayList arrayList = this.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.c(arrayList, f));
        int i = cc90Var.c - cc90Var.b;
        int i2 = cc90Var.d;
        if (i == 0) {
            return i2;
        }
        gb2 gb2Var = cc90Var.a;
        float f2 = f - cc90Var.f;
        zqy0 zqy0Var = gb2Var.d;
        return zqy0Var.f.getLineForVertical(((int) f2) - zqy0Var.h) + i2;
    }

    public final float f(int i) {
        m(i);
        ArrayList arrayList = this.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        return gb2Var.d.g(i - cc90Var.d) + cc90Var.f;
    }

    public final int g(long j) {
        int i = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        float intBitsToFloat = Float.intBitsToFloat(i);
        ArrayList arrayList = this.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.c(arrayList, intBitsToFloat));
        int i2 = cc90Var.c;
        int i3 = cc90Var.b;
        if (i2 - i3 == 0) {
            return i3;
        }
        gb2 gb2Var = cc90Var.a;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat(i) - cc90Var.f;
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        zqy0 zqy0Var = gb2Var.d;
        int lineForVertical = zqy0Var.f.getLineForVertical(((int) Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & floatToRawIntBits))) - zqy0Var.h);
        return zqy0Var.f.getOffsetForHorizontal(lineForVertical, (zqy0Var.b(lineForVertical) * (-1.0f)) + Float.intBitsToFloat((int) (floatToRawIntBits >> 32))) + i3;
    }

    public final long h(zii0 zii0Var, int i, s2u0 s2u0Var) {
        long j;
        long j2;
        float f = zii0Var.b;
        ArrayList arrayList = this.h;
        int c = cqb1.c(arrayList, f);
        float f2 = ((cc90) arrayList.get(c)).g;
        float f3 = zii0Var.d;
        if (f2 >= f3 || c == scc.f(arrayList)) {
            cc90 cc90Var = (cc90) arrayList.get(c);
            return cc90Var.b(cc90Var.a.c(cc90Var.c(zii0Var), i, s2u0Var), true);
        }
        int c2 = cqb1.c(arrayList, f3);
        long j3 = asy0.b;
        while (true) {
            j = asy0.b;
            if (!asy0.b(j3, j) || c > c2) {
                break;
            }
            cc90 cc90Var2 = (cc90) arrayList.get(c);
            j3 = cc90Var2.b(cc90Var2.a.c(cc90Var2.c(zii0Var), i, s2u0Var), true);
            c++;
        }
        if (asy0.b(j3, j)) {
            return j;
        }
        while (true) {
            j2 = asy0.b;
            if (!asy0.b(j, j2) || c > c2) {
                break;
            }
            cc90 cc90Var3 = (cc90) arrayList.get(c2);
            j = cc90Var3.b(cc90Var3.a.c(cc90Var3.c(zii0Var), i, s2u0Var), true);
            c2--;
        }
        return asy0.b(j, j2) ? j3 : eja1.c((int) (j3 >> 32), (int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & j));
    }

    public final void i(i28 i28Var, long j, bgr0 bgr0Var, rly0 rly0Var, ram ramVar) {
        i28Var.save();
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            cc90 cc90Var = (cc90) arrayList.get(i);
            cc90Var.a.f(i28Var, j, bgr0Var, rly0Var, ramVar);
            i28Var.c(0.0f, cc90Var.a.b());
        }
        i28Var.n();
    }

    public final void j(i28 i28Var, ml6 ml6Var, float f, bgr0 bgr0Var, rly0 rly0Var, ram ramVar) {
        i28Var.save();
        ArrayList arrayList = this.h;
        if (arrayList.size() <= 1) {
            yua1.b(this, i28Var, ml6Var, f, bgr0Var, rly0Var, ramVar);
        } else if (ml6Var instanceof a6t0) {
            yua1.b(this, i28Var, ml6Var, f, bgr0Var, rly0Var, ramVar);
        } else {
            if (!(ml6Var instanceof zfr0)) {
                w511.b();
                return;
            }
            int size = arrayList.size();
            float f2 = 0.0f;
            float f3 = 0.0f;
            for (int i = 0; i < size; i++) {
                cc90 cc90Var = (cc90) arrayList.get(i);
                f3 += cc90Var.a.b();
                f2 = Math.max(f2, cc90Var.a.d());
            }
            Shader b = ((zfr0) ml6Var).b((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f3) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
            Matrix matrix = new Matrix();
            b.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                gb2 gb2Var = ((cc90) arrayList.get(i2)).a;
                gb2Var.g(i28Var, new nl6(b), f, bgr0Var, rly0Var, ramVar);
                i28Var.c(0.0f, gb2Var.b());
                matrix.setTranslate(0.0f, -gb2Var.b());
                b.setLocalMatrix(matrix);
            }
        }
        i28Var.n();
    }

    public final void k(int i) {
        kk2 kk2Var = (kk2) this.a.a;
        if (i < 0 || i >= kk2Var.b.length()) {
            StringBuilder t = b64.t(i, "offset(", ") is out of bounds [0, ");
            t.append(kk2Var.b.length());
            t.append(')');
            jxv.a(t.toString());
        }
    }

    public final void l(int i) {
        kk2 kk2Var = (kk2) this.a.a;
        if (i < 0 || i > kk2Var.b.length()) {
            StringBuilder t = b64.t(i, "offset(", ") is out of bounds [0, ");
            t.append(kk2Var.b.length());
            t.append(']');
            jxv.a(t.toString());
        }
    }

    public final void m(int i) {
        boolean z = false;
        int i2 = this.f;
        if (i >= 0 && i < i2) {
            z = true;
        }
        if (z) {
            return;
        }
        jxv.a("lineIndex(" + i + ") is out of bounds [0, " + i2 + ')');
    }
}
