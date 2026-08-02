package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class ff71 {
    public final Map a;

    public ff71(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ff71) && this.a.equals(((ff71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return nnm.j("Success(images=", Extension.C_BRAKE, this.a);
    }
}
