package xsna;

/* compiled from: FormFieldScreenContent.kt */
/* loaded from: classes18.dex */
public final class u8s {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public u8s(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u8s)) {
            return false;
        }
        u8s u8sVar = (u8s) obj;
        return epx.f(this.a, u8sVar.a) && this.b == u8sVar.b && this.c == u8sVar.c && this.d == u8sVar.d && this.e == u8sVar.e && this.f == u8sVar.f && this.g == u8sVar.g && this.h == u8sVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormFieldUpdateConfig(text=");
        sb.append(this.a);
        sb.append(", showLabel=");
        sb.append(this.b);
        sb.append(", showCaption=");
        sb.append(this.c);
        sb.append(", showLeftIcon=");
        sb.append(this.d);
        sb.append(", showAfterIcon=");
        sb.append(this.e);
        sb.append(", showAfterText=");
        sb.append(this.f);
        sb.append(", showError=");
        sb.append(this.g);
        sb.append(", isRequired=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
