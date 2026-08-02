package xsna;

import com.vk.im.engine.models.dialogs.Dialog;
import java.util.List;

/* compiled from: GroupCallBannerViewState.kt */
/* loaded from: classes2.dex */
public abstract class chu {

    /* compiled from: GroupCallBannerViewState.kt */
    public static final class a extends chu {
        public static final a a = new a();
    }

    /* compiled from: GroupCallBannerViewState.kt */
    public static final class b extends chu {
        public final Dialog a;
        public final List<String> b;
        public final int c;
        public final String d;
        public final String e;

        public b(Dialog dialog, List<String> list, int i, String str, String str2) {
            this.a = dialog;
            this.b = list;
            this.c = i;
            this.d = str;
            this.e = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b) && this.c == bVar.c && epx.f(this.d, bVar.d) && epx.f(this.e, bVar.e);
        }

        public final int hashCode() {
            int a = shy.a(this.c, fw3.a(this.a.hashCode() * 31, 31, this.b), 31);
            String str = this.d;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Shown(dialog=");
            sb.append(this.a);
            sb.append(", displayedAvatars=");
            sb.append(this.b);
            sb.append(", participantCount=");
            sb.append(this.c);
            sb.append(", joinLink=");
            sb.append(this.d);
            sb.append(", vkJoinLink=");
            return ho8.a(sb, this.e, ')');
        }
    }
}
