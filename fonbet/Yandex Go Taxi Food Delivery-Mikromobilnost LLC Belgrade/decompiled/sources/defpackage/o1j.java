package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.experiment.f;
import ru.yandex.taxi.masstransit.geopayment.tickets.model.a;

/* loaded from: classes6.dex */
public final class o1j {
    public final su30 a;
    public final f b;
    public final pd01 c;
    public final a d;

    public o1j(su30 su30Var, f fVar, pd01 pd01Var, a aVar) {
        this.a = su30Var;
        this.b = fVar;
        this.c = pd01Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1j)) {
            return false;
        }
        o1j o1jVar = (o1j) obj;
        return jl40.l(this.a, o1jVar.a) && jl40.l(this.b, o1jVar.b) && jl40.l(this.c, o1jVar.c) && jl40.l(this.d, o1jVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Configs(mtRoute=" + this.a + ", transportOnSummaryConfig=" + this.b + ", trainsFlowConfig=" + this.c + ", mtPaymentTickets=" + this.d + Extension.C_BRAKE;
    }
}
