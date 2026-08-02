package defpackage;

import com.yandex.delivery.mapper.model.LocalIconName;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class h3z extends w4v {
    public final LocalIconName a;
    public final String b;
    public final Boolean c;

    public h3z(LocalIconName localIconName, String str, Boolean bool) {
        this.a = localIconName;
        this.b = str;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3z)) {
            return false;
        }
        h3z h3zVar = (h3z) obj;
        return this.a == h3zVar.a && jl40.l(this.b, h3zVar.b) && jl40.l(this.c, h3zVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalIconModel(name=");
        sb.append(this.a);
        sb.append(", accessibilityLabel=");
        sb.append(this.b);
        sb.append(", monochrome=");
        return nzs.d(sb, this.c, Extension.C_BRAKE);
    }
}
