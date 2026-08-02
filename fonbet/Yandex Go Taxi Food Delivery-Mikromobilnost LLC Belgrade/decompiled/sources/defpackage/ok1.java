package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ok1 implements qk1 {
    public final bd a;

    public ok1(bd bdVar) {
        this.a = bdVar;
    }

    @Override // defpackage.qk1, defpackage.tk1
    public final bd a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ok1) && jl40.l(this.a, ((ok1) obj).a);
    }

    public final int hashCode() {
        bd bdVar = this.a;
        if (bdVar == null) {
            return 0;
        }
        return bdVar.hashCode();
    }

    public final String toString() {
        return "LocationPermissionV1(acceptance=" + this.a + Extension.C_BRAKE;
    }

    @Override // defpackage.tk1
    public final dd a() {
        return this.a;
    }
}
