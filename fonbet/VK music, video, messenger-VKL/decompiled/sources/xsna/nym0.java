package xsna;

/* compiled from: SubscriptionInfoState.kt */
/* loaded from: classes5.dex */
public final class nym0 {
    public final String a;
    public final int b;
    public final a c;

    /* compiled from: SubscriptionInfoState.kt */
    public static final class a {
        public final String a;
        public final int b;
        public final int c;

        public a(String str, int i, int i2) {
            this.a = str;
            this.b = i;
            this.c = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + shy.a(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubscriptionOnboardingState(userName=");
            sb.append(this.a);
            sb.append(", bottomSheetTitleRes=");
            sb.append(this.b);
            sb.append(", bottomSheetSubtitleRes=");
            return vu5.b(sb, this.c, ')');
        }
    }

    public nym0(String str, int i, a aVar) {
        this.a = str;
        this.b = i;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nym0)) {
            return false;
        }
        nym0 nym0Var = (nym0) obj;
        return epx.f(this.a, nym0Var.a) && this.b == nym0Var.b && epx.f(this.c, nym0Var.c);
    }

    public final int hashCode() {
        int a2 = shy.a(this.b, this.a.hashCode() * 31, 31);
        a aVar = this.c;
        return a2 + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "SubscriptionInfoState(userName=" + this.a + ", textResId=" + this.b + ", onboardingState=" + this.c + ')';
    }
}
