package defpackage;

import com.yandex.go.parks.ParkRouterImpl$onAttachWithFragment$$inlined$safeCollectIn$1;
import com.yandex.go.parks.interactor.a;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.common.WebViewFragment;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes13.dex */
public final class le90 extends dds {
    public final a F;
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a G;

    public le90(a aVar, com.yandex.go.mainscreen.superapp.impl.fragment.a aVar2) {
        super(null);
        this.F = aVar;
        this.G = aVar2;
    }

    @Override // defpackage.dds
    public final com.yandex.go.mainscreen.superapp.impl.fragment.a P() {
        return this.G;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        tje.N(o(), null, null, new ParkRouterImpl$onAttachWithFragment$$inlined$safeCollectIn$1(this.F.a(((ke90) obj).b), null, (WebViewFragment) baseFragment), 3);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(null, null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194303, null);
        uiWebViewConfig.setHasTitleFromWeb(false);
        uiWebViewConfig.setTitle(((ke90) obj).a);
        uiWebViewConfig.setBusinessName("tariffs");
        WebViewFragment.Companion.getClass();
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.setConfig(uiWebViewConfig);
        return webViewFragment;
    }
}
