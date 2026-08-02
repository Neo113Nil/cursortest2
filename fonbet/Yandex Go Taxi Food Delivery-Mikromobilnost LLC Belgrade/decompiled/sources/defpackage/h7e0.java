package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import java.util.List;

/* loaded from: classes2.dex */
public final class h7e0 implements b70 {
    public static final h7e0 a = new h7e0();
    public static final List b = scc.g("textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "action", "subscriptionProductTarget");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        a7e0 a7e0Var = (a7e0) obj;
        bfxVar.A1("textColor");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, a7e0Var.a);
        bfxVar.A1(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        om60Var.a(bfxVar, cVar, a7e0Var.b);
        bfxVar.A1("action");
        ep60 a2 = l80.a(f7e0.a);
        y6e0 y6e0Var = a7e0Var.c;
        if (y6e0Var == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, y6e0Var);
        }
        bfxVar.A1("subscriptionProductTarget");
        om60Var.a(bfxVar, cVar, a7e0Var.d);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        y6e0 y6e0Var = null;
        String str3 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 2) {
                ep60 a2 = l80.a(f7e0.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                y6e0Var = (y6e0) b2;
            } else {
                if (h2 != 3) {
                    return new a7e0(str, str2, y6e0Var, str3);
                }
                str3 = (String) l80.i.b(xdxVar, cVar);
            }
        }
    }
}
