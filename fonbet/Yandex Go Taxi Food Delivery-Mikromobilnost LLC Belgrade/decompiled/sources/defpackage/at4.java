package defpackage;

import defpackage.shs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.a;
import ru.yandex.taxi.promotions.model.Promotion;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes9.dex */
public final class at4 {
    public final ir4 a;

    public at4(ir4 ir4Var) {
        this.a = ir4Var;
    }

    public final LinkedHashSet a(Promotion promotion) {
        List b = promotion.b();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String a = this.a.a((String) it.next());
            if (a != null) {
                linkedHashSet.add(a);
            }
        }
        return linkedHashSet;
    }

    public final boolean b(Promotion promotion) {
        String str;
        ArrayList arrayList;
        List list;
        boolean z = promotion instanceof shs;
        ir4 ir4Var = this.a;
        if (!z) {
            return !(promotion instanceof tg60) || (str = ((tg60) promotion).n) == null || evu0.J(str) || ir4Var.a.contains(str);
        }
        shs.a aVar = (shs.a) a.R(((shs) promotion).l);
        if (aVar == null || (list = aVar.f) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                PromotionBackground promotionBackground = (PromotionBackground) obj;
                if (promotionBackground.a == PromotionBackground.Type.VIDEO && !evu0.J(promotionBackground.b)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(tcc.n(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList.add(((PromotionBackground) it.next()).b);
            }
        }
        if (arrayList != null && !arrayList.isEmpty() && (arrayList == null || !arrayList.isEmpty())) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (!ir4Var.a.contains((String) it2.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
