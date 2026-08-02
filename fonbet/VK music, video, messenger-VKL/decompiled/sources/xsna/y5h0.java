package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: ScheduledCallAction.kt */
/* loaded from: classes7.dex */
public abstract class y5h0 implements r49 {

    /* compiled from: ScheduledCallAction.kt */
    public static final class a extends y5h0 {
        public final CallsUserId b;

        public a(CallsUserId callsUserId) {
            this.b = callsUserId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.b;
            if (callsUserId == null) {
                return 0;
            }
            return callsUserId.hashCode();
        }

        public final String toString() {
            return "ChangeCaller(currentUser=" + this.b + ')';
        }
    }

    /* compiled from: ScheduledCallAction.kt */
    public static final class b extends y5h0 {
        public final x5h0 b;
        public final boolean c;

        public b(x5h0 x5h0Var, boolean z) {
            this.b = x5h0Var;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MenuClick(call=");
            sb.append(this.b);
            sb.append(", showStartCall=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ScheduledCallAction.kt */
    public static abstract class c extends y5h0 {

        /* compiled from: ScheduledCallAction.kt */
        public static final class a extends c {
            public final x5h0 b;

            public a(x5h0 x5h0Var) {
                this.b = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "RemoveCall(call=" + this.b + ')';
            }
        }

        /* compiled from: ScheduledCallAction.kt */
        public static final class b extends c {
            public final x5h0 b;

            public b(x5h0 x5h0Var) {
                this.b = x5h0Var;
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
                return "RescheduleCall(call=" + this.b + ')';
            }
        }
    }

    /* compiled from: ScheduledCallAction.kt */
    public static abstract class d extends y5h0 {

        /* compiled from: ScheduledCallAction.kt */
        public static final class a extends d {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                ((a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "BeginCall(joinLink=null)";
            }
        }

        /* compiled from: ScheduledCallAction.kt */
        public static final class b extends d {
            public final x5h0 b;

            public b(x5h0 x5h0Var) {
                this.b = x5h0Var;
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
                return "ConfirmRemove(call=" + this.b + ')';
            }
        }

        /* compiled from: ScheduledCallAction.kt */
        public static final class c extends d {
            public final x5h0 b;

            public c(x5h0 x5h0Var) {
                this.b = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "CopyInvite(call=" + this.b + ')';
            }
        }

        /* compiled from: ScheduledCallAction.kt */
        /* renamed from: xsna.y5h0$d$d, reason: collision with other inner class name */
        public static final class C4077d extends d {
            public final x5h0 b;

            public C4077d(x5h0 x5h0Var) {
                this.b = x5h0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C4077d) && epx.f(this.b, ((C4077d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "EditCall(call=" + this.b + ')';
            }
        }
    }

    /* compiled from: ScheduledCallAction.kt */
    public static final class e extends y5h0 {
        public final CallsUserId b;

        public e(CallsUserId.VkUserId vkUserId) {
            this.b = vkUserId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.b;
            if (callsUserId == null) {
                return 0;
            }
            return callsUserId.hashCode();
        }

        public final String toString() {
            return "ReloadForUser(userId=" + this.b + ')';
        }
    }

    /* compiled from: ScheduledCallAction.kt */
    public static final class f extends y5h0 {
    }

    /* compiled from: ScheduledCallAction.kt */
    public static final class g extends y5h0 {
        public static final g b = new g();
    }
}
