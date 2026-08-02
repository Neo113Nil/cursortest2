package xsna;

/* compiled from: FaveDividerHolderUiDto.kt */
/* loaded from: classes4.dex */
public final class onq extends ol60 {
    public final boolean h;
    public final int i;

    public onq(boolean z, int i) {
        super(1112, 0, i, 1, null);
        this.h = z;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onq)) {
            return false;
        }
        onq onqVar = (onq) obj;
        return this.h == onqVar.h && this.i == onqVar.i;
    }

    @Override // xsna.ol60
    public final int f() {
        return this.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + (Boolean.hashCode(this.h) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaveDividerHolderUiDto(withBottomMargin=");
        sb.append(this.h);
        sb.append(", seqId=");
        return vu5.b(sb, this.i, ')');
    }
}
