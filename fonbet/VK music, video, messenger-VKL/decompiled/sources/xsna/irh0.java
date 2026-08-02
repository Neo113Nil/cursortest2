package xsna;

import kotlin.time.DurationUnit;
import xsna.zno;

/* compiled from: SearchFeatureOptions.kt */
/* loaded from: classes5.dex */
public final class irh0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;

    public irh0(boolean z, boolean z2, int i) {
        boolean z3 = (i & 4) == 0;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? true : z2;
        int i2 = (i & 32) != 0 ? 0 : 3;
        boolean z4 = (i & 64) == 0;
        zno.a aVar = zno.c;
        long e = eoo.e(300, DurationUnit.MILLISECONDS);
        this.a = true;
        this.b = true;
        this.c = z3;
        this.d = z;
        this.e = z2;
        this.f = i2;
        this.g = z4;
        this.h = e;
        this.i = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof irh0)) {
            return false;
        }
        irh0 irh0Var = (irh0) obj;
        return this.a == irh0Var.a && this.b == irh0Var.b && this.c == irh0Var.c && this.d == irh0Var.d && this.e == irh0Var.e && this.f == irh0Var.f && this.g == irh0Var.g && zno.d(this.h, irh0Var.h) && this.i == irh0Var.i;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.f, qoy.b(qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31, this.g);
        zno.a aVar = zno.c;
        return Boolean.hashCode(this.i) + bh10.a(b, 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchFeatureOptions(isReloadOnNewQuery=");
        sb.append(this.a);
        sb.append(", isScrollToTopOnSync=");
        sb.append(this.b);
        sb.append(", isSpellcheckerEnabled=");
        sb.append(this.c);
        sb.append(", isSuggestionsEnabled=");
        sb.append(this.d);
        sb.append(", isEmptyQueryAllowed=");
        sb.append(this.e);
        sb.append(", minQueryLength=");
        sb.append(this.f);
        sb.append(", debounceDuringSuggesterMode=");
        sb.append(this.g);
        sb.append(", queryDebounceDuration=");
        sb.append((Object) zno.m(this.h));
        sb.append(", isParamsIconAlwaysVisible=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
