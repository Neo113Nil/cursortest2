package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class mz31 {
    public final boolean a;
    public final long b;

    public mz31(boolean z, long j) {
        this.a = z;
        this.b = j;
    }

    public final boolean a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz31)) {
            return false;
        }
        mz31 mz31Var = (mz31) obj;
        return this.a == mz31Var.a && this.b == mz31Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "VoipCallHangupConfirmationExperimentData(enabled=" + this.a + ", showConfirmationAfterSec=" + this.b + Extension.C_BRAKE;
    }
}
