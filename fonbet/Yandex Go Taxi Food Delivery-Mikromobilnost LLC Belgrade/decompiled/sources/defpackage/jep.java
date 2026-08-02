package defpackage;

import com.yandex.go.address.models.FavoriteAddress;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jep implements tep {
    public final FavoriteAddress a;

    public jep(FavoriteAddress favoriteAddress) {
        this.a = favoriteAddress;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jep) && jl40.l(this.a, ((jep) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AddressChanged(address=" + this.a + Extension.C_BRAKE;
    }
}
