package defpackage;

import com.yandex.go.places.api.navigation.OpenNavigatorActionSubtype;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dq implements fr {
    public final String a;
    public final OpenNavigatorActionSubtype b;

    public dq(OpenNavigatorActionSubtype openNavigatorActionSubtype, String str) {
        this.a = str;
        this.b = openNavigatorActionSubtype;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return jl40.l(this.a, dqVar.a) && this.b == dqVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenNavigatorAction(fallbackDeeplink=" + this.a + ", actionSubtype=" + this.b + Extension.C_BRAKE;
    }
}
