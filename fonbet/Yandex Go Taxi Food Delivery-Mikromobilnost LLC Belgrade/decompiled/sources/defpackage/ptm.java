package defpackage;

import androidx.compose.ui.graphics.vector.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ptm implements rtm {
    public final pa90 a;
    public final String b;
    public final sls c;

    public ptm(b bVar, String str, sls slsVar) {
        this.a = bVar;
        this.b = str;
        this.c = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptm)) {
            return false;
        }
        ptm ptmVar = (ptm) obj;
        return jl40.l(this.a, ptmVar.a) && jl40.l(this.b, ptmVar.b) && jl40.l(this.c, ptmVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        sls slsVar = this.c;
        return hashCode2 + (slsVar != null ? slsVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Icon(painter=");
        sb.append(this.a);
        sb.append(", tint=null, contentDescription=");
        sb.append(this.b);
        sb.append(", onClick=");
        return ly3.r(sb, this.c, Extension.C_BRAKE);
    }
}
