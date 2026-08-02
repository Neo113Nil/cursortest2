package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.chat.clips.decoration.api.models.ImChatPaginationKey;
import com.vk.im.engine.models.attaches.HistoryAttach;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.hfr;
import xsna.ye20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mob implements izs {
    public final /* synthetic */ ImChatPaginationKey b;
    public final /* synthetic */ nob c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ mob(ImChatPaginationKey imChatPaginationKey, nob nobVar, boolean z, int i) {
        this.b = imChatPaginationKey;
        this.c = nobVar;
        this.d = z;
        this.e = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ye20.a aVar = (ye20.a) obj;
        List<HistoryAttach> list = aVar.a;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((HistoryAttach) it.next()).b));
        }
        hfr j = rli0.j(new i5g(aVar.a), new g8(7));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        hfr.a aVar2 = new hfr.a(j);
        while (aVar2.hasNext()) {
            Object next = aVar2.next();
            Integer num = ((HistoryAttach) next).g;
            if (num == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            linkedHashMap.put(Integer.valueOf(num.intValue()), next);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            String str = ((HistoryAttach) entry.getValue()).h;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            linkedHashMap2.put(key, str);
        }
        MsgIdType msgIdType = MsgIdType.CNV_ID;
        Serializer.c<Peer> cVar = Peer.CREATOR;
        ImChatPaginationKey imChatPaginationKey = this.b;
        Peer b = Peer.a.b(imChatPaginationKey.c);
        Source source = Source.CACHE;
        nob nobVar = this.c;
        return new io.reactivex.rxjava3.internal.operators.single.r(nobVar.c.b(nobVar, new dj30(msgIdType, arrayList, b, source, false, nobVar)), new lh3(new kob(arrayList, imChatPaginationKey, nobVar, aVar, linkedHashMap2, this.d, this.e), 4));
    }
}
