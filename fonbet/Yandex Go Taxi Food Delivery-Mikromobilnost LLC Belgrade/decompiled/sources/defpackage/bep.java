package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bep implements dep {
    public final zzs a;

    public /* synthetic */ bep(zzs zzsVar) {
        this.a = zzsVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bep) {
            return jl40.l(this.a, ((bep) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InitialPoint(value=" + this.a + Extension.C_BRAKE;
    }
}
