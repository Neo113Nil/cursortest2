package xsna;

import java.util.List;
import xsna.bmz;

/* compiled from: LiveSpectatorsViewState.kt */
/* loaded from: classes3.dex */
public final class dmz implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: LiveSpectatorsViewState.kt */
    public static final class a implements fm50<bmz.a> {
        public final yzt0<List<mlz>> a;

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
            return tr.c(new StringBuilder("Data(items="), this.a, ')');
        }
    }

    /* compiled from: LiveSpectatorsViewState.kt */
    public static final class b implements fm50<bmz.a> {
        public static final b a = new b();
    }

    /* compiled from: LiveSpectatorsViewState.kt */
    public static final class c implements fm50<bmz.b> {
        public static final c a = new c();
    }

    /* compiled from: LiveSpectatorsViewState.kt */
    public static final class d implements fm50<bmz.c> {
        public static final d a = new d();
    }

    public dmz(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
