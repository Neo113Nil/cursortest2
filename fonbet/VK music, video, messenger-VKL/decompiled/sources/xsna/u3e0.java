package xsna;

/* compiled from: PostingPendingProgressHolder.kt */
/* loaded from: classes4.dex */
public abstract class u3e0 {

    /* compiled from: PostingPendingProgressHolder.kt */
    public static final class a extends u3e0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -226498449;
        }

        public final String toString() {
            return "Done";
        }
    }

    /* compiled from: PostingPendingProgressHolder.kt */
    public static final class c extends u3e0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -226385361;
        }

        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: PostingPendingProgressHolder.kt */
    public static final class d extends u3e0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1723508433;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PostingPendingProgressHolder.kt */
    public static final class e extends u3e0 {
        public final int a;
        public final boolean b;

        public e(int i, boolean z) {
            this.a = i;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a == eVar.a && this.b == eVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Uploading(progress=");
            sb.append(this.a);
            sb.append(", showPercentage=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: PostingPendingProgressHolder.kt */
    public static final class b extends u3e0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("Error(showMessage="), this.a, ')');
        }

        public b() {
            this(true);
        }
    }
}
