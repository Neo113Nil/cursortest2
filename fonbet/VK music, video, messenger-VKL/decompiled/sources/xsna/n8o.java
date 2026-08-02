package xsna;

/* compiled from: DownloadEvent.kt */
/* loaded from: classes17.dex */
public abstract class n8o {
    public final String a;

    /* compiled from: DownloadEvent.kt */
    public static final class a extends n8o {
        public final String b;
        public final Exception c;

        public a(String str, Exception exc) {
            super(str);
            this.b = str;
            this.c = exc;
        }

        @Override // xsna.n8o
        public final String a() {
            return this.b;
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
            Exception exc = this.c;
            return hashCode + (exc == null ? 0 : exc.hashCode());
        }

        public final String toString() {
            return "Error(url=" + this.b + ", exception=" + this.c + ')';
        }
    }

    /* compiled from: DownloadEvent.kt */
    public static final class b extends n8o {
        public final String b;
        public final String c;

        public b(String str, String str2) {
            super(str);
            this.b = str;
            this.c = str2;
        }

        @Override // xsna.n8o
        public final String a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(url=");
            sb.append(this.b);
            sb.append(", filePath=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public n8o(String str) {
        this.a = str;
    }

    public String a() {
        return this.a;
    }
}
