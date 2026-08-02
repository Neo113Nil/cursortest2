package xsna;

/* compiled from: GamesCatalogDetailSideEffect.kt */
/* loaded from: classes17.dex */
public interface gbt {

    /* compiled from: GamesCatalogDetailSideEffect.kt */
    public static final class a implements gbt {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1765106900;
        }

        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: GamesCatalogDetailSideEffect.kt */
    public static final class b implements gbt {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("GameDeleted(success="), this.a, ')');
        }
    }

    /* compiled from: GamesCatalogDetailSideEffect.kt */
    public static final class c implements gbt {
        public final djc a;

        public c(djc djcVar) {
            this.a = djcVar;
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
            return "ItemClick(click=" + this.a + ')';
        }
    }
}
