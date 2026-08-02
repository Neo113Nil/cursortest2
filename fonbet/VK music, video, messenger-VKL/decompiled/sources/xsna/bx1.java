package xsna;

/* compiled from: AnalyticsConfig.kt */
/* loaded from: classes3.dex */
public interface bx1 {

    /* compiled from: AnalyticsConfig.kt */
    public static final class a implements bx1 {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public a() {
            this(7);
        }

        @Override // xsna.bx1
        public final boolean a() {
            return this.b;
        }

        @Override // xsna.bx1
        public final boolean b() {
            return this.a;
        }

        @Override // xsna.bx1
        public final boolean c() {
            return this.c;
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
            StringBuilder sb = new StringBuilder("Default(trackPlaybackAnalytics=");
            sb.append(this.a);
            sb.append(", trackTechAnalytics=");
            sb.append(this.b);
            sb.append(", trackInputLagAnalytics=");
            return defpackage.q0.a(sb, this.c, ')');
        }

        public /* synthetic */ a(int i) {
            this(false, (i & 4) == 0);
        }

        public a(boolean z, boolean z2) {
            this.a = z;
            this.b = true;
            this.c = z2;
        }
    }

    boolean a();

    boolean b();

    boolean c();
}
