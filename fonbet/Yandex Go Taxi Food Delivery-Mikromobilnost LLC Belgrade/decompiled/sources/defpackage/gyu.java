package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gyu {
    public final x0v a;
    public final List b;

    public gyu(x0v x0vVar, List list) {
        this.a = x0vVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gyu)) {
            return false;
        }
        gyu gyuVar = (gyu) obj;
        return jl40.l(this.a, gyuVar.a) && jl40.l(this.b, gyuVar.b);
    }

    public final int hashCode() {
        x0v x0vVar = this.a;
        return this.b.hashCode() + ((x0vVar == null ? 0 : x0vVar.hashCode()) * 31);
    }

    public final String toString() {
        return "HubFooterUiState(onboarding=" + this.a + ", filters=" + this.b + Extension.C_BRAKE;
    }
}
