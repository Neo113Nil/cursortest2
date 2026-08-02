package defpackage;

import com.ybsdk.core.utils.text.Text;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class kqs {
    public final Text.Constant a;
    public final rr51 b;
    public final Map c;

    public kqs(Text.Constant constant, rr51 rr51Var, Map map) {
        this.a = constant;
        this.b = rr51Var;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kqs)) {
            return false;
        }
        kqs kqsVar = (kqs) obj;
        return this.a.equals(kqsVar.a) && jl40.l(this.b, kqsVar.b) && jl40.l(this.c, kqsVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Map map = this.c;
        return hashCode + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FuturePaymentsEntity(title=");
        sb.append(this.a);
        sb.append(", divData=");
        sb.append(this.b);
        sb.append(", analyticParameters=");
        return b64.r(sb, this.c, Extension.C_BRAKE);
    }
}
