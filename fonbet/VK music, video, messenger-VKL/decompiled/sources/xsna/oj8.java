package xsna;

import java.util.List;

/* compiled from: BroadcastSettingsContract.kt */
/* loaded from: classes3.dex */
public final class oj8 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class a implements fm50<fj8> {
        public final yzt0<List<nj8>> a;
        public final yzt0<Boolean> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(settings=");
            sb.append(this.a);
            sb.append(", isRefreshing=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class b implements fm50<fj8> {
        public final yzt0<Throwable> a;

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

    /* compiled from: BroadcastSettingsContract.kt */
    public static final class c implements fm50<fj8> {
        public static final c a = new c();
    }

    public oj8(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
