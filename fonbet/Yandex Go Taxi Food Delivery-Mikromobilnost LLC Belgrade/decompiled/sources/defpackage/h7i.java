package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh7i;", "", "Companion", "f7i", "g7i", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class h7i {
    public static final g7i Companion = new g7i();
    public final String a;
    public final String b;

    public /* synthetic */ h7i(int i, String str, String str2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7i)) {
            return false;
        }
        h7i h7iVar = (h7i) obj;
        return jl40.l(this.a, h7iVar.a) && jl40.l(this.b, h7iVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("DeliveryEmptyContactItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }

    public h7i() {
        this.a = "";
        this.b = null;
    }
}
