package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ok70 {
    public final List a;

    static {
        int i = ol70.e;
    }

    public ok70(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok70) && jl40.l(this.a, ((ok70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("CancelItemsUpdate(items=", Extension.C_BRAKE, this.a);
    }
}
