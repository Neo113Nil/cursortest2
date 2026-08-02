package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hhp0 {
    public final String a;
    public final int b;
    public final int c;

    public hhp0(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhp0)) {
            return false;
        }
        hhp0 hhp0Var = (hhp0) obj;
        if (!jl40.l(this.a, hhp0Var.a) || this.b != hhp0Var.b || this.c != hhp0Var.c) {
            return false;
        }
        ghp0 ghp0Var = ghp0.a;
        return ghp0Var.equals(ghp0Var);
    }

    public final int hashCode() {
        return ((Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31)) * 31) + 1968249127;
    }

    public final String toString() {
        StringBuilder u = b64.u(this.b, "ScrollButtonUiState(text=", this.a, ", jumpCount=", ", jumpDelayMs=");
        u.append(this.c);
        u.append(", action=");
        u.append(ghp0.a);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
