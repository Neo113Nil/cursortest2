package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class jm70 implements nm70, fn70 {
    public final ArrayList a;

    public jm70(ArrayList arrayList) {
        this.a = arrayList;
    }

    public final List a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jm70) && this.a.equals(((jm70) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return g8e.q("OrderCardHeaderIconStack(icons=", Extension.C_BRAKE, this.a);
    }
}
