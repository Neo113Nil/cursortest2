package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.messages.MsgTextFormat;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChatClipsBottomBarDecorationMviState.kt */
/* loaded from: classes2.dex */
public interface knb extends km50 {

    /* compiled from: ChatClipsBottomBarDecorationMviState.kt */
    public static final class a implements knb {
        public final DialogExt b;
        public final VideoFile c;
        public final boolean d;

        public a(DialogExt dialogExt, VideoFile videoFile, boolean z) {
            this.b = dialogExt;
            this.c = videoFile;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && this.d == aVar.d;
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            VideoFile videoFile = this.c;
            return Boolean.hashCode(this.d) + ((hashCode + (videoFile == null ? 0 : videoFile.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ClipRecom(dialogExt=");
            sb.append(this.b);
            sb.append(", recVideoFile=");
            sb.append(this.c);
            sb.append(", isSent=");
            return defpackage.q0.a(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationMviState.kt */
    public static final class b implements knb {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1773009968;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsBottomBarDecorationMviState.kt */
    public static final class c implements knb {
        public final DialogExt b;
        public final Msg c;
        public final boolean d;
        public final boolean e;
        public final String f;
        public final String g;
        public final MsgTextFormat h;
        public final boolean i;

        public c(DialogExt dialogExt, Msg msg, boolean z, boolean z2, String str, String str2, MsgTextFormat msgTextFormat, boolean z3) {
            this.b = dialogExt;
            this.c = msg;
            this.d = z;
            this.e = z2;
            this.f = str;
            this.g = str2;
            this.h = msgTextFormat;
            this.i = z3;
        }

        public static c a(c cVar, boolean z, boolean z2, String str, MsgTextFormat msgTextFormat, int i) {
            DialogExt dialogExt = cVar.b;
            Msg msg = (i & 2) != 0 ? cVar.c : null;
            if ((i & 4) != 0) {
                z = cVar.d;
            }
            boolean z3 = z;
            if ((i & 8) != 0) {
                z2 = cVar.e;
            }
            boolean z4 = z2;
            String str2 = cVar.f;
            if ((i & 32) != 0) {
                str = cVar.g;
            }
            String str3 = str;
            if ((i & 64) != 0) {
                msgTextFormat = cVar.h;
            }
            boolean z5 = cVar.i;
            cVar.getClass();
            return new c(dialogExt, msg, z3, z4, str2, str3, msgTextFormat, z5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.b, cVar.b) && epx.f(this.c, cVar.c) && this.d == cVar.d && this.e == cVar.e && epx.f(this.f, cVar.f) && epx.f(this.g, cVar.g) && epx.f(this.h, cVar.h) && this.i == cVar.i;
        }

        public final int hashCode() {
            int b = qoy.b(qoy.b(pn.a(this.c, this.b.hashCode() * 31, 31), 31, this.d), 31, this.e);
            String str = this.f;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.g;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            MsgTextFormat msgTextFormat = this.h;
            return Boolean.hashCode(this.i) + ((hashCode2 + (msgTextFormat != null ? msgTextFormat.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(dialogExt=");
            sb.append(this.b);
            sb.append(", msg=");
            sb.append(this.c);
            sb.append(", showExpandedReactionsPicker=");
            sb.append(this.d);
            sb.append(", myReactionSet=");
            sb.append(this.e);
            sb.append(", linkedText=");
            sb.append(this.f);
            sb.append(", draftMsgText=");
            sb.append(this.g);
            sb.append(", msgTextFormat=");
            sb.append(this.h);
            sb.append(", isClipInReply=");
            return defpackage.q0.a(sb, this.i, ')');
        }
    }
}
