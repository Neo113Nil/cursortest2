package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.ui.holders.group.GroupLikeRecentBusinessesVh;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupLikes;
import com.vk.dto.stickers.bonus.StickerStockItemDiscount;
import com.vk.dto.stickers.bonus.StickerStockItemDiscounts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.sl7;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class rl7 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rl7(Object obj, boolean z, Object obj2, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                com.vk.lists.c cVar = (com.vk.lists.c) this.d;
                sl7 sl7Var = (sl7) this.e;
                sl7.a aVar = sl7Var.m;
                StickerStockItemDiscounts stickerStockItemDiscounts = (StickerStockItemDiscounts) obj;
                String str = stickerStockItemDiscounts.c;
                List<StickerStockItemDiscount> list = stickerStockItemDiscounts.b;
                cVar.s(str);
                if (this.c) {
                    boolean z = sl7Var.p;
                    aVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ol7((StickerStockItemDiscount) it.next(), z));
                    }
                    aVar.setItems(arrayList);
                } else {
                    boolean z2 = sl7Var.p;
                    aVar.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(aVar.h);
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(new ol7((StickerStockItemDiscount) it2.next(), z2));
                    }
                    aVar.setItems(arrayList2);
                }
                break;
            default:
                Group group = (Group) this.d;
                GroupLikeRecentBusinessesVh groupLikeRecentBusinessesVh = (GroupLikeRecentBusinessesVh) this.e;
                ((Boolean) obj).booleanValue();
                if (group.T == null) {
                    group.T = new GroupLikes(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }
                GroupLikes groupLikes = group.T;
                if (groupLikes != null) {
                    groupLikes.c = !this.c;
                }
                UIBlockGroup uIBlockGroup = groupLikeRecentBusinessesVh.e;
                if (uIBlockGroup != null) {
                    groupLikeRecentBusinessesVh.N6(uIBlockGroup);
                }
                break;
        }
        return s3q0.a;
    }
}
