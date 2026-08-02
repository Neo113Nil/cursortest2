package defpackage;

import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.ArrayList;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class dry0 {
    public final cry0 a;
    public final hm40 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public dry0(cry0 cry0Var, hm40 hm40Var, long j) {
        this.a = cry0Var;
        this.b = hm40Var;
        this.c = j;
        ArrayList arrayList = hm40Var.h;
        float f = 0.0f;
        this.d = arrayList.isEmpty() ? 0.0f : ((cc90) arrayList.get(0)).a.d.d(0);
        if (!arrayList.isEmpty()) {
            cc90 cc90Var = (cc90) a.Z(arrayList);
            f = cc90Var.a.d.d(r4.g - 1) + cc90Var.f;
        }
        this.e = f;
        this.f = hm40Var.g;
    }

    public static int h(dry0 dry0Var, int i) {
        return dry0Var.b.c(i, false);
    }

    public final ResolvedTextDirection a(int i) {
        hm40 hm40Var = this.b;
        hm40Var.l(i);
        int length = ((kk2) hm40Var.a.a).b.length();
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(i == length ? scc.f(arrayList) : cqb1.a(i, arrayList));
        return cc90Var.a.d.f.isRtlCharAt(cc90Var.d(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    public final zii0 b(int i) {
        float i2;
        float i3;
        float h;
        float h2;
        hm40 hm40Var = this.b;
        hm40Var.k(i);
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.a(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int d = cc90Var.d(i);
        CharSequence charSequence = gb2Var.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder t = b64.t(d, "offset(", ") is out of bounds [0,");
            t.append(charSequence.length());
            t.append(')');
            jxv.a(t.toString());
        }
        zqy0 zqy0Var = gb2Var.d;
        Layout layout = zqy0Var.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = zqy0Var.g(lineForOffset);
        float e = zqy0Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                h = zqy0Var.i(d, false);
                h2 = zqy0Var.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = zqy0Var.h(d, false);
                h2 = zqy0Var.h(d + 1, true);
            } else {
                i2 = zqy0Var.i(d, false);
                i3 = zqy0Var.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        } else {
            i2 = zqy0Var.h(d, false);
            i3 = zqy0Var.h(d + 1, true);
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return cc90Var.a(new zii0(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final zii0 c(int i) {
        hm40 hm40Var = this.b;
        hm40Var.l(i);
        int length = ((kk2) hm40Var.a.a).b.length();
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(i == length ? scc.f(arrayList) : cqb1.a(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int d = cc90Var.d(i);
        CharSequence charSequence = gb2Var.e;
        zqy0 zqy0Var = gb2Var.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder t = b64.t(d, "offset(", ") is out of bounds [0,");
            t.append(charSequence.length());
            t.append(']');
            jxv.a(t.toString());
        }
        float h = zqy0Var.h(d, false);
        int lineForOffset = zqy0Var.f.getLineForOffset(d);
        return cc90Var.a(new zii0(h, zqy0Var.g(lineForOffset), h, zqy0Var.e(lineForOffset)));
    }

    public final boolean d() {
        hm40 hm40Var = this.b;
        return hm40Var.c || ((float) ((int) (this.c & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) < hm40Var.e;
    }

    public final boolean e() {
        return ((float) ((int) (this.c >> 32))) < this.b.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dry0) {
            dry0 dry0Var = (dry0) obj;
            if (jl40.l(this.a, dry0Var.a) && this.b == dry0Var.b && k6w.a(this.c, dry0Var.c) && this.d == dry0Var.d && this.e == dry0Var.e && jl40.l(this.f, dry0Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return e() || d();
    }

    public final cry0 g() {
        return this.a;
    }

    public final int hashCode() {
        return this.f.hashCode() + g8e.c(this.e, g8e.c(this.d, qv10.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final float i(int i) {
        hm40 hm40Var = this.b;
        hm40Var.m(i);
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int i2 = i - cc90Var.d;
        zqy0 zqy0Var = gb2Var.d;
        return zqy0Var.f.getLineLeft(i2) + (i2 == zqy0Var.g + (-1) ? zqy0Var.j : 0.0f);
    }

    public final float j(int i) {
        hm40 hm40Var = this.b;
        hm40Var.m(i);
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int i2 = i - cc90Var.d;
        zqy0 zqy0Var = gb2Var.d;
        return zqy0Var.f.getLineRight(i2) + (i2 == zqy0Var.g + (-1) ? zqy0Var.k : 0.0f);
    }

    public final int k(int i) {
        hm40 hm40Var = this.b;
        hm40Var.m(i);
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(cqb1.b(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        return gb2Var.d.f.getLineStart(i - cc90Var.d) + cc90Var.b;
    }

    public final ResolvedTextDirection l(int i) {
        hm40 hm40Var = this.b;
        hm40Var.l(i);
        int length = ((kk2) hm40Var.a.a).b.length();
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(i == length ? scc.f(arrayList) : cqb1.a(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int d = cc90Var.d(i);
        zqy0 zqy0Var = gb2Var.d;
        return zqy0Var.f.getParagraphDirection(zqy0Var.f.getLineForOffset(d)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final jb2 m(int i, int i2) {
        hm40 hm40Var = this.b;
        kk2 kk2Var = (kk2) hm40Var.a.a;
        if (i < 0 || i > i2 || i2 > kk2Var.b.length()) {
            StringBuilder s = b64.s(i, i2, "Start(", ") or End(", ") is out of range [0..");
            s.append(kk2Var.b.length());
            s.append("), or start > end!");
            jxv.a(s.toString());
        }
        if (i == i2) {
            return nb2.a();
        }
        jb2 a = nb2.a();
        cqb1.d(hm40Var.h, eja1.c(i, i2), new j0v(a, i, i2, 1));
        return a;
    }

    public final long n(int i) {
        int t;
        int i2;
        int s;
        hm40 hm40Var = this.b;
        hm40Var.l(i);
        int length = ((kk2) hm40Var.a.a).b.length();
        ArrayList arrayList = hm40Var.h;
        cc90 cc90Var = (cc90) arrayList.get(i == length ? scc.f(arrayList) : cqb1.a(i, arrayList));
        gb2 gb2Var = cc90Var.a;
        int d = cc90Var.d(i);
        yi6 j = gb2Var.d.j();
        if (j.p(j.t(d))) {
            j.e(d);
            t = d;
            while (t != -1 && (!j.p(t) || j.k(t))) {
                t = j.t(t);
            }
        } else {
            j.e(d);
            t = j.o(d) ? (!j.l(d) || j.i(d)) ? j.t(d) : d : j.i(d) ? j.t(d) : -1;
        }
        if (t == -1) {
            t = d;
        }
        if (j.k(j.s(d))) {
            j.e(d);
            i2 = d;
            while (i2 != -1 && (j.p(i2) || !j.k(i2))) {
                i2 = j.s(i2);
            }
        } else {
            j.e(d);
            if (j.i(d)) {
                if (!j.l(d) || j.o(d)) {
                    s = j.s(d);
                    i2 = s;
                } else {
                    i2 = d;
                }
            } else if (j.o(d)) {
                s = j.s(d);
                i2 = s;
            } else {
                i2 = -1;
            }
        }
        if (i2 != -1) {
            d = i2;
        }
        return cc90Var.b(eja1.c(t, d), false);
    }

    public final boolean o(int i) {
        hm40 hm40Var = this.b;
        hm40Var.m(i);
        ArrayList arrayList = hm40Var.h;
        Layout layout = ((cc90) arrayList.get(cqb1.b(i, arrayList))).a.d.f;
        ThreadLocal threadLocal = fry0.a;
        return layout.getEllipsisCount(i) > 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.a);
        sb.append(", multiParagraph=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append((Object) k6w.b(this.c));
        sb.append(", firstBaseline=");
        sb.append(this.d);
        sb.append(", lastBaseline=");
        sb.append(this.e);
        sb.append(", placeholderRects=");
        return smw0.m(sb, this.f, ')');
    }
}
