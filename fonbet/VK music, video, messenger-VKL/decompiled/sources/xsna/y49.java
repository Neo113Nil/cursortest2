package xsna;

import com.vk.voip.api.id.CallId;
import com.vk.voip.api.join.JoinData;
import com.vk.voip.userid.CallsUserId;
import java.util.List;

/* compiled from: CallListOngoingCall.kt */
/* loaded from: classes7.dex */
public final class y49 {
    public final CallId a;
    public final List<CallsUserId> b;
    public final int c;
    public final b.a d;

    /* compiled from: CallListOngoingCall.kt */
    public static abstract class a {

        /* compiled from: CallListOngoingCall.kt */
        /* renamed from: xsna.y49$a$a, reason: collision with other inner class name */
        public static final class C4073a extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4073a)) {
                    return false;
                }
                ((C4073a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "AsAnonym(joinData=null, anonymJoinData=null, name=null)";
            }
        }

        /* compiled from: CallListOngoingCall.kt */
        public static final class b extends a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                ((b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "AsGroup(joinData=null, groupId=null)";
            }
        }

        /* compiled from: CallListOngoingCall.kt */
        public static final class c extends a {
            public final JoinData a;

            public c(JoinData joinData) {
                this.a = joinData;
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
                return "AsUser(joinData=" + this.a + ')';
            }
        }
    }

    /* compiled from: CallListOngoingCall.kt */
    public static abstract class b {

        /* compiled from: CallListOngoingCall.kt */
        public static final class a extends b {
            public final a.c a;
            public final s49 b;
            public final List<CallsUserId> c;

            public a(a.c cVar, s49 s49Var, List list) {
                this.a = cVar;
                this.b = s49Var;
                this.c = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                aVar.getClass();
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                return fw3.a((this.b.hashCode() + (this.a.a.hashCode() * 961)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Group(name=null, joinInfo=");
                sb.append(this.a);
                sb.append(", vkJoinLink=null, chat=");
                sb.append(this.b);
                sb.append(", participantIds=");
                return vp.b(", scheduledCallInfo=null)", sb, this.c);
            }
        }

        /* compiled from: CallListOngoingCall.kt */
        /* renamed from: xsna.y49$b$b, reason: collision with other inner class name */
        public static final class C4074b extends b {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C4074b)) {
                    return false;
                }
                ((C4074b) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "PeerToPeer(participantId=null)";
            }
        }
    }

    public y49(CallId callId, List list, int i, b.a aVar) {
        this.a = callId;
        this.b = list;
        this.c = i;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y49)) {
            return false;
        }
        y49 y49Var = (y49) obj;
        return epx.f(this.a, y49Var.a) && epx.f(this.b, y49Var.b) && this.c == y49Var.c && this.d.equals(y49Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, fw3.a(this.a.b.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "CallListOngoingCall(callId=" + this.a + ", userIds=" + this.b + ", usersCount=" + this.c + ", metaInfo=" + this.d + ')';
    }
}
