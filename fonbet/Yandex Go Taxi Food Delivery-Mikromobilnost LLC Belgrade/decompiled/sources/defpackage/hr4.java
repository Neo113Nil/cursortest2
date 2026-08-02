package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes5.dex */
public abstract class hr4 {
    public static final String a(ir4 ir4Var, String str) {
        if (str != null) {
            return ir4Var.a(str);
        }
        return null;
    }

    public static final PromotionBackground b(List list, ir4 ir4Var, PromotionBackground.Type type) {
        Object obj;
        String a;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((PromotionBackground) obj).a == type) {
                break;
            }
        }
        PromotionBackground promotionBackground = (PromotionBackground) obj;
        if (promotionBackground == null) {
            return null;
        }
        if (type != PromotionBackground.Type.COLOR) {
            if (!ir4Var.a.contains(promotionBackground.b)) {
                return null;
            }
            if (type == PromotionBackground.Type.VIDEO && ((a = promotionBackground.a()) == null || !ir4Var.a.contains(a))) {
                return null;
            }
        }
        return promotionBackground;
    }

    public static final String c(PromotionBackground promotionBackground, ir4 ir4Var) {
        if (evu0.J(promotionBackground.b)) {
            return null;
        }
        return ir4Var.a(promotionBackground.b);
    }
}
