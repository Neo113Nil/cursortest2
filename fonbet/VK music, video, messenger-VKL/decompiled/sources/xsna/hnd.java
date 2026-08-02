package xsna;

/* compiled from: ClipsCoauthorsSnackbarConfig.kt */
/* loaded from: classes16.dex */
public interface hnd {

    /* compiled from: ClipsCoauthorsSnackbarConfig.kt */
    public static final class a implements hnd {
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
            return vu5.b(new StringBuilder("CoauthorClipDeleted(count="), this.a, ')');
        }
    }

    /* compiled from: ClipsCoauthorsSnackbarConfig.kt */
    public static final class b implements hnd {
        public final boolean a;
        public final int b;
        public final int c;

        public b(boolean z, int i, int i2) {
            this.a = z;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, Boolean.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CoauthorRequestProceeded(isAcceptRequest=");
            sb.append(this.a);
            sb.append(", count=");
            sb.append(this.b);
            sb.append(", totalCount=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ClipsCoauthorsSnackbarConfig.kt */
    public static final class c implements hnd {
        public static final c a = new c();
    }

    /* compiled from: ClipsCoauthorsSnackbarConfig.kt */
    public static final class d implements hnd {
        public final uh3 a;

        public d(uh3 uh3Var) {
            this.a = uh3Var;
        }
    }

    /* compiled from: ClipsCoauthorsSnackbarConfig.kt */
    public static final class e implements hnd {
        public final un9 a;

        public e(un9 un9Var) {
            this.a = un9Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PublishClosedGroup(openGroupCallback=" + this.a + ')';
        }
    }

    /* compiled from: ClipsCoauthorsSnackbarConfig.kt */
    public static final class f implements hnd {
        public final defpackage.f0 a;

        public f(defpackage.f0 f0Var) {
            this.a = f0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.a.equals(((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PublishClosedProfile(openProfileCallback=" + this.a + ')';
        }
    }
}
