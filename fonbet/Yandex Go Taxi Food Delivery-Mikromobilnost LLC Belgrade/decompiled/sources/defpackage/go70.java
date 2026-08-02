package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class go70 implements io70 {
    public final tb9 a;

    public go70(tb9 tb9Var) {
        this.a = tb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go70) && jl40.l(this.a, ((go70) obj).a);
    }

    @Override // defpackage.io70
    public final tb9 getPayload() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(payload=" + this.a + Extension.C_BRAKE;
    }
}
