package xsna;

import java.util.List;

/* compiled from: MarketMultiPickerViewState.kt */
/* loaded from: classes18.dex */
public final class c910 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: MarketMultiPickerViewState.kt */
    public static final class a implements fm50<y810> {
        public final yzt0<tlo0> a;
        public final yzt0<List<Integer>> b;
        public final yzt0<List<glu>> c;
        public final yzt0<Integer> d;
        public final yzt0<List<hfz>> e;
        public final yzt0<Boolean> f;
        public final yzt0<Boolean> g;
        public final yzt0<Boolean> h;
        public final yzt0<List<hfz>> i;
        public final yzt0<Boolean> j;
        public final yzt0<Boolean> k;
        public final yzt0<Boolean> l;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5, h0u0 h0u0Var6, h0u0 h0u0Var7, h0u0 h0u0Var8, h0u0 h0u0Var9, h0u0 h0u0Var10, h0u0 h0u0Var11, h0u0 h0u0Var12) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
            this.f = h0u0Var6;
            this.g = h0u0Var7;
            this.h = h0u0Var8;
            this.i = h0u0Var9;
            this.j = h0u0Var10;
            this.k = h0u0Var11;
            this.l = h0u0Var12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e) && epx.f(this.f, aVar.f) && epx.f(this.g, aVar.g) && epx.f(this.h, aVar.h) && epx.f(this.i, aVar.i) && epx.f(this.j, aVar.j) && epx.f(this.k, aVar.k) && epx.f(this.l, aVar.l);
        }

        public final int hashCode() {
            return this.l.hashCode() + sr.a(this.k, sr.a(this.j, sr.a(this.i, sr.a(this.h, sr.a(this.g, sr.a(this.f, sr.a(this.e, sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ContentRender(title=");
            sb.append(this.a);
            sb.append(", tabs=");
            sb.append(this.b);
            sb.append(", groups=");
            sb.append(this.c);
            sb.append(", selectedItemsCount=");
            sb.append(this.d);
            sb.append(", groupItems=");
            sb.append(this.e);
            sb.append(", isGroupItemsLoading=");
            sb.append(this.f);
            sb.append(", isGroupItemsError=");
            sb.append(this.g);
            sb.append(", isGroupSearchShown=");
            sb.append(this.h);
            sb.append(", faveItems=");
            sb.append(this.i);
            sb.append(", isFaveItemsLoading=");
            sb.append(this.j);
            sb.append(", isFaveItemsError=");
            sb.append(this.k);
            sb.append(", isFaveItemsEmpty=");
            return tr.c(sb, this.l, ')');
        }
    }

    /* compiled from: MarketMultiPickerViewState.kt */
    public static final class b implements fm50<y810> {
        public final yzt0<tlo0> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("EmptyRender(title="), this.a, ')');
        }
    }

    /* compiled from: MarketMultiPickerViewState.kt */
    public static final class c implements fm50<y810> {
        public final yzt0<tlo0> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("ErrorRender(title="), this.a, ')');
        }
    }

    /* compiled from: MarketMultiPickerViewState.kt */
    public static final class d implements fm50<y810> {
        public static final d a = new d();
    }

    public c910(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
