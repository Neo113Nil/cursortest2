package xsna;

import com.vk.im.engine.models.dialogs.DialogTheme;
import kotlin.Pair;
import xsna.x9m;

/* compiled from: DialogThemeStorageImpl.kt */
/* loaded from: classes2.dex */
public final class ilm {
    public static final Pair a(okm okmVar, plm plmVar, lam lamVar, x9m x9mVar, String str) {
        Pair<com.vk.im.engine.models.dialogs.c, DialogTheme> b = plmVar.b(okmVar.a, b(x9mVar.c), b(x9mVar.d));
        if (b == null) {
            return null;
        }
        if (lamVar == null || !b.i().a()) {
            return b;
        }
        return Pair.h(b, DialogTheme.zb(b.j(), null, hpo0.j(lamVar), null, str, 5));
    }

    public static final npo0 b(x9m.a aVar) {
        return new npo0(aVar.a, aVar.b, aVar.c, aVar.d, aVar.e, aVar.f, aVar.g.a);
    }
}
