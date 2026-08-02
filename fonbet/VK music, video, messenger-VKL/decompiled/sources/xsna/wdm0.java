package xsna;

/* compiled from: StoryStatElement.kt */
/* loaded from: classes18.dex */
public final class wdm0 {
    public final String a;
    public final int b;
    public final boolean c;

    public wdm0(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdm0)) {
            return false;
        }
        wdm0 wdm0Var = (wdm0) obj;
        return epx.f(this.a, wdm0Var.a) && this.b == wdm0Var.b && this.c == wdm0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoryStatElement(name=");
        sb.append(this.a);
        sb.append(", counter=");
        sb.append(this.b);
        sb.append(", isUnavailable=");
        return defpackage.q0.a(sb, this.c, ')');
    }
}
