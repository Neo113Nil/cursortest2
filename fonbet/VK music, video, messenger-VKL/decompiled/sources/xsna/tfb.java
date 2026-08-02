package xsna;

import com.vk.channels.api.Channel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.g1e0;

/* compiled from: ChannelsHistoryExtGetCmd.kt */
/* loaded from: classes2.dex */
public final class tfb extends xl6<sfb> {
    public final ufb b;

    /* compiled from: ChannelsHistoryExtGetCmd.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[Source.CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tfb(ufb ufbVar) {
        this.b = ufbVar;
    }

    @Override // xsna.m2w
    public final String a() {
        return a.$EnumSwitchMapping$0[this.b.d.ordinal()] == 1 ? "im-channels-history-get-cached" : "im-channels-history-get-network";
    }

    @Override // xsna.le6
    public final Object e(w2w w2wVar) {
        ProfilesInfo profilesInfo;
        ufb ufbVar = this.b;
        qfb qfbVar = (qfb) w2wVar.b1(this, new vfb(ufbVar));
        if (qfbVar.isEmpty()) {
            profilesInfo = new ProfilesInfo();
        } else {
            f1e0 f1e0Var = new f1e0();
            ArrayList arrayList = qfbVar.f;
            f1e0 f1e0Var2 = new f1e0();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                long j = ((Channel) it.next()).b;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                f1e0Var2.a(Peer.a.d(j), Peer.a.f(j));
            }
            f1e0Var.e(f1e0Var2);
            Collection values = qfbVar.g.values();
            f1e0 f1e0Var3 = new f1e0();
            if ((values instanceof List) && (values instanceof RandomAccess)) {
                List list = (List) values;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    lv30.b((Msg) list.get(i), f1e0Var3);
                }
            } else {
                Iterator it2 = values.iterator();
                while (it2.hasNext()) {
                    lv30.b((Msg) it2.next(), f1e0Var3);
                }
            }
            f1e0Var.e(f1e0Var3);
            Source source = ufbVar.d;
            if (source == Source.NETWORK) {
                source = Source.ACTUAL;
            }
            g1e0.a aVar = new g1e0.a();
            aVar.a.e(f1e0Var);
            aVar.b = source;
            aVar.c = ufbVar.e;
            aVar.d = null;
            profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        }
        return new sfb(qfbVar, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return tfb.class.equals(obj != null ? obj.getClass() : null) && epx.f(this.b, ((tfb) obj).b);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelsHistoryExtGetCmd(args=" + this.b + ')';
    }
}
