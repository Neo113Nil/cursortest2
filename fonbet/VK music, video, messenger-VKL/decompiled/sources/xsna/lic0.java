package xsna;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public final class lic0 implements com.vk.newsfeed.posting.impl.domain.model.e {
    public final int b;
    public final int c;

    public lic0(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lic0)) {
            return false;
        }
        lic0 lic0Var = (lic0) obj;
        return this.b == lic0Var.b && this.c == lic0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MovePhotoVideo(fromPosition=");
        sb.append(this.b);
        sb.append(", toPosition=");
        return vu5.b(sb, this.c, ')');
    }
}
