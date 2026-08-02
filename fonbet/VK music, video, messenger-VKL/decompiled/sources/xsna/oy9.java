package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.ecomm.cart.api.router.models.CartCounterState;
import com.vk.ecomm.cart.impl.cart.feature.state.Cart;
import com.vk.ecomm.cart.impl.cart.feature.state.ExternalOrderState;
import java.util.LinkedHashMap;

/* compiled from: CartState.kt */
/* loaded from: classes18.dex */
public final class oy9 implements km50 {
    public final UserId b;
    public final LinkedHashMap<UserId, Cart> c;
    public final d990 d;
    public final Throwable e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final UserId i;
    public final ExternalOrderState j;
    public final CartCounterState k;
    public final boolean l;

    public oy9() {
        throw null;
    }

    public oy9(UserId userId, LinkedHashMap linkedHashMap, d990 d990Var, Throwable th, boolean z, boolean z2, boolean z3, UserId userId2, ExternalOrderState externalOrderState, CartCounterState cartCounterState, boolean z4) {
        this.b = userId;
        this.c = linkedHashMap;
        this.d = d990Var;
        this.e = th;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = userId2;
        this.j = externalOrderState;
        this.k = cartCounterState;
        this.l = z4;
    }

    public static oy9 a(oy9 oy9Var, UserId userId, LinkedHashMap linkedHashMap, d990 d990Var, Throwable th, boolean z, boolean z2, boolean z3, UserId userId2, ExternalOrderState externalOrderState, CartCounterState cartCounterState, boolean z4, int i) {
        if ((i & 1) != 0) {
            userId = oy9Var.b;
        }
        UserId userId3 = userId;
        if ((i & 2) != 0) {
            linkedHashMap = oy9Var.c;
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        if ((i & 4) != 0) {
            d990Var = oy9Var.d;
        }
        d990 d990Var2 = d990Var;
        Throwable th2 = (i & 8) != 0 ? oy9Var.e : th;
        boolean z5 = (i & 16) != 0 ? oy9Var.f : z;
        boolean z6 = (i & 32) != 0 ? oy9Var.g : z2;
        boolean z7 = (i & 64) != 0 ? oy9Var.h : z3;
        UserId userId4 = (i & 128) != 0 ? oy9Var.i : userId2;
        ExternalOrderState externalOrderState2 = (i & 256) != 0 ? oy9Var.j : externalOrderState;
        CartCounterState cartCounterState2 = (i & 512) != 0 ? oy9Var.k : cartCounterState;
        boolean z8 = (i & 1024) != 0 ? oy9Var.l : z4;
        oy9Var.getClass();
        return new oy9(userId3, linkedHashMap2, d990Var2, th2, z5, z6, z7, userId4, externalOrderState2, cartCounterState2, z8);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oy9)) {
            return false;
        }
        oy9 oy9Var = (oy9) obj;
        return epx.f(this.b, oy9Var.b) && epx.f(this.c, oy9Var.c) && epx.f(this.d, oy9Var.d) && epx.f(this.e, oy9Var.e) && this.f == oy9Var.f && this.g == oy9Var.g && this.h == oy9Var.h && epx.f(this.i, oy9Var.i) && epx.f(this.j, oy9Var.j) && epx.f(this.k, oy9Var.k) && this.l == oy9Var.l;
    }

    public final int hashCode() {
        UserId userId = this.b;
        int hashCode = (this.d.hashCode() + uf3.b(this.c, (userId == null ? 0 : Long.hashCode(userId.b)) * 31, 31)) * 31;
        Throwable th = this.e;
        int b = qoy.b(qoy.b(qoy.b((hashCode + (th == null ? 0 : th.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        UserId userId2 = this.i;
        int hashCode2 = (b + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        ExternalOrderState externalOrderState = this.j;
        int hashCode3 = (hashCode2 + (externalOrderState == null ? 0 : externalOrderState.hashCode())) * 31;
        CartCounterState cartCounterState = this.k;
        return Boolean.hashCode(this.l) + ((hashCode3 + (cartCounterState != null ? Integer.hashCode(cartCounterState.b) : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CartState(currentCommunity=");
        sb.append(this.b);
        sb.append(", carts=");
        sb.append(this.c);
        sb.append(", page=");
        sb.append(this.d);
        sb.append(", error=");
        sb.append(this.e);
        sb.append(", isLoading=");
        sb.append(this.f);
        sb.append(", isBlockingProgress=");
        sb.append(this.g);
        sb.append(", isRefreshing=");
        sb.append(this.h);
        sb.append(", cartToRefreshId=");
        sb.append(this.i);
        sb.append(", externalOrderState=");
        sb.append(this.j);
        sb.append(", cartCounterState=");
        sb.append(this.k);
        sb.append(", trackOnContent=");
        return defpackage.q0.a(sb, this.l, ')');
    }
}
