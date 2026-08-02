package defpackage;

import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.api.AccountListShowMode;
import com.yandex.passport.internal.properties.AccountListProperties;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.properties.VisualProperties;
import com.yandex.passport.internal.properties.b0;
import com.yandex.passport.internal.properties.i;
import com.yandex.passport.internal.util.p;

/* loaded from: classes15.dex */
public abstract class mtf0 {
    public static final LoginProperties a(hj3 hj3Var) {
        LoginProperties.a aVar = new LoginProperties.a();
        aVar.b = una1.c(hj3Var.a);
        aVar.J = hj3Var.d;
        aVar.y = gob1.d(hj3Var.b);
        bm3 bm3Var = hj3Var.c;
        VisualProperties.a aVar2 = new VisualProperties.a();
        if (bm3Var.a) {
            aVar2.a = true;
            AccountListProperties.a aVar3 = new AccountListProperties.a();
            aVar3.a = AccountListShowMode.FULLSCREEN;
            aVar3.b = AccountListBranding.Yandex.INSTANCE;
            aVar3.c = false;
            aVar2.F = p.v(aVar3);
        } else {
            aVar2.a = false;
            AccountListProperties.a aVar4 = new AccountListProperties.a();
            aVar4.a = AccountListShowMode.BOTTOM_SHEET;
            aVar4.b = AccountListBranding.Yandex.INSTANCE;
            aVar4.c = true;
            aVar2.F = p.v(aVar4);
        }
        VisualProperties.Companion.getClass();
        aVar.H = b0.a(aVar2);
        LoginProperties.Companion.getClass();
        return i.b(aVar);
    }
}
