package defpackage;

import com.apollographql.apollo3.api.c;
import com.apollographql.apollo3.api.json.JsonReader$Token;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import java.util.List;

/* loaded from: classes2.dex */
public final class ifg implements b70 {
    public static final ifg a = new ifg();
    public static final List b = scc.g("textColor", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "action");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        cfg cfgVar = (cfg) obj;
        bfxVar.A1("textColor");
        om60 om60Var = l80.i;
        om60Var.a(bfxVar, cVar, cfgVar.a);
        bfxVar.A1(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        om60Var.a(bfxVar, cVar, cfgVar.b);
        bfxVar.A1("action");
        ep60 a2 = l80.a(gfg.a);
        afg afgVar = cfgVar.c;
        if (afgVar == null) {
            bfxVar.k2();
        } else {
            a2.a(bfxVar, cVar, afgVar);
        }
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        Object b2;
        String str = null;
        String str2 = null;
        afg afgVar = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                str = (String) l80.i.b(xdxVar, cVar);
            } else if (h2 == 1) {
                str2 = (String) l80.i.b(xdxVar, cVar);
            } else {
                if (h2 != 2) {
                    return new cfg(str, str2, afgVar);
                }
                ep60 a2 = l80.a(gfg.a);
                if (xdxVar.peek() == JsonReader$Token.NULL) {
                    xdxVar.skipValue();
                    b2 = null;
                } else {
                    b2 = a2.b(xdxVar, cVar);
                }
                afgVar = (afg) b2;
            }
        }
    }
}
