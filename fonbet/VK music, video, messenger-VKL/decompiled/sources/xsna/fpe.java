package xsna;

import java.util.List;

/* compiled from: ClipsOwnerSwipeViewState.kt */
/* loaded from: classes17.dex */
public final class fpe implements ao50 {
    public final fi50 a;

    /* compiled from: ClipsOwnerSwipeViewState.kt */
    public static final class a implements fm50<voe> {
        public final yzt0<b> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsOwnerSwipeViewState.kt */
    public static final class b {
        public final List<mme> a;
        public final int b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends mme> list, int i) {
            this.a = list;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final List<mme> b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ItemsData(items=");
            sb.append(this.a);
            sb.append(", currentItemIndex=");
            return vu5.b(sb, this.b, ')');
        }
    }

    public fpe(fi50 fi50Var) {
        this.a = fi50Var;
    }

    public final n0u0<a> a() {
        return this.a;
    }
}
