package xsna;

import com.vk.audience.api.domain.AudienceResearchSurfaceCode;
import com.vk.dto.stickers.StickersDictionaryItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class y94 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y94(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                List list = (List) this.c;
                db4 db4Var = (db4) this.d;
                AudienceResearchSurfaceCode audienceResearchSurfaceCode = (AudienceResearchSurfaceCode) this.e;
                List list2 = list;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(db4Var.a((String) it.next()).b(audienceResearchSurfaceCode).build());
                }
                return arrayList;
            default:
                StickersDictionaryItem a = ((dk5) this.c).a((String) this.d, (k6n0) this.e);
                return a == null ? new StickersDictionaryItem(null, null, null, null, false, 31, null) : a;
        }
    }
}
