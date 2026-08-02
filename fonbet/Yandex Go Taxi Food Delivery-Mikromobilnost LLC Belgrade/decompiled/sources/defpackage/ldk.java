package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ldk extends mi91 {
    public final List a;
    public final String b;

    public ldk(List list, String str) {
        this.a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ldk)) {
            return false;
        }
        ldk ldkVar = (ldk) obj;
        return this.a.equals(ldkVar.a) && this.b.equals(ldkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.i("DivAddNewCard(actions=", ", title=", this.b, Extension.C_BRAKE, this.a);
    }
}
