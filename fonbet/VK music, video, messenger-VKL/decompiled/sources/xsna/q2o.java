package xsna;

/* compiled from: ChannelApiModel.kt */
/* loaded from: classes2.dex */
public final class q2o {
    public final boolean a;
    public final boolean b;
    public final a c;

    /* compiled from: ChannelApiModel.kt */
    public static final class a {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Config(reactionCost="), this.a, ')');
        }
    }

    public q2o(boolean z, boolean z2, a aVar) {
        this.a = z;
        this.b = z2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2o)) {
            return false;
        }
        q2o q2oVar = (q2o) obj;
        return this.a == q2oVar.a && this.b == q2oVar.b && epx.f(this.c, q2oVar.c);
    }

    public final int hashCode() {
        int b = qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        a aVar = this.c;
        return b + (aVar == null ? 0 : Integer.hashCode(aVar.a));
    }

    public final String toString() {
        return "DonutSettings(isOneTimePaymentsEnabled=" + this.a + ", paidReactionsEnabled=" + this.b + ", paidReactionsConfig=" + this.c + ')';
    }
}
