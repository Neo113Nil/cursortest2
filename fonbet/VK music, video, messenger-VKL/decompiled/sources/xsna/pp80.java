package xsna;

/* compiled from: PostSettingsAdapterItem.kt */
/* loaded from: classes16.dex */
public abstract class pp80 {

    /* compiled from: PostSettingsAdapterItem.kt */
    public static final class a extends pp80 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 313600887;
        }

        public final String toString() {
            return "Always";
        }
    }

    /* compiled from: PostSettingsAdapterItem.kt */
    public static final class b extends pp80 {
        public final int a;

        public b(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Days(daysCount="), this.a, ')');
        }
    }
}
