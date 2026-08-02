package xsna;

/* compiled from: ClipsPublishCellConfig.kt */
/* loaded from: classes17.dex */
public interface zoa {

    /* compiled from: ClipsPublishCellConfig.kt */
    public static final class a implements zoa {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Custom(id="), this.a, ')');
        }
    }
}
