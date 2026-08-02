package xsna;

/* compiled from: WaitingRoomEvent.kt */
/* loaded from: classes7.dex */
public abstract class c8x0 {

    /* compiled from: WaitingRoomEvent.kt */
    public static final class a extends c8x0 {
        public static final a a = new a();
    }

    /* compiled from: WaitingRoomEvent.kt */
    public static final class b extends c8x0 {
        public static final b a = new b();
    }

    /* compiled from: WaitingRoomEvent.kt */
    public static final class c extends c8x0 {
        public final k8x0 a;

        public c(k8x0 k8x0Var) {
            this.a = k8x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnWaitingParticipantsUpdated(data=" + this.a + ')';
        }
    }

    /* compiled from: WaitingRoomEvent.kt */
    public static final class d extends c8x0 {
        public final boolean a;

        public d(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("OnWaitingRoomEnabledChanged(isEnabled="), this.a, ')');
        }
    }

    /* compiled from: WaitingRoomEvent.kt */
    public static final class e extends c8x0 {
        public static final e a = new e();
    }

    /* compiled from: WaitingRoomEvent.kt */
    public static final class f extends c8x0 {
        public final String a;
        public final int b;

        public f() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && this.b == fVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateWaitingRoomInfo(firstUserName=");
            sb.append(this.a);
            sb.append(", totalAmount=");
            return vu5.b(sb, this.b, ')');
        }

        public f(String str, int i) {
            this.a = str;
            this.b = i;
        }

        public /* synthetic */ f(int i) {
            this("", 0);
        }
    }
}
