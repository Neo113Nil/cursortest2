package xsna;

import com.vk.im.engine.models.SearchMode;

/* compiled from: MsgSearchLayout.kt */
/* loaded from: classes2.dex */
public abstract class ox30 {
    public final SearchMode a;

    /* compiled from: MsgSearchLayout.kt */
    public static final class a extends ox30 {
        public static final a b = new a(SearchMode.PEERS);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -751681510;
        }

        public final String toString() {
            return "All";
        }
    }

    /* compiled from: MsgSearchLayout.kt */
    public static final class b extends ox30 {
        public final long b;
        public final String c;

        public b(long j, String str) {
            super(SearchMode.MESSAGES);
            this.b = j;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Long.hashCode(this.b) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Msgs(peerId=");
            sb.append(this.b);
            sb.append(", title=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: MsgSearchLayout.kt */
    public static final class c extends ox30 {
        public static final c b = new c(SearchMode.PEERS);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -797784182;
        }

        public final String toString() {
            return "Peers";
        }
    }

    /* compiled from: MsgSearchLayout.kt */
    public static final class d extends ox30 {
        public static final d b = new d(SearchMode.PEERS);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1684116639;
        }

        public final String toString() {
            return "PeersAndMsgs";
        }
    }

    public ox30(SearchMode searchMode) {
        this.a = searchMode;
    }
}
