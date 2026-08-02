package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pdv0 implements udv0 {
    public final ch6 a;

    public pdv0(ch6 ch6Var) {
        this.a = ch6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdv0) && jl40.l(this.a, ((pdv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BottomSheetStateChanged(bottomSheetUiState=" + this.a + Extension.C_BRAKE;
    }
}
