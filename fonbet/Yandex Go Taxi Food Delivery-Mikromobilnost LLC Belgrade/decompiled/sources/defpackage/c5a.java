package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c5a {
    public final List a;

    public c5a(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c5a) && jl40.l(this.a, ((c5a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ChargersMultiOrderSelectToReturnUiState(items=", Extension.C_BRAKE, this.a);
    }

    public c5a() {
        this(EmptyList.a);
    }
}
