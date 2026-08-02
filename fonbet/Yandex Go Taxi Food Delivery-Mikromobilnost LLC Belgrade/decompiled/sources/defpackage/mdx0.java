package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mdx0 implements rcx0 {
    public final vnx0 a;

    public mdx0(vnx0 vnx0Var) {
        this.a = vnx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mdx0) && this.a.equals(((mdx0) obj).a);
    }

    @Override // defpackage.rcx0
    public final String getId() {
        return "tariff_selector";
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "TariffCardSelectorUiState(tariffSelectorUiState=" + this.a + Extension.C_BRAKE;
    }
}
