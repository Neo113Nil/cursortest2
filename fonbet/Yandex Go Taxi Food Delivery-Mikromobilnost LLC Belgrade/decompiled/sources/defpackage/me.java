package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class me {
    public final sls a;
    public final sls b;

    public /* synthetic */ me(rd rdVar, int i) {
        this((sls) null, (i & 2) != 0 ? null : rdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof me)) {
            return false;
        }
        me meVar = (me) obj;
        return jl40.l(this.a, meVar.a) && jl40.l(this.b, meVar.b);
    }

    public final int hashCode() {
        sls slsVar = this.a;
        int hashCode = (slsVar == null ? 0 : slsVar.hashCode()) * 31;
        sls slsVar2 = this.b;
        return hashCode + (slsVar2 != null ? slsVar2.hashCode() : 0);
    }

    public final String toString() {
        return "Handlers(onNotificationClick=" + this.a + ", onCancelClick=" + this.b + Extension.C_BRAKE;
    }

    public me() {
        this((rd) null, 3);
    }

    public me(sls slsVar, sls slsVar2) {
        this.a = slsVar;
        this.b = slsVar2;
    }
}
