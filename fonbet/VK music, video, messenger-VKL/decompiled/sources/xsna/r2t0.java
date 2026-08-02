package xsna;

/* compiled from: VideoPickerPatch.kt */
/* loaded from: classes4.dex */
public interface r2t0 extends xl50 {

    /* compiled from: VideoPickerPatch.kt */
    public static abstract class a implements r2t0 {

        /* compiled from: VideoPickerPatch.kt */
        /* renamed from: xsna.r2t0$a$a, reason: collision with other inner class name */
        public static final class C3595a extends a {
            public final fwp b;

            public C3595a(fwp fwpVar) {
                this.b = fwpVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3595a) && epx.f(this.b, ((C3595a) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "Error(errorLoading=" + this.b + ')';
            }
        }

        /* compiled from: VideoPickerPatch.kt */
        public static final class b extends a {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1521440198;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: VideoPickerPatch.kt */
        public static final class c extends a {
            public final e3t0<p2t0> b;

            public c(e3t0<p2t0> e3t0Var) {
                this.b = e3t0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(videoList=" + this.b + ')';
            }
        }
    }

    /* compiled from: VideoPickerPatch.kt */
    public static final class b implements r2t0 {
        public final String b;
        public final boolean c;

        public b(String str, boolean z) {
            this.b = str;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MultiselectionChanged(videoId=");
            sb.append(this.b);
            sb.append(", isSelected=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
