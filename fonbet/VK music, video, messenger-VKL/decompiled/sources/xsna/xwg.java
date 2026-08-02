package xsna;

import java.util.List;

/* compiled from: CommunityCheckListViewState.kt */
/* loaded from: classes18.dex */
public final class xwg implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: CommunityCheckListViewState.kt */
    public static final class a implements fm50<twg> {
        public final yzt0<List<hfz>> a;

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
            return tr.c(new StringBuilder("Content(items="), this.a, ')');
        }
    }

    /* compiled from: CommunityCheckListViewState.kt */
    public static final class b implements fm50<twg> {
    }

    /* compiled from: CommunityCheckListViewState.kt */
    public static final class c implements fm50<twg> {
        public final yzt0<Boolean> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    public xwg(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
