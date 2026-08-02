package xsna;

/* compiled from: PostingAttachmentTestTag.kt */
/* loaded from: classes4.dex */
public final class hcc0 {
    public final int a;

    public hcc0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcc0) && this.a == ((hcc0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return vu5.b(new StringBuilder("PostingAttachmentTestTag(attachmentType="), this.a, ')');
    }
}
