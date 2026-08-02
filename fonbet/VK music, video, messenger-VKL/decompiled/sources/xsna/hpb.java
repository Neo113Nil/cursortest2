package xsna;

import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChatClipsTopBarDecorationMviState.kt */
/* loaded from: classes2.dex */
public interface hpb extends km50 {

    /* compiled from: ChatClipsTopBarDecorationMviState.kt */
    public static final class a implements hpb {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 950643427;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ChatClipsTopBarDecorationMviState.kt */
    public static final class b implements hpb {
        public final DialogExt b;
        public final Msg c;
        public final int d;

        public b(DialogExt dialogExt, Msg msg, int i) {
            this.b = dialogExt;
            this.c = msg;
            this.d = i;
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
            return Integer.hashCode(this.d) + pn.a(this.c, this.b.hashCode() * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Main(dialogExt=");
            sb.append(this.b);
            sb.append(", msg=");
            sb.append(this.c);
            sb.append(", attachPosition=");
            return vu5.b(sb, this.d, ')');
        }
    }

    /* compiled from: ChatClipsTopBarDecorationMviState.kt */
    public static final class c implements hpb {
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
            return "Recommendation(dialogExt=" + this.b + ')';
        }
    }
}
