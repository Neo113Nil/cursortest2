package defpackage;

import android.text.SpannableStringBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g711 implements h711 {
    public final SpannableStringBuilder a;
    public final CharSequence b;
    public final String c;
    public final i911 d;
    public final String e;

    public g711(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, String str, i911 i911Var, String str2) {
        this.a = spannableStringBuilder;
        this.b = charSequence;
        this.c = str;
        this.d = i911Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g711)) {
            return false;
        }
        g711 g711Var = (g711) obj;
        return this.a.equals(g711Var.a) && this.b.equals(g711Var.b) && this.c.equals(g711Var.c) && this.d.equals(g711Var.d) && this.e.equals(g711Var.e);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UndergroundInfo(title=");
        sb.append((Object) this.a);
        sb.append(", subtitle=");
        sb.append((Object) this.b);
        sb.append(", contentDescription=");
        sb.append(this.c);
        sb.append(", transportType=");
        sb.append(this.d);
        sb.append(", id=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
