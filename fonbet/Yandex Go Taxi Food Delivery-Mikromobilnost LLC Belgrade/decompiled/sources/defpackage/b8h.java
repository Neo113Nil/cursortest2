package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class b8h {
    public final String a;
    public final ArrayList b;

    public b8h(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8h)) {
            return false;
        }
        b8h b8hVar = (b8h) obj;
        return this.a.equals(b8hVar.a) && this.b.equals(b8hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return n.k("DefaultCallTypeUiState(title=", this.a, ", options=", Extension.C_BRAKE, this.b);
    }
}
