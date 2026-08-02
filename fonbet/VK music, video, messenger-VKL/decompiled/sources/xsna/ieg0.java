package xsna;

/* compiled from: ResumableUploadResult.kt */
/* loaded from: classes15.dex */
public final class ieg0 {
    public final boolean a;
    public final String b;

    public ieg0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieg0)) {
            return false;
        }
        ieg0 ieg0Var = (ieg0) obj;
        return this.a == ieg0Var.a && epx.f(this.b, ieg0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResumableUploadResult(fullyUploaded=");
        sb.append(this.a);
        sb.append(", directLink=");
        return ho8.a(sb, this.b, ')');
    }

    public /* synthetic */ ieg0() {
        this(false, "");
    }
}
