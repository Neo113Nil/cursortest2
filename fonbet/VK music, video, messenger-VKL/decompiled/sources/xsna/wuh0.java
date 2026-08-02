package xsna;

/* compiled from: SearchHistoryConfig.kt */
/* loaded from: classes3.dex */
public interface wuh0 {

    /* compiled from: SearchHistoryConfig.kt */
    public static final class a implements wuh0 {
        public final int a;

        public a() {
            this(0);
        }

        @Override // xsna.wuh0
        public final int a() {
            return this.a;
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
            return vu5.b(new StringBuilder("Default(maxCachedItemsCount="), this.a, ')');
        }

        public a(int i) {
            this.a = 10;
        }
    }

    int a();
}
