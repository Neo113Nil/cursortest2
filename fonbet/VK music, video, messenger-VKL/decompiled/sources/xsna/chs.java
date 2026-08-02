package xsna;

/* compiled from: FrescoImageState.kt */
/* loaded from: classes17.dex */
public interface chs {

    /* compiled from: FrescoImageState.kt */
    public static final class a implements chs {
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
            return ho8.a(new StringBuilder("Cancel(id="), this.a, ')');
        }
    }

    /* compiled from: FrescoImageState.kt */
    public static final class b implements chs {
        public final String a;
        public final Throwable b;

        public b(String str, Throwable th) {
            this.a = str;
            this.b = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Throwable th = this.b;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(id=");
            sb.append(this.a);
            sb.append(", throwable=");
            return oq.c(sb, this.b, ')');
        }
    }

    /* compiled from: FrescoImageState.kt */
    public static final class c implements chs {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Loading(id="), this.a, ')');
        }
    }

    /* compiled from: FrescoImageState.kt */
    public static final class d implements chs {
        public static final d a = new d();
    }

    /* compiled from: FrescoImageState.kt */
    public static final class e implements chs {
        public final String a;
        public final int b;
        public final int c;

        public e(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && this.b == eVar.b && this.c == eVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(id=");
            sb.append(this.a);
            sb.append(", width=");
            sb.append(this.b);
            sb.append(", height=");
            return vu5.b(sb, this.c, ')');
        }
    }
}
