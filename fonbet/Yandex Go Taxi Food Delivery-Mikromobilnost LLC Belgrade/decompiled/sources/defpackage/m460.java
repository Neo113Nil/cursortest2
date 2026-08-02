package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m460 implements o460 {
    public final e360 a;

    public m460(e360 e360Var) {
        this.a = e360Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m460) && this.a.equals(((m460) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Static(value=" + this.a + Extension.C_BRAKE;
    }
}
