package xsna;

/* compiled from: FaveEmptyPlaceholderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class wnq extends ol60 {
    public final int h;
    public final String i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final String m;
    public final boolean n;
    public final boolean o;
    public final int p;

    public wnq(int i, String str, boolean z, String str2, boolean z2, String str3, boolean z3, boolean z4, int i2) {
        super(1113, 0, i2, 6, null);
        this.h = i;
        this.i = str;
        this.j = z;
        this.k = str2;
        this.l = z2;
        this.m = str3;
        this.n = z3;
        this.o = z4;
        this.p = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnq)) {
            return false;
        }
        wnq wnqVar = (wnq) obj;
        return this.h == wnqVar.h && epx.f(this.i, wnqVar.i) && this.j == wnqVar.j && epx.f(this.k, wnqVar.k) && this.l == wnqVar.l && epx.f(this.m, wnqVar.m) && this.n == wnqVar.n && this.o == wnqVar.o && this.p == wnqVar.p;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.p;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.h) * 31;
        String str = this.i;
        int b = qoy.b(urd0.a(qoy.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.j), 31, this.k), 31, this.l);
        String str2 = this.m;
        return Integer.hashCode(this.p) + qoy.b(qoy.b((b + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveEmptyPlaceholderHolderUiDto(paddingBottom=");
        sb.append(this.h);
        sb.append(", title=");
        sb.append(this.i);
        sb.append(", isTitleVisible=");
        sb.append(this.j);
        sb.append(", description=");
        sb.append(this.k);
        sb.append(", isClearButtonVisible=");
        sb.append(this.l);
        sb.append(", actionButtonTitle=");
        sb.append(this.m);
        sb.append(", isActionButtonVisible=");
        sb.append(this.n);
        sb.append(", isTopDividerVisible=");
        sb.append(this.o);
        sb.append(", seqId=");
        return vu5.b(sb, this.p, ')');
    }
}
