package xsna;

import xsna.mwv;

/* compiled from: ImChannelChatActionItem.kt */
/* loaded from: classes2.dex */
public interface pyv extends mwv.a {

    /* compiled from: ImChannelChatActionItem.kt */
    public static final class a implements pyv {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowMonetizationEntry(groupId=");
            sb.append(this.a);
            sb.append(", conversationId=");
            return vu5.a(')', this.b, sb);
        }
    }
}
