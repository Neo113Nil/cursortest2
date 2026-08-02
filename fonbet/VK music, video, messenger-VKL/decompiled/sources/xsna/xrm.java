package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogsHistory;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.EmptySet;

/* compiled from: DialogsList.kt */
/* loaded from: classes18.dex */
public final class xrm implements Iterable<Dialog>, frz, gcy {
    public final DialogsHistory b;
    public final Set<Long> c;
    public final ewf<gkx0> d;
    public final ProfilesInfo e;

    public xrm() {
        this(null, null, null, null, 15);
    }

    @Override // xsna.frz
    public final boolean c() {
        DialogsHistory dialogsHistory = this.b;
        if (dialogsHistory.d().isEmpty()) {
            return dialogsHistory.size() == 0 && !dialogsHistory.j() && dialogsHistory.i();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrm)) {
            return false;
        }
        xrm xrmVar = (xrm) obj;
        return epx.f(this.b, xrmVar.b) && epx.f(this.c, xrmVar.c) && epx.f(this.d, xrmVar.d) && epx.f(this.e, xrmVar.e);
    }

    @Override // xsna.frz
    public final int getSize() {
        return this.b.size();
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + fw3.b(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator<Dialog> iterator() {
        return this.b.iterator();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsList(history=");
        sb.append(this.b);
        sb.append(", updatesDialogsIds=");
        sb.append(this.c);
        sb.append(", nonExpiredRange=");
        sb.append(this.d);
        sb.append(", cachedProfiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.e, ')');
    }

    public xrm(DialogsHistory dialogsHistory, Set<Long> set, ewf<gkx0> ewfVar, ProfilesInfo profilesInfo) {
        this.b = dialogsHistory;
        this.c = set;
        this.d = ewfVar;
        this.e = profilesInfo;
    }

    public xrm(DialogsHistory dialogsHistory, Set set, t6i t6iVar, ProfilesInfo profilesInfo, int i) {
        this((i & 1) != 0 ? new DialogsHistory(0, 29) : dialogsHistory, (i & 2) != 0 ? EmptySet.b : set, (i & 4) != 0 ? new t6i(gkx0.e, gkx0.d) : t6iVar, (i & 8) != 0 ? new ProfilesInfo() : profilesInfo);
    }
}
