package defpackage;

/* loaded from: classes4.dex */
public final class iih {
    public final int a;
    public final boolean b;

    public iih(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final int a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iih)) {
            return false;
        }
        iih iihVar = (iih) obj;
        return this.a == iihVar.a && this.b == iihVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MonthDifference(roundedMonthDifference=");
        sb.append(this.a);
        sb.append(", hasPartialMonth=");
        return unr0.u(sb, this.b, ')');
    }
}
