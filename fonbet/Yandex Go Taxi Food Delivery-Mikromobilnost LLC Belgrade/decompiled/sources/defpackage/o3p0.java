package defpackage;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o3p0 implements p3p0 {
    public final List a;

    public o3p0(ListBuilder listBuilder) {
        this.a = listBuilder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o3p0) && jl40.l(this.a, ((o3p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("Success(surgeContentItems=", Extension.C_BRAKE, this.a);
    }
}
