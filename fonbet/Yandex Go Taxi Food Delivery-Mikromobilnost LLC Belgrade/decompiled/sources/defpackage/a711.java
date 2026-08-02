package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class a711 {
    public final String a;
    public final String b;
    public final int c;
    public final ArrayList d;

    public a711(String str, String str2, int i, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a711)) {
            return false;
        }
        a711 a711Var = (a711) obj;
        return jl40.l(this.a, a711Var.a) && jl40.l(this.b, a711Var.b) && this.c == a711Var.c && this.d.equals(a711Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + oyr.b(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TipsChoices(id=", this.a, ", analyticsId=", this.b, ", selectedChoiceIndex=");
        v.append(this.c);
        v.append(", choices=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
