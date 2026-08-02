package defpackage;

import com.yx360.profile.api.model.PassportEnv;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class im {
    public final long a;
    public final PassportEnv b;

    public im(long j, PassportEnv passportEnv) {
        this.a = j;
        this.b = passportEnv;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        return this.a == imVar.a && this.b == imVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AccountUid(value=" + this.a + ", env=" + this.b + Extension.C_BRAKE;
    }
}
