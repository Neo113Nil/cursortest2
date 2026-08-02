package xsna;

/* compiled from: DonutDocumentTeaserUiDto.kt */
/* loaded from: classes4.dex */
public final class ozn extends ol60 {
    public final String h;
    public final r1o i;

    public ozn(String str, r1o r1oVar) {
        super(27, 0, 0, 0, null);
        this.h = str;
        this.i = r1oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ozn)) {
            return false;
        }
        ozn oznVar = (ozn) obj;
        return epx.f(this.h, oznVar.h) && epx.f(this.i, oznVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.i.hashCode() + (this.h.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DonutDocumentTeaserUiDto(name=" + this.h + ", action=" + this.i + ", seqId=0)";
    }
}
