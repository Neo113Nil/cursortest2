package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class d18 implements taa, i2a {
    public final String a;
    public final cy9 b;

    public d18(cy9 cy9Var, String str) {
        this.a = str;
        this.b = cy9Var;
    }

    @Override // defpackage.taa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.taa
    public final ChargersActiveOrderStatus b() {
        return ChargersActiveOrderStatus.CANCELED;
    }

    @Override // defpackage.taa
    public final sca c() {
        sca scaVar = sca.e;
        return sca.e;
    }

    @Override // defpackage.taa
    public final FormattedText d() {
        return FormattedText.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d18)) {
            return false;
        }
        d18 d18Var = (d18) obj;
        return this.a.equals(d18Var.a) && this.b.equals(d18Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CanceledChargersOrder(orderId=" + this.a + ", errorDetails=" + this.b + Extension.C_BRAKE;
    }
}
