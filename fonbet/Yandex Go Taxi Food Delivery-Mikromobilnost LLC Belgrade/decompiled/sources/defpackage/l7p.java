package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class l7p {
    public final List a;

    public /* synthetic */ l7p(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l7p) {
            return jl40.l(this.a, ((l7p) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("FaceContour(points=", Extension.C_BRAKE, this.a);
    }
}
