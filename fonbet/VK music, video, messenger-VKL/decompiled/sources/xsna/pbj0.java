package xsna;

/* compiled from: SharingExternalMsgConfig.kt */
/* loaded from: classes11.dex */
public final class pbj0 {
    public static final a f = new a();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final b e;

    /* compiled from: SharingExternalMsgConfig.kt */
    public static final class a {
    }

    /* compiled from: SharingExternalMsgConfig.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public b() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InstallTrackingUrls(fromPost=");
            sb.append(this.a);
            sb.append(", fromClip=");
            sb.append(this.b);
            sb.append(", fromChannel=");
            sb.append(this.c);
            sb.append(", fromStories=");
            return ho8.a(sb, this.d, ')');
        }

        public /* synthetic */ b(int i) {
            this("", "", "", "");
        }

        public b(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    public pbj0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pbj0)) {
            return false;
        }
        pbj0 pbj0Var = (pbj0) obj;
        return this.a == pbj0Var.a && this.b == pbj0Var.b && this.c == pbj0Var.c && this.d == pbj0Var.d && epx.f(this.e, pbj0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "SharingExternalMsgConfig(post=" + this.a + ", clip=" + this.b + ", channel=" + this.c + ", stories=" + this.d + ", trackingUrls=" + this.e + ')';
    }

    public pbj0(boolean z, boolean z2, boolean z3, boolean z4, b bVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = bVar;
    }

    public /* synthetic */ pbj0(int i) {
        this(false, false, false, false, new b(0));
    }
}
