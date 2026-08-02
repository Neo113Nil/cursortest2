package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dlg0 {
    public final rr51 a;

    public dlg0(rr51 rr51Var) {
        this.a = rr51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlg0) && this.a.equals(((dlg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QuickActionsHeaderEntity(divData=" + this.a + Extension.C_BRAKE;
    }
}
