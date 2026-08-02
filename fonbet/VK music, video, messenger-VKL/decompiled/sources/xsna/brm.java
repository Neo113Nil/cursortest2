package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogsHistory;

/* compiled from: DialogsHistoryExt.kt */
/* loaded from: classes2.dex */
public final class brm {
    public final DialogsHistory a;
    public final ProfilesInfo b;

    public brm(DialogsHistory dialogsHistory, ProfilesInfo profilesInfo) {
        this.a = dialogsHistory;
        this.b = profilesInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof brm)) {
            return false;
        }
        brm brmVar = (brm) obj;
        return epx.f(this.a, brmVar.a) && epx.f(this.b, brmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsHistoryExt(history=");
        sb.append(this.a);
        sb.append(", profiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
