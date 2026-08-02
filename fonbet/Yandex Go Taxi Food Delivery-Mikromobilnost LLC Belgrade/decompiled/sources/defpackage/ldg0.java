package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ldg0 implements ndg0 {
    public final List a;

    public ldg0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ldg0) && jl40.l(this.a, ((ldg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("DeeplinksTarget(deeplinks=", Extension.C_BRAKE, this.a);
    }
}
