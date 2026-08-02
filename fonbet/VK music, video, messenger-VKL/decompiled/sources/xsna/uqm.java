package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import java.util.Collection;
import java.util.Iterator;
import xsna.g1e0;

/* compiled from: DialogsGetByIdExtCmd.kt */
/* loaded from: classes2.dex */
public final class uqm extends xl6<ipm> {
    public final sqm b;

    public uqm(sqm sqmVar) {
        this.b = sqmVar;
    }

    @Override // xsna.m2w
    public final String a() {
        if (this.b.b == Source.CACHE) {
            return null;
        }
        return "im-dialogs-load-from-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        sqm sqmVar = this.b;
        wpp wppVar = (wpp) w2wVar.b1(this, new tqm(sqmVar));
        g1e0.a aVar = new g1e0.a();
        Collection values = wppVar.c.values();
        f1e0 f1e0Var = new f1e0();
        Iterator it = values.iterator();
        while (it.hasNext()) {
            ijm.b((Dialog) it.next(), f1e0Var);
        }
        aVar.a.e(f1e0Var);
        Source source = sqmVar.b;
        if (source == Source.NETWORK) {
            source = Source.ACTUAL;
        }
        aVar.b = source;
        aVar.c = sqmVar.c;
        aVar.d = sqmVar.d;
        g1e0 g1e0Var = new g1e0(aVar);
        return new ipm(wppVar, g1e0Var.a.f() ? new ProfilesInfo() : (ProfilesInfo) w2wVar.L0(this, new d1e0(g1e0Var)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uqm) && epx.f(this.b, ((uqm) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "DialogsGetByIdExtCmd(args=" + this.b + ')';
    }

    public uqm(Peer peer, Source source) {
        this(new sqm(peer, source, false, (Object) null, 28));
    }
}
