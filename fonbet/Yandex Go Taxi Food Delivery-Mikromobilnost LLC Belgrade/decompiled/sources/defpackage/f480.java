package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class f480 {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final c4v d;
    public final h480 e;

    public f480(String str, FormattedText formattedText, FormattedText formattedText2, c4v c4vVar, h480 h480Var) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = c4vVar;
        this.e = h480Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f480)) {
            return false;
        }
        f480 f480Var = (f480) obj;
        return jl40.l(this.a, f480Var.a) && jl40.l(this.b, f480Var.b) && jl40.l(this.c, f480Var.c) && jl40.l(this.d, f480Var.d) && this.e.equals(f480Var.e);
    }

    public final int hashCode() {
        return this.e.a.hashCode() + ((this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a)) * 31);
    }

    public final String toString() {
        StringBuilder q = xvz.q("OrderShare(id=", this.a, ", title=", ", text=", this.b);
        q.append(this.c);
        q.append(", icon=");
        q.append(this.d);
        q.append(", widget=");
        q.append(this.e);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
