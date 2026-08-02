package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jty0 {
    public final ArrayList a;
    public final String b;

    public jty0(ArrayList arrayList, String str) {
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jty0)) {
            return false;
        }
        jty0 jty0Var = (jty0) obj;
        return this.a.equals(jty0Var.a) && this.b.equals(jty0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextSuggest(items=" + this.a + ", queryId=" + this.b + Extension.C_BRAKE;
    }
}
