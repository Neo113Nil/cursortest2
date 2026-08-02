package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.experiments.NddRouteType;

/* loaded from: classes5.dex */
public final class bj50 {
    public final NddRouteType a;
    public final String b;

    public bj50(NddRouteType nddRouteType, String str) {
        this.a = nddRouteType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj50)) {
            return false;
        }
        bj50 bj50Var = (bj50) obj;
        return this.a == bj50Var.a && this.b.equals(bj50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NddRouteSwitchButton(type=" + this.a + ", title=" + this.b + Extension.C_BRAKE;
    }
}
