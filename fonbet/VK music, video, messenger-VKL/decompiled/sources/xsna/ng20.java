package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: MessagesRequests.kt */
/* loaded from: classes18.dex */
public abstract class ng20 {

    /* compiled from: MessagesRequests.kt */
    public static final class a extends ng20 {
        public static final a a = new a();
    }

    /* compiled from: MessagesRequests.kt */
    public static final class b extends ng20 {
        public final int a;
        public final Dialog b;
        public final ProfilesInfo c;
        public final Msg d;

        public b(int i, ProfilesInfo profilesInfo, Dialog dialog, Msg msg) {
            this.a = i;
            this.b = dialog;
            this.c = profilesInfo;
            this.d = msg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c) && epx.f(this.d, bVar.d);
        }

        public final int hashCode() {
            int b = ur.b(this.c, (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31);
            Msg msg = this.d;
            return b + (msg == null ? 0 : msg.hashCode());
        }

        public final String toString() {
            return "Presented(count=" + this.a + ", lastDialog=" + this.b + ", profiles=" + this.c + ", lastMsg=" + this.d + ')';
        }
    }
}
