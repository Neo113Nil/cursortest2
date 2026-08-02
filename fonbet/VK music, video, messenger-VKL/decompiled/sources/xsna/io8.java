package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: BusinessNotifications.kt */
/* loaded from: classes2.dex */
public abstract class io8 {

    /* compiled from: BusinessNotifications.kt */
    public static final class a extends io8 {
        public static final a a = new a();
    }

    /* compiled from: BusinessNotifications.kt */
    public static final class b extends io8 {
        public final int a;
        public final Dialog b;
        public final Msg c;
        public final ProfilesInfo d;

        public b(int i, ProfilesInfo profilesInfo, Dialog dialog, Msg msg) {
            this.a = i;
            this.b = dialog;
            this.c = msg;
            this.d = profilesInfo;
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
            int hashCode = (this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31;
            Msg msg = this.c;
            return this.d.hashCode() + ((hashCode + (msg == null ? 0 : msg.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Presented(count=");
            sb.append(this.a);
            sb.append(", lastDialog=");
            sb.append(this.b);
            sb.append(", lastMsg=");
            sb.append(this.c);
            sb.append(", profiles=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.d, ')');
        }
    }
}
