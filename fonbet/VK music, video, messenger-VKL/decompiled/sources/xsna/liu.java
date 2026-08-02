package xsna;

import com.vk.voip.dto.call_member.CallMemberId;

/* compiled from: GroupCallPinState.kt */
/* loaded from: classes7.dex */
public final class liu {
    public final com.vk.voip.ui.c a;
    public final io.reactivex.rxjava3.subjects.d<a> b = io.reactivex.rxjava3.subjects.d.O0(new a(null, null, null, null));
    public CallMemberId c;
    public CallMemberId d;
    public CallMemberId e;
    public CallMemberId f;

    /* compiled from: GroupCallPinState.kt */
    public static final class a {
        public final CallMemberId a;
        public final CallMemberId b;
        public final CallMemberId c;
        public final CallMemberId d;

        public a() {
            this(null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            CallMemberId callMemberId = this.a;
            int hashCode = (callMemberId == null ? 0 : callMemberId.hashCode()) * 31;
            CallMemberId callMemberId2 = this.b;
            int hashCode2 = (hashCode + (callMemberId2 == null ? 0 : callMemberId2.hashCode())) * 31;
            CallMemberId callMemberId3 = this.c;
            int hashCode3 = (hashCode2 + (callMemberId3 == null ? 0 : callMemberId3.hashCode())) * 31;
            CallMemberId callMemberId4 = this.d;
            return hashCode3 + (callMemberId4 != null ? callMemberId4.hashCode() : 0);
        }

        public final String toString() {
            return "State(pinnedUserChoice=" + this.a + ", pinnedSystemChoice=" + this.b + ", pinnedAdminChoice=" + this.c + ", pinnedParticipantId=" + this.d + ')';
        }

        public a(CallMemberId callMemberId, CallMemberId callMemberId2, CallMemberId callMemberId3, CallMemberId callMemberId4) {
            this.a = callMemberId;
            this.b = callMemberId2;
            this.c = callMemberId3;
            this.d = callMemberId4;
        }
    }

    public liu(com.vk.voip.ui.c cVar) {
        this.a = cVar;
    }

    public final void a() {
        this.b.onNext(new a(this.c, this.d, this.e, this.f));
    }
}
