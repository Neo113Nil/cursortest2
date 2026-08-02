package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesCachedData;
import com.vk.story.viewer.stat.data.cache.viewers.replies.RepliesKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class b4u implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b4u(Object obj, int i, int i2) {
        this.b = i2;
        this.d = obj;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        List<hfz> list;
        switch (this.b) {
            case 0:
                cxo cxoVar = (cxo) this.d;
                h8u h8uVar = cxoVar.J;
                h8u h8uVar2 = null;
                if (h8uVar == null || (list = h8uVar.j) == null) {
                    arrayList = null;
                } else {
                    ArrayList arrayList2 = new ArrayList(list);
                    arrayList = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        hfz hfzVar = (hfz) it.next();
                        if (epx.f(hfzVar.getItemId(), Integer.valueOf(this.c)) && (hfzVar instanceof t7u)) {
                            t7u t7uVar = (t7u) hfzVar;
                            hfzVar = new u7u(t7uVar.b, t7uVar.c, t7uVar.d, t7uVar.e, t7uVar.f, t7uVar.g, t7uVar.h, t7uVar.i, t7uVar.j);
                        }
                        arrayList.add(hfzVar);
                    }
                }
                h8u h8uVar3 = cxoVar.J;
                List list2 = arrayList;
                if (h8uVar3 != null) {
                    if (arrayList == null) {
                        list2 = EmptyList.b;
                    }
                    h8uVar2 = h8u.c(h8uVar3, list2, 524031);
                }
                cxoVar.J = h8uVar2;
                c4u.d(cxoVar);
                return s3q0.a;
            case 1:
                List<StoriesContainer> list3 = ((RepliesCachedData) obj).b.get(new RepliesKey((UserId) this.d, this.c));
                return list3 != null ? io.reactivex.rxjava3.core.k.i(list3) : io.reactivex.rxjava3.internal.operators.maybe.i.b;
            default:
                ((ogs0) this.d).invoke(new rbt0(this.c, 50, 0, 16, EmptyList.b));
                return s3q0.a;
        }
    }

    public /* synthetic */ b4u(cxo cxoVar, c4u c4uVar, int i) {
        this.b = 0;
        this.d = cxoVar;
        this.c = i;
    }
}
