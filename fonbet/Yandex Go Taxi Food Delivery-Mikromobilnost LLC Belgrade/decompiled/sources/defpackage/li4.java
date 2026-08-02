package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class li4 implements b70 {
    public static final List a = scc.g(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "backgroundGradientsTv");

    public static hi4 c(xdx xdxVar, c cVar) {
        Object b;
        String str = null;
        List list = null;
        while (true) {
            int h2 = xdxVar.h2(a);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 1) {
                    return new hi4(str, list);
                }
                lqy lqyVar = new lqy(new om60(l80.a(ki4.a)));
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b = null;
                } else {
                    b = lqyVar.b(xdxVar, cVar);
                }
                list = (List) b;
            }
        }
    }

    public static void d(bfx bfxVar, c cVar, hi4 hi4Var) {
        bfxVar.A1(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        l80.i.a(bfxVar, cVar, hi4Var.a);
        bfxVar.A1("backgroundGradientsTv");
        lqy lqyVar = new lqy(new om60(l80.a(ki4.a)));
        List list = hi4Var.b;
        if (list == null) {
            bfxVar.k2();
        } else {
            lqyVar.a(bfxVar, cVar, list);
        }
    }
}
