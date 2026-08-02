package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aej0 {
    public final sdj0 a;

    public aej0(sdj0 sdj0Var) {
        this.a = sdj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aej0) && this.a.equals(((aej0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ButtonUiState(buttonUiState=" + this.a + Extension.C_BRAKE;
    }
}
