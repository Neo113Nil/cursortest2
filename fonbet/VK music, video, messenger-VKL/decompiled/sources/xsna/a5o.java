package xsna;

/* compiled from: DonutVideoActionHandlerParams.kt */
/* loaded from: classes18.dex */
public final class a5o {
    public final boolean a;
    public final a b;

    /* compiled from: DonutVideoActionHandlerParams.kt */
    public static final class a {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }

        public final String b() {
            return this.a;
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
            StringBuilder sb = new StringBuilder("DonutVideoAnalyticsParams(screenSource=");
            sb.append(this.a);
            sb.append(", clickSource=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public a5o() {
        this((a) null, 3);
    }

    public final a a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5o)) {
            return false;
        }
        a5o a5oVar = (a5o) obj;
        return this.a == a5oVar.a && epx.f(this.b, a5oVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "DonutVideoActionHandlerParams(forceDarkTheme=" + this.a + ", analyticsParams=" + this.b + ')';
    }

    public /* synthetic */ a5o(a aVar, int i) {
        this(false, (i & 2) != 0 ? null : aVar);
    }

    public a5o(boolean z, a aVar) {
        this.a = z;
        this.b = aVar;
    }
}
