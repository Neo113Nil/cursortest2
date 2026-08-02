package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bzd {
    public final List a;

    public bzd() {
        this(EmptyList.a, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzd) && jl40.l(this.a, ((bzd) obj).a) && jl40.l(null, null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "ConditionsUiState(title=null, items=" + this.a + ", footerButton=" + ((Object) null) + Extension.C_BRAKE;
    }

    public bzd(List list, vpb1 vpb1Var) {
        this.a = list;
    }
}
