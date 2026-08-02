package xsna;

/* compiled from: AsrRecordFeatureState.kt */
/* loaded from: classes7.dex */
public interface yv3 {

    /* compiled from: AsrRecordFeatureState.kt */
    public static final class a implements yv3 {
        public static final a a = new a();
    }

    /* compiled from: AsrRecordFeatureState.kt */
    public interface b extends yv3 {

        /* compiled from: AsrRecordFeatureState.kt */
        public static final class a implements b {
            public final boolean a;
            public final boolean b;

            public a(boolean z, boolean z2) {
                this.a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Loading(isMeInitiator=");
                sb.append(this.a);
                sb.append(", canStopAsr=");
                return defpackage.q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: AsrRecordFeatureState.kt */
        /* renamed from: xsna.yv3$b$b, reason: collision with other inner class name */
        public static final class C4138b implements b {
            public final sew0 a;
            public final String b;
            public final boolean c;
            public final boolean d;

            public C4138b(sew0 sew0Var, String str, boolean z, boolean z2) {
                this.a = sew0Var;
                this.b = str;
                this.c = z;
                this.d = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4138b)) {
                    return false;
                }
                C4138b c4138b = (C4138b) obj;
                return epx.f(this.a, c4138b.a) && epx.f(this.b, c4138b.b) && this.c == c4138b.c && this.d == c4138b.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Ready(initiatorAvatar=");
                sb.append(this.a);
                sb.append(", authorName=");
                sb.append(this.b);
                sb.append(", isMeInitiator=");
                sb.append(this.c);
                sb.append(", canStopAsr=");
                return defpackage.q0.a(sb, this.d, ')');
            }
        }

        /* compiled from: AsrRecordFeatureState.kt */
        public static final class c implements b {
            public static final c a = new c();
        }
    }

    /* compiled from: AsrRecordFeatureState.kt */
    public static abstract class c implements yv3 {
        public final hw3 a;

        /* compiled from: AsrRecordFeatureState.kt */
        public static final class a extends c {
            public final hw3 b;
            public final Throwable c;

            public a(hw3 hw3Var, Throwable th) {
                super(hw3Var);
                this.b = hw3Var;
                this.c = th;
            }

            @Override // xsna.yv3.c
            public final hw3 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Error(config=");
                sb.append(this.b);
                sb.append(", error=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: AsrRecordFeatureState.kt */
        public static final class b extends c {
            public final hw3 b;

            public b(hw3 hw3Var) {
                super(hw3Var);
                this.b = hw3Var;
            }

            @Override // xsna.yv3.c
            public final hw3 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Launching(config=" + this.b + ')';
            }
        }

        /* compiled from: AsrRecordFeatureState.kt */
        /* renamed from: xsna.yv3$c$c, reason: collision with other inner class name */
        public static final class C4139c extends c {
            public final hw3 b;

            public C4139c(hw3 hw3Var) {
                super(hw3Var);
                this.b = hw3Var;
            }

            @Override // xsna.yv3.c
            public final hw3 a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4139c) && epx.f(this.b, ((C4139c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Ready(config=" + this.b + ')';
            }
        }

        public c(hw3 hw3Var) {
            this.a = hw3Var;
        }

        public hw3 a() {
            return this.a;
        }
    }

    /* compiled from: AsrRecordFeatureState.kt */
    public static final class d implements yv3 {
        public final boolean a;
        public final boolean b;

        public d(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a == dVar.a && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Stopped(amIStarter=");
            sb.append(this.a);
            sb.append(", amIStopper=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
