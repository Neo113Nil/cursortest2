package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.g1e0;

/* compiled from: MsgGetByIdExtCmd.kt */
/* loaded from: classes2.dex */
public final class ej30 extends le6<t140> {
    public final MsgIdType b;
    public final Collection<Integer> c;
    public final Peer d;
    public final Source e;
    public final boolean f;
    public final Object g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ej30(MsgIdType msgIdType, Collection collection, Peer peer, Source source, int i) {
        this(msgIdType, collection, peer, (i & 8) != 0 ? Source.CACHE : source, false, null);
        if ((i & 4) != 0) {
            Serializer.c<Peer> cVar = Peer.CREATOR;
            peer = Peer.Unknown.e;
        }
    }

    @Override // xsna.le6
    public final t140 e(w2w w2wVar) {
        ProfilesInfo profilesInfo;
        wpp wppVar = (wpp) w2wVar.L0(this, new dj30(this.b, this.c, this.d, this.e, this.f, this.g));
        Collection values = wppVar.c.values();
        f1e0 f1e0Var = new f1e0();
        if ((values instanceof List) && (values instanceof RandomAccess)) {
            List list = (List) values;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                lv30.b((Msg) list.get(i), f1e0Var);
            }
        } else {
            Iterator it = values.iterator();
            while (it.hasNext()) {
                lv30.b((Msg) it.next(), f1e0Var);
            }
        }
        if (f1e0Var.f()) {
            profilesInfo = new ProfilesInfo();
        } else {
            g1e0.a aVar = new g1e0.a();
            aVar.a.e(f1e0Var);
            aVar.b = this.e;
            aVar.c = this.f;
            aVar.d = this.g;
            profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        }
        return new t140(wppVar, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej30)) {
            return false;
        }
        ej30 ej30Var = (ej30) obj;
        return this.b == ej30Var.b && epx.f(this.c, ej30Var.c) && epx.f(this.d, ej30Var.d) && this.e == ej30Var.e && this.f == ej30Var.f && epx.f(this.g, ej30Var.g);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(bh10.a(s3j0.a(this.b.hashCode() * 31, this.c, 31), 31, this.d.b), 31, this.e), 31, this.f);
        Object obj = this.g;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgGetByIdExtCmd(type=");
        sb.append(this.b);
        sb.append(", msgIds=");
        sb.append(this.c);
        sb.append(", peer=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", changerTag=");
        return k73.c(sb, this.g, ')');
    }

    public ej30(MsgIdType msgIdType, Collection<Integer> collection, Peer peer, Source source, boolean z, Object obj) {
        this.b = msgIdType;
        this.c = collection;
        this.d = peer;
        this.e = source;
        this.f = z;
        this.g = obj;
        if (msgIdType == MsgIdType.CNV_ID && peer.Ab(Peer.Type.UNKNOWN)) {
            throw new IllegalArgumentException("dialogId is not specified");
        }
    }
}
