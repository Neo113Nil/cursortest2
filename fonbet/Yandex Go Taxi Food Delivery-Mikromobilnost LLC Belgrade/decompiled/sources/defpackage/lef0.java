package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class lef0 {
    public final kr a;

    public lef0(kr krVar) {
        this.a = krVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lef0) && jl40.l(this.a, ((lef0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UiState(action=" + this.a + Extension.C_BRAKE;
    }
}
