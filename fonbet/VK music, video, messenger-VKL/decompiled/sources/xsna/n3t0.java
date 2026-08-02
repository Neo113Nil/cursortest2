package xsna;

/* compiled from: VideoPipModeEvent.kt */
/* loaded from: classes2.dex */
public interface n3t0 {

    /* compiled from: VideoPipModeEvent.kt */
    public static final class a implements n3t0 {
        public static final a a = new a();
    }

    /* compiled from: VideoPipModeEvent.kt */
    public static final class b implements n3t0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(true) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return i5s.a(new StringBuilder("ClosedByUser(initiatorId="), this.a, ", closedByUser=true)");
        }
    }

    /* compiled from: VideoPipModeEvent.kt */
    public static final class c implements n3t0 {
        public final String a;
        public final boolean b;

        public c(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final boolean a() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            String str = this.a;
            return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnPipModeChangedModeEvent(initiatorId=");
            sb.append(this.a);
            sb.append(", isInPipMode=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
