package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g28 {
    public boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final FavoriteAddress e;

    public g28(boolean z, String str, String str2, String str3, FavoriteAddress favoriteAddress) {
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = favoriteAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g28)) {
            return false;
        }
        g28 g28Var = (g28) obj;
        return this.a == g28Var.a && jl40.l(this.b, g28Var.b) && jl40.l(this.c, g28Var.c) && jl40.l(this.d, g28Var.d) && this.e.equals(g28Var.e);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = ly3.v("CandidateToSaveFavoriteAddress(isNew=", ", lastOrderId=", this.b, ", shortSubtitle=", this.a);
        g8e.D(v, this.c, ", fullSubtitle=", this.d, ", address=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
