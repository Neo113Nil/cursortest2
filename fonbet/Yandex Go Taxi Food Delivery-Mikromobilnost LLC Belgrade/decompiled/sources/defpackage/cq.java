package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class cq implements fr {
    public final String a;
    public final String b;
    public final agi c;

    public cq(String str, String str2, agi agiVar) {
        this.a = str;
        this.b = str2;
        this.c = agiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return jl40.l(this.a, cqVar.a) && jl40.l(this.b, cqVar.b) && jl40.l(this.c, cqVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        agi agiVar = this.c;
        return b + (agiVar != null ? agiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpenDeliveryFormAction(scenario=", this.a, ", mode=", this.b, ", presetPoint=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
