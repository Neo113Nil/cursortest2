package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ce31 implements ge31 {
    public final g0v a;

    public ce31(g0v g0vVar) {
        this.a = g0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ce31) && jl40.l(this.a, ((ce31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ReportHubItemClickedAction(uiState=" + this.a + Extension.C_BRAKE;
    }
}
