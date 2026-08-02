package xsna;

import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;

/* compiled from: AttachRelatedEntities.kt */
/* loaded from: classes2.dex */
public final class i34 {
    public final xpp<Dialog> a;
    public final xpp<Msg> b;
    public final ProfilesInfo c;

    public i34() {
        this(0);
    }

    public final DialogExt a() {
        Dialog a = this.a.a();
        if (a != null) {
            return new DialogExt(a, this.c);
        }
        return null;
    }

    public final PinnedMsg b() {
        Dialog a = this.a.a();
        if (a != null) {
            return a.dc();
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i34)) {
            return false;
        }
        i34 i34Var = (i34) obj;
        return epx.f(this.a, i34Var.a) && epx.f(this.b, i34Var.b) && epx.f(this.c, i34Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachRelatedEntities(dialog=");
        sb.append(this.a);
        sb.append(", msg=");
        sb.append(this.b);
        sb.append(", profiles=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(sb, this.c, ')');
    }

    public i34(xpp<Dialog> xppVar, xpp<Msg> xppVar2, ProfilesInfo profilesInfo) {
        this.a = xppVar;
        this.b = xppVar2;
        this.c = profilesInfo;
    }

    public /* synthetic */ i34(int i) {
        this(new xpp(), new xpp(), new ProfilesInfo());
    }
}
