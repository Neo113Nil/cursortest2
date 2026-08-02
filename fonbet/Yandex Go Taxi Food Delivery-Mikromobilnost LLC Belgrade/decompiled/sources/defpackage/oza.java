package defpackage;

import com.yandex.go.charity.models.OpenCharitySource;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class oza implements qza {
    public final Map a;
    public final OpenCharitySource b;

    public oza(Map map, OpenCharitySource openCharitySource) {
        this.a = map;
        this.b = openCharitySource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oza)) {
            return false;
        }
        oza ozaVar = (oza) obj;
        return jl40.l(this.a, ozaVar.a) && this.b == ozaVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Default(urlParams=" + this.a + ", defaultSource=" + this.b + Extension.C_BRAKE;
    }
}
