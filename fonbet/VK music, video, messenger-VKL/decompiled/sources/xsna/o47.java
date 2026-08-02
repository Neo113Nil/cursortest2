package xsna;

/* compiled from: BiometricDialogPresentation.kt */
/* loaded from: classes6.dex */
public final class o47 {
    public final String a;
    public final String b;
    public final String c;

    public o47() {
        this("", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o47)) {
            return false;
        }
        o47 o47Var = (o47) obj;
        return epx.f(this.a, o47Var.a) && epx.f(this.b, o47Var.b) && epx.f(this.c, o47Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BiometricDialogPresentation(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", negativeButtonText=");
        return ho8.a(sb, this.c, ')');
    }

    public o47(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
