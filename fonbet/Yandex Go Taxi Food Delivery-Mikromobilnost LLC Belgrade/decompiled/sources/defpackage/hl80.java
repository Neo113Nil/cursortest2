package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hl80 implements il80 {
    public final dm80 a;

    public /* synthetic */ hl80(dm80 dm80Var) {
        this.a = dm80Var;
    }

    public static final /* synthetic */ hl80 a(dm80 dm80Var) {
        return new hl80(dm80Var);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hl80) {
            return this.a.equals(((hl80) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Discovery(childPayload=" + this.a + Extension.C_BRAKE;
    }
}
