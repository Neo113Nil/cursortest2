package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dge {
    public final age a;
    public final yfe b;

    public dge(age ageVar, yfe yfeVar) {
        this.a = ageVar;
        this.b = yfeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dge)) {
            return false;
        }
        dge dgeVar = (dge) obj;
        return jl40.l(this.a, dgeVar.a) && this.b.equals(dgeVar.b);
    }

    public final int hashCode() {
        age ageVar = this.a;
        return this.b.a.hashCode() + ((ageVar == null ? 0 : ageVar.hashCode()) * 31);
    }

    public final String toString() {
        return "ContentFooterUiState(lead=" + this.a + ", body=" + this.b + Extension.C_BRAKE;
    }
}
