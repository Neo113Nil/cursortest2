package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: ChatClipsBottomBarDecorationNavigationEvent.kt */
/* loaded from: classes2.dex */
public interface lnb {

    /* compiled from: ChatClipsBottomBarDecorationNavigationEvent.kt */
    public static final class a implements lnb {
        public final DialogExt a;
        public final int b;
        public final String c;
        public final Long d;
        public final boolean e;

        public a(DialogExt dialogExt, int i, String str, Long l, boolean z) {
            this.a = dialogExt;
            this.b = i;
            this.c = str;
            this.d = l;
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
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public final int hashCode() {
            int a = shy.a(this.b, this.a.hashCode() * 31, 31);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.d;
            return Boolean.hashCode(this.e) + ((hashCode + (l != null ? l.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OpenReplyScreen(dialogExt=");
            sb.append(this.a);
            sb.append(", cnvMsgId=");
            sb.append(this.b);
            sb.append(", linkedText=");
            sb.append(this.c);
            sb.append(", senderId=");
            sb.append(this.d);
            sb.append(", canShowQuickStickerSuggest=");
            return defpackage.q0.a(sb, this.e, ')');
        }
    }
}
