package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class oen0 implements pen0 {
    public final zzs a;

    public final boolean equals(Object obj) {
        if (obj instanceof oen0) {
            return this.a.equals(((oen0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Saved(destination=" + this.a + Extension.C_BRAKE;
    }
}
