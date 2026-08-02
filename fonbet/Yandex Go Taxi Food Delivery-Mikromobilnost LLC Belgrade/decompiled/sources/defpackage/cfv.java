package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cfv implements dfv {
    public final boolean a;

    public /* synthetic */ cfv(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cfv) {
            return this.a == ((cfv) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Back(useWideAngleIfPossible=", Extension.C_BRAKE, this.a);
    }
}
