package xsna;

/* compiled from: DonutTextOneTimeBadgeUiDto.kt */
/* loaded from: classes4.dex */
public final class a4o extends ol60 {
    public final String h;
    public final String i;

    public a4o(String str, String str2) {
        super(395, 0, 0, 0, null);
        this.h = str;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4o)) {
            return false;
        }
        a4o a4oVar = (a4o) obj;
        return epx.f(this.h, a4oVar.h) && epx.f(this.i, a4oVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + urd0.a(this.h.hashCode() * 31, 31, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonutTextOneTimeBadgeUiDto(text=");
        sb.append(this.h);
        sb.append(", amount=");
        return i5s.a(sb, this.i, ", seqId=0)");
    }
}
