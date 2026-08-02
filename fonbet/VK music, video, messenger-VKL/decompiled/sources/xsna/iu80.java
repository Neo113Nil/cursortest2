package xsna;

import com.vk.dto.common.Price;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.common.model.OrderSource;
import com.vk.ecomm.orders.impl.common.model.OrderStatus;
import java.util.List;

/* compiled from: Order.kt */
/* loaded from: classes18.dex */
public final class iu80 {
    public final UserId a;
    public final int b;
    public final String c;
    public final ms90 d;
    public final OrderSource e;
    public final dx80 f;
    public final OrderStatus g;
    public final long h;
    public final Price i;
    public final Price j;
    public final String k;
    public final ou80 l;
    public final ax80 m;
    public final rx80 n;
    public final List<vw80> o;
    public final String p;
    public final boolean q;
    public final List<ww80> r;

    public iu80(UserId userId, int i, String str, ms90 ms90Var, OrderSource orderSource, dx80 dx80Var, OrderStatus orderStatus, long j, Price price, Price price2, String str2, ou80 ou80Var, ax80 ax80Var, rx80 rx80Var, List<vw80> list, String str3, boolean z, List<ww80> list2) {
        this.a = userId;
        this.b = i;
        this.c = str;
        this.d = ms90Var;
        this.e = orderSource;
        this.f = dx80Var;
        this.g = orderStatus;
        this.h = j;
        this.i = price;
        this.j = price2;
        this.k = str2;
        this.l = ou80Var;
        this.m = ax80Var;
        this.n = rx80Var;
        this.o = list;
        this.p = str3;
        this.q = z;
        this.r = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iu80)) {
            return false;
        }
        iu80 iu80Var = (iu80) obj;
        return epx.f(this.a, iu80Var.a) && this.b == iu80Var.b && epx.f(this.c, iu80Var.c) && epx.f(this.d, iu80Var.d) && epx.f(this.e, iu80Var.e) && epx.f(this.f, iu80Var.f) && this.g == iu80Var.g && this.h == iu80Var.h && epx.f(this.i, iu80Var.i) && epx.f(this.j, iu80Var.j) && epx.f(this.k, iu80Var.k) && epx.f(this.l, iu80Var.l) && epx.f(this.m, iu80Var.m) && epx.f(this.n, iu80Var.n) && epx.f(this.o, iu80Var.o) && epx.f(this.p, iu80Var.p) && this.q == iu80Var.q && epx.f(this.r, iu80Var.r);
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        String str = this.c;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        ms90 ms90Var = this.d;
        int hashCode2 = (this.e.hashCode() + ((hashCode + (ms90Var == null ? 0 : ms90Var.hashCode())) * 31)) * 31;
        dx80 dx80Var = this.f;
        int hashCode3 = (this.i.hashCode() + bh10.a((this.g.hashCode() + ((hashCode2 + (dx80Var == null ? 0 : dx80Var.hashCode())) * 31)) * 31, 31, this.h)) * 31;
        Price price = this.j;
        int hashCode4 = (hashCode3 + (price == null ? 0 : price.hashCode())) * 31;
        String str2 = this.k;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ou80 ou80Var = this.l;
        int hashCode6 = (hashCode5 + (ou80Var == null ? 0 : ou80Var.hashCode())) * 31;
        ax80 ax80Var = this.m;
        int hashCode7 = (hashCode6 + (ax80Var == null ? 0 : ax80Var.hashCode())) * 31;
        rx80 rx80Var = this.n;
        int a2 = fw3.a((hashCode7 + (rx80Var == null ? 0 : rx80Var.hashCode())) * 31, 31, this.o);
        String str3 = this.p;
        return this.r.hashCode() + qoy.b((a2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Order(userId=");
        sb.append(this.a);
        sb.append(", orderId=");
        sb.append(this.b);
        sb.append(", displayedId=");
        sb.append(this.c);
        sb.append(", paymentInfo=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", seller=");
        sb.append(this.f);
        sb.append(", status=");
        sb.append(this.g);
        sb.append(", date=");
        sb.append(this.h);
        sb.append(", price=");
        sb.append(this.i);
        sb.append(", discount=");
        sb.append(this.j);
        sb.append(", promoCode=");
        sb.append(this.k);
        sb.append(", delivery=");
        sb.append(this.l);
        sb.append(", recipient=");
        sb.append(this.m);
        sb.append(", trackNumber=");
        sb.append(this.n);
        sb.append(", priceDetails=");
        sb.append(this.o);
        sb.append(", sellerComment=");
        sb.append(this.p);
        sb.append(", isPaymentAvailable=");
        sb.append(this.q);
        sb.append(", products=");
        return ms9.a(')', sb, this.r);
    }
}
