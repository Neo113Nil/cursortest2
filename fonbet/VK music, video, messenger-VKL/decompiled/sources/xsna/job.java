package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class job implements izs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ job(long j, wh50 wh50Var) {
        this.c = j;
        this.d = wh50Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.d;
        long j = this.c;
        switch (i) {
            case 0:
                nob nobVar = (nob) obj2;
                lzv lzvVar = nobVar.c;
                Serializer.c<Peer> cVar = Peer.CREATOR;
                return lzvVar.b(nobVar, new uqm(new sqm(Peer.a.b(j), Source.CACHE, false, (Object) null, 16))).l(new kb(new hob(j, (ProfilesInfo) obj, 0), 13));
            default:
                return ((kw8) obj).c(new tf5(j, (wh50) obj2, 2));
        }
    }

    public /* synthetic */ job(nob nobVar, long j) {
        this.d = nobVar;
        this.c = j;
    }
}
