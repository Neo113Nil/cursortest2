package xsna;

import com.vk.api.generated.calls.dto.CallsActiveCallDto;
import com.vk.api.generated.calls.dto.CallsHistoryRecordDto;
import com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto;
import com.vk.api.generated.messages.dto.MessagesCallHistoryItemDto;
import com.vk.api.generated.messages.dto.MessagesConversationPeerDto;
import com.vk.api.generated.messages.dto.MessagesConversationPeerTypeDto;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.voip.api.id.CallId;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.s49;

/* compiled from: CallListPastCall.kt */
/* loaded from: classes7.dex */
public abstract class a59 {

    /* compiled from: CallListPastCall.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("ActiveCall(okJoinLink="), this.a, ')');
        }
    }

    /* compiled from: CallListPastCall.kt */
    public static final class b {

        /* compiled from: CallListPastCall.kt */
        public static final /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[MessagesCallHistoryItemDto.ReachStatusDto.values().length];
                try {
                    iArr[MessagesCallHistoryItemDto.ReachStatusDto.REACHED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MessagesCallHistoryItemDto.ReachStatusDto.CANCELLED_BY_INITIATOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MessagesCallHistoryItemDto.ReachStatusDto.REJECTED_BY_RECEIVER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[CallsHistoryRecordDto.CallsHistoryRecordSingleDto.ReachStatusDto.values().length];
                try {
                    iArr2[CallsHistoryRecordDto.CallsHistoryRecordSingleDto.ReachStatusDto.REACHED.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[CallsHistoryRecordDto.CallsHistoryRecordSingleDto.ReachStatusDto.CANCELLED_BY_INITIATOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[CallsHistoryRecordDto.CallsHistoryRecordSingleDto.ReachStatusDto.REJECTED_BY_RECEIVER.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[CallsHistoryRecordSingleDto.ReachStatusDto.values().length];
                try {
                    iArr3[CallsHistoryRecordSingleDto.ReachStatusDto.REACHED.ordinal()] = 1;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr3[CallsHistoryRecordSingleDto.ReachStatusDto.CANCELLED_BY_INITIATOR.ordinal()] = 2;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr3[CallsHistoryRecordSingleDto.ReachStatusDto.REJECTED_BY_RECEIVER.ordinal()] = 3;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        public static Pair a(long j, long j2) {
            return j == 0 ? new Pair(0L, Long.valueOf(j2)) : new Pair(Long.valueOf(j2 - j), Long.valueOf(j));
        }

        public static d b(CallsHistoryRecordDto.CallsHistoryRecordSingleDto callsHistoryRecordSingleDto) {
            String d;
            MessagesConversationPeerDto j = callsHistoryRecordSingleDto.j();
            List<String> i = callsHistoryRecordSingleDto.i();
            ArrayList arrayList = new ArrayList(c5g.u(i, 10));
            for (String str : i) {
                Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                Long n = arm0.n(str);
                arrayList.add(n == null ? new CallsUserId.ContactId(str) : new CallsUserId.VkUserId(new UserId(n.longValue())));
            }
            if (j != null && j.f() != MessagesConversationPeerTypeDto.CHAT) {
                return new d.b((CallsUserId) arrayList.get(0));
            }
            s49 a2 = s49.a.a(callsHistoryRecordSingleDto.f(), j, callsHistoryRecordSingleDto.o(), callsHistoryRecordSingleDto.n());
            CallsActiveCallDto d2 = callsHistoryRecordSingleDto.d();
            return new d.a(a2, arrayList, (d2 == null || (d = d2.d()) == null) ? null : new a(d));
        }

        public static d c(CallsHistoryRecordSingleDto callsHistoryRecordSingleDto) {
            String d;
            MessagesConversationPeerDto j = callsHistoryRecordSingleDto.j();
            List<String> i = callsHistoryRecordSingleDto.i();
            ArrayList arrayList = new ArrayList(c5g.u(i, 10));
            for (String str : i) {
                Serializer.c<? extends Serializer.StreamParcelable> cVar = CallsUserId.CREATOR;
                Long n = arm0.n(str);
                arrayList.add(n == null ? new CallsUserId.ContactId(str) : new CallsUserId.VkUserId(new UserId(n.longValue())));
            }
            if (j != null && j.f() != MessagesConversationPeerTypeDto.CHAT) {
                return new d.b((CallsUserId) arrayList.get(0));
            }
            s49 a2 = s49.a.a(callsHistoryRecordSingleDto.f(), j, callsHistoryRecordSingleDto.o(), callsHistoryRecordSingleDto.n());
            CallsActiveCallDto d2 = callsHistoryRecordSingleDto.d();
            return new d.a(a2, arrayList, (d2 == null || (d = d2.d()) == null) ? null : new a(d));
        }

        public static f d(CallsHistoryRecordSingleDto callsHistoryRecordSingleDto) {
            CallsHistoryRecordSingleDto.ReachStatusDto k = callsHistoryRecordSingleDto.k();
            long j = 1000;
            long g = callsHistoryRecordSingleDto.g() * j;
            boolean u = callsHistoryRecordSingleDto.u();
            long p = callsHistoryRecordSingleDto.p() * j;
            d c = c(callsHistoryRecordSingleDto);
            Pair a2 = a(p, g);
            long longValue = ((Number) a2.d()).longValue();
            long longValue2 = ((Number) a2.g()).longValue();
            int i = a.$EnumSwitchMapping$2[k.ordinal()];
            if (i == 1) {
                return c instanceof d.b ? new f.c(u, longValue2, longValue) : new f.b(u, longValue2, longValue);
            }
            if (i == 2) {
                return u ? new f.e(g) : new f.a(g);
            }
            if (i == 3) {
                return new f.d(u, g);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: CallListPastCall.kt */
    public static final class c extends a59 {
        public final f a;
        public final d b;
        public final ArrayList c;

        public c(f fVar, d dVar, ArrayList arrayList) {
            this.a = fVar;
            this.b = dVar;
            this.c = arrayList;
        }

        @Override // xsna.a59
        public final d a() {
            return this.b;
        }

        @Override // xsna.a59
        public final f b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Merged(state=");
            sb.append(this.a);
            sb.append(", metaInfo=");
            sb.append(this.b);
            sb.append(", calls=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.c);
        }
    }

    /* compiled from: CallListPastCall.kt */
    public static abstract class d {

        /* compiled from: CallListPastCall.kt */
        public static final class a extends d {
            public final s49 a;
            public final ArrayList b;
            public final a c;

            public a(s49 s49Var, ArrayList arrayList, a aVar) {
                this.a = s49Var;
                this.b = arrayList;
                this.c = aVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
            }

            public final int hashCode() {
                int a = qr.a(this.b, this.a.hashCode() * 31, 31);
                a aVar = this.c;
                return a + (aVar == null ? 0 : aVar.a.hashCode());
            }

            public final String toString() {
                return "Group(chat=" + this.a + ", participantIds=" + this.b + ", activeCall=" + this.c + ')';
            }
        }

        /* compiled from: CallListPastCall.kt */
        public static final class b extends d {
            public final CallsUserId a;

            public b(CallsUserId callsUserId) {
                this.a = callsUserId;
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
                return "PeerToPeer(participantId=" + this.a + ')';
            }
        }
    }

    /* compiled from: CallListPastCall.kt */
    public static final class e extends a59 {
        public final f a;
        public final d b;
        public final long c;
        public final CallId d;

        public e(f fVar, d dVar, long j, CallId callId) {
            this.a = fVar;
            this.b = dVar;
            this.c = j;
            this.d = callId;
        }

        @Override // xsna.a59
        public final d a() {
            return this.b;
        }

        @Override // xsna.a59
        public final f b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.a, eVar.a) && epx.f(this.b, eVar.b) && this.c == eVar.c && epx.f(this.d, eVar.d);
        }

        public final int hashCode() {
            return this.d.b.hashCode() + bh10.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "Single(state=" + this.a + ", metaInfo=" + this.b + ", id=" + this.c + ", callId=" + this.d + ')';
        }
    }

    /* compiled from: CallListPastCall.kt */
    public static abstract class f {

        /* compiled from: CallListPastCall.kt */
        public static final class a extends f {
            public final long a;

            public a(long j) {
                this.a = j;
            }

            @Override // xsna.a59.f
            public final boolean a() {
                return false;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("Cancelled(endTimestampMs="));
            }
        }

        /* compiled from: CallListPastCall.kt */
        public static final class b extends f {
            public final boolean a;
            public final long b;
            public final long c;

            public b(boolean z, long j, long j2) {
                this.a = z;
                this.b = j;
                this.c = j2;
            }

            @Override // xsna.a59.f
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CompletedGroup(isIncoming=");
                sb.append(this.a);
                sb.append(", startTimestampMs=");
                sb.append(this.b);
                sb.append(", durationMs=");
                return vu5.a(')', this.c, sb);
            }
        }

        /* compiled from: CallListPastCall.kt */
        public static final class c extends f {
            public final boolean a;
            public final long b;
            public final long c;

            public c(boolean z, long j, long j2) {
                this.a = z;
                this.b = j;
                this.c = j2;
            }

            @Override // xsna.a59.f
            public final boolean a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && this.b == cVar.b && this.c == cVar.c;
            }

            public final int hashCode() {
                return Long.hashCode(this.c) + bh10.a(Boolean.hashCode(this.a) * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("CompletedP2P(isIncoming=");
                sb.append(this.a);
                sb.append(", startTimestampMs=");
                sb.append(this.b);
                sb.append(", durationMs=");
                return vu5.a(')', this.c, sb);
            }
        }

        /* compiled from: CallListPastCall.kt */
        public static final class d extends f {
            public final boolean a;
            public final long b;

            public d(boolean z, long j) {
                this.a = z;
                this.b = j;
            }

            @Override // xsna.a59.f
            public final boolean a() {
                return this.a;
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
                return Long.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Declined(isIncoming=");
                sb.append(this.a);
                sb.append(", endTimestampMs=");
                return vu5.a(')', this.b, sb);
            }
        }

        /* compiled from: CallListPastCall.kt */
        public static final class e extends f {
            public final long a;
            public final boolean b = true;

            public e(long j) {
                this.a = j;
            }

            @Override // xsna.a59.f
            public final boolean a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Long.hashCode(this.a);
            }

            public final String toString() {
                return vu5.a(')', this.a, new StringBuilder("Missed(endTimestampMs="));
            }
        }

        public abstract boolean a();
    }

    public abstract d a();

    public abstract f b();
}
