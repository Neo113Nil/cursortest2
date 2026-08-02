package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nt6 {
    public final List a;

    public nt6(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt6) && jl40.l(this.a, ((nt6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("BulletList(points=", Extension.C_BRAKE, this.a);
    }

    public nt6() {
        this(EmptyList.a);
    }
}
