package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ewj0 implements nui0 {
    public final Throwable a;

    public ewj0(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return ewj0.class.equals(obj != null ? obj.getClass() : null) && this.a.equals(((ewj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.m("ResponseFailure(cause=", Extension.C_BRAKE, this.a);
    }
}
