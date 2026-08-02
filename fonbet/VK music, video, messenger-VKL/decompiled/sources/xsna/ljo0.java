package xsna;

import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: TextLayoutResult.kt */
/* loaded from: classes11.dex */
public final class ljo0 {
    public final kjo0 a;
    public final m540 b;
    public final long c;
    public final float d;
    public final float e;
    public final ArrayList f;

    public ljo0(kjo0 kjo0Var, m540 m540Var, long j) {
        this.a = kjo0Var;
        this.b = m540Var;
        this.c = j;
        ArrayList arrayList = m540Var.h;
        boolean isEmpty = arrayList.isEmpty();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.d = isEmpty ? 0.0f : ((ah90) arrayList.get(0)).a.b();
        if (!arrayList.isEmpty()) {
            ah90 ah90Var = (ah90) j5g.i0(arrayList);
            f = ah90Var.a.d() + ah90Var.f;
        }
        this.e = f;
        this.f = m540Var.g;
    }

    public static int g(ljo0 ljo0Var, int i) {
        return ljo0Var.b.c(i, false);
    }

    public final ResolvedTextDirection a(int i) {
        m540 m540Var = this.b;
        ArrayList arrayList = m540Var.h;
        m540Var.m(i);
        ah90 ah90Var = (ah90) arrayList.get(i == m540Var.a.a.c.length() ? e43.h(arrayList) : c4g0.n(i, arrayList));
        return ah90Var.a.d.f.isRtlCharAt(ah90Var.d(i)) ? ResolvedTextDirection.Rtl : ResolvedTextDirection.Ltr;
    }

