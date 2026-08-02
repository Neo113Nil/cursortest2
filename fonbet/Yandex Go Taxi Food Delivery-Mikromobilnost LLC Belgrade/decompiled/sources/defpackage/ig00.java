package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.address_details.config.MapConfig$MapStyle$MapTheme;

/* loaded from: classes5.dex */
public final class ig00 {
    public final MapConfig$MapStyle$MapTheme a;
    public final String b;

    public ig00(MapConfig$MapStyle$MapTheme mapConfig$MapStyle$MapTheme, String str) {
        this.a = mapConfig$MapStyle$MapTheme;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig00)) {
            return false;
        }
        ig00 ig00Var = (ig00) obj;
        return this.a == ig00Var.a && jl40.l(this.b, ig00Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MapStyle(theme=" + this.a + ", value=" + this.b + Extension.C_BRAKE;
    }
}
