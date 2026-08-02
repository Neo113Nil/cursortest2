package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pd31 implements ge31 {
    public final g0v a;

    public pd31(g0v g0vVar) {
        this.a = g0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pd31) && this.a.equals(((pd31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnHubItemShown(uiState=" + this.a + Extension.C_BRAKE;
    }
}
