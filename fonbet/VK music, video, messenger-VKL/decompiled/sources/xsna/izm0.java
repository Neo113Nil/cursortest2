package xsna;

import com.vk.dto.common.Peer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.hzm0;

/* compiled from: SubscriptionProgressMediator.kt */
/* loaded from: classes2.dex */
public final class izm0 implements hzm0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final LinkedHashMap b = new LinkedHashMap();

    @Override // xsna.hzm0
    public final boolean a(Peer peer) {
        if (peer == null) {
            return false;
        }
        return epx.f(this.b.get(peer), Boolean.TRUE);
    }

    @Override // xsna.hzm0
    public final void b(com.vk.im.video.g gVar) {
        this.a.remove(gVar);
    }

    @Override // xsna.hzm0
    public final void c(com.vk.im.video.g gVar) {
        this.a.add(gVar);
    }

    public final void d(Peer peer, boolean z) {
        LinkedHashMap linkedHashMap = this.b;
        if (z) {
            linkedHashMap.put(peer, Boolean.TRUE);
        } else {
            linkedHashMap.remove(peer);
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((hzm0.a) it.next()).d(peer);
        }
    }
}
