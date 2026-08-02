package xsna;

import com.vk.api.generated.video.dto.VideoVideoFullDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ List c;

    public /* synthetic */ mom(List list, int i) {
        this.b = i;
        this.c = list;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar.V;
                List list2 = this.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (!list.contains(Integer.valueOf(((Number) obj2).intValue()))) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList.isEmpty() ^ true ? com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, null, 0, false, false, null, j5g.u0(arrayList, list), 0, null, 0, -1, 2080767) : bVar;
            case 1:
                return Boolean.valueOf(this.c.contains(((gza0) obj).b));
            case 2:
                int intValue = ((Integer) obj).intValue();
                List list3 = this.c;
                Object obj3 = null;
                if (list3 == null) {
                    return null;
                }
                Iterator it = list3.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        Integer s1 = ((VideoVideoFullDto) next).s1();
                        if (s1 != null && s1.intValue() == intValue) {
                            obj3 = next;
                        }
                    }
                }
                return (VideoVideoFullDto) obj3;
            default:
                ((rzq0) obj).b(new wow(this.c), nzo.b);
                return s3q0.a;
        }
    }
}
