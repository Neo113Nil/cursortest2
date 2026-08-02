package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.f;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bwq {
    public final MasstransitOrderDto a;
    public final String b;

    static {
        f fVar = MasstransitOrderDto.Companion;
    }

    public bwq(MasstransitOrderDto masstransitOrderDto, String str) {
        this.a = masstransitOrderDto;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwq)) {
            return false;
        }
        bwq bwqVar = (bwq) obj;
        return jl40.l(this.a, bwqVar.a) && jl40.l(this.b, bwqVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FetchOrderNetworkResult(order=" + this.a + ", requestId=" + this.b + Extension.C_BRAKE;
    }
}
