package defpackage;

import kotlin.coroutines.Continuation;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class l88 implements vpr {
    public final /* synthetic */ ff41 a;

    public l88(ff41 ff41Var) {
        this.a = ff41Var;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        CoreWebViewConfig.Companion.getClass();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = (String) obj;
        ((ag41) ((scg) this.a).a()).a(new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 1, 0, true, false, null, false, false, 4030202, null));
        return zy11.a;
    }
}
