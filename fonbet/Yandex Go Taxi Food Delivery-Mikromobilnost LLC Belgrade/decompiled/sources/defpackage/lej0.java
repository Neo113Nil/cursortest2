package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lej0 {
    public final bpl0 a;

    public lej0(bpl0 bpl0Var) {
        this.a = bpl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lej0) && this.a.equals(((lej0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "RequirementChipsUiState(requirements=" + this.a + Extension.C_BRAKE;
    }
}
