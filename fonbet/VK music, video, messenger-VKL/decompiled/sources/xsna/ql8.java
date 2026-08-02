package xsna;

/* compiled from: BucketDescriptor.kt */
/* loaded from: classes3.dex */
public final class ql8 {
    public final int a;
    public final String b;
    public final String c;

    public ql8(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ql8)) {
            return false;
        }
        ql8 ql8Var = (ql8) obj;
        return this.a == ql8Var.a && epx.f(this.b, ql8Var.b) && epx.f(this.c, ql8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BucketDescriptor(bucketId=");
        sb.append(this.a);
        sb.append(", bucketName=");
        sb.append(this.b);
        sb.append(", relativePath=");
        return ho8.a(sb, this.c, ')');
    }
}
