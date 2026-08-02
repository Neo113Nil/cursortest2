package xsna;

import xsna.mwv;

/* compiled from: ImChannelDonutActionItem.kt */
/* loaded from: classes2.dex */
public interface ryv extends mwv.a {

    /* compiled from: ImChannelDonutActionItem.kt */
    public static final class a implements ryv {
        public final long a;
        public final long b;
        public final boolean c;

        public a(long j, long j2, boolean z) {
            this.a = j;
            this.b = j2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChangeDonutInPostingSettings(groupId=");
            sb.append(this.a);
            sb.append(", conversationId=");
            sb.append(this.b);
            sb.append(", isEnable=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    /* compiled from: ImChannelDonutActionItem.kt */
    public static final class b implements ryv {
        public final long a;
        public final long b;

        public b(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickDonutInEntry(groupId=");
            sb.append(this.a);
            sb.append(", conversationId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: ImChannelDonutActionItem.kt */
    public static final class c implements ryv {
        public final long a;
        public final long b;

        public c(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickDonutInProfile(groupId=");
            sb.append(this.a);
            sb.append(", conversationId=");
            return vu5.a(')', this.b, sb);
        }
    }

    /* compiled from: ImChannelDonutActionItem.kt */
    public static final class d implements ryv {
        public final long a;
        public final int b;

        public d(long j, int i) {
            this.a = j;
            this.b = i;
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
            return Integer.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClickPartDonutEntry(peerId=");
            sb.append(this.a);
            sb.append(", conversationMessageId=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
