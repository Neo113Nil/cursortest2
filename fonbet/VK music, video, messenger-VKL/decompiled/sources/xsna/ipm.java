package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;

/* compiled from: DialogsExt.kt */
/* loaded from: classes2.dex */
public final class ipm {
    public final wpp<Long, Dialog> a;
    public final ProfilesInfo b;

    public ipm(wpp<Long, Dialog> wppVar, ProfilesInfo profilesInfo) {
        this.a = wppVar;
        this.b = profilesInfo;
    }

    public final DialogExt a(long j) {
        Long valueOf = Long.valueOf(j);
        Long valueOf2 = Long.valueOf(j);
        wpp<Long, Dialog> wppVar = this.a;
        return new DialogExt(new ypp(valueOf, (btx0) wppVar.c.get(valueOf2), wppVar.b.contains(Long.valueOf(j))), this.b, null, 4, null);
    }

    public final wpp<Long, Dialog> b() {
        return this.a;
    }

    public final ProfilesInfo c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ipm)) {
            return false;
        }
        ipm ipmVar = (ipm) obj;
        return epx.f(this.a, ipmVar.a) && epx.f(this.b, ipmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsExt(dialogs=");
        sb.append(this.a);
        sb.append(", info=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.b, ')');
    }
}
