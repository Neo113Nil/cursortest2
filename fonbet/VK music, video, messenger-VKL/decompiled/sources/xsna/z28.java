package xsna;

import com.vk.dto.common.Peer;

/* compiled from: BotKeyboard.kt */
/* loaded from: classes2.dex */
public abstract class z28 {

    /* compiled from: BotKeyboard.kt */
    public static final class a extends z28 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenLink(url=");
            sb.append(this.a);
            sb.append(", payload=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class b extends z28 {
        public final int a;
        public final Peer b;
        public final String c;

        public b(int i, Peer peer, String str) {
            this.a = i;
            this.b = peer;
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
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.a) * 31;
            Peer peer = this.b;
            return this.c.hashCode() + ((hashCode + (peer == null ? 0 : Long.hashCode(peer.b))) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenMiniApp(appId=");
            sb.append(this.a);
            sb.append(", owner=");
            sb.append(this.b);
            sb.append(", hash=");
            return ho8.a(sb, this.c, ')');
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class c extends z28 {
        public final String a;

        public c(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("OpenModalView(url="), this.a, ')');
        }
    }

    /* compiled from: BotKeyboard.kt */
    public static final class d extends z28 {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShowSnackbar(text="), this.a, ')');
        }
    }
}
