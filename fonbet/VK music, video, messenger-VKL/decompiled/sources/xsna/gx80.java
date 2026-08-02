package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.orders.impl.order.presentation.mvi.state.OrderError;

/* compiled from: OrderState.kt */
/* loaded from: classes18.dex */
public final class gx80 implements lm50 {
    public final UserId b;
    public final Integer c;
    public final String d;
    public final iu80 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final OrderError i;

    public gx80(UserId userId, Integer num, String str, iu80 iu80Var, boolean z, boolean z2, boolean z3, OrderError orderError) {
        this.b = userId;
        this.c = num;
        this.d = str;
        this.e = iu80Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = orderError;
    }

    public static gx80 a(gx80 gx80Var, Integer num, String str, iu80 iu80Var, boolean z, boolean z2, boolean z3, OrderError orderError, int i) {
        Integer num2 = num;
        UserId userId = gx80Var.b;
        if ((i & 2) != 0) {
            num2 = gx80Var.c;
        }
        if ((i & 4) != 0) {
            str = gx80Var.d;
        }
        if ((i & 8) != 0) {
            iu80Var = gx80Var.e;
        }
        if ((i & 16) != 0) {
            z = gx80Var.f;
        }
        if ((i & 32) != 0) {
            z2 = gx80Var.g;
        }
        if ((i & 64) != 0) {
            z3 = gx80Var.h;
        }
        if ((i & 128) != 0) {
            orderError = gx80Var.i;
        }
        OrderError orderError2 = orderError;
        gx80Var.getClass();
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        iu80 iu80Var2 = iu80Var;
        return new gx80(userId, num2, str, iu80Var2, z6, z5, z4, orderError2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gx80)) {
            return false;
        }
        gx80 gx80Var = (gx80) obj;
        return epx.f(this.b, gx80Var.b) && epx.f(this.c, gx80Var.c) && epx.f(this.d, gx80Var.d) && epx.f(this.e, gx80Var.e) && this.f == gx80Var.f && this.g == gx80Var.g && this.h == gx80Var.h && this.i == gx80Var.i;
    }

    public final int hashCode() {
        UserId userId = this.b;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        Integer num = this.c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        iu80 iu80Var = this.e;
        int b = qoy.b(qoy.b(qoy.b((hashCode3 + (iu80Var == null ? 0 : iu80Var.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        OrderError orderError = this.i;
        return b + (orderError != null ? orderError.hashCode() : 0);
    }

    public final String toString() {
        return "OrderState(userId=" + this.b + ", orderId=" + this.c + ", displayedOrderId=" + this.d + ", order=" + this.e + ", isLoading=" + this.f + ", isBlockingProgress=" + this.g + ", isRefreshing=" + this.h + ", error=" + this.i + ')';
    }
}
