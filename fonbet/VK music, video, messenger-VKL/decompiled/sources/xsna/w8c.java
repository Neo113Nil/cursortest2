package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: CheckoutState.kt */
/* loaded from: classes18.dex */
public final class w8c implements km50 {
    public final UserId b;
    public final Long c;
    public final Throwable d;
    public final boolean e;
    public final boolean f;
    public final com.vk.ecomm.cart.impl.checkout.feature.state.f g;
    public final boolean h;
    public final q1n0 i;
    public final gbk j;

    public w8c(UserId userId, Long l, Throwable th, boolean z, boolean z2, com.vk.ecomm.cart.impl.checkout.feature.state.f fVar, boolean z3, q1n0 q1n0Var, gbk gbkVar) {
        this.b = userId;
        this.c = l;
        this.d = th;
        this.e = z;
        this.f = z2;
        this.g = fVar;
        this.h = z3;
        this.i = q1n0Var;
        this.j = gbkVar;
    }

    public static w8c a(w8c w8cVar, Throwable th, boolean z, boolean z2, com.vk.ecomm.cart.impl.checkout.feature.state.f fVar, boolean z3, q1n0 q1n0Var, gbk gbkVar, int i) {
        UserId userId = w8cVar.b;
        Long l = w8cVar.c;
        if ((i & 4) != 0) {
            th = w8cVar.d;
        }
        Throwable th2 = th;
        if ((i & 8) != 0) {
            z = w8cVar.e;
        }
        boolean z4 = z;
        if ((i & 16) != 0) {
            z2 = w8cVar.f;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            fVar = w8cVar.g;
        }
        com.vk.ecomm.cart.impl.checkout.feature.state.f fVar2 = fVar;
        boolean z6 = (i & 64) != 0 ? w8cVar.h : z3;
        q1n0 q1n0Var2 = (i & 128) != 0 ? w8cVar.i : q1n0Var;
        gbk gbkVar2 = (i & 256) != 0 ? w8cVar.j : gbkVar;
        w8cVar.getClass();
        return new w8c(userId, l, th2, z4, z5, fVar2, z6, q1n0Var2, gbkVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w8c)) {
            return false;
        }
        w8c w8cVar = (w8c) obj;
        return epx.f(this.b, w8cVar.b) && epx.f(this.c, w8cVar.c) && epx.f(this.d, w8cVar.d) && this.e == w8cVar.e && this.f == w8cVar.f && epx.f(this.g, w8cVar.g) && this.h == w8cVar.h && epx.f(this.i, w8cVar.i) && epx.f(this.j, w8cVar.j);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Throwable th = this.d;
        int b = qoy.b((this.g.hashCode() + qoy.b(qoy.b((hashCode2 + (th == null ? 0 : th.hashCode())) * 31, 31, this.e), 31, this.f)) * 31, 31, this.h);
        q1n0 q1n0Var = this.i;
        int hashCode3 = (b + (q1n0Var == null ? 0 : Boolean.hashCode(q1n0Var.a))) * 31;
        gbk gbkVar = this.j;
        return hashCode3 + (gbkVar != null ? gbkVar.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutState(groupId=" + this.b + ", itemId=" + this.c + ", error=" + this.d + ", isLoading=" + this.e + ", isRefreshing=" + this.f + ", form=" + this.g + ", isBlockingProgress=" + this.h + ", successCheckout=" + this.i + ", createdOrderContactInfo=" + this.j + ')';
    }
}
