package xsna;

/* compiled from: MLModelDbEntity.kt */
/* loaded from: classes3.dex */
public final class zb00 {
    public final String a;
    public final String b;
    public final int c;
    public final String d;
    public final int e;
    public final boolean f;

    public zb00(int i, String str, String str2, String str3, boolean z, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = i2;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zb00)) {
            return false;
        }
        zb00 zb00Var = (zb00) obj;
        return epx.f(this.a, zb00Var.a) && epx.f(this.b, zb00Var.b) && this.c == zb00Var.c && epx.f(this.d, zb00Var.d) && this.e == zb00Var.e && this.f == zb00Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + shy.a(this.e, urd0.a(shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MLModelDbEntity(featureName=");
        sb.append(this.a);
        sb.append(", modelPath=");
        sb.append(this.b);
        sb.append(", modelVersion=");
        sb.append(this.c);
        sb.append(", metaString=");
        sb.append(this.d);
        sb.append(", metaVersion=");
        sb.append(this.e);
        sb.append(", isEncrypted=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
