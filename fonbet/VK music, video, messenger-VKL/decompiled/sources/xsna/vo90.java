package xsna;

/* compiled from: PastCallDetailsDialogPatch.kt */
/* loaded from: classes7.dex */
public abstract class vo90 implements b59 {

    /* compiled from: PastCallDetailsDialogPatch.kt */
    public static final class a extends vo90 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -899598545;
        }

        public final String toString() {
            return "Hide";
        }
    }

    /* compiled from: PastCallDetailsDialogPatch.kt */
    public static final class b extends vo90 {
        public final a59 b;
        public final boolean c;

        public b(a59 a59Var, boolean z) {
            this.b = a59Var;
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
            StringBuilder sb = new StringBuilder("Show(call=");
            sb.append(this.b);
            sb.append(", isFromMore=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
