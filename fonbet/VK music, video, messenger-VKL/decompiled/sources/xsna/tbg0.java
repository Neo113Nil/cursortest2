package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import xsna.dux0;
import xsna.dw30;
import xsna.g1e0;

/* compiled from: ExtendedResponse.kt */
/* loaded from: classes2.dex */
public final class tbg0<T extends dux0, R> extends ccq<T, R> {
    public final boolean b;
    public final ew30 c;
    public final fw30 d;

    public tbg0(dw30.a aVar, boolean z, ew30 ew30Var, fw30 fw30Var) {
        super(aVar);
        this.b = z;
        this.c = ew30Var;
        this.d = fw30Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ccq
    public final Object a(w2w w2wVar, com.vk.libvideo.design.view.video.a aVar) {
        dux0 dux0Var;
        T t = this.a;
        dux0 dux0Var2 = (dux0) t;
        if (dux0Var2.c().g()) {
            g1e0.a aVar2 = new g1e0.a();
            aVar2.h(dux0Var2.c().h());
            aVar2.b = Source.ACTUAL;
            aVar2.c = this.b;
            dux0Var = (dux0) this.c.invoke(t, ((ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar2)))).Ob());
        } else {
            dux0Var = dux0Var2;
        }
        if (!(dux0Var2 instanceof cux0)) {
            return aVar.invoke(dux0Var);
        }
        cux0 cux0Var = (cux0) t;
        if (cux0Var.a().isEmpty()) {
            return aVar.invoke(dux0Var);
        }
        Set<Long> a = cux0Var.a();
        ArrayList arrayList = new ArrayList(c5g.u(a, 10));
        Iterator<T> it = a.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        return this.d.invoke(dux0Var, (wpp) w2wVar.J0(cux0Var, new tqm(new sqm(arrayList, Source.ACTUAL, this.b, "MsgSearchExtCmd", 0, 16))).await());
    }
}
