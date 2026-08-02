package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChatClipsBottomBarDecorationPatch.kt */
/* loaded from: classes2.dex */
public interface mnb extends xl50 {

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class a implements mnb {
        public final DialogExt b;
        public final Msg c;
        public final String d;
        public final boolean e;

        public a(DialogExt dialogExt, Msg msg, String str, boolean z) {
            this.b = dialogExt;
            this.c = msg;
            this.d = str;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int a = pn.a(this.c, this.b.hashCode() * 31, 31);
            String str = this.d;
            return Boolean.hashCode(this.e) + ((a + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindMsgDataLoaded(dialogExt=");
            sb.append(this.b);
            sb.append(", msg=");
            sb.append(this.c);
            sb.append(", linkedText=");
            sb.append(this.d);
            sb.append(", isClipInReply=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class b implements mnb {
        public final DialogExt b;
        public final VideoFile c;
        public final boolean d;

        public b(DialogExt dialogExt, VideoFile videoFile, boolean z) {
            this.b = dialogExt;
            this.c = videoFile;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && this.d == bVar.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + jq.b(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipRecomOpened(dialogExt=");
            sb.append(this.b);
            sb.append(", recVideoFile=");
            sb.append(this.c);
            sb.append(", isSent=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class c implements mnb {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1700336627;
        }

        public final String toString() {
            return "ClipRecomSent";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class d implements mnb {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -893624730;
        }

        public final String toString() {
            return "CloseFullReactions";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class e implements mnb {
        public static final e b = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -655284206;
        }

        public final String toString() {
            return "Drop";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class f implements mnb {
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class g implements mnb {
        public static final g b = new g();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -2047941820;
        }

        public final String toString() {
            return "SwitchFullReactions";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class h implements mnb {
        public final DialogExt b;

        public h(DialogExt dialogExt) {
            this.b = dialogExt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateCanReply(dialogExt=" + this.b + ')';
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationPatch.kt */
    public static final class i implements mnb {
        public final String b;
        public final MsgTextFormat c;

        public i(String str, MsgTextFormat msgTextFormat) {
            this.b = str;
            this.c = msgTextFormat;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return epx.f(this.b, iVar.b) && epx.f(this.c, iVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateWriteBarEditText(draftMsgText=" + this.b + ", msgTextFormat=" + this.c + ')';
        }
    }
}
