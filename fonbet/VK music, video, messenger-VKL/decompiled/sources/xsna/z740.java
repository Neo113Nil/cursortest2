package xsna;

/* compiled from: MultipleCoownershipViewState.kt */
/* loaded from: classes3.dex */
public final class z740 implements ao50 {
    public final fi50 a;

    /* compiled from: MultipleCoownershipViewState.kt */
    public static abstract class a implements fm50<w740> {

        /* compiled from: MultipleCoownershipViewState.kt */
        /* renamed from: xsna.z740$a$a, reason: collision with other inner class name */
        public static final class C4159a extends a {
            public final yzt0<x740> a;

            public C4159a(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }
        }

        /* compiled from: MultipleCoownershipViewState.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1547037030;
            }

            public final String toString() {
                return "Initial";
            }
        }
    }

    public z740(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
