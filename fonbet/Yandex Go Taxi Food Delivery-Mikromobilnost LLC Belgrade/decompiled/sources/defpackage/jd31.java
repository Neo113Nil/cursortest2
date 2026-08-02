package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jd31 implements ge31 {
    public final ArrayList a;
    public final int b;

    public jd31(ArrayList arrayList, int i) {
        this.a = arrayList;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jd31)) {
            return false;
        }
        jd31 jd31Var = (jd31) obj;
        return this.a.equals(jd31Var.a) && this.b == jd31Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ModalStateChanged(itemsList=" + this.a + ", sheetTarget=" + dtr0.a(this.b) + Extension.C_BRAKE;
    }
}
