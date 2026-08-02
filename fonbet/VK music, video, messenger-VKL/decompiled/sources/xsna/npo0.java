package xsna;

import java.util.List;

/* compiled from: ThemeParamsData.kt */
/* loaded from: classes2.dex */
public final class npo0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final List<String> g;

    public npo0(String str, String str2, String str3, String str4, String str5, String str6, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof npo0)) {
            return false;
        }
        npo0 npo0Var = (npo0) obj;
        return epx.f(this.a, npo0Var.a) && epx.f(this.b, npo0Var.b) && epx.f(this.c, npo0Var.c) && epx.f(this.d, npo0Var.d) && epx.f(this.e, npo0Var.e) && epx.f(this.f, npo0Var.f) && epx.f(this.g, npo0Var.g);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return this.g.hashCode() + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThemeParamsData(accentColor=");
        sb.append(this.a);
        sb.append(", headerTint=");
        sb.append(this.b);
        sb.append(", writeBarTint=");
        sb.append(this.c);
        sb.append(", textPrimary=");
        sb.append(this.d);
        sb.append(", textPlaceholder=");
        sb.append(this.e);
        sb.append(", forwardLine=");
        sb.append(this.f);
        sb.append(", bubbleGradient=");
        return ms9.a(')', sb, this.g);
    }
}
