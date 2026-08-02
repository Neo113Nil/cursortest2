package xsna;

/* compiled from: QualitySettingsItem.kt */
/* loaded from: classes2.dex */
public abstract class hpe0 {

    /* compiled from: QualitySettingsItem.kt */
    public static final class a extends hpe0 {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Category(title="), this.a, ')');
        }
    }

    /* compiled from: QualitySettingsItem.kt */
    public static final class b extends hpe0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1473171636;
        }

        public final String toString() {
            return "GoToSettings";
        }
    }

    /* compiled from: QualitySettingsItem.kt */
    public static final class c extends hpe0 {
        public final gpe0 a;

        public c(gpe0 gpe0Var) {
            this.a = gpe0Var;
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
            return "Item(settings=" + this.a + ')';
        }
    }
}
