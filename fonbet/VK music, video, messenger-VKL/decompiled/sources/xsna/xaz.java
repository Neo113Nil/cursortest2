package xsna;

/* compiled from: LinkState.kt */
/* loaded from: classes7.dex */
public abstract class xaz {

    /* compiled from: LinkState.kt */
    public static final class a extends xaz {
        public final Throwable a;
        public final String b;

        public a(Throwable th, String str) {
            this.a = th;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(error=");
            sb.append(this.a);
            sb.append(", requestCode=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: LinkState.kt */
    public static final class b extends xaz {
        public static final b a = new b();
    }

    /* compiled from: LinkState.kt */
    public static final class c extends xaz {
        public final boolean a;

        public c(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("None(isJustInited="), this.a, ')');
        }
    }

    /* compiled from: LinkState.kt */
    public static final class d extends xaz {
        public final String a;
        public final String b;

        public d(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(link=");
            sb.append(this.a);
            sb.append(", requestCode=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
