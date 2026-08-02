package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.voip.userid.CallsUserId;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ScheduledCallsPatch.kt */
/* loaded from: classes7.dex */
public abstract class k7h0 implements b59 {

    /* compiled from: ScheduledCallsPatch.kt */
    public static final class a extends k7h0 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("Error(throwable="), this.b, ')');
        }
    }

    /* compiled from: ScheduledCallsPatch.kt */
    public static final class b extends k7h0 {
        public final CallsUserId b;
        public final ArrayList c;
        public final String d;
        public final boolean e;
        public final List<GroupsGroupFullDto> f;

        public b(CallsUserId callsUserId, ArrayList arrayList, String str, boolean z, List list) {
            this.b = callsUserId;
            this.c = arrayList;
            this.d = str;
            this.e = z;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d) && this.e == bVar.e && epx.f(this.f, bVar.f);
        }

        public final int hashCode() {
            CallsUserId callsUserId = this.b;
            return this.f.hashCode() + qoy.b(urd0.a(qr.a(this.c, (callsUserId == null ? 0 : callsUserId.hashCode()) * 31, 31), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(selectedUser=");
            sb.append(this.b);
            sb.append(", scheduledCalls=");
            sb.append(this.c);
            sb.append(", nextFrom=");
            sb.append(this.d);
            sb.append(", hasMore=");
            sb.append(this.e);
            sb.append(", managedGroups=");
            return ms9.a(')', sb, this.f);
        }
    }

    /* compiled from: ScheduledCallsPatch.kt */
    public static final class c extends k7h0 {
        public static final c b = new c();
    }
}
