package xsna;

import android.location.Location;
import com.vk.api.generated.address.dto.AddressFieldsDto;
import com.vk.dto.common.id.UserId;
import java.util.List;

/* compiled from: MarketGetAddressesRequest.kt */
/* loaded from: classes15.dex */
public final class fz00 {
    public final UserId a;
    public final long b;
    public final int c;
    public final Location d;
    public final List<AddressFieldsDto> e;

    public fz00(UserId userId, long j, int i, Location location, List list) {
        this.a = userId;
        this.b = j;
        this.c = i;
        this.d = location;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fz00)) {
            return false;
        }
        fz00 fz00Var = (fz00) obj;
        return epx.f(this.a, fz00Var.a) && this.b == fz00Var.b && this.c == fz00Var.c && epx.f(this.d, fz00Var.d) && epx.f(this.e, fz00Var.e);
    }

    public final int hashCode() {
        int a = shy.a(30, shy.a(this.c, bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31), 31);
        Location location = this.d;
        int hashCode = (((a + (location == null ? 0 : location.hashCode())) * 31) + 1034829994) * 31;
        List<AddressFieldsDto> list = this.e;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketGetAddressesRequestParams(ownerId=");
        sb.append(this.a);
        sb.append(", itemId=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        sb.append(", count=30, location=");
        sb.append(this.d);
        sb.append(", fields=work_info_status,timetable, fieldsDto=");
        return ms9.a(')', sb, this.e);
    }
}
