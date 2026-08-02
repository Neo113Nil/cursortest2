package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0(with = dgy0.class)
/* loaded from: classes9.dex */
public final class cgy0 extends kr {
    public static final bgy0 Companion = new bgy0();
    public final String a;
    public final LinkedHashMap b;

    public cgy0(String str, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!cgy0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        cgy0 cgy0Var = (cgy0) obj;
        return jl40.l(this.a, cgy0Var.a) && jl40.l(this.b, cgy0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TemplatedAction(templateId=" + this.a + ", params=" + this.b + Extension.C_BRAKE;
    }
}
