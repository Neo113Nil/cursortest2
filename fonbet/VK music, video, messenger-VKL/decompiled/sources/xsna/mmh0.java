package xsna;

import java.util.List;

/* compiled from: SearchAddressRender.kt */
/* loaded from: classes18.dex */
public interface mmh0 extends fm50<omh0> {

    /* compiled from: SearchAddressRender.kt */
    public static final class a implements mmh0 {
        public static final a a = new a();
    }

    /* compiled from: SearchAddressRender.kt */
    public static final class b implements mmh0 {
        public final yzt0<cmh0> a;

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
            return tr.c(new StringBuilder("ErrorPlaceholder(errorViewState="), this.a, ')');
        }
    }

    /* compiled from: SearchAddressRender.kt */
    public static final class c implements mmh0 {
        public final yzt0<Boolean> a;

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
            return tr.c(new StringBuilder("Loading(isInProgress="), this.a, ')');
        }
    }

    /* compiled from: SearchAddressRender.kt */
    public static final class d implements mmh0 {
        public final yzt0<rsh0> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("SearchField(searchFieldState="), this.a, ')');
        }
    }

    /* compiled from: SearchAddressRender.kt */
    public static final class e implements mmh0 {
        public final yzt0<List<g6n0>> a;

        public e(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tr.c(new StringBuilder("Suggestions(items="), this.a, ')');
        }
    }
}
