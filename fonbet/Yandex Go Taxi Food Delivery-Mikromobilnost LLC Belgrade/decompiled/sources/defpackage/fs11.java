package defpackage;

import com.yandex.go.ugc.UgcWebViewTheme;
import com.yandex.go.ugc.f;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.web.deeplink.WebViewFromDeeplinkExperiment;

/* loaded from: classes14.dex */
public final class fs11 implements as11 {
    public final WebViewFromDeeplinkExperiment.a a;
    public final /* synthetic */ f b;

    public fs11(f fVar, WebViewFromDeeplinkExperiment.a aVar) {
        this.b = fVar;
        this.a = aVar;
    }

    public final void a(UgcWebViewTheme ugcWebViewTheme) {
        ThemeType themeType;
        xf41 a = ((scg) this.b.T()).a();
        int i = ls11.a[ugcWebViewTheme.ordinal()];
        if (i == 1) {
            themeType = ThemeType.LIGHT;
        } else if (i == 2) {
            themeType = ThemeType.DARK;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            themeType = null;
        }
        ((ag41) a).a.g(new mf41(themeType));
    }
}
