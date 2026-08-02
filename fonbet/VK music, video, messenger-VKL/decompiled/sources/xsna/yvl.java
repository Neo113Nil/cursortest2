package xsna;

/* compiled from: DeletedSuggestedPostHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class yvl extends ol60 {
    public final String h;

    public yvl(String str) {
        super(1122, 0, 0, 0, null);
        this.h = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yvl) && epx.f(this.h, ((yvl) obj).h);
    }

    @Override // xsna.ol60
    public final int f() {
        return 0;
    }

    public final int hashCode() {
        String str = this.h;
        return Integer.hashCode(0) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return i5s.a(new StringBuilder("DeletedSuggestedPostHolderUiDto(publisherName="), this.h, ", seqId=0)");
    }
}
