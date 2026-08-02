package xsna;

import xsna.r7h0;

/* compiled from: ScheduledCallsViewState.kt */
/* loaded from: classes7.dex */
public final class v7h0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: ScheduledCallsViewState.kt */
    public static final class a implements fm50<r7h0.a> {
        public final yzt0<m59> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Content(listState="), this.a, ')');
        }
    }

    /* compiled from: ScheduledCallsViewState.kt */
    public static final class b implements fm50<r7h0.b> {
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
            return tr.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: ScheduledCallsViewState.kt */
    public static final class c implements fm50<r7h0.c> {
        public static final c a = new c();
    }

    /* compiled from: ScheduledCallsViewState.kt */
    public static final class d implements fm50<r7h0.d> {
        public static final d a = new d();
    }

    public v7h0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
