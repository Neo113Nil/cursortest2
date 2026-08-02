package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class a89 extends ye1 {
    public final bg1 a;

    public a89(bg1 bg1Var) {
        this.a = bg1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a89) && ((a89) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(a89.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a + Extension.C_BRAKE;
    }
}
