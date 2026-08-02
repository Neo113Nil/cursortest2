package xsna;

/* compiled from: AsrRecordInProgressViewModel.kt */
/* loaded from: classes7.dex */
public interface cw3 {

    /* compiled from: AsrRecordInProgressViewModel.kt */
    public static final class a implements cw3 {
        public final sew0 a;
        public final String b;
        public final boolean c;
        public final boolean d;

        public a(sew0 sew0Var, String str, boolean z, boolean z2) {
            this.a = sew0Var;
            this.b = str;
            this.c = z;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + qoy.b(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Active(initiatorAvatar=");
            sb.append(this.a);
            sb.append(", authorName=");
            sb.append(this.b);
            sb.append(", isMeInitiator=");
            sb.append(this.c);
            sb.append(", canStopAsr=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: AsrRecordInProgressViewModel.kt */
    public static final class b implements cw3 {
        public static final b a = new b();
    }

    /* compiled from: AsrRecordInProgressViewModel.kt */
    public static final class c implements cw3 {
        public final boolean a;
        public final boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
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
}
