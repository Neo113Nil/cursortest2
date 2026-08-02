package xsna;

import com.vk.api.generated.base.dto.BaseStickerDto;
import com.vk.dto.stickers.StickerItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o6e0 implements izs {
    public final /* synthetic */ long b;
    public final /* synthetic */ r6e0 c;

    public /* synthetic */ o6e0(long j, r6e0 r6e0Var) {
        this.b = j;
        this.c = r6e0Var;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List list = (List) obj;
        ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            StickerItem a = bo6.a((BaseStickerDto) it.next());
            int i = a.b;
            arrayList2.add(new h6e0(i, a, this.b));
            arrayList.add(Integer.valueOf(i));
            arrayList3.add(a);
        }
        asu0.a.getClass();
        asu0.n().execute(new ac3(this.c, arrayList2, arrayList, 4));
        return io.reactivex.rxjava3.core.q.T(arrayList3);
    }
}
