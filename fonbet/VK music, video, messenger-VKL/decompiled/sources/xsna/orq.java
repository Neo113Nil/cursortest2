package xsna;

import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AdaptedFunctionReference;
import xsna.csq;
import xsna.qn60;

/* compiled from: FaveRenameTagEditorAction.kt */
/* loaded from: classes4.dex */
public final class orq implements qn60.b {
    public final FaveTag a;
    public final pn60 b;

    /* compiled from: FaveRenameTagEditorAction.kt */
    public static final /* synthetic */ class a extends AdaptedFunctionReference implements izs<Object, List<? extends ol60>> {
        @Override // xsna.izs
        public final List<? extends ol60> invoke(Object obj) {
            return pn60.c((pn60) this.receiver, obj, null, null, 14);
        }
    }

    public orq(FaveTag faveTag, pn60 pn60Var) {
        this.a = faveTag;
        this.b = pn60Var;
    }

    @Override // xsna.qn60.b
    public final void a(qn60.a aVar) {
        FaveTag faveTag = this.a;
        HashSet c = aVar.c(new csq.a(faveTag.b));
        if (c == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            FaveEntry faveEntry = (FaveEntry) it.next();
            FaveItem faveItem = faveEntry.i;
            List<FaveTag> list = faveItem.e;
            ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
            for (FaveTag faveTag2 : list) {
                if (faveTag2.b == faveTag.b) {
                    faveTag2 = faveTag;
                }
                arrayList2.add(faveTag2);
            }
            FaveEntry faveEntry2 = new FaveEntry(new FaveItem(faveItem.b, faveItem.c, faveItem.d, arrayList2, faveItem.f), faveEntry.j, faveEntry.k);
            faveEntry2.c = faveEntry.c;
            faveEntry2.g = faveEntry.g;
            faveEntry2.h = faveEntry.h;
            arrayList.add(faveEntry2);
        }
        aVar.f(c, new a(1, this.b, pn60.class, "transform", "transform(Ljava/lang/Object;Lcom/vk/newsfeed/common/presentation/model/modifiers/NewsfeedItemModifier;Ljava/util/Map;Lcom/vk/dto/newsfeed/RenderingNestedItemsMeasurer;)Ljava/util/List;", 0));
    }
}
