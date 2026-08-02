package xsna;

/* compiled from: DonutTextTeaserUiDto.kt */
/* loaded from: classes4.dex */
public final class b4o extends ol60 {
    public final String h;
    public final r1o i;

    public b4o(String str, r1o r1oVar) {
        super(25, 0, 0, 0, null);
        this.h = str;
        this.i = r1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4o)) {
            return false;
        }
        b4o b4oVar = (b4o) obj;
        return epx.f(this.h, b4oVar.h) && epx.f(this.i, b4oVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DonutTextTeaserUiDto(text=" + this.h + ", action=" + this.i + ", seqId=0)";
    }
}
