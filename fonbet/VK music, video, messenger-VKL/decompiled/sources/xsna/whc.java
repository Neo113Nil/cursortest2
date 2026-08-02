package xsna;

/* compiled from: ClearCacheReason.kt */
/* loaded from: classes2.dex */
public abstract class whc implements plp {
    public final String a;
    public final Throwable b;

    /* compiled from: ClearCacheReason.kt */
    public static final class a extends whc {
        public final String c;
        public final Throwable d;

        public a(String str, Throwable th) {
            super(str, th);
            this.c = str;
            this.d = th;
        }

        @Override // xsna.whc
        public final Throwable a() {
            return this.d;
        }

        @Override // xsna.whc
        public final String b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            Throwable th = this.d;
            return hashCode + (th == null ? 0 : th.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("EngineFailed(type=");
            sb.append(this.c);
            sb.append(", throwable=");
            return oq.c(sb, this.d, ')');
        }
    }

    /* compiled from: ClearCacheReason.kt */
    public static final class b extends whc {
        public static final b c = new b("LPSyncError", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1197073619;
        }

        public final String toString() {
            return "LPSyncError";
        }
    }

    /* compiled from: ClearCacheReason.kt */
    public static final class c extends whc {
        public static final c c = new c("User", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1294776991;
        }

        public final String toString() {
            return "User";
        }
    }

    public whc(String str, Throwable th) {
        this.a = str;
        this.b = th;
    }

    public Throwable a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }
}
