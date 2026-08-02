package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dlv implements elv {
    public final ojv a;

    public dlv(ojv ojvVar) {
        this.a = ojvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dlv) && this.a == ((dlv) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(params=" + this.a + Extension.C_BRAKE;
    }
}
