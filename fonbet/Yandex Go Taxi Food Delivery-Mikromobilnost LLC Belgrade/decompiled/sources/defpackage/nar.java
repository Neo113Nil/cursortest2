package defpackage;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class nar implements taa, i2a {
    public final String a;
    public final FormattedText b;
    public final List c;
    public final List d;

    public nar(String str, FormattedText formattedText, ArrayList arrayList, ArrayList arrayList2) {
        this.a = str;
        this.b = formattedText;
        this.c = arrayList;
        this.d = arrayList2;
    }

    @Override // defpackage.taa
    public final String a() {
        return this.a;
    }

    @Override // defpackage.taa
    public final ChargersActiveOrderStatus b() {
        return ChargersActiveOrderStatus.FINISHED;
    }

    @Override // defpackage.taa
    public final sca c() {
        sca scaVar = sca.e;
        return sca.e;
    }

    @Override // defpackage.taa
    public final FormattedText d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nar)) {
            return false;
        }
        nar narVar = (nar) obj;
        return this.a.equals(narVar.a) && jl40.l(this.b, narVar.b) && jl40.l(this.c, narVar.c) && jl40.l(this.d, narVar.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        List list = this.c;
        int hashCode = (c + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        return vfc.p(xvz.q("FinishedChargersOrder(orderId=", this.a, ", statusText=", ", notifications=", this.b), this.c, ", popups=", this.d, Extension.C_BRAKE);
    }
}
