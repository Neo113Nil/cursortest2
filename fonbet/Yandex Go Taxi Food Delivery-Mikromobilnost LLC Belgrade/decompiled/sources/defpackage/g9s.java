package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class g9s {
    public final CharSequence a;
    public final FormattedText b;
    public final boolean c;

    public g9s(CharSequence charSequence, FormattedText formattedText, boolean z) {
        this.a = charSequence;
        this.b = formattedText;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g9s)) {
            return false;
        }
        g9s g9sVar = (g9s) obj;
        return jl40.l(this.a, g9sVar.a) && this.b.equals(g9sVar.b) && this.c == g9sVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormattedTitleWithFallback(fallback=");
        sb.append((Object) this.a);
        sb.append(", formatted=");
        sb.append(this.b);
        sb.append(", hasDefaultFormatting=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
