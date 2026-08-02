package xsna;

import java.util.List;

/* compiled from: ArchiveViewState.kt */
/* loaded from: classes4.dex */
public final class oj3 implements ao50 {
    public final fi50 a;

    /* compiled from: ArchiveViewState.kt */
    public static final class a implements fm50<ej3> {
        public final yzt0<Boolean> a;
        public final yzt0<List<y7a0>> b;
        public final yzt0<Boolean> c;
        public final yzt0<Boolean> d;
        public final yzt0<Boolean> e;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3, h0u0 h0u0Var4, h0u0 h0u0Var5) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
            this.d = h0u0Var4;
            this.e = h0u0Var5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + sr.a(this.d, sr.a(this.c, sr.a(this.b, this.a.hashCode() * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(showSkeleton=");
            sb.append(this.a);
            sb.append(", photoFlowItems=");
            sb.append(this.b);
            sb.append(", showLoader=");
            sb.append(this.c);
            sb.append(", multiSelectMode=");
            sb.append(this.d);
            sb.append(", menuActive=");
            return tr.c(sb, this.e, ')');
        }
    }

    public oj3(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
