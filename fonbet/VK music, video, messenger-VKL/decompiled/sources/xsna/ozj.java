package xsna;

/* compiled from: CourierMapRender.kt */
/* loaded from: classes18.dex */
public interface ozj extends fm50<tzj> {

    /* compiled from: CourierMapRender.kt */
    public static final class a implements ozj {
        public static final a a = new a();
    }

    /* compiled from: CourierMapRender.kt */
    public static final class b implements ozj {
        public final yzt0<mw9> a;

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
            return tr.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: CourierMapRender.kt */
    public static final class c implements ozj {
        public final yzt0<it0> a;
        public final yzt0<qm00> b;

        public c(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MainRender(addressBottomSheet=");
            sb.append(this.a);
            sb.append(", mapViewState=");
            return tr.c(sb, this.b, ')');
        }
    }
}
