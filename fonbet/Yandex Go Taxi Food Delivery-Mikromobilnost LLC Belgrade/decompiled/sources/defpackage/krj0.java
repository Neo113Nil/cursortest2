package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class krj0 implements taa {
    public final String a;
    public final FormattedText b;
    public final sca c;

    public krj0(String str, FormattedText formattedText, sca scaVar) {
        this.a = str;
        this.b = formattedText;
        this.c = scaVar;
    }

    @Override // defpackage.taa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.taa
    public final ChargersActiveOrderStatus b() {
        return ChargersActiveOrderStatus.RESERVATION;
    }

    @Override // defpackage.taa
    public final sca c() {
        return this.c;
    }

    @Override // defpackage.taa
    public final FormattedText d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof krj0)) {
            return false;
        }
        krj0 krj0Var = (krj0) obj;
        return this.a.equals(krj0Var.a) && jl40.l(this.b, krj0Var.b) && jl40.l(this.c, krj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder q = xvz.q("ReservationChargersOrder(orderId=", this.a, ", statusText=", ", multiorder=", this.b);
        q.append(this.c);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
