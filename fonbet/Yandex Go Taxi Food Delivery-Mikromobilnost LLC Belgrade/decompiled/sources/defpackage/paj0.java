package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class paj0 {
    public final List a;

    public paj0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof paj0) && jl40.l(this.a, ((paj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("RequiredAltChoiceSectionsUiState(sections=", Extension.C_BRAKE, this.a);
    }

    public paj0() {
        this(0);
    }

    public /* synthetic */ paj0(int i) {
        this(EmptyList.a);
    }
}
