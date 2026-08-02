package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.us2;

/* compiled from: ParagraphStyle.kt */
/* loaded from: classes11.dex */
public final class fh90 implements us2.a {
    public final int a;
    public final int b;
    public final long c;
    public final iio0 d;
    public final yta0 e;
    public final t7z f;
    public final int g;
    public final int h;
    public final zjo0 i;

    public fh90(int i, int i2, long j, iio0 iio0Var, yta0 yta0Var, t7z t7zVar, int i3, int i4, zjo0 zjo0Var) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = iio0Var;
        this.e = yta0Var;
        this.f = t7zVar;
        this.g = i3;
        this.h = i4;
        this.i = zjo0Var;
        if (fno0.b(j, fno0.c) || fno0.d(j) >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        vzw.c("lineHeight can't be negative (" + fno0.d(j) + ')');
    }

    public final fh90 a(fh90 fh90Var) {
        return fh90Var == null ? this : gh90.a(this, fh90Var.a, fh90Var.b, fh90Var.c, fh90Var.d, fh90Var.e, fh90Var.f, fh90Var.g, fh90Var.h, fh90Var.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh90)) {
            return false;
        }
        fh90 fh90Var = (fh90) obj;
        return this.a == fh90Var.a && this.b == fh90Var.b && fno0.b(this.c, fh90Var.c) && epx.f(this.d, fh90Var.d) && epx.f(this.e, fh90Var.e) && epx.f(this.f, fh90Var.f) && this.g == fh90Var.g && this.h == fh90Var.h && epx.f(this.i, fh90Var.i);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        gno0[] gno0VarArr = fno0.b;
        int a2 = bh10.a(a, 31, this.c);
        iio0 iio0Var = this.d;
        int hashCode = (a2 + (iio0Var != null ? iio0Var.hashCode() : 0)) * 31;
        yta0 yta0Var = this.e;
        int hashCode2 = (hashCode + (yta0Var != null ? yta0Var.hashCode() : 0)) * 31;
        t7z t7zVar = this.f;
        int a3 = shy.a(this.h, shy.a(this.g, (hashCode2 + (t7zVar != null ? t7zVar.hashCode() : 0)) * 31, 31), 31);
        zjo0 zjo0Var = this.i;
        return a3 + (zjo0Var != null ? zjo0Var.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) obo0.a(this.a)) + ", textDirection=" + ((Object) udo0.a(this.b)) + ", lineHeight=" + ((Object) fno0.f(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) q7z.a(this.g)) + ", hyphens=" + ((Object) plv.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
