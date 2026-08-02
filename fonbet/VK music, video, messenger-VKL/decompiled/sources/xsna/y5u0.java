package xsna;

import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.Pair;
import kotlin.text.Regex;
import xsna.wbr;

/* compiled from: VisualOptions.kt */
/* loaded from: classes2.dex */
public final class y5u0 {
    public static final y5u0 l = new y5u0(0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final boolean i;
    public final boolean j;
    public final wbr.b k;

    public y5u0() {
        this(0, 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5u0)) {
            return false;
        }
        y5u0 y5u0Var = (y5u0) obj;
        return this.a == y5u0Var.a && this.b == y5u0Var.b && this.c == y5u0Var.c && this.d == y5u0Var.d && this.e == y5u0Var.e && this.f == y5u0Var.f && this.g == y5u0Var.g && this.h == y5u0Var.h && this.i == y5u0Var.i && this.j == y5u0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + qoy.b(shy.a(this.h, qoy.b(shy.a(this.f, qoy.b(shy.a(this.d, shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31, this.e), 31), 31, this.g), 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VisualOptions(scoreType=");
        sb.append(this.a);
        sb.append(", markersWithTitleAndSubtitleCount=");
        sb.append(this.b);
        sb.append(", categoriesCount=");
        sb.append(this.c);
        sb.append(", dotsCount=");
        sb.append(this.d);
        sb.append(", drawRects=");
        sb.append(this.e);
        sb.append(", rateLimitPercent=");
        sb.append(this.f);
        sb.append(", showProgress=");
        sb.append(this.g);
        sb.append(", newRateLimit=");
        sb.append(this.h);
        sb.append(", drawScore=");
        sb.append(this.i);
        sb.append(", ignoreSubtitleLogic=");
        return defpackage.q0.a(sb, this.j, ')');
    }

    public y5u0(int i, int i2, int i3, int i4, boolean z, int i5, boolean z2, int i6, boolean z3, boolean z4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = z;
        this.f = i5;
        this.g = z2;
        this.h = i6;
        this.i = z3;
        this.j = z4;
        this.k = new wbr.b(new Pair[]{new Pair(wbr.b.b, new wbr.a(i2, i3, i4))});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y5u0(int i, int i2, int i3) {
        this(1, r2, r3, r4, false, -1, false, Integer.MAX_VALUE, false, (i3 & 512) == 0);
        int i4 = (i3 & 2) != 0 ? 3 : i;
        int i5 = (i3 & 4) != 0 ? 1000 : 0;
        int i6 = (i3 & 8) != 0 ? 1000 : i2;
        Regex regex = fqv.j;
    }
}
