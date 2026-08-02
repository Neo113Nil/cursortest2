package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cx30 {
    public final List a;

    public cx30(List list) {
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx30) && jl40.l(this.a, ((cx30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("MtRoutesCommunicationsParams(routes=", Extension.C_BRAKE, this.a);
    }

    public cx30() {
        this(EmptyList.a);
    }
}
