package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class g480 {
    public final String a;
    public final FormattedText b;
    public final c4v c;
    public final List d;
    public final h480 e;
    public final i480 f;

    public g480(String str, FormattedText formattedText, c4v c4vVar, List list, h480 h480Var, i480 i480Var) {
        this.a = str;
        this.b = formattedText;
        this.c = c4vVar;
        this.d = list;
        this.e = h480Var;
        this.f = i480Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g480)) {
            return false;
        }
        g480 g480Var = (g480) obj;
        return jl40.l(this.a, g480Var.a) && jl40.l(this.b, g480Var.b) && jl40.l(this.c, g480Var.c) && jl40.l(this.d, g480Var.d) && this.e.equals(g480Var.e) && jl40.l(this.f, g480Var.f);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.c((this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a)) * 31, 31, this.d), 31, this.e.a);
        i480 i480Var = this.f;
        return c + (i480Var == null ? 0 : i480Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder q = xvz.q("Robotaxi(id=", this.a, ", title=", ", image=", this.b);
        q.append(this.c);
        q.append(", bullets=");
        q.append(this.d);
        q.append(", actionButtons=");
        q.append(this.e);
        q.append(", sliderButton=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
