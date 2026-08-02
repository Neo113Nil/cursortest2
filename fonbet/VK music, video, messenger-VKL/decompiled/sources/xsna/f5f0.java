package xsna;

/* compiled from: ReactionsFeedPlaceholderHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class f5f0 extends ol60 {
    public final int h;

    public f5f0(int i) {
        super(1110, 0, i, 0, null);
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5f0) && this.h == ((f5f0) obj).h;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("ReactionsFeedPlaceholderHolderUiDto(seqId="), this.h, ')');
    }
}
