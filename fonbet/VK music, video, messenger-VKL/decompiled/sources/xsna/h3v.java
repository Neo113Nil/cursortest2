package xsna;

/* compiled from: HideAppContentRender.kt */
/* loaded from: classes15.dex */
public interface h3v extends fm50<j3v> {

    /* compiled from: HideAppContentRender.kt */
    public static final class a implements h3v {
        public final yzt0<Boolean> a;
        public final yzt0<Boolean> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + sr.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Data(isHidePushContentEnabled=");
            sb.append(this.a);
            sb.append(", isHideAppContentEnabled=");
            sb.append(this.b);
            sb.append(", needShowHideAppContentDlg=");
            return tr.c(sb, this.c, ')');
        }
    }

    /* compiled from: HideAppContentRender.kt */
    public static final class b implements h3v {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1909173022;
        }

        public final String toString() {
            return "Empty";
        }
    }
}
