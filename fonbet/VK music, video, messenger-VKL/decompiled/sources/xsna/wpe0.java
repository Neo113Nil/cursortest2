package xsna;

/* compiled from: QuestionUIModel.kt */
/* loaded from: classes16.dex */
public final class wpe0 {
    public final String a;
    public final String b;
    public final boolean c;

    public wpe0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wpe0)) {
            return false;
        }
        wpe0 wpe0Var = (wpe0) obj;
        return epx.f(this.a, wpe0Var.a) && epx.f(this.b, wpe0Var.b) && this.c == wpe0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + urd0.a(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuestionUIModel(value=");
        sb.append(this.a);
        sb.append(", text=");
        sb.append(this.b);
        sb.append(", selected=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
