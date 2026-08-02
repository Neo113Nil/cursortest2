package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class goj {
    public final ek20 a;

    public goj(ek20 ek20Var) {
        this.a = ek20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof goj) && this.a.equals(((goj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MissionProgressTrailItemModel(item=" + this.a + Extension.C_BRAKE;
    }
}
