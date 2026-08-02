package defpackage;

import android.net.Uri;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes6.dex */
public final class fza {
    public final UiWebViewConfig a(bza bzaVar) {
        if (!(bzaVar instanceof aza)) {
            w511.b();
            return null;
        }
        String builder = Uri.parse(((aza) bzaVar).a).buildUpon().toString();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = builder;
        aVar.e = true;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setTitleHorizontalAlignment(0);
        uiWebViewConfig.setShouldUseCached(false);
        return uiWebViewConfig;
    }
}
