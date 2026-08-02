package defpackage;

import com.yandex.go.mainscreen.superapp.impl.fragment.a;
import com.yandex.go.navigation.api.router.FragmentAnimation$TransitionType;
import com.yandex.go.taxi.tariffs.LegacyTariffsRouterImpl$onAttachWithFragment$$inlined$safeCollectIn$1;
import com.yandex.go.taxi.tariffs.interactor.s;
import ru.yandex.taxi.fragment.BaseFragment;
import ru.yandex.taxi.fragment.common.WebViewFragment;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final class nay extends dds {
    public final s F;
    public final zuj0 G;
    public final a H;

    public nay(s sVar, zuj0 zuj0Var, a aVar) {
        super(null);
        this.F = sVar;
        this.G = zuj0Var;
        this.H = aVar;
    }

    @Override // defpackage.dds
    public final a P() {
        return this.H;
    }

    @Override // defpackage.dds
    public final void Q(Object obj, BaseFragment baseFragment) {
        lay layVar = (lay) obj;
        String str = layVar.a;
        tje.N(o(), null, null, new LegacyTariffsRouterImpl$onAttachWithFragment$$inlined$safeCollectIn$1(this.F.b(layVar.b, str), null, (WebViewFragment) baseFragment), 3);
    }

    @Override // defpackage.dds
    public final xbs S(Object obj) {
        return new vbs(FragmentAnimation$TransitionType.ENTER);
    }

    @Override // defpackage.dds
    public final BaseFragment T(Object obj) {
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(null, null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194303, null);
        uiWebViewConfig.setTitle(((avj0) this.G).h(kyh0.tariffs_title));
        uiWebViewConfig.setHasTitleFromWeb(false);
        uiWebViewConfig.setBusinessName("tariffs");
        WebViewFragment.Companion.getClass();
        WebViewFragment webViewFragment = new WebViewFragment();
        webViewFragment.setConfig(uiWebViewConfig);
        return webViewFragment;
    }

    @Override // defpackage.dds
    public final xbs U() {
        return new vbs(FragmentAnimation$TransitionType.RETURN);
    }
}
