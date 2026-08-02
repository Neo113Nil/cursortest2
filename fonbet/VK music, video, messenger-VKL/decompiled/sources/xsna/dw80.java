package xsna;

import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.orderlist.domain.OrderPreview;
import java.util.Map;

/* compiled from: OrderListState.kt */
/* loaded from: classes18.dex */
public final class dw80 implements lm50 {
    public final int b;
    public final Map<Integer, OrderPreview> c;
    public final ReviewSuggestion d;
    public final Integer e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final Throwable i;
    public final boolean j;
    public final boolean k;
    public final Throwable l;

    public dw80() {
        this(null, 2047);
    }

    public static dw80 a(dw80 dw80Var, int i, Map map, Integer num, int i2, boolean z, boolean z2, Throwable th, boolean z3, boolean z4, Throwable th2, int i3) {
        if ((i3 & 1) != 0) {
            i = dw80Var.b;
        }
        int i4 = i;
        if ((i3 & 2) != 0) {
            map = dw80Var.c;
        }
        Map map2 = map;
        ReviewSuggestion reviewSuggestion = dw80Var.d;
        if ((i3 & 8) != 0) {
            num = dw80Var.e;
        }
        Integer num2 = num;
        int i5 = (i3 & 16) != 0 ? dw80Var.f : i2;
        boolean z5 = (i3 & 32) != 0 ? dw80Var.g : z;
        boolean z6 = (i3 & 64) != 0 ? dw80Var.h : z2;
        Throwable th3 = (i3 & 128) != 0 ? dw80Var.i : th;
        boolean z7 = (i3 & 256) != 0 ? dw80Var.j : z3;
        boolean z8 = (i3 & 512) != 0 ? dw80Var.k : z4;
        Throwable th4 = (i3 & 1024) != 0 ? dw80Var.l : th2;
        dw80Var.getClass();
        return new dw80(i4, map2, reviewSuggestion, num2, i5, z5, z6, th3, z7, z8, th4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw80)) {
            return false;
        }
        dw80 dw80Var = (dw80) obj;
        return this.b == dw80Var.b && epx.f(this.c, dw80Var.c) && epx.f(this.d, dw80Var.d) && epx.f(this.e, dw80Var.e) && this.f == dw80Var.f && this.g == dw80Var.g && this.h == dw80Var.h && epx.f(this.i, dw80Var.i) && this.j == dw80Var.j && this.k == dw80Var.k && epx.f(this.l, dw80Var.l);
    }

    public final int hashCode() {
        int a = v11.a(Integer.hashCode(this.b) * 31, 31, this.c);
        ReviewSuggestion reviewSuggestion = this.d;
        int hashCode = (a + (reviewSuggestion == null ? 0 : reviewSuggestion.hashCode())) * 31;
        Integer num = this.e;
        int b = qoy.b(qoy.b(shy.a(this.f, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.g), 31, this.h);
        Throwable th = this.i;
        int b2 = qoy.b(qoy.b((b + (th == null ? 0 : th.hashCode())) * 31, 31, this.j), 31, this.k);
        Throwable th2 = this.l;
        return b2 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrderListState(totalOrders=");
        sb.append(this.b);
        sb.append(", orderPreviews=");
        sb.append(this.c);
        sb.append(", initialReviewSuggestion=");
        sb.append(this.d);
        sb.append(", paidOrderId=");
        sb.append(this.e);
        sb.append(", cartQuantity=");
        sb.append(this.f);
        sb.append(", isLoading=");
        sb.append(this.g);
        sb.append(", isLoadingNext=");
        sb.append(this.h);
        sb.append(", loadingNextError=");
        sb.append(this.i);
        sb.append(", isBlockingProgress=");
        sb.append(this.j);
        sb.append(", isRefreshing=");
        sb.append(this.k);
        sb.append(", error=");
        return oq.c(sb, this.l, ')');
    }

    public dw80(int i, Map<Integer, OrderPreview> map, ReviewSuggestion reviewSuggestion, Integer num, int i2, boolean z, boolean z2, Throwable th, boolean z3, boolean z4, Throwable th2) {
        this.b = i;
        this.c = map;
        this.d = reviewSuggestion;
        this.e = num;
        this.f = i2;
        this.g = z;
        this.h = z2;
        this.i = th;
        this.j = z3;
        this.k = z4;
        this.l = th2;
    }

    public /* synthetic */ dw80(ReviewSuggestion reviewSuggestion, int i) {
        this(0, jgp.b, (i & 4) != 0 ? null : reviewSuggestion, null, 0, (i & 32) == 0, false, null, false, false, null);
    }
}
