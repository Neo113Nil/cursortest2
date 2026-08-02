package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class cy9 {
    public static final cy9 e = new cy9(15, null, null, null, null);
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final String d;

    public /* synthetic */ cy9(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        this((i & 1) != 0 ? "" : str, (i & 8) != 0 ? null : str2, (i & 2) != 0 ? FormattedText.c : formattedText, (i & 4) != 0 ? FormattedText.c : formattedText2);
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy9)) {
            return false;
        }
        cy9 cy9Var = (cy9) obj;
        return jl40.l(this.a, cy9Var.a) && jl40.l(this.b, cy9Var.b) && jl40.l(this.c, cy9Var.c) && jl40.l(this.d, cy9Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a);
        String str = this.d;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder q = xvz.q("ChargersErrorDetails(errorCode=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", traceId=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public cy9(String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = str2;
    }

    public cy9() {
        this(15, null, null, null, null);
    }
}
