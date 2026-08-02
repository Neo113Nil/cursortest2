package defpackage;

import com.yandex.go.address.models.PlainAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h71 {
    public final PlainAddress a;
    public final String b;

    public h71(PlainAddress plainAddress, String str) {
        this.a = plainAddress;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h71)) {
            return false;
        }
        h71 h71Var = (h71) obj;
        return jl40.l(this.a, h71Var.a) && this.b.equals(h71Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AddressShortcutItem(address=" + this.a + ", eta=" + this.b + Extension.C_BRAKE;
    }
}
