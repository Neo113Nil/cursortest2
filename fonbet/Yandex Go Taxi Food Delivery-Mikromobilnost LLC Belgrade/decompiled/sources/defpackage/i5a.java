package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes.dex */
public final class i5a {
    public final FormattedText a;
    public final c4a b;
    public final d4a c;
    public final String d;
    public final List e;
    public final List f;

    public i5a(FormattedText formattedText, c4a c4aVar, d4a d4aVar, String str, List list, List list2) {
        this.a = formattedText;
        this.b = c4aVar;
        this.c = d4aVar;
        this.d = str;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5a)) {
            return false;
        }
        i5a i5aVar = (i5a) obj;
        return jl40.l(this.a, i5aVar.a) && jl40.l(this.b, i5aVar.b) && jl40.l(this.c, i5aVar.c) && jl40.l(this.d, i5aVar.d) && this.e.equals(i5aVar.e) && this.f.equals(i5aVar.f);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        c4a c4aVar = this.b;
        int hashCode2 = (hashCode + (c4aVar == null ? 0 : c4aVar.hashCode())) * 31;
        d4a d4aVar = this.c;
        int hashCode3 = (hashCode2 + (d4aVar == null ? 0 : d4aVar.hashCode())) * 31;
        String str = this.d;
        return this.f.hashCode() + unr0.c((hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChargersMultiOrderUi(title=");
        sb.append(this.a);
        sb.append(", headerButton=");
        sb.append(this.b);
        sb.append(", headerLabel=");
        sb.append(this.c);
        sb.append(", defaultModeId=");
        sb.append(this.d);
        sb.append(", modes=");
        return vfc.p(sb, this.e, ", items=", this.f, Extension.C_BRAKE);
    }
}
