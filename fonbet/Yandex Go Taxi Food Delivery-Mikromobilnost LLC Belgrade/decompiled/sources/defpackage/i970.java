package defpackage;

import com.yandex.go.flex.common.api.actions.OpenWebAction;
import ru.yandex.taxi.am.AuthType;

/* loaded from: classes.dex */
public final class i970 implements dw {
    public final yvf0 a;
    public final oep0 b;

    public i970(vw2 vw2Var, oep0 oep0Var) {
        this.a = vw2Var;
        this.b = oep0Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        AuthType authType;
        OpenWebAction openWebAction = (OpenWebAction) krVar;
        m950 m950Var = (m950) this.a.get();
        String str = openWebAction.a;
        int i = h970.a[openWebAction.b.ordinal()];
        if (i == 1) {
            authType = AuthType.OAUTH;
        } else if (i == 2) {
            authType = AuthType.COOKIES;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            authType = null;
        }
        ((pep0) this.b).f(m950Var, new fnr(str, authType, openWebAction.c, new uhx(27, n6uVar), openWebAction.d), hxx.a);
    }
}
