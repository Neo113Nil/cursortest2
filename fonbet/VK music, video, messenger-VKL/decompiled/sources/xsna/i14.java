package xsna;

/* compiled from: AttachCutUiDto.kt */
/* loaded from: classes4.dex */
public final class i14 extends ol60 {
    public final int h;

    public i14(int i) {
        super(78, 0, 0, 0, null);
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i14) && this.h == ((i14) obj).h;
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Integer.hashCode(this.h) * 31);
    }

    public final String toString() {
        return h5s.c(this.h, ", seqId=0)", new StringBuilder("AttachCutUiDto(hiddenAttachmentsSize="));
    }
}
