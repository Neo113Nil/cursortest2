package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class k1c0 {
    public final j1c0 a;

    public k1c0(j1c0 j1c0Var) {
        this.a = j1c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1c0) && this.a.equals(((k1c0) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a.a);
    }

    public final String toString() {
        return "PinV2UiState(icon=" + this.a + Extension.C_BRAKE;
    }
}
