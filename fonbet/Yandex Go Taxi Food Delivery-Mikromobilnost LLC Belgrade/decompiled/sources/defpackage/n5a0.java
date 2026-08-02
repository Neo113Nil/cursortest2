package defpackage;

import com.apollographql.apollo3.api.c;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import java.util.List;

/* loaded from: classes2.dex */
public final class n5a0 implements b70 {
    public static final n5a0 a = new n5a0();
    public static final List b = scc.g(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "iconUrl", "textColor");

    @Override // defpackage.b70
    public final void a(bfx bfxVar, c cVar, Object obj) {
        z3a0 z3a0Var = (z3a0) obj;
        bfxVar.A1(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR);
        foe foeVar = l80.a;
        bfxVar.r0(z3a0Var.a);
        bfxVar.A1("iconUrl");
        bfxVar.r0(z3a0Var.b);
        bfxVar.A1("textColor");
        bfxVar.r0(z3a0Var.c);
    }

    @Override // defpackage.b70
    public final Object b(xdx xdxVar, c cVar) {
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int h2 = xdxVar.h2(b);
            if (h2 == 0) {
                foe foeVar = l80.a;
                str = xdxVar.nextString();
            } else if (h2 == 1) {
                foe foeVar2 = l80.a;
                str2 = xdxVar.nextString();
            } else {
                if (h2 != 2) {
                    return new z3a0(str, str2, str3);
                }
                foe foeVar3 = l80.a;
                str3 = xdxVar.nextString();
            }
        }
    }
}
