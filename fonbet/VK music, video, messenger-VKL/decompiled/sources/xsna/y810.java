package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import java.util.List;
import java.util.Set;

/* compiled from: MarketMultiPickerState.kt */
/* loaded from: classes18.dex */
public final class y810 implements km50 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final int b;
    public final boolean c;
    public final Throwable d;
    public final Set<MultipickerProduct> e;
    public final List<glu> f;
    public final List<ha10> g;
    public final int h;
    public final int i;
    public final l810 j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final Throwable n;
    public final Throwable o;
    public final boolean p;
    public final List<ha10> q;
    public final Integer r;
    public final l810 s;
    public final boolean t;
    public final boolean u;
    public final Throwable v;
    public final Throwable w;
    public final a910 x;
    public final int y;
    public final boolean z;

    public y810(int i, boolean z, Throwable th, Set<MultipickerProduct> set, List<glu> list, List<ha10> list2, int i2, int i3, l810 l810Var, String str, boolean z2, boolean z3, Throwable th2, Throwable th3, boolean z4, List<ha10> list3, Integer num, l810 l810Var2, boolean z5, boolean z6, Throwable th4, Throwable th5, a910 a910Var, int i4) {
        this.b = i;
        this.c = z;
        this.d = th;
        this.e = set;
        this.f = list;
        this.g = list2;
        this.h = i2;
        this.i = i3;
        this.j = l810Var;
        this.k = str;
        this.l = z2;
        this.m = z3;
        this.n = th2;
        this.o = th3;
        this.p = z4;
        this.q = list3;
        this.r = num;
        this.s = l810Var2;
        this.t = z5;
        this.u = z6;
        this.v = th4;
        this.w = th5;
        this.x = a910Var;
        this.y = i4;
        this.z = 1 <= i3 && i3 < i2;
        this.A = num != null;
        this.B = th != null;
        this.C = th2 != null;
        this.D = th5 != null;
        this.E = i > 1;
        this.F = th4 != null;
        this.G = th3 != null;
    }

    public static y810 a(y810 y810Var, int i, boolean z, Throwable th, Set set, List list, List list2, int i2, int i3, String str, boolean z2, boolean z3, Throwable th2, Throwable th3, boolean z4, List list3, Integer num, boolean z5, Throwable th4, a910 a910Var, int i4, int i5) {
        int i6 = (i5 & 1) != 0 ? y810Var.b : i;
        boolean z6 = (i5 & 2) != 0 ? y810Var.c : z;
        Throwable th5 = (i5 & 4) != 0 ? y810Var.d : th;
        Set set2 = (i5 & 8) != 0 ? y810Var.e : set;
        List list4 = (i5 & 16) != 0 ? y810Var.f : list;
        List list5 = (i5 & 32) != 0 ? y810Var.g : list2;
        int i7 = (i5 & 64) != 0 ? y810Var.h : i2;
        int i8 = (i5 & 128) != 0 ? y810Var.i : i3;
        l810 l810Var = y810Var.j;
        String str2 = (i5 & 512) != 0 ? y810Var.k : str;
        boolean z7 = (i5 & 1024) != 0 ? y810Var.l : z2;
        boolean z8 = (i5 & 2048) != 0 ? y810Var.m : z3;
        Throwable th6 = (i5 & 4096) != 0 ? y810Var.n : th2;
        Throwable th7 = (i5 & 8192) != 0 ? y810Var.o : th3;
        boolean z9 = (i5 & 16384) != 0 ? y810Var.p : z4;
        List list6 = (32768 & i5) != 0 ? y810Var.q : list3;
        Integer num2 = (65536 & i5) != 0 ? y810Var.r : num;
        l810 l810Var2 = y810Var.s;
        boolean z10 = (262144 & i5) != 0 ? y810Var.t : false;
        boolean z11 = (524288 & i5) != 0 ? y810Var.u : z5;
        Throwable th8 = (1048576 & i5) != 0 ? y810Var.v : th4;
        Throwable th9 = (2097152 & i5) != 0 ? y810Var.w : null;
        a910 a910Var2 = (4194304 & i5) != 0 ? y810Var.x : a910Var;
        int i9 = (i5 & 8388608) != 0 ? y810Var.y : i4;
        y810Var.getClass();
        return new y810(i6, z6, th5, set2, list4, list5, i7, i8, l810Var, str2, z7, z8, th6, th7, z9, list6, num2, l810Var2, z10, z11, th8, th9, a910Var2, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y810)) {
            return false;
        }
        y810 y810Var = (y810) obj;
        return this.b == y810Var.b && this.c == y810Var.c && epx.f(this.d, y810Var.d) && epx.f(this.e, y810Var.e) && epx.f(this.f, y810Var.f) && epx.f(this.g, y810Var.g) && this.h == y810Var.h && this.i == y810Var.i && epx.f(this.j, y810Var.j) && epx.f(this.k, y810Var.k) && this.l == y810Var.l && this.m == y810Var.m && epx.f(this.n, y810Var.n) && epx.f(this.o, y810Var.o) && this.p == y810Var.p && epx.f(this.q, y810Var.q) && epx.f(this.r, y810Var.r) && epx.f(this.s, y810Var.s) && this.t == y810Var.t && this.u == y810Var.u && epx.f(this.v, y810Var.v) && epx.f(this.w, y810Var.w) && epx.f(this.x, y810Var.x) && this.y == y810Var.y;
    }

    public final int hashCode() {
        int b = qoy.b(Integer.hashCode(this.b) * 31, 31, this.c);
        Throwable th = this.d;
        int b2 = qoy.b(qoy.b(urd0.a((this.j.hashCode() + shy.a(this.i, shy.a(this.h, fw3.a(fw3.a(fw3.b((b + (th == null ? 0 : th.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31), 31)) * 31, 31, this.k), 31, this.l), 31, this.m);
        Throwable th2 = this.n;
        int hashCode = (b2 + (th2 == null ? 0 : th2.hashCode())) * 31;
        Throwable th3 = this.o;
        int a = fw3.a(qoy.b((hashCode + (th3 == null ? 0 : th3.hashCode())) * 31, 31, this.p), 31, this.q);
        Integer num = this.r;
        int b3 = qoy.b(qoy.b((this.s.hashCode() + ((a + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.t), 31, this.u);
        Throwable th4 = this.v;
        int hashCode2 = (b3 + (th4 == null ? 0 : th4.hashCode())) * 31;
        Throwable th5 = this.w;
        return Integer.hashCode(this.y) + ((this.x.hashCode() + ((hashCode2 + (th5 != null ? th5.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketMultiPickerState(maxSelectProductCount=");
        sb.append(this.b);
        sb.append(", isFullScreenLoading=");
        sb.append(this.c);
        sb.append(", throwable=");
        sb.append(this.d);
        sb.append(", selectedGoods=");
        sb.append(this.e);
        sb.append(", groups=");
        sb.append(this.f);
        sb.append(", groupItems=");
        sb.append(this.g);
        sb.append(", groupItemsCount=");
        sb.append(this.h);
        sb.append(", groupItemsOffset=");
        sb.append(this.i);
        sb.append(", groupItemsPage=");
        sb.append(this.j);
        sb.append(", groupItemsQuery=");
        sb.append(this.k);
        sb.append(", isLoadingGroupItems=");
        sb.append(this.l);
        sb.append(", isNextPageGroupItemsLoading=");
        sb.append(this.m);
        sb.append(", groupItemsError=");
        sb.append(this.n);
        sb.append(", isNextPageGroupItemsError=");
        sb.append(this.o);
        sb.append(", canDisplayGroupPlaceholder=");
        sb.append(this.p);
        sb.append(", faveItems=");
        sb.append(this.q);
        sb.append(", faveItemsNextFrom=");
        sb.append(this.r);
        sb.append(", faveItemsPage=");
        sb.append(this.s);
        sb.append(", isLoadingFaveItems=");
        sb.append(this.t);
        sb.append(", isNextPageFaveItemsLoading=");
        sb.append(this.u);
        sb.append(", isNextPageFaveItemsError=");
        sb.append(this.v);
        sb.append(", faveItemsError=");
        sb.append(this.w);
        sb.append(", techMetrics=");
        sb.append(this.x);
        sb.append(", currentTabPosition=");
        return vu5.b(sb, this.y, ')');
    }
}
