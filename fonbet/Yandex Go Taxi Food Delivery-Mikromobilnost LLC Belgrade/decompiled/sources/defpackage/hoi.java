package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class hoi {
    public final String a;
    public final sti b;
    public final tpr c;

    public hoi(String str, sti stiVar, tpr tprVar) {
        this.a = str;
        this.b = stiVar;
        this.c = tprVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hoi)) {
            return false;
        }
        hoi hoiVar = (hoi) obj;
        return jl40.l(this.a, hoiVar.a) && jl40.l(this.b, hoiVar.b) && this.c.equals(hoiVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DeliverySddIntervalsRouterPayload(tariffClass=" + this.a + ", intervalsListScreen=" + this.b + ", deliveryIntervalsFlow=" + this.c + Extension.C_BRAKE;
    }
}
