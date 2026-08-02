package xsna;

import com.vk.dialogtags.impl.list.TagsListState;
import com.vk.dto.attaches.Attach;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class gpm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ gpm(int i, int i2) {
        this.b = i2;
        this.c = i;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.im.engine.models.dialogs.b bVar = (com.vk.im.engine.models.dialogs.b) obj;
                List<Integer> list = bVar.L;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return bVar;
                }
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    int i = this.c;
                    if (intValue <= i) {
                        ArrayList arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            if (((Number) obj2).intValue() > i) {
                                arrayList.add(obj2);
                            }
                        }
                        return com.vk.im.engine.models.dialogs.b.a(bVar, null, null, null, 0, 0, 0, 0, 0, 0, false, null, null, null, null, null, false, null, false, null, null, null, false, null, null, null, arrayList, 0, false, false, null, null, 0, null, 0, -1, 2097135);
                    }
                }
                return bVar;
            case 1:
                TagsListState tagsListState = (TagsListState) obj;
                return TagsListState.a(tagsListState, null, j5g.v0(Integer.valueOf(this.c), tagsListState.c), 5);
            default:
                return Boolean.valueOf(((Attach) obj).xb() == this.c);
        }
    }
}
