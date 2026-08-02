package xsna;

/* compiled from: ClipsLinksEditPatch.kt */
/* loaded from: classes16.dex */
public interface gke extends xl50 {

    /* compiled from: ClipsLinksEditPatch.kt */
    public static final class a implements gke {
        public final String b;

        public a(String str) {
            this.b = str;
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
            return ho8.a(new StringBuilder("EditLink(link="), this.b, ')');
        }
    }

    /* compiled from: ClipsLinksEditPatch.kt */
    public static final class b implements gke {
        public final String b;

        public b(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("EditName(name="), this.b, ')');
        }
    }

    /* compiled from: ClipsLinksEditPatch.kt */
    public static final class c implements gke {
        public final String b;
        public final String c;
        public final String d;

        public c(String str, String str2, String str3) {
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SetInitial(link=");
            sb.append(this.b);
            sb.append(", name=");
            sb.append(this.c);
            sb.append(", fragmentResultKey=");
            return ho8.a(sb, this.d, ')');
        }
    }
}
