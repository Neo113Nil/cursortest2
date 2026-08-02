package xsna;

/* compiled from: DonutPollTeaserUiDto.kt */
/* loaded from: classes4.dex */
public final class g1o extends ol60 {
    public final String h;
    public final r1o i;

    public g1o(String str, r1o r1oVar) {
        super(26, 0, 0, 0, null);
        this.h = str;
        this.i = r1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1o)) {
            return false;
        }
        g1o g1oVar = (g1o) obj;
        return epx.f(this.h, g1oVar.h) && epx.f(this.i, g1oVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DonutPollTeaserUiDto(question=" + this.h + ", action=" + this.i + ", seqId=0)";
    }
}