    public final zhf0 b(int i) {
        float i2;
        float i3;
        float h;
        float h2;
        m540 m540Var = this.b;
        m540Var.l(i);
        ArrayList arrayList = m540Var.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.n(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int d = ah90Var.d(i);
        CharSequence charSequence = ya2Var.e;
        if (d < 0 || d >= charSequence.length()) {
            StringBuilder b = ji.b(d, "offset(", ") is out of bounds [0,");
            b.append(charSequence.length());
            b.append(')');
            vzw.a(b.toString());
        }
        fjo0 fjo0Var = ya2Var.d;
        Layout layout = fjo0Var.f;
        int lineForOffset = layout.getLineForOffset(d);
        float g = fjo0Var.g(lineForOffset);
        float e = fjo0Var.e(lineForOffset);
        boolean z = layout.getParagraphDirection(lineForOffset) == 1;
        boolean isRtlCharAt = layout.isRtlCharAt(d);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                h = fjo0Var.i(d, false);
                h2 = fjo0Var.i(d + 1, true);
            } else if (isRtlCharAt) {
                h = fjo0Var.h(d, false);
                h2 = fjo0Var.h(d + 1, true);
            } else {
                i2 = fjo0Var.i(d, false);
                i3 = fjo0Var.i(d + 1, true);
            }
            float f = h;
            i2 = h2;
            i3 = f;
        } else {
            i2 = fjo0Var.h(d, false);
            i3 = fjo0Var.h(d + 1, true);
        }
        RectF rectF = new RectF(i2, g, i3, e);
        return ah90Var.a(new zhf0(rectF.left, rectF.top, rectF.right, rectF.bottom));
    }

    public final zhf0 c(int i) {
        m540 m540Var = this.b;
        ArrayList arrayList = m540Var.h;
        m540Var.m(i);
        ah90 ah90Var = (ah90) arrayList.get(i == m540Var.a.a.c.length() ? e43.h(arrayList) : c4g0.n(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int d = ah90Var.d(i);
        CharSequence charSequence = ya2Var.e;
        fjo0 fjo0Var = ya2Var.d;
        if (d < 0 || d > charSequence.length()) {
            StringBuilder b = ji.b(d, "offset(", ") is out of bounds [0,");
            b.append(charSequence.length());
            b.append(']');
            vzw.a(b.toString());
        }
        float h = fjo0Var.h(d, false);
        int lineForOffset = fjo0Var.f.getLineForOffset(d);
        return ah90Var.a(new zhf0(h, fjo0Var.g(lineForOffset), h, fjo0Var.e(lineForOffset)));
    }

    public final boolean d() {
        m540 m540Var = this.b;
        return m540Var.c || ((float) ((int) (this.c & 4294967295L))) < m540Var.e;
    }

    public final boolean e() {
        return ((float) ((int) (this.c >> 32))) < this.b.d || d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljo0)) {
            return false;
        }
        ljo0 ljo0Var = (ljo0) obj;
        return epx.f(this.a, ljo0Var.a) && this.b.equals(ljo0Var.b) && q9x.b(this.c, ljo0Var.c) && this.d == ljo0Var.d && this.e == ljo0Var.e && epx.f(this.f, ljo0Var.f);
    }

    public final float f(int i, boolean z) {
        m540 m540Var = this.b;
        ArrayList arrayList = m540Var.h;
        m540Var.m(i);
        ah90 ah90Var = (ah90) arrayList.get(i == m540Var.a.a.c.length() ? e43.h(arrayList) : c4g0.n(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int d = ah90Var.d(i);
        fjo0 fjo0Var = ya2Var.d;
        return z ? fjo0Var.h(d, false) : fjo0Var.i(d, false);
    }

    public final float h(int i) {
        m540 m540Var = this.b;
        m540Var.n(i);
        ArrayList arrayList = m540Var.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int i2 = i - ah90Var.d;
        fjo0 fjo0Var = ya2Var.d;
        return fjo0Var.f.getLineLeft(i2) + (i2 == fjo0Var.g + (-1) ? fjo0Var.j : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final int hashCode() {
        return this.f.hashCode() + io.reactivex.rxjava3.subjects.b.a(this.e, io.reactivex.rxjava3.subjects.b.a(this.d, bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31), 31);
    }

    public final float i(int i) {
        m540 m540Var = this.b;
        m540Var.n(i);
        ArrayList arrayList = m540Var.h;
        ah90 ah90Var = (ah90) arrayList.get(c4g0.o(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int i2 = i - ah90Var.d;
        fjo0 fjo0Var = ya2Var.d;
        return fjo0Var.f.getLineRight(i2) + (i2 == fjo0Var.g + (-1) ? fjo0Var.k : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    public final ResolvedTextDirection j(int i) {
        m540 m540Var = this.b;
        ArrayList arrayList = m540Var.h;
        m540Var.m(i);
        ah90 ah90Var = (ah90) arrayList.get(i == m540Var.a.a.c.length() ? e43.h(arrayList) : c4g0.n(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int d = ah90Var.d(i);
        fjo0 fjo0Var = ya2Var.d;
        return fjo0Var.f.getParagraphDirection(fjo0Var.f.getLineForOffset(d)) == 1 ? ResolvedTextDirection.Ltr : ResolvedTextDirection.Rtl;
    }

    public final androidx.compose.ui.graphics.a k(final int i, final int i2) {
        m540 m540Var = this.b;
        us2 us2Var = m540Var.a.a;
        if (i < 0 || i > i2 || i2 > us2Var.c.length()) {
            StringBuilder a = odj.a(i, i2, "Start(", ") or End(", ") is out of range [0..");
            a.append(us2Var.c.length());
            a.append("), or start > end!");
            vzw.a(a.toString());
        }
        if (i == i2) {
            return androidx.compose.ui.graphics.b.a();
        }
        final androidx.compose.ui.graphics.a a2 = androidx.compose.ui.graphics.b.a();
        c4g0.q(m540Var.h, jgz.c(i, i2), new izs() { // from class: xsna.l540
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ah90 ah90Var = (ah90) obj;
                ya2 ya2Var = ah90Var.a;
                int d = ah90Var.d(i);
                int d2 = ah90Var.d(i2);
                CharSequence charSequence = ya2Var.e;
                if (d < 0 || d > d2 || d2 > charSequence.length()) {
                    StringBuilder a3 = odj.a(d, d2, "start(", ") or end(", ") is out of range [0..");
                    a3.append(charSequence.length());
                    a3.append("], or start > end!");
                    vzw.a(a3.toString());
                }
                Path path = new Path();
                fjo0 fjo0Var = ya2Var.d;
                fjo0Var.f.getSelectionPath(d, d2, path);
                int i3 = fjo0Var.h;
                if (i3 != 0 && !path.isEmpty()) {
                    path.offset(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3);
                }
                androidx.compose.ui.graphics.a aVar = new androidx.compose.ui.graphics.a(path);
                float f = ah90Var.f;
                aVar.e((Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << 32) | (Float.floatToRawIntBits(f) & 4294967295L));
                androidx.compose.ui.graphics.a.this.w(aVar, 0L);
                return s3q0.a;
            }
        });
        return a2;
    }

    public final long l(int i) {
        int i2;
        int i3;
        int h;
        m540 m540Var = this.b;
        ArrayList arrayList = m540Var.h;
        m540Var.m(i);
        ah90 ah90Var = (ah90) arrayList.get(i == m540Var.a.a.c.length() ? e43.h(arrayList) : c4g0.n(i, arrayList));
        ya2 ya2Var = ah90Var.a;
        int d = ah90Var.d(i);
        sux0 j = ya2Var.d.j();
        if (j.g(j.i(d))) {
            j.a(d);
            i2 = d;
            while (i2 != -1 && (!j.g(i2) || j.c(i2))) {
                i2 = j.i(i2);
            }
        } else {
            j.a(d);
            i2 = j.f(d) ? (!j.d(d) || j.b(d)) ? j.i(d) : d : j.b(d) ? j.i(d) : -1;
        }
        if (i2 == -1) {
            i2 = d;
        }
        if (j.c(j.h(d))) {
            j.a(d);
            i3 = d;
            while (i3 != -1 && (j.g(i3) || !j.c(i3))) {
                i3 = j.h(i3);
            }
        } else {
            j.a(d);
            if (j.b(d)) {
                if (!j.d(d) || j.f(d)) {
                    h = j.h(d);
                    i3 = h;
                } else {
                    i3 = d;
                }
            } else if (j.f(d)) {
                h = j.h(d);
                i3 = h;
            } else {
                i3 = -1;
            }
        }
        if (i3 != -1) {
            d = i3;
        }
        return ah90Var.b(jgz.c(i2, d), false);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextLayoutResult(layoutInput=");
        sb.append(this.a);
        sb.append(", multiParagraph=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append((Object) q9x.c(this.c));
        sb.append(", firstBaseline=");
        sb.append(this.d);
        sb.append(", lastBaseline=");
        sb.append(this.e);
        sb.append(", placeholderRects=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.f);
    }
}
