package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ouo {
    public final List a;

    public ouo(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ouo) && jl40.l(this.a, ((ouo) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ExplorerRegionCoverage(regions=", Extension.C_BRAKE, this.a);
    }

    public ouo() {
        this(EmptyList.a);
    }
}
