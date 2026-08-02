package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class b6b {
    public final String a;
    public final List b;

    public b6b(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6b)) {
            return false;
        }
        b6b b6bVar = (b6b) obj;
        return this.a.equals(b6bVar.a) && this.b.equals(b6bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return nnm.h("ChatNotification(title=", this.a, ", messages=", Extension.C_BRAKE, this.b);
    }
}
