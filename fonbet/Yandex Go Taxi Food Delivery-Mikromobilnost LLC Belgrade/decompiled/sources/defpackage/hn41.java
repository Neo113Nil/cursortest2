package defpackage;

import java.util.HashMap;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.view.WebViewState$State;

/* loaded from: classes6.dex */
public final class hn41 extends ad5 {
    public final h3y A;
    public final h3y B;
    public final h3y C;
    public final bpt D;
    public String E;
    public String F;
    public String G;
    public UiWebViewConfig H;
    public cu41 I;
    public pzt0 J;
    public final h3y x;
    public final h3y y;
    public final h3y z;

    public hn41(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5, h3y h3yVar6, bpt bptVar) {
        super(gn41.class);
        this.x = h3yVar;
        this.y = h3yVar2;
        this.z = h3yVar3;
        this.A = h3yVar4;
        this.B = h3yVar5;
        this.C = h3yVar6;
        this.D = bptVar;
        this.E = "";
        this.H = new UiWebViewConfig(new CoreWebViewConfig.a().a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        this.I = cu41.b;
    }

    public static final void Kg(hn41 hn41Var, String str, boolean z) {
        if (!hn41Var.H.getHasTitleFromWeb() || hn41Var.I.a == WebViewState$State.ERROR) {
            return;
        }
        hn41Var.E = str;
        if (z) {
            ((gn41) hn41Var.Dg()).nb(hn41Var.I);
        }
    }

    public final void Lg(String str) {
        Og(cu41.b);
        if (this.H.getCoreConfig().getIsCompatibleWithMob()) {
            str = this.D.b(str);
        }
        ((gn41) Dg()).loadUrl(str, Mg());
    }

    public final HashMap Mg() {
        HashMap hashMap = new HashMap();
        CoreWebViewConfig coreConfig = this.H.getCoreConfig();
        if (coreConfig.shouldUseAuthorizationHeader()) {
            hashMap.put("Authorization", kp50.h(coreConfig.getToken(null)));
        }
        hashMap.put("Accept-Language", ((j5z) this.C.get()).d());
        hashMap.putAll(coreConfig.getHeaders());
        return hashMap;
    }

    public final void Ng(String str, String str2) {
        ((gn41) Dg()).clearHistory();
        ((gn41) Dg()).G2(str, str2);
    }

    public final void Og(cu41 cu41Var) {
        this.I = cu41Var;
        ((gn41) Dg()).nb(this.I);
    }
}
