package xsna;

/* compiled from: ReviewBlockBottom.kt */
/* loaded from: classes18.dex */
public final class mgg0 {
    public final String a;
    public final boolean b;

    public mgg0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgg0)) {
            return false;
        }
        mgg0 mgg0Var = (mgg0) obj;
        return this.a.equals(mgg0Var.a) && this.b == mgg0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReviewBlockBottom(publishInfo=");
        sb.append(this.a);
        sb.append(", isShowReplayButton=");
        return n23.b(sb, this.b, ", isLiked=false)");
    }
}
