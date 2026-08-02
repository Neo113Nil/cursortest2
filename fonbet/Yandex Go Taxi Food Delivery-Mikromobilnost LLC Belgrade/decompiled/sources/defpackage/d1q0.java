package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class d1q0 implements e6v, eeu {
    public final String a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;

    public d1q0(String str, FormattedText formattedText, String str2, Integer num) {
        String a = formattedText.a();
        a = a == null ? "" : a;
        this.a = str;
        this.b = formattedText;
        this.c = str;
        this.d = str2;
        this.e = a;
        this.f = num;
    }

    @Override // defpackage.hx31
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1q0)) {
            return false;
        }
        d1q0 d1q0Var = (d1q0) obj;
        return jl40.l(this.a, d1q0Var.a) && jl40.l(this.b, d1q0Var.b) && jl40.l(this.c, d1q0Var.c) && jl40.l(this.d, d1q0Var.d) && jl40.l(this.e, d1q0Var.e) && jl40.l(this.f, d1q0Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        return b + (num == null ? 0 : num.hashCode());
    }

    @Override // defpackage.eeu
    public final String m() {
        return this.d;
    }

    @Override // defpackage.eeu
    public final String n() {
        return this.e;
    }

    public final String toString() {
        StringBuilder q = xvz.q("SectionHeaderModel(id=", this.a, ", title=", ", viewId=", this.b);
        g8e.D(q, this.c, ", headerShortcutId=", this.d, ", headerText=");
        q.append(this.e);
        q.append(", headerTextColor=");
        q.append(this.f);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
