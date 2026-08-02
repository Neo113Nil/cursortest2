package xsna;

import xsna.sox;

/* compiled from: CurrentIntervalTitleViewState.kt */
/* loaded from: classes8.dex */
public final class ilk implements l2u0 {
    public static final ilk j = new ilk(false, false, null, 0, 0, true, "·", null, null);
    public final boolean a;
    public final boolean b;
    public final sox.a c;
    public final int d;
    public final int e;
    public final boolean f;
    public final String g;
    public final Integer h;
    public final Integer i;

    public ilk(boolean z, boolean z2, sox.a aVar, int i, int i2, boolean z3, String str, Integer num, Integer num2) {
        this.a = z;
        this.b = z2;
        this.c = aVar;
        this.d = i;
        this.e = i2;
        this.f = z3;
        this.g = str;
        this.h = num;
        this.i = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ilk)) {
            return false;
        }
        ilk ilkVar = (ilk) obj;
        return this.a == ilkVar.a && this.b == ilkVar.b && epx.f(this.c, ilkVar.c) && this.d == ilkVar.d && this.e == ilkVar.e && this.f == ilkVar.f && epx.f(this.g, ilkVar.g) && epx.f(this.h, ilkVar.h) && epx.f(this.i, ilkVar.i);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        sox.a aVar = this.c;
        int a = urd0.a(qoy.b(shy.a(this.e, shy.a(this.d, (b + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31), 31, this.f), 31, this.g);
        Integer num = this.h;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.i;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // xsna.n2u0
    public final boolean isVisible() {
        return this.a;
    }

    public final String toString() {
        StringBuilder c = gp.c("CurrentIntervalTitleViewState(isVisible=", ", isInAnimation=", ", interval=", this.a, this.b);
        c.append(this.c);
        c.append(", intervalIndex=");
        c.append(this.d);
        c.append(", intervalsCount=");
        c.append(this.e);
        c.append(", shouldShowCounter=");
        c.append(this.f);
        c.append(", separatorSymbol=");
        kr.b(this.h, this.g, ", separatorMarginLeft=", ", separatorMarginRight=", c);
        return oq.b(c, this.i, ")");
    }
}
