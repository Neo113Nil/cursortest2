package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ivq {
    public final String a;
    public final List b;

    public ivq(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivq)) {
            return false;
        }
        ivq ivqVar = (ivq) obj;
        return jl40.l(this.a, ivqVar.a) && jl40.l(this.b, ivqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("FeedbackSubtitle(title=", this.a, ", scores=", Extension.C_BRAKE, this.b);
    }
}
