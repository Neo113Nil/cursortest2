package xsna;

/* compiled from: HideAppContentPatch.kt */
/* loaded from: classes15.dex */
public interface b3v extends xl50 {

    /* compiled from: HideAppContentPatch.kt */
    public static final class a implements b3v {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Boolean.hashCode(false);
        }

        public final String toString() {
            return "AppContentDialog(needShow=false)";
        }
    }

    /* compiled from: HideAppContentPatch.kt */
    public static final class b implements b3v {
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(false) + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(isHidePushInfoEnabled=");
            sb.append(this.b);
            sb.append(", isHideAppContentEnabled=");
            return n23.b(sb, this.c, ", needShowHideAppContentDlg=false)");
        }
    }

    /* compiled from: HideAppContentPatch.kt */
    public static final class c implements b3v {
        public final boolean b;
        public final boolean c;

        public c(boolean z, boolean z2) {
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.b == cVar.b && this.c == cVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TurnHideAppContent(isHideAppContentEnabled=");
            sb.append(this.b);
            sb.append(", needShowHideAppContentDlg=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: HideAppContentPatch.kt */
    public static final class d implements b3v {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("TurnHidePushContent(isEnabled="), this.b, ')');
        }
    }
}
