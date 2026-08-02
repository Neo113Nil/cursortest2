package defpackage;

import kotlin.a;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes.dex */
public final class hjb0 implements gjb0 {
    public final oep0 a;
    public final gf41 b;
    public final i3y c = a.a(new t9a0(8, this));

    public hjb0(oep0 oep0Var, gf41 gf41Var) {
        this.a = oep0Var;
        this.b = gf41Var;
    }

    public final void a(String str) {
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.j(str);
        ((pep0) this.a).f(((scg) ((ff41) this.c.getValue())).b(), new dg41(new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, true, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194174, null), null, null, null, null, null, null, 254), hxx.a);
    }
}
