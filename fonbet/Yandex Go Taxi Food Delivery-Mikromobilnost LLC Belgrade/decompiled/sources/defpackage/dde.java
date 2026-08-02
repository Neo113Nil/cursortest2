package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes5.dex */
public final class dde extends fde {
    public final String a;
    public final String b;
    public final String c;
    public final SelectedFrom d;
    public final boolean e;

    public dde(String str, String str2, String str3, SelectedFrom selectedFrom, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = selectedFrom;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dde)) {
            return false;
        }
        dde ddeVar = (dde) obj;
        return jl40.l(this.a, ddeVar.a) && jl40.l(this.b, ddeVar.b) && jl40.l(this.c, ddeVar.c) && this.d == ddeVar.d && this.e == ddeVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ContactUiModel(id=", this.a, ", name=", this.b, ", phone=");
        v.append(this.c);
        v.append(", selectedFrom=");
        v.append(this.d);
        v.append(", isChecked=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }
}
