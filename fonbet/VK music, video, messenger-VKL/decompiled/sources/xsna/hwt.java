package xsna;

import com.vk.api.generated.stories.dto.StoriesGetUnseenStatusResponseDto;
import com.vk.api.generated.stories.dto.StoriesUnseenStatusItemDto;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* compiled from: GetUnseenStoriesStatusApiCmd.kt */
/* loaded from: classes2.dex */
public final class hwt extends nx2<Map<Peer, ? extends Boolean>> {
    public final Collection<Peer> b;
    public final boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public hwt(Collection<? extends Peer> collection, boolean z) {
        this.b = collection;
        this.c = z;
    }

    @Override // xsna.nx2
    public final Map<Peer, ? extends Boolean> f(l7r0 l7r0Var) {
        Collection<Peer> collection = this.b;
        ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(com.vk.dto.common.a.b((Peer) it.next()));
        }
        tfx tfxVar = new tfx("stories.getUnseenStatus", new vcl0(1), new io.reactivex.rxjava3.internal.operators.mixed.j(27));
        tfx.p(tfxVar, "owner_ids", arrayList, 0L, 12);
        List<StoriesUnseenStatusItemDto> d = ((StoriesGetUnseenStatusResponseDto) ((az2) bz2.n(tfxVar, new x2e(this, 19)).c).invoke(l7r0Var)).d();
        int e = on00.e(c5g.u(d, 10));
        if (e < 16) {
            e = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(e);
        for (StoriesUnseenStatusItemDto storiesUnseenStatusItemDto : d) {
            Pair pair = new Pair(com.vk.dto.common.a.a(storiesUnseenStatusItemDto.q()), Boolean.valueOf(storiesUnseenStatusItemDto.d()));
            linkedHashMap.put(pair.i(), pair.j());
        }
        return linkedHashMap;
    }
}
