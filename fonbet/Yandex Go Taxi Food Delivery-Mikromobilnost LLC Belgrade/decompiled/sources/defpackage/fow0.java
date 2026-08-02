package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class fow0 {
    public final h36 a;
    public final f36 b;

    public fow0(h36 h36Var, f36 f36Var) {
        this.a = h36Var;
        this.b = f36Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fow0)) {
            return false;
        }
        fow0 fow0Var = (fow0) obj;
        return this.a.equals(fow0Var.a) && this.b.equals(fow0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SurgeBlizzardUiState(textUiState=" + this.a + ", buttonUiState=" + this.b + Extension.C_BRAKE;
    }
}
