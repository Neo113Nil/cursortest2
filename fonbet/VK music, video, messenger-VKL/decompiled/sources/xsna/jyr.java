package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: FolderDialogsDataSource.kt */
/* loaded from: classes18.dex */
public final class jyr implements hnm {
    public final a1w a;
    public final int b;

    public jyr(a1w a1wVar, int i) {
        this.a = a1wVar;
        this.b = i;
    }

    @Override // xsna.hnm
    public final io.reactivex.rxjava3.internal.operators.single.c a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList(c5g.u(linkedHashSet, 10));
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Serializer.c<Peer> cVar = Peer.CREATOR;
            arrayList.add(Peer.a.b(longValue));
        }
        return this.a.C(this, new tqm(new sqm(arrayList, null, false, null, this.b, 14)));
    }
}
