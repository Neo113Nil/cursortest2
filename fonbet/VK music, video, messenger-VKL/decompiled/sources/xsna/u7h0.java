package xsna;

import com.vk.voip.userid.CallsUserId;

/* compiled from: ScheduledCallsViewItem.kt */
/* loaded from: classes7.dex */
public abstract class u7h0 implements l59 {

    /* compiled from: ScheduledCallsViewItem.kt */
    public static final class a extends u7h0 {
        public final boolean b;
        public final CallsUserId c;
        public final String d;

        public a(boolean z, CallsUserId callsUserId, String str) {
            this.b = z;
            this.c = callsUserId;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            CallsUserId callsUserId = this.c;
            return this.d.hashCode() + ((hashCode + (callsUserId == null ? 0 : callsUserId.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StickyHeader(shouldShow=");
            sb.append(this.b);
            sb.append(", selectedUser=");
            sb.append(this.c);
            sb.append(", selectedTitle=");
            return ho8.a(sb, this.d, ')');
        }
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }
}
