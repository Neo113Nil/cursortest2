package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: ScheduledCallDialogEvent.kt */
/* loaded from: classes7.dex */
public abstract class b6h0 implements u49 {

    /* compiled from: ScheduledCallDialogEvent.kt */
    public static final class a extends b6h0 {
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
            return "ShowCallsFrom(selectedUser=" + this.a + ')';
        }
    }

    /* compiled from: ScheduledCallDialogEvent.kt */
    public static final class b extends b6h0 {
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
            return "ShowDeleteConfirm(call=" + this.a + ')';
        }
    }

    /* compiled from: ScheduledCallDialogEvent.kt */
    public static final class c extends b6h0 {
        public final x5h0 a;
        public final boolean b;

        public c(x5h0 x5h0Var, boolean z) {
            this.a = x5h0Var;
            this.b = z;
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
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowMenu(call=");
            sb.append(this.a);
            sb.append(", showBeginItem=");
            return defpackage.q0.a(sb, this.b, ')');
        }
    }
}
