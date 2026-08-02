package xsna;

/* compiled from: ClipsWrapperDownloadState.kt */
/* loaded from: classes17.dex */
public interface ypf {

    /* compiled from: ClipsWrapperDownloadState.kt */
    public static final class a implements ypf {
        public final zqc a;

        public a(zqc zqcVar) {
            this.a = zqcVar;
        }

        @Override // xsna.ypf
        public final zqc a() {
            return this.a;
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
            return "Finished(event=" + this.a + ')';
        }
    }

    /* compiled from: ClipsWrapperDownloadState.kt */
    public static final class b implements ypf {
        public final zqc a;
        public final float b;

        public b(zqc zqcVar, float f) {
            this.a = zqcVar;
            this.b = f;
        }

        @Override // xsna.ypf
        public final zqc a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && Float.compare(this.b, bVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InProgress(event=");
            sb.append(this.a);
            sb.append(", progress=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: ClipsWrapperDownloadState.kt */
    public static final class c implements ypf {
        public static final c a = new c();

        @Override // xsna.ypf
        public final zqc a() {
            return null;
        }
    }

    /* compiled from: ClipsWrapperDownloadState.kt */
    public static final class d implements ypf {
        public final zqc a;

        public d(zqc zqcVar) {
            this.a = zqcVar;
        }

        @Override // xsna.ypf
        public final zqc a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Started(event=" + this.a + ')';
        }
    }

    zqc a();
}
