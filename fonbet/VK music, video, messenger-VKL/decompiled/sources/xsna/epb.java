package xsna;

import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChatClipsTopBarDecorationAction.kt */
/* loaded from: classes2.dex */
public interface epb extends kj50 {

    /* compiled from: ChatClipsTopBarDecorationAction.kt */
    public static final class a implements epb {
        public final long b;
        public final int c;
        public final int d;

        public a(long j, int i, int i2) {
            this.b = j;
            this.c = i;
            this.d = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b == aVar.b && this.c == aVar.c && this.d == aVar.d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.d) + shy.a(this.c, Long.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindDialogAndMsg(dialogId=");
            sb.append(this.b);
            sb.append(", cnvMsgId=");
            sb.append(this.c);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationAction.kt */
    public static final class b implements epb {
        public final Msg b;
        public final int c;

        public b(Msg msg, int i) {
            this.b = msg;
            this.c = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && this.c == bVar.c;
        }

        public final int hashCode() {
            return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindMsg(msg=");
            sb.append(this.b);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationAction.kt */
    public static final class c implements epb {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1025260124;
        }

        public final String toString() {
            return "BindRecommendation";
        }
    }

    /* compiled from: ChatClipsTopBarDecorationAction.kt */
    public static final class d implements epb {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1253168674;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsTopBarDecorationAction.kt */
    public static final class e implements epb {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -584983244;
        }

        public final String toString() {
            return "OnBackClick";
        }
    }

    /* compiled from: ChatClipsTopBarDecorationAction.kt */
    public static final class f implements epb {
    }
}
