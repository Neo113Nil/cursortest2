package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.voip.userid.CallsUserId;
import java.util.List;

/* compiled from: ScheduledCallsState.kt */
/* loaded from: classes7.dex */
public abstract class r7h0 implements km50 {

    /* compiled from: ScheduledCallsState.kt */
    public static final class a extends r7h0 {
        public final CallsUserId b;
        public final List<GroupsGroupFullDto> c;
        public final w6h0 d;
        public final a990<String> e;

        public a(CallsUserId callsUserId, List<GroupsGroupFullDto> list, w6h0 w6h0Var, a990<String> a990Var) {
            this.b = callsUserId;
            this.c = list;
            this.d = w6h0Var;
            this.e = a990Var;
        }

        public static a a(a aVar, CallsUserId callsUserId, w6h0 w6h0Var, a990 a990Var, int i) {
            if ((i & 1) != 0) {
                callsUserId = aVar.b;
            }
            List<GroupsGroupFullDto> list = aVar.c;
            if ((i & 4) != 0) {
                w6h0Var = aVar.d;
            }
            if ((i & 8) != 0) {
                a990Var = aVar.e;
            }
            aVar.getClass();
            return new a(callsUserId, list, w6h0Var, a990Var);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.b;
            return this.e.hashCode() + fw3.a(fw3.a((callsUserId == null ? 0 : callsUserId.hashCode()) * 31, 31, this.c), 31, this.d.a);
        }

        public final String toString() {
            return "Content(selectedUser=" + this.b + ", managedGroups=" + this.c + ", scheduledCalls=" + this.d + ", page=" + this.e + ')';
        }
    }

    /* compiled from: ScheduledCallsState.kt */
    public static final class b extends r7h0 {
        public final Throwable b;

        public b(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: ScheduledCallsState.kt */
    public static final class c extends r7h0 {
        public static final c b = new c();
    }

    /* compiled from: ScheduledCallsState.kt */
    public static abstract class d extends r7h0 {

        /* compiled from: ScheduledCallsState.kt */
        public static final class a extends d {
            public static final a b = new a();
        }
    }
}
