package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ld40 implements td40 {
    public final be40 a;

    public ld40(be40 be40Var) {
        this.a = be40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ld40) && this.a.equals(((ld40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnConditionsClick(mtTrainConditionInfoDialogData=" + this.a + Extension.C_BRAKE;
    }
}
