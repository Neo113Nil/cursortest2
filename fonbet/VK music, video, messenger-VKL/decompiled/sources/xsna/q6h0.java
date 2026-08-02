package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: ScheduledCallViewEvent.kt */
/* loaded from: classes7.dex */
public abstract class q6h0 implements j59 {

    /* compiled from: ScheduledCallViewEvent.kt */
    public static final class a extends q6h0 {
        public final CallsUserId a;

        public a(CallsUserId callsUserId) {
            this.a = callsUserId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.a;
            if (callsUserId == null) {
                return 0;
            }
            return callsUserId.hashCode();
        }

        public final String toString() {
            return "ChangeCaller(currentUser=" + this.a + ')';
        }
    }

    /* compiled from: ScheduledCallViewEvent.kt */
    public static final class b extends q6h0 {
        public final x5h0 a;
        public final boolean b;

        public b(x5h0 x5h0Var, boolean z) {
            this.a = x5h0Var;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MenuClick(call=");
            sb.append(this.a);
            sb.append(", showStartCall=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ScheduledCallViewEvent.kt */
    public static abstract class c extends q6h0 {

        /* compiled from: ScheduledCallViewEvent.kt */
        public static final class a extends c {
            public final x5h0 a;

            public a(x5h0 x5h0Var) {
                this.a = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "RemoveCall(call=" + this.a + ')';
            }
        }

        /* compiled from: ScheduledCallViewEvent.kt */
        public static final class b extends c {
            public final x5h0 a;

            public b(x5h0 x5h0Var) {
                this.a = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "RescheduleCall(call=" + this.a + ')';
            }
        }
    }

    /* compiled from: ScheduledCallViewEvent.kt */
    public static abstract class d extends q6h0 {

        /* compiled from: ScheduledCallViewEvent.kt */
        public static final class a extends d {
        }

        /* compiled from: ScheduledCallViewEvent.kt */
        public static final class b extends d {
            public final x5h0 a;

            public b(x5h0 x5h0Var) {
                this.a = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "ConfirmRemove(call=" + this.a + ')';
            }
        }

        /* compiled from: ScheduledCallViewEvent.kt */
        public static final class c extends d {
            public final x5h0 a;

            public c(x5h0 x5h0Var) {
                this.a = x5h0Var;
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
                return "CopyInvite(call=" + this.a + ')';
            }
        }

        /* compiled from: ScheduledCallViewEvent.kt */
        /* renamed from: xsna.q6h0$d$d, reason: collision with other inner class name */
        public static final class C3550d extends d {
            public final x5h0 a;

            public C3550d(x5h0 x5h0Var) {
                this.a = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3550d) && epx.f(this.a, ((C3550d) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "EditCall(call=" + this.a + ')';
            }
        }
    }
}
