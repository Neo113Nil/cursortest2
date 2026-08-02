package defpackage;

import com.yandex.go.hiredriver.api.HireDriverOpenReason;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oku {
    public final yju a;
    public final HireDriverOpenReason b;
    public final Map c;

    public oku(yju yjuVar, HireDriverOpenReason hireDriverOpenReason, Map map) {
        this.a = yjuVar;
        this.b = hireDriverOpenReason;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oku)) {
            return false;
        }
        oku okuVar = (oku) obj;
        return jl40.l(this.a, okuVar.a) && this.b == okuVar.b && jl40.l(this.c, okuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HireDriverModalViewPayload(data=");
        sb.append(this.a);
        sb.append(", openReason=");
        sb.append(this.b);
        sb.append(", queryParams=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }
}
