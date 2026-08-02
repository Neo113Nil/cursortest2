package xsna;

import java.util.List;
import kotlin.collections.builders.ListBuilder;
import xsna.wns;

/* compiled from: FriendsCleanupViewState.kt */
/* loaded from: classes15.dex */
public final class cos implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;

    /* compiled from: FriendsCleanupViewState.kt */
    public static final class a implements fm50<wns.a> {
        public final yzt0<d> a;

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

    /* compiled from: FriendsCleanupViewState.kt */
    public static final class b implements fm50<wns.b> {
        public static final b a = new b();
    }

    /* compiled from: FriendsCleanupViewState.kt */
    public static final class c implements fm50<wns.c> {
        public final yzt0<Throwable> a;

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
            return tr.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: FriendsCleanupViewState.kt */
    public static final class d implements fm50<wns.a> {
        public final List<Object> a;
        public final boolean b;

        public d(ListBuilder listBuilder, boolean z) {
            this.a = listBuilder;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FriendsCleanupList(items=");
            sb.append(this.a);
            sb.append(", reloadingInBackground=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: FriendsCleanupViewState.kt */
    public static final class e implements fm50<wns.d> {
        public static final e a = new e();
    }

    public cos(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
    }
}
