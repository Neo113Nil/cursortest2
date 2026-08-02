package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;

/* loaded from: classes5.dex */
public final class nae {
    public final String a;
    public final String b;
    public final FieldVisibility c;
    public final String d;
    public final bce e;
    public final boolean f;

    public nae(String str, String str2, FieldVisibility fieldVisibility, String str3, bce bceVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = fieldVisibility;
        this.d = str3;
        this.e = bceVar;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nae)) {
            return false;
        }
        nae naeVar = (nae) obj;
        return jl40.l(this.a, naeVar.a) && jl40.l(this.b, naeVar.b) && this.c == naeVar.c && jl40.l(this.d, naeVar.d) && this.e.equals(naeVar.e) && this.f == naeVar.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.d;
        int hashCode3 = str2 != null ? str2.hashCode() : 0;
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ContactModel(title=", this.a, ", value=", this.b, ", visibility=");
        v.append(this.c);
        v.append(", editFieldName=");
        v.append(this.d);
        v.append(", trail=");
        v.append(this.e);
        v.append(", isClickEnabled=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
