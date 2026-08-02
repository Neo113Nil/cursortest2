package defpackage;

import com.yandex.go.masstransit.sdk.order.impl.orders.MasstransitOrderDto;
import com.yandex.go.masstransit.sdk.order.impl.orders.f;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class cwq {
    public final MasstransitOrderDto a;
    public final String b;

    static {
        f fVar = MasstransitOrderDto.Companion;
    }

    public cwq(MasstransitOrderDto masstransitOrderDto, String str) {
        this.a = masstransitOrderDto;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwq)) {
            return false;
        }
        cwq cwqVar = (cwq) obj;
        return jl40.l(this.a, cwqVar.a) && jl40.l(this.b, cwqVar.b);
    }

    public final int hashCode() {
        MasstransitOrderDto masstransitOrderDto = this.a;
        int hashCode = (masstransitOrderDto == null ? 0 : masstransitOrderDto.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "FetchOrderResult(order=" + this.a + ", requestId=" + this.b + Extension.C_BRAKE;
    }
}
