package xsna;

/* compiled from: DebugInfoHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class z5l extends ol60 {
    public final CharSequence h;
    public final CharSequence i;

    public z5l(CharSequence charSequence, CharSequence charSequence2) {
        super(403, 0, 0, 0, null);
        this.h = charSequence;
        this.i = charSequence2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5l)) {
            return false;
        }
        z5l z5lVar = (z5l) obj;
        return epx.f(this.h, z5lVar.h) && epx.f(this.i, z5lVar.i);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + u11.c(this.h.hashCode() * 31, 31, this.i);
    }

    public final String toString() {
        return "DebugInfoHolderUiDto(label=" + ((Object) this.h) + ", description=" + ((Object) this.i) + ", seqId=0)";
    }
}
