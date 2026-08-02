package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gl80 implements il80 {
    public final xl80 a;

    public /* synthetic */ gl80(xl80 xl80Var) {
        this.a = xl80Var;
    }

    public static final /* synthetic */ gl80 a(xl80 xl80Var) {
        return new gl80(xl80Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gl80) {
            return this.a == ((gl80) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Card(childPayload=" + this.a + Extension.C_BRAKE;
    }
}
