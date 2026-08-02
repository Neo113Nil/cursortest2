package xsna;

import java.util.List;

/* compiled from: NewsfeedCoownersListViewState.kt */
/* loaded from: classes17.dex */
public final class oe60 implements ao50 {
    public final fi50 a;

    /* compiled from: NewsfeedCoownersListViewState.kt */
    public static abstract class a implements fm50<me60> {

        /* compiled from: NewsfeedCoownersListViewState.kt */
        /* renamed from: xsna.oe60$a$a, reason: collision with other inner class name */
        public static final class C3451a extends a {
            public final yzt0<List<ie60>> a;

            public C3451a(h0u0 h0u0Var) {
                this.a = h0u0Var;
            }
        }

        /* compiled from: NewsfeedCoownersListViewState.kt */
        public static final class b extends a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2064777855;
            }

            public final String toString() {
                return "Initial";
            }
        }
    }

    public oe60(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
