package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class bgr implements mgr {
    public final String a;
    public final Map b;

    public bgr(String str, Map map) {
        this.a = str;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgr)) {
            return false;
        }
        bgr bgrVar = (bgr) obj;
        return jl40.l(this.a, bgrVar.a) && jl40.l(this.b, bgrVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.j("FinishFlowAction(status=", this.a, ", params=", Extension.C_BRAKE, this.b);
    }
}
