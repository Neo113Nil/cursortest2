package defpackage;

import com.ybsdk.core.utils.text.Text;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c9r0 implements e9r0 {
    public final String a;
    public final Text b;
    public final Text c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;

    public c9r0(String str, Text text, Text text2, boolean z, String str2, boolean z2, String str3) {
        this.a = str;
        this.b = text;
        this.c = text2;
        this.d = z;
        this.e = str2;
        this.f = z2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c9r0)) {
            return false;
        }
        c9r0 c9r0Var = (c9r0) obj;
        return jl40.l(this.a, c9r0Var.a) && jl40.l(this.b, c9r0Var.b) && jl40.l(this.c, c9r0Var.c) && this.d == c9r0Var.d && jl40.l(this.e, c9r0Var.e) && this.f == c9r0Var.f && jl40.l(this.g, c9r0Var.g);
    }

    @Override // defpackage.e9r0
    public final String getKey() {
        return this.a;
    }

    public final int hashCode() {
        int c = n.c(this.b, this.a.hashCode() * 31, 31);
        Text text = this.c;
        int e = unr0.e((c + (text == null ? 0 : text.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int e2 = unr0.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        String str2 = this.g;
        return e2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SettingsListEditItem(key=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", subtitle=");
        sb.append(this.c);
        sb.append(", clickable=");
        sb.append(this.d);
        sb.append(", action=");
        tse0.y(this.e, ", enabled=", ", analyticAction=", sb, this.f);
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
