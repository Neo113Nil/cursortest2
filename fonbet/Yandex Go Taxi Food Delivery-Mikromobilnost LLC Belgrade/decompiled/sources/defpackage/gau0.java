package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lgau0;", "", "Companion", "v9u0", "eau0", "promotions"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class gau0 {
    public static final eau0 Companion = new eau0();
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final lau0 d;

    public /* synthetic */ gau0(int i, String str, FormattedText formattedText, FormattedText formattedText2, lau0 lau0Var) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = FormattedText.c;
        } else {
            this.b = formattedText;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = formattedText2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = lau0Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gau0)) {
            return false;
        }
        gau0 gau0Var = (gau0) obj;
        return jl40.l(this.a, gau0Var.a) && jl40.l(this.b, gau0Var.b) && jl40.l(this.c, gau0Var.c) && jl40.l(this.d, gau0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        FormattedText formattedText = this.c;
        int hashCode = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        lau0 lau0Var = this.d;
        return hashCode + (lau0Var != null ? lau0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder q = xvz.q("Step(icon=", this.a, ", title=", ", subtitle=", this.b);
        q.append(this.c);
        q.append(", image=");
        q.append(this.d);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }

    public gau0() {
        FormattedText formattedText = FormattedText.c;
        this.a = "";
        this.b = formattedText;
        this.c = null;
        this.d = null;
    }
}
