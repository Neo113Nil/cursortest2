package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.paymentcards.TransportCardStatus;

/* loaded from: classes6.dex */
public final class p011 {
    public static final p011 e = new p011(null, null, null, EmptyList.a);
    public final String a;
    public final TransportCardStatus b;
    public final r011 c;
    public final List d;

    public p011(String str, TransportCardStatus transportCardStatus, r011 r011Var, List list) {
        this.a = str;
        this.b = transportCardStatus;
        this.c = r011Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p011)) {
            return false;
        }
        p011 p011Var = (p011) obj;
        return jl40.l(this.a, p011Var.a) && this.b == p011Var.b && jl40.l(this.c, p011Var.c) && this.d.equals(p011Var.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        TransportCardStatus transportCardStatus = this.b;
        int hashCode2 = (hashCode + (transportCardStatus == null ? 0 : transportCardStatus.hashCode())) * 31;
        r011 r011Var = this.c;
        return this.d.hashCode() + ((hashCode2 + (r011Var != null ? r011Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TransportCardAnalyticsData(chosenCardId=" + this.a + ", chosenCardStatus=" + this.b + ", chosenCardBalance=" + this.c + ", cardsList=" + this.d + Extension.C_BRAKE;
    }
}
