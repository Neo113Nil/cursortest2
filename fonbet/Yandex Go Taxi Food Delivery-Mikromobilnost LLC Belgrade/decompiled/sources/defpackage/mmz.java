package defpackage;

import com.yandex.go.taxi.order.search.polling.model.DriverCandidate;
import com.yandex.go.taxi.order.search.polling.model.ETA;
import com.yandex.go.taxi.order.search.polling.model.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mmz {
    public final Integer a = null;
    public final ETA b = null;
    public final DriverCandidate c = null;
    public final String d = null;
    public final String e = null;

    static {
        a aVar = DriverCandidate.Companion;
    }

    public mmz() {
        int i = 31 & 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmz)) {
            return false;
        }
        mmz mmzVar = (mmz) obj;
        return jl40.l(this.a, mmzVar.a) && jl40.l(this.b, mmzVar.b) && jl40.l(this.c, mmzVar.c) && jl40.l(this.d, mmzVar.d) && jl40.l(this.e, mmzVar.e);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        ETA eta = this.b;
        int hashCode2 = (hashCode + (eta == null ? 0 : eta.hashCode())) * 31;
        DriverCandidate driverCandidate = this.c;
        int hashCode3 = (hashCode2 + (driverCandidate == null ? 0 : driverCandidate.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LongSearchInfo(radius=");
        sb.append(this.a);
        sb.append(", eta=");
        sb.append(this.b);
        sb.append(", driverCandidate=");
        sb.append(this.c);
        sb.append(", hint=");
        sb.append(this.d);
        sb.append(", error=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
