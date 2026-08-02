package defpackage;

import android.view.View;
import com.yandex.go.preorder.suggested.menu.analytics.SuggestMenuLegacyAnalytics$Prefix;
import com.yandex.go.preorder.suggested.menu.presenter.b;
import com.yandex.go.requirements.comment.summary.ui.v3.data.net.api.AIRequirementsCommentApi;
import com.yandex.go.superapp.discovery.map.impl.experiments.SuperAppDiscoveryMapExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.s;
import com.yandex.go.superapp.discovery.map.impl.experiments.transport.SuperAppDiscoveryMapTransportExperiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.SuperAppDiscoveryMapV2Experiment;
import com.yandex.go.superapp.discovery.map.impl.experiments.v2.p;
import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.SuperAppOrderBundleView;
import com.yandex.go.superapp.orders.bundle.modal.impl.presentation.ui.f;
import com.yandex.go.taxi.summary.models.SummaryVerticalHeaderExperiment;
import com.yandex.go.yb.ui.SuggestYbCardInRideView;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import com.ybsdk.widgets.common.SuggestsGroupView;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.fragment.SuggestedFavoritesFragment;
import ru.yandex.taxi.network.api.models.GoApiName;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.i;
import ru.yandex.taxi.preorder.summary.tariffpage.badge.j;
import ru.yandex.taxi.stories.domain.a;
import ru.yandex.taxi.stories.presentation.preview.StoryPreviewView;
import ru.yandex.taxi.stories.presentation.preview.StoryPreviewView$loadImage$1;
import ru.yandex.taxi.stories.presentation.story.StoryModalView;
import ru.yandex.taxi.superapp.chat.view.SuperAppChatView;

/* loaded from: classes14.dex */
public final /* synthetic */ class ogu0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ogu0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 playImage$lambda$1;
        zy11 onViewAttachedToWindow$lambda$1;
        View insetsType$lambda$0;
        g7r finalizeAddressByGravityRouter_delegate$lambda$0;
        qa3 suggestsAdapter_delegate$lambda$0;
        View view;
        View insetsType$lambda$02;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((qht0) ((pgu0) obj).d).b(ghv0.a);
                return zy11Var;
            case 1:
                playImage$lambda$1 = StoryModalView.playImage$lambda$1((StoryModalView) obj);
                return playImage$lambda$1;
            case 2:
                amp0 amp0Var = (amp0) obj;
                tlu0 tlu0Var = (tlu0) amp0Var.b;
                return new a(tlu0Var.d, tlu0Var.e, tlu0Var.f, tlu0Var.g, tlu0Var.o, (gou0) amp0Var.a);
            case 3:
                onViewAttachedToWindow$lambda$1 = StoryPreviewView$loadImage$1.onViewAttachedToWindow$lambda$1((StoryPreviewView) obj);
                return onViewAttachedToWindow$lambda$1;
            case 4:
                return Float.valueOf(((ru.yandex.taxi.communications.stories.domain.a) obj).F.getResources().getDimension(mrg0.story_card_corner_radius));
            case 5:
                return (mth) obj;
            case 6:
                b bVar = (b) obj;
                bVar.Wg(i6v0.a);
                hwo0 hwo0Var = bVar.z;
                o7r0 o7r0Var = (o7r0) hwo0Var.w;
                SuggestMenuLegacyAnalytics$Prefix suggestMenuLegacyAnalytics$Prefix = (SuggestMenuLegacyAnalytics$Prefix) hwo0Var.x;
                o7r0Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put(AppSettingsContract$Setting.COLUMN_PREFIX, suggestMenuLegacyAnalytics$Prefix.getEventValue());
                HashMap hashMap2 = new HashMap();
                Regex regex = sho.a;
                o7r0Var.a.a(sb2.q("${prefix}.MapFailed", hashMap), hashMap, 1, hashMap2);
                return zy11Var;
            case 7:
                insetsType$lambda$0 = SuggestYbCardInRideView.insetsType$lambda$0((SuggestYbCardInRideView) obj);
                return insetsType$lambda$0;
            case 8:
                finalizeAddressByGravityRouter_delegate$lambda$0 = SuggestedFavoritesFragment.finalizeAddressByGravityRouter_delegate$lambda$0((SuggestedFavoritesFragment) obj);
                return finalizeAddressByGravityRouter_delegate$lambda$0;
            case 9:
                suggestsAdapter_delegate$lambda$0 = SuggestsGroupView.suggestsAdapter_delegate$lambda$0((SuggestsGroupView) obj);
                return suggestsAdapter_delegate$lambda$0;
            case 10:
                on2 on2Var = ((xbv0) obj).a;
                on2Var.getClass();
                return (AIRequirementsCommentApi) on2Var.a(GoApiName.TaxiV4, AIRequirementsCommentApi.class);
            case 11:
                return ((avj0) ((i) obj).e).h(kyh0.change_payment_title);
            case 12:
                return Integer.valueOf(((avj0) ((j) obj).c).c(mrg0.component_safe_image_padding));
            case 13:
                ((ru.yandex.taxi.preorder.summary.tariffpage.requirements.a) obj).g.a();
                return zy11Var;
            case 14:
                jov0 jov0Var = (jov0) obj;
                jov0Var.R.b();
                jov0Var.F.a();
                return zy11Var;
            case 15:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                cne0 cne0Var = ((ru.yandex.taxi.tooltips.repository.b) obj).c;
                for (String str : cne0Var.e()) {
                    concurrentHashMap.put(str, Integer.valueOf(cne0Var.i(str, 0)));
                }
                return concurrentHashMap;
            case 16:
                return (SummaryVerticalHeaderExperiment) ((brv0) obj).a.b();
            case 17:
                view = ((SuperAppChatView) obj).webViewContainer;
                return view;
            case 18:
                return ((jbh) ((s) obj).a).e(SuperAppDiscoveryMapExperiment.k);
            case 19:
                return Integer.valueOf(c.d(sug0.super_app_map_category_filter_text_padding, ((com.yandex.go.superapp.discovery.map.impl.ui.main.filters.adapter.a) obj).a));
            case 20:
                ((ivv0) obj).b();
                return zy11Var;
            case 21:
                return (m950) obj;
            case 22:
                return (m950) ((com.yandex.go.superapp.discovery.map.impl.navigation.c) obj).Q.get();
            case 23:
                rqo rqoVar = ((com.yandex.go.superapp.discovery.map.impl.experiments.transport.c) obj).a;
                SuperAppDiscoveryMapTransportExperiment.Companion.getClass();
                return ((jbh) rqoVar).e(SuperAppDiscoveryMapTransportExperiment.e);
            case 24:
                return ((jbh) ((p) obj).a).e(SuperAppDiscoveryMapV2Experiment.p);
            case 25:
                return (v9w0) ((umt0) obj).get();
            case 26:
                y4c0 y4c0Var = (y4c0) obj;
                if (y4c0Var.x()) {
                    ((f09) y4c0Var.E).setVisible(true);
                }
                return zy11Var;
            case 27:
                return vez0.D(((f) obj).C);
            case 28:
                insetsType$lambda$02 = SuperAppOrderBundleView.insetsType$lambda$0((SuperAppOrderBundleView) obj);
                return insetsType$lambda$02;
            default:
                int i2 = 9;
                return new v4c(i2, new but0(i2, (i9w0) obj));
        }
    }
}
