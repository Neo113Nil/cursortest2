package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fe40 implements ge40 {
    public final be40 a;

    public fe40(be40 be40Var) {
        this.a = be40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe40) && jl40.l(this.a, ((fe40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadInitData(mtTrainConditionInfoDialogData=" + this.a + Extension.C_BRAKE;
    }
}
