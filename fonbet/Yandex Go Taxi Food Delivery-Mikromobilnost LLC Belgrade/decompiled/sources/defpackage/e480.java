package defpackage;

import com.yandex.go.taxi.order.models.api.response.q3;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class e480 {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;
    public final q3 d;
    public final c4v e;
    public final h480 f;

    public e480(String str, FormattedText formattedText, FormattedText formattedText2, q3 q3Var, c4v c4vVar, h480 h480Var) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
        this.d = q3Var;
        this.e = c4vVar;
        this.f = h480Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e480)) {
            return false;
        }
        e480 e480Var = (e480) obj;
        return jl40.l(this.a, e480Var.a) && jl40.l(this.b, e480Var.b) && jl40.l(this.c, e480Var.c) && jl40.l(this.d, e480Var.d) && jl40.l(this.e, e480Var.e) && jl40.l(this.f, e480Var.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + unr0.c(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c.a)) * 31)) * 31;
        h480 h480Var = this.f;
        return hashCode + (h480Var == null ? 0 : h480Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder q = xvz.q("Default(id=", this.a, ", title=", ", text=", this.b);
        q.append(this.c);
        q.append(", image=");
        q.append(this.d);
        q.append(", icon=");
        q.append(this.e);
        q.append(", widget=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
