package xsna;

import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import xsna.g1e0;

/* compiled from: ChannelMessagesGetByIdExtCmd.kt */
/* loaded from: classes2.dex */
public final class o2b extends le6<t140> {
    public final long b;
    public final Collection<Integer> c;
    public final MsgIdType d;
    public final Source e;
    public final boolean f;
    public final boolean g;
    public final Object h;

    public o2b(long j, Collection<Integer> collection, MsgIdType msgIdType, Source source, boolean z, boolean z2, Object obj) {
        this.b = j;
        this.c = collection;
        this.d = msgIdType;
        this.e = source;
        this.f = z;
        this.g = z2;
        this.h = obj;
    }

    @Override // xsna.le6
    public final t140 e(w2w w2wVar) {
        ProfilesInfo profilesInfo;
        wpp wppVar = (wpp) w2wVar.L0(this, new n2b(this.b, this.c, this.d, this.e, this.f, this.g));
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
            aVar.d = this.h;
            profilesInfo = (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
        }
        return new t140(wppVar, profilesInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o2b)) {
            return false;
        }
        o2b o2bVar = (o2b) obj;
        return this.b == o2bVar.b && epx.f(this.c, o2bVar.c) && this.d == o2bVar.d && this.e == o2bVar.e && this.f == o2bVar.f && this.g == o2bVar.g && epx.f(this.h, o2bVar.h);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c((this.d.hashCode() + s3j0.a(Long.hashCode(this.b) * 31, this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        Object obj = this.h;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelMessagesGetByIdExtCmd(channelId=");
        sb.append(this.b);
        sb.append(", messagesIds=");
        sb.append(this.c);
        sb.append(", msgIdType=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", isAwaitNetwork=");
        sb.append(this.f);
        sb.append(", isPostponed=");
        sb.append(this.g);
        sb.append(", changerTag=");
        return k73.c(sb, this.h, ')');
    }
}
