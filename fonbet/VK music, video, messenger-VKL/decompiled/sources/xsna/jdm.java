package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: DialogFilterMetaCmd.kt */
/* loaded from: classes2.dex */
public abstract class jdm<T> extends xl6<T> {
    public final DialogsFilter b;

    /* compiled from: DialogFilterMetaCmd.kt */
    public static final class a {
        public static final a d = new a(null, null, null);
        public final Dialog a;
        public final Msg b;
        public final ProfilesInfo c;

        public a(Dialog dialog, Msg msg, ProfilesInfo profilesInfo) {
            this.a = dialog;
            this.b = msg;
            this.c = profilesInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            Dialog dialog = this.a;
            int hashCode = (dialog == null ? 0 : dialog.hashCode()) * 31;
            Msg msg = this.b;
            int hashCode2 = (hashCode + (msg == null ? 0 : msg.hashCode())) * 31;
            ProfilesInfo profilesInfo = this.c;
            return hashCode2 + (profilesInfo != null ? profilesInfo.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FilterInfo(lastDialog=");
            sb.append(this.a);
            sb.append(", lastMsg=");
            sb.append(this.b);
            sb.append(", profilesInfo=");
            return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.c, ')');
        }
    }

    public jdm(DialogsFilter dialogsFilter) {
        this.b = dialogsFilter;
    }

    @Override // xsna.m2w
    public final String a() {
        return zr.a("im-dialog-meta-", this.b.name(), "-update");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final a f(w2w w2wVar, boolean z) {
        Source source = z ? Source.CACHE : Source.ACTUAL;
        StringBuilder sb = new StringBuilder("DialogFilterMetaCmd sinceWeight= ");
        gkx0 gkx0Var = gkx0.e;
        sb.append(gkx0Var);
        sb.append(" fromCache= ");
        sb.append(z);
        brm brmVar = (brm) w2wVar.J0(this, new crm(new drm(gkx0Var, this.b, 1, source, !z, this, sb.toString()))).await();
        DialogsHistory dialogsHistory = brmVar.a;
        if (dialogsHistory.isEmpty()) {
            return null;
        }
        Dialog dialog = dialogsHistory.k().get(0);
        return new a(dialog, dialogsHistory.s().get(dialog.Sb()), brmVar.b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return System.identityHashCode(this);
    }
}
