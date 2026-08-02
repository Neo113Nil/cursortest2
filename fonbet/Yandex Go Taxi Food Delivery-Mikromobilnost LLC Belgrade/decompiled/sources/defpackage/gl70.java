package defpackage;

import com.yandex.go.taxi.order.models.api.cancel.OrderCancelNotification;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class gl70 {
    public final String a;
    public final String b;
    public final OrderCancelNotification c;
    public final ief d;
    public final List e;

    public gl70(String str, String str2, OrderCancelNotification orderCancelNotification, ief iefVar, List list) {
        this.a = str;
        this.b = str2;
        this.c = orderCancelNotification;
        this.d = iefVar;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl70)) {
            return false;
        }
        gl70 gl70Var = (gl70) obj;
        return jl40.l(this.a, gl70Var.a) && jl40.l(this.b, gl70Var.b) && this.c.equals(gl70Var.c) && jl40.l(this.d, gl70Var.d) && jl40.l(this.e, gl70Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        ief iefVar = this.d;
        return this.e.hashCode() + ((hashCode + (iefVar == null ? 0 : iefVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("TaxiOnTheWayUpdate(orderId=", this.a, ", type=", this.b, ", notification=");
        v.append(this.c);
        v.append(", currencyRulesDto=");
        v.append(this.d);
        v.append(", pendingChanges=");
        return ly3.s(v, this.e, Extension.C_BRAKE);
    }
}
