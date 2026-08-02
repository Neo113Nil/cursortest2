package xsna;

/* compiled from: PagingState.kt */
/* loaded from: classes7.dex */
public abstract class sf90 {
    public final String a;

    /* compiled from: PagingState.kt */
    public static final class a extends sf90 {
        public final Throwable b;
        public final String c;

        public a(Throwable th, String str) {
            super(str);
            this.b = th;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(throwable=");
            sb.append(this.b);
            sb.append(", nextBlockId1=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: PagingState.kt */
    public static final class b extends sf90 {
        public final String b;

        public b(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Idle(nextBlockId1="), this.b, ')');
        }
    }

    /* compiled from: PagingState.kt */
    public static final class c extends sf90 {
        public final String b;

        public c(String str) {
            super(str);
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            String str = this.b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Loading(nextBlockId1="), this.b, ')');
        }
    }

    public sf90(String str) {
        this.a = str;
    }
}
