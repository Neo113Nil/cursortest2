package xsna;

/* compiled from: UploadVideoViewState.kt */
/* loaded from: classes16.dex */
public final class bdq0 {
    public final String a;
    public final int b;
    public final String c;
    public final Float d;
    public final String e;
    public final boolean f;
    public final String g;
    public final int h;

    public bdq0(String str, int i, String str2, Float f, String str3, boolean z, String str4, int i2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = f;
        this.e = str3;
        this.f = z;
        this.g = str4;
        this.h = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdq0)) {
            return false;
        }
        bdq0 bdq0Var = (bdq0) obj;
        return epx.f(this.a, bdq0Var.a) && this.b == bdq0Var.b && epx.f(this.c, bdq0Var.c) && epx.f(this.d, bdq0Var.d) && epx.f(this.e, bdq0Var.e) && this.f == bdq0Var.f && epx.f(this.g, bdq0Var.g) && this.h == bdq0Var.h;
    }

    public final int hashCode() {
        String str = this.a;
        int a = urd0.a(shy.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
        Float f = this.d;
        int hashCode = (a + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.e;
        return Integer.hashCode(this.h) + urd0.a(qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UploadVideoViewState(image=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", text=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", progressFileSize=");
        sb.append(this.e);
        sb.append(", isFailed=");
        sb.append(this.f);
        sb.append(", filePath=");
        sb.append(this.g);
        sb.append(", id=");
        return vu5.b(sb, this.h, ')');
    }
}
