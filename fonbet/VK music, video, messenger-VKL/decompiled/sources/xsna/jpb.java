package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChatClipsTopBarDecorationPatch.kt */
/* loaded from: classes2.dex */
public interface jpb extends xl50 {

    /* compiled from: ChatClipsTopBarDecorationPatch.kt */
    public static final class a implements jpb {
        public final DialogExt b;
        public final Msg c;
        public final int d;

        public a(DialogExt dialogExt, Msg msg, int i) {
            this.b = dialogExt;
            this.c = msg;
            this.d = i;
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
            return Integer.hashCode(this.d) + pn.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BindDialogMsgDataLoaded(dialogExt=");
            sb.append(this.b);
            sb.append(", msg=");
            sb.append(this.c);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationPatch.kt */
    public static final class b implements jpb {
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
            StringBuilder sb = new StringBuilder("BindMsgDataLoaded(msg=");
            sb.append(this.b);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.c, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationPatch.kt */
    public static final class c implements jpb {
        public final DialogExt b;

        public c(DialogExt dialogExt) {
            this.b = dialogExt;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BindRecommendation(dialogExt=" + this.b + ')';
        }
    }
}
