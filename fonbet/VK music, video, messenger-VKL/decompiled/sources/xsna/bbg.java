package xsna;

/* compiled from: CommentDisplayContext.kt */
/* loaded from: classes3.dex */
public final class bbg {
    public final boolean a;
    public final boolean b;

    public bbg(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbg)) {
            return false;
        }
        bbg bbgVar = (bbg) obj;
        return this.a == bbgVar.a && this.b == bbgVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CommentDisplayContext(shouldOpenCommentThread=");
        sb.append(this.a);
        sb.append(", isPostComment=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
