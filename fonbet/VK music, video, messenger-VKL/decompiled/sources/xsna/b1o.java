package xsna;

/* compiled from: DonutOneTimeBadgeUiDto.kt */
/* loaded from: classes4.dex */
public final class b1o extends ol60 {
    public final String h;

    public b1o(String str) {
        super(394, 0, 0, 0, null);
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1o) && epx.f(this.h, ((b1o) obj).h);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (this.h.hashCode() * 31);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("DonutOneTimeBadgeUiDto(amount="), this.h, ", seqId=0)");
    }
}
