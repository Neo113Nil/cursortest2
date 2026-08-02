package xsna;

/* compiled from: UserInfo.kt */
/* loaded from: classes16.dex */
public final class hkq0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final a d;

    /* compiled from: UserInfo.kt */
    public static final class a {
        public final y6c a;
        public final String b;

        public a(y6c y6cVar, String str) {
            this.a = y6cVar;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DonutChipViewState(text=");
            sb.append(this.a);
            sb.append(", contentDescription=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public hkq0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkq0)) {
            return false;
        }
        hkq0 hkq0Var = (hkq0) obj;
        return epx.f(this.a, hkq0Var.a) && epx.f(this.b, hkq0Var.b) && this.c == hkq0Var.c && epx.f(this.d, hkq0Var.d);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        a aVar = this.d;
        return b + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "UserInfo(title=" + this.a + ", userName=" + this.b + ", isVerified=" + this.c + ", donutChipViewState=" + this.d + ')';
    }

    public /* synthetic */ hkq0(int i) {
        this("", "", false, null);
    }

    public hkq0(String str, String str2, boolean z, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = aVar;
    }
}
