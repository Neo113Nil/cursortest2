package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ahj0 {
    public final mhj0 a;

    public ahj0(mhj0 mhj0Var) {
        this.a = mhj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahj0) && jl40.l(this.a, ((ahj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RequirementGroupScreenCommentUiState(requirementCommentModel=" + this.a + Extension.C_BRAKE;
    }
}
