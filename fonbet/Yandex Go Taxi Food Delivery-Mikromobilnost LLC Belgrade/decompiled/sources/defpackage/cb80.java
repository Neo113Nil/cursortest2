package defpackage;

import com.yandex.go.dto.response.OrderDto;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcb80;", "Lx251;", "Companion", "ab80", "bb80", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class cb80 extends x251 {
    public static final bb80 Companion = new bb80();
    public final OrderDto a;
    public final String b;

    public cb80(int i, OrderDto orderDto, String str) {
        this.a = (i & 1) == 0 ? new OrderDto(null, null, 15) : orderDto;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
    }

    public static cb80 b(cb80 cb80Var, OrderDto orderDto) {
        return new cb80(orderDto, cb80Var.b);
    }

    @Override // defpackage.x251
    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: c, reason: from getter */
    public final OrderDto getA() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb80)) {
            return false;
        }
        cb80 cb80Var = (cb80) obj;
        return jl40.l(this.a, cb80Var.a) && jl40.l(this.b, cb80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OrderWidgetDto(payload=" + this.a + ", id=" + this.b + Extension.C_BRAKE;
    }

    public cb80() {
        this((OrderDto) null, 3);
    }

    public cb80(OrderDto orderDto, String str) {
        this.a = orderDto;
        this.b = str;
    }

    public /* synthetic */ cb80(OrderDto orderDto, int i) {
        this((i & 1) != 0 ? new OrderDto(null, null, 15) : orderDto, "");
    }
}
