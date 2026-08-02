package xsna;

/* compiled from: SettingsItem.kt */
/* loaded from: classes8.dex */
public abstract class p2j0 {

    /* compiled from: SettingsItem.kt */
    public static final class a extends p2j0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 2062768113;
        }

        public final String toString() {
            return "AudioTracks";
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class b extends p2j0 {
        public final l9p0 a;

        public b(l9p0 l9p0Var) {
            this.a = l9p0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            l9p0 l9p0Var = this.a;
            if (l9p0Var == null) {
                return 0;
            }
            return l9p0Var.hashCode();
        }

        public final String toString() {
            return "ExtendVideoTracks(topVideoDialogModel=" + this.a + ")";
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class c extends p2j0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OneLineCustomSettingsItem(title=null, icon=null, enabled=false, onClick=null)";
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class d extends p2j0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2071851551;
        }

        public final String toString() {
            return "PlaybackSpeed";
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class e extends p2j0 {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -841385534;
        }

        public final String toString() {
            return "TextTracks";
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class f extends p2j0 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1439732086;
        }

        public final String toString() {
            return "TrafficSaving";
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class g extends p2j0 {
        public final String a;
        public final String b;
        public final Integer c;
        public final boolean d;
        public final gzs<s3q0> e;

        public g() {
            throw null;
        }

        public g(String str, String str2, Integer num, gzs gzsVar) {
            this.a = str;
            this.b = str2;
            this.c = num;
            this.d = true;
            this.e = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return epx.f(this.a, gVar.a) && epx.f(this.b, gVar.b) && epx.f(this.c, gVar.c) && this.d == gVar.d && epx.f(this.e, gVar.e);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            Integer num = this.c;
            return this.e.hashCode() + qoy.b((a + (num == null ? 0 : num.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder a = xe9.a("TwoLineCustomSettingsItem(title=", this.a, ", value=", this.b, ", icon=");
            a.append(this.c);
            a.append(", enabled=");
            a.append(this.d);
            a.append(", onClick=");
            a.append(this.e);
            a.append(")");
            return a.toString();
        }
    }

    /* compiled from: SettingsItem.kt */
    public static final class h extends p2j0 {
        public static final h a = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1631584042;
        }

        public final String toString() {
            return "VideoTracks";
        }
    }
}
