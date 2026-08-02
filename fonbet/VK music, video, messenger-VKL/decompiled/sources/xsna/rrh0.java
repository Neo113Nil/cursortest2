package xsna;

import xsna.ksh0;

/* compiled from: SearchFeaturePatch.kt */
/* loaded from: classes5.dex */
public interface rrh0 extends xl50 {

    /* compiled from: SearchFeaturePatch.kt */
    public static final class a implements rrh0 {
        public static final a b = new a();
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class b implements rrh0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("LoadingState(isLoading="), this.b, ')');
        }
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class c implements rrh0 {
        public static final c b = new c();
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class d implements rrh0 {
        public final ksh0.b b;

        public d(ksh0.b bVar) {
            this.b = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetInputQuery(query=" + this.b + ')';
        }
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class e implements rrh0 {
        public final yqh0 b;

        public e(yqh0 yqh0Var) {
            this.b = yqh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetPreSuggesterCatalogSnapshot(snapshot=" + this.b + ')';
        }
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class f implements rrh0 {
        public final dsh0 b;

        public f(dsh0 dsh0Var) {
            this.b = dsh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetRequest(requestState=" + this.b + ')';
        }
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class g implements rrh0 {
        public static final g b = new g();
    }

    /* compiled from: SearchFeaturePatch.kt */
    public static final class h implements rrh0 {
        public final ksh0 b;

        public h(ksh0 ksh0Var) {
            this.b = ksh0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetSuggesterModeOn(preSuggesterState=" + this.b + ')';
        }
    }
}
