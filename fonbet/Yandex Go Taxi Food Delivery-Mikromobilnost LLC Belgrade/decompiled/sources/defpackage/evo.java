package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class evo {
    public final int a;
    public final int b;
    public final int c;
    public final List d;

    public evo(int i, int i2, int i3, List list) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof evo)) {
            return false;
        }
        evo evoVar = (evo) obj;
        return this.a == evoVar.a && this.b == evoVar.b && this.c == evoVar.c && this.d.equals(evoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder s = b64.s(this.a, this.b, "ExposureAction(percentage=", ", duration=", ", limit=");
        s.append(this.c);
        s.append(", actions=");
        s.append(this.d);
        s.append(Extension.C_BRAKE);
        return s.toString();
    }
}
