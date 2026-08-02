package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class da5 {
    public static final da5 c = new da5("");
    public final CharSequence a;
    public final FormattedText b;

    public da5(CharSequence charSequence, FormattedText formattedText) {
        this.a = charSequence;
        this.b = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof da5)) {
            return false;
        }
        da5 da5Var = (da5) obj;
        return jl40.l(this.a, da5Var.a) && jl40.l(this.b, da5Var.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormattedTextWithFallback(fallback=" + ((Object) this.a) + ", formatted=" + this.b + Extension.C_BRAKE;
    }

    public /* synthetic */ da5(String str) {
        this(str, FormattedText.c);
    }
}
