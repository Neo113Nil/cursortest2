package defpackage;

import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b7a implements g7a {
    public final String a;
    public final b b;
    public final String c;

    public b7a(String str, String str2, b bVar) {
        this.a = str;
        this.b = bVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7a)) {
            return false;
        }
        b7a b7aVar = (b7a) obj;
        return jl40.l(this.a, b7aVar.a) && this.b.equals(b7aVar.b) && this.c.equals(b7aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PurchasePlusDvizhSubscriptionThenCreateOrder(offerId=");
        sb.append(this.a);
        sb.append(", purchaseInfo=");
        sb.append(this.b);
        sb.append(", selectedSharingService=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
