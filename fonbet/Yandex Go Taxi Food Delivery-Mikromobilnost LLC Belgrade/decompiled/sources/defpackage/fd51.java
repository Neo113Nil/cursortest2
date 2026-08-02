package defpackage;

import java.util.Objects;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class fd51 extends ye1 {
    public final ag1 a;

    public fd51(ag1 ag1Var) {
        this.a = ag1Var;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof fd51) && ((fd51) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(fd51.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a + Extension.C_BRAKE;
    }
}
