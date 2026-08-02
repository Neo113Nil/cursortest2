package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.ba0;

/* loaded from: classes7.dex */
public final class ap61 extends zz61 {
    public final boolean a;

    public ap61(boolean z) {
        ba0 ba0Var = ba0.b;
        this.a = z;
    }

    @Override // defpackage.zz61
    public final boolean a(zz61 zz61Var) {
        if (!(zz61Var instanceof ap61)) {
            return false;
        }
        ba0 ba0Var = ba0.b;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap61)) {
            return false;
        }
        ba0 ba0Var = ba0.b;
        return this.a == ((ap61) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a) + ((ba0.b.hashCode() - 1222345866) * 31);
    }

    public final String toString() {
        return "Switch(text=Debug Error Indicator, switchType=" + ba0.b + ", initialState=" + this.a + Extension.C_BRAKE;
    }
}
