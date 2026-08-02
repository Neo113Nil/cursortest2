package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChatClipsBottomBarDecorationAction.kt */
/* loaded from: classes2.dex */
public interface wmb extends kj50 {

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class a implements wmb {
        public final VideoFile b;

        public a(VideoFile videoFile) {
            this.b = videoFile;
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
            return lq.a(new StringBuilder("BindClipRecom(recVideoFile="), this.b, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class b implements wmb {
        public final long b;
        public final int c;
        public final Integer d;
        public final boolean e;

        public b(long j, int i, Integer num, boolean z) {
            this.b = j;
            this.c = i;
            this.d = num;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b == bVar.b && this.c == bVar.c && epx.f(this.d, bVar.d) && this.e == bVar.e;
        }

        public final int hashCode() {
            int a = shy.a(this.c, Long.hashCode(this.b) * 31, 31);
            Integer num = this.d;
            return Boolean.hashCode(this.e) + ((a + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindInitMsg(dialogId=");
            sb.append(this.b);
            sb.append(", cnvMsgId=");
            sb.append(this.c);
            sb.append(", linkedCmid=");
            sb.append(this.d);
            sb.append(", isClipInReply=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class c implements wmb {
        public final Msg b;
        public final boolean c;
        public final String d;

        public c(Msg msg, boolean z, String str) {
            this.b = msg;
            this.c = z;
            this.d = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && this.c == cVar.c && epx.f(this.d, cVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindPagingMsg(msg=");
            sb.append(this.b);
            sb.append(", isLocal=");
            sb.append(this.c);
            sb.append(", linkedText=");
            return ho8.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class d implements wmb {
        public final int b;
        public final int c;
        public final boolean d;

        public d(int i, int i2, boolean z) {
            this.b = i;
            this.c = i2;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ChipUpdateReaction(cnvMsgId=");
            sb.append(this.b);
            sb.append(", reactionId=");
            sb.append(this.c);
            sb.append(", isReactedByMe=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class e implements wmb {
        public final VideoFile b;

        public e(VideoFile videoFile) {
            this.b = videoFile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && epx.f(this.b, ((e) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return lq.a(new StringBuilder("ClipRecomReplyBtnClick(recVideoFile="), this.b, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class f implements wmb {
        public static final f b = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -570215443;
        }

        public final String toString() {
            return "CloseReactions";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class g implements wmb {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1591206185;
        }

        public final String toString() {
            return "DropMsg";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class h implements wmb {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -1042257301;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class i implements wmb {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("LinkedMsgClick(cnvMsgId="), this.b, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class j implements wmb {
        public static final j b = new j();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1884361998;
        }

        public final String toString() {
            return "MoreReactionsClick";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class k implements wmb {
        public final int b;
        public final Integer c;
        public final Integer d;

        public k(int i, Integer num, Integer num2) {
            this.b = i;
            this.c = num;
            this.d = num2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.b == kVar.b && epx.f(this.c, kVar.c) && epx.f(this.d, kVar.d);
        }

        public final int hashCode() {
            int hashCode = Integer.hashCode(this.b) * 31;
            Integer num = this.c;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.d;
            return hashCode2 + (num2 != null ? num2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PickReaction(cnvMsgId=");
            sb.append(this.b);
            sb.append(", oldReactionId=");
            sb.append(this.c);
            sb.append(", newReactionId=");
            return uqi.b(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class l implements wmb {
        public final int b;

        public l(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.b == ((l) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("WritebarClick(cnvMsgId="), this.b, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationAction.kt */
    public static final class m implements wmb {
        public final String b;
        public final MsgTextFormat c;

        public m(String str, MsgTextFormat msgTextFormat) {
            this.b = str;
            this.c = msgTextFormat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return epx.f(this.b, mVar.b) && epx.f(this.c, mVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "WritebarEditTextUpdate(draftMsgText=" + this.b + ", msgTextFormat=" + this.c + ')';
        }
    }
}
