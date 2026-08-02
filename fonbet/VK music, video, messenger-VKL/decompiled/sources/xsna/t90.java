package xsna;

import com.vk.games.model.GamesCatalogActivityType;
import com.vk.games.model.GamesCatalogSection;
import xsna.djc;

/* compiled from: ActivityItem.kt */
/* loaded from: classes17.dex */
public final class t90 {
    public static final djc a(s90 s90Var, Integer num) {
        sbt sbtVar;
        return (s90Var.d == GamesCatalogActivityType.STICKERS_ACHIEVEMENT || (sbtVar = s90Var.a) == null) ? new djc.a(s90Var.j) : new djc.b(sbtVar, num, null, null);
    }

    public static final s90 b(GamesCatalogSection.a.C1078a c1078a, String str) {
        GamesCatalogActivityType gamesCatalogActivityType = c1078a.c;
        if (gamesCatalogActivityType == null) {
            return null;
        }
        uet uetVar = null;
        sbt sbtVar = c1078a.a;
        if (sbtVar != null) {
            uetVar = new uet(sbtVar.a.b, sbtVar.c, sbtVar.d);
        }
        return new s90(sbtVar, uetVar, c1078a.b, gamesCatalogActivityType, c1078a.d, c1078a.e, c1078a.f, c1078a.g, c1078a.h, str);
    }
}
