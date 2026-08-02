package xsna;

/* compiled from: AdsItemPositionPointsState.kt */
/* loaded from: classes17.dex */
public final class hz0 {
    public final a a;

    /* compiled from: AdsItemPositionPointsState.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ActionButtonPointsState(showTsReached=");
            sb.append(this.a);
            sb.append(", hideTsReached=");
            sb.append(this.b);
            sb.append(", activationTsReached=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public hz0(a aVar) {
        this.a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hz0) && epx.f(this.a, ((hz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AdsItemPositionPointsState(actionButtonPointsState=" + this.a + ')';
    }
}
