package defpackage;

import java.io.IOException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class puf0 {
    public final String a;
    public final IOException b;

    public puf0(String str, IOException iOException) {
        this.a = str;
        this.b = iOException;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof puf0)) {
            return false;
        }
        puf0 puf0Var = (puf0) obj;
        return this.a.equals(puf0Var.a) && this.b.equals(puf0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ProtoAdapterError(message=" + this.a + ", cause=" + this.b + Extension.C_BRAKE;
    }
}
