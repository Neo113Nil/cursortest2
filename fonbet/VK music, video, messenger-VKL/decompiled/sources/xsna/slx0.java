package xsna;

/* compiled from: WhiteboardPatch.kt */
/* loaded from: classes7.dex */
public interface slx0 extends xl50 {

    /* compiled from: WhiteboardPatch.kt */
    public static final class a implements slx0 {
        public final jlx0 b;

        public a(jlx0 jlx0Var) {
            this.b = jlx0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ApplyActions(actions=" + this.b + ')';
        }
    }

    /* compiled from: WhiteboardPatch.kt */
    public static final class b implements slx0 {
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
            return defpackage.q0.a(new StringBuilder("ApplyExpand(isMenuExpanded="), this.b, ')');
        }
    }

    /* compiled from: WhiteboardPatch.kt */
    public static final class c implements slx0 {
        public final boolean b;

        public c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ApplyWhiteboardMenuOpen(isOpened="), this.b, ')');
        }
    }

    /* compiled from: WhiteboardPatch.kt */
    public static final class d implements slx0 {
        public final String b;

        public d(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("ShowWhiteboardByHash(whiteboardHash="), this.b, ')');
        }
    }

    /* compiled from: WhiteboardPatch.kt */
    public static final class e implements slx0 {
        public final String b;

        public e(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("ShowWhiteboardByLink(whiteboardLink="), this.b, ')');
        }
    }
}
