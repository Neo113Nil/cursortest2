package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.route.interactor.b;
import com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a;

/* loaded from: classes14.dex */
public final class acw {
    public final ifw a;
    public final a b;
    public final wiq0 c;
    public final b d;

    public acw(ifw ifwVar, a aVar, wiq0 wiq0Var, b bVar) {
        this.a = ifwVar;
        this.b = aVar;
        this.c = wiq0Var;
        this.d = bVar;
    }

    public final String a() {
        v8b1 a = this.a.a();
        if (a == null) {
            return null;
        }
        if (a instanceof agw) {
            return Constants.DEEPLINK;
        }
        if (a instanceof bgw) {
            return "discovery";
        }
        if (a instanceof cgw) {
            return "summary";
        }
        if (a instanceof dgw) {
            return "superapp";
        }
        if (a instanceof zfw) {
            return "summary";
        }
        w511.b();
        return null;
    }
}
