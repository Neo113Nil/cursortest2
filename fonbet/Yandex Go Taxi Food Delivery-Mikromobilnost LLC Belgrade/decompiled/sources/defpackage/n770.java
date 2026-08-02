package defpackage;

import com.yandex.go.flex.common.api.actions.OpenWebAction;
import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;

/* loaded from: classes13.dex */
public final class n770 implements dw {
    public final oep0 a;
    public final yvf0 b;
    public final qgc0 c;

    public n770(oep0 oep0Var, yvf0 yvf0Var, qgc0 qgc0Var) {
        this.a = oep0Var;
        this.b = yvf0Var;
        this.c = qgc0Var;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        PlacesWebAuthType placesWebAuthType;
        OpenWebAction openWebAction = (OpenWebAction) krVar;
        rwo0 rwo0Var = new rwo0(6, (vgc0) this.b.get(), this.c);
        String str = openWebAction.a;
        int i = m770.a[openWebAction.b.ordinal()];
        if (i == 1) {
            placesWebAuthType = PlacesWebAuthType.OAUTH;
        } else if (i == 2) {
            placesWebAuthType = PlacesWebAuthType.COOKIES;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            placesWebAuthType = null;
        }
        ((pep0) this.a).f(rwo0Var, new ugc0(str, placesWebAuthType, false, 12), hxx.a);
    }
}
