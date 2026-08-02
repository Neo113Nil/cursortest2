package defpackage;

import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes12.dex */
public final class hvz extends h55 {
    public final gf41 D;

    public hvz(gf41 gf41Var) {
        super(null);
        this.D = gf41Var;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        gvz gvzVar = (gvz) obj;
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = gvzVar.a;
        A(this.D.a().b(), new dg41(new UiWebViewConfig(aVar.a(), null, true, false, false, false, null, false, true, null, false, false, UiWebViewConfig.SignalForLoaded.OnCommitVisible.INSTANCE, null, null, 1, 0, false, false, null, false, false, 4157178, null), null, null, null, new oqc(1, this, gvzVar), null, null, 222), new dl1(20, this));
    }
}
