package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mmq0 implements omq0 {
    public final vnx0 a;

    public mmq0(vnx0 vnx0Var) {
        this.a = vnx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mmq0) && jl40.l(this.a, ((mmq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DefaultSelectorUiState(tariffSelectorUiState=" + this.a + Extension.C_BRAKE;
    }
}
