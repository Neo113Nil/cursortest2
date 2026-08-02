package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class p460 {
    public final f460 a;
    public final o460 b;
    public final FormattedText c;
    public final FormattedText d;
    public final List e;
    public final s260 f;
    public final String g;

    public p460(f460 f460Var, o460 o460Var, FormattedText formattedText, FormattedText formattedText2, ArrayList arrayList, s260 s260Var, String str) {
        this.a = f460Var;
        this.b = o460Var;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = arrayList;
        this.f = s260Var;
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p460)) {
            return false;
        }
        p460 p460Var = (p460) obj;
        return this.a.equals(p460Var.a) && jl40.l(this.b, p460Var.b) && jl40.l(this.c, p460Var.c) && jl40.l(this.d, p460Var.d) && jl40.l(this.e, p460Var.e) && jl40.l(this.f, p460Var.f) && jl40.l(this.g, p460Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        o460 o460Var = this.b;
        int hashCode2 = (hashCode + (o460Var == null ? 0 : o460Var.hashCode())) * 31;
        FormattedText formattedText = this.c;
        int hashCode3 = (hashCode2 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.d;
        int hashCode4 = (hashCode3 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        List list = this.e;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        s260 s260Var = this.f;
        int hashCode6 = (hashCode5 + (s260Var == null ? 0 : s260Var.hashCode())) * 31;
        String str = this.g;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NeuroPostcardState(stage=");
        sb.append(this.a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", subtitle=");
        sb.append(this.d);
        sb.append(", buttons=");
        sb.append(this.e);
        sb.append(", action=");
        sb.append(this.f);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }
}
