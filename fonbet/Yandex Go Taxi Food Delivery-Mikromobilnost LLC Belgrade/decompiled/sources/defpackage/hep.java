package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhep;", "", "Companion", "fep", "gep", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class hep {
    public static final gep Companion = new gep();
    public final String a;
    public final Integer b;

    public /* synthetic */ hep(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hep)) {
            return false;
        }
        hep hepVar = (hep) obj;
        return jl40.l(this.a, hepVar.a) && jl40.l(this.b, hepVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "FavoriteAddressRemove(id=" + this.a + ", version=" + this.b + Extension.C_BRAKE;
    }

    public hep(String str, Integer num) {
        this.a = str;
        this.b = num;
    }

    public hep() {
        this(null, null);
    }
}
