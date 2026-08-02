package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class i0o implements m1j {
    public final String a;
    public final CharSequence b;
    public final String c;
    public final k911 d;
    public final String e;
    public final String f;
    public final k911 g;
    public final String h;

    public i0o(String str, SpannableStringBuilder spannableStringBuilder, String str2, k911 k911Var, String str3, String str4, k911 k911Var2, String str5) {
        this.a = str;
        this.b = spannableStringBuilder;
        this.c = str2;
        this.d = k911Var;
        this.e = str3;
        this.f = str4;
        this.g = k911Var2;
        this.h = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0o)) {
            return false;
        }
        i0o i0oVar = (i0o) obj;
        return jl40.l(this.a, i0oVar.a) && jl40.l(this.b, i0oVar.b) && jl40.l(this.c, i0oVar.c) && jl40.l(this.d, i0oVar.d) && jl40.l(this.e, i0oVar.e) && jl40.l(this.f, i0oVar.f) && jl40.l(this.g, i0oVar.g) && jl40.l(this.h, i0oVar.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int b = unr0.b(smw0.e(this.d, unr0.b((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c), 31), 31, this.e);
        String str = this.f;
        return this.h.hashCode() + smw0.e(this.g, (b + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EndTransportSection(title=");
        sb.append((Object) this.a);
        sb.append(", subtitle=");
        sb.append((Object) this.b);
        sb.append(", time=");
        sb.append(this.c);
        sb.append(", nextTransportType=");
        sb.append(this.d);
        sb.append(", contentDescription=");
        g8e.D(sb, this.e, ", exitName=", this.f, ", transportType=");
        sb.append(this.g);
        sb.append(", id=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public /* synthetic */ i0o(String str, String str2, k911 k911Var, String str3, h911 h911Var, String str4) {
        this(str, null, str2, k911Var, str3, null, h911Var, str4);
    }
}
