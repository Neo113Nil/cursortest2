package defpackage;

import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final class dow0 {
    public final b a;
    public final Set b;
    public final ThemeType c;
    public final Map d;
    public final String e;

    public dow0(b bVar, Set set, ThemeType themeType, Map map, String str) {
        this.a = bVar;
        this.b = set;
        this.c = themeType;
        this.d = map;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dow0)) {
            return false;
        }
        dow0 dow0Var = (dow0) obj;
        return jl40.l(this.a, dow0Var.a) && this.b.equals(dow0Var.b) && this.c == dow0Var.c && jl40.l(this.d, dow0Var.d) && jl40.l(this.e, dow0Var.e);
    }

    public final int hashCode() {
        b bVar = this.a;
        return this.e.hashCode() + unr0.d((this.c.hashCode() + g8e.e(this.b, (bVar == null ? 0 : bVar.hashCode()) * 31, 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurgeBalanceDto(payload=");
        sb.append(this.a);
        sb.append(", tariffClasses=");
        sb.append(this.b);
        sb.append(", themeType=");
        sb.append(this.c);
        sb.append(", selection=");
        sb.append(this.d);
        sb.append(", origin=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
