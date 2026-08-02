package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.yandex.fintechsdk.features.splash.internal.presentation.SplashFragment;
import com.yandex.fintechsdk.features.splash.internal.presentation.b;
import com.yandex.go.flex.common.facade.routers.views.SlidableFlexView;
import com.yandex.go.pin.api.v1.PinV1Component;
import com.yandex.go.something_wrong_screen.ui.SomethingWrongOnboardingScreenModalView;
import com.yandex.go.taxi.summary.shared.experiment.SourceDestinationOnTopExperiment;
import com.yandex.mapkit.annotations.LocalizedPhrase;
import com.yandex.messaging.internal.view.input.d;
import com.yandex.messaging.internal.view.timeline.overlay.e;
import com.ybsdk.core.design.widget.SlidableCoordinatorLayout;
import com.ybsdk.feature.card.internal.entities.CardProductTypeEntity;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardScreenScreenParams;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;
import com.ybsdk.feature.split.deposit.internal.ui.deposit.SplitDepositScreenParams;
import com.ybsdk.widgets.common.StadiumButtonView;
import com.ybsdk.widgets.common.paymentmethod.UpgradeInfoView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.design.ToolbarComponent;
import ru.yandex.taxi.masstransit.main.ui.flex.SlideableFlexModalView;
import ru.yandex.taxi.preorder.source.SourcePointFragment;
import ru.yandex.taxi.summary.promotions.analytics.c;
import ru.yandex.taxi.summary.solid.p;

/* loaded from: classes6.dex */
public final /* synthetic */ class gas0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gas0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.sls
    public final Object invoke() {
        float slideableHeight_delegate$lambda$0;
        qns0 documentTracker_delegate$lambda$0;
        bos0 documentTracker_delegate$lambda$02;
        View insetsType$lambda$0;
        zy11 onAttach$lambda$0;
        b viewModel_delegate$lambda$0;
        zy11 render$lambda$16$lambda$15;
        zy11 enableRightPartClick$lambda$10;
        List W;
        List W2;
        int i = this.a;
        boolean z = false;
        CardProductTypeEntity cardProductTypeEntity = 0;
        Object obj = null;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((c) obj2).e.getClass();
                return uyj.a.P(1);
            case 1:
                return new les0((mes0) obj2);
            case 2:
                return new UpgradeInfoView(((tfs0) obj2).a, null, 0, 6, null);
            case 3:
                zl8 zl8Var = CardProductTypeEntity.Companion;
                String productId = ((SingleCardScreenScreenParams) obj2).getProductId();
                zl8Var.getClass();
                if (productId != null) {
                    Iterator<E> it = CardProductTypeEntity.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (((CardProductTypeEntity) next).name().toLowerCase(Locale.ROOT).equals(productId)) {
                                obj = next;
                            }
                        }
                    }
                    CardProductTypeEntity cardProductTypeEntity2 = (CardProductTypeEntity) obj;
                    cardProductTypeEntity = cardProductTypeEntity2;
                    if (cardProductTypeEntity2 == null) {
                        cardProductTypeEntity = CardProductTypeEntity.UNKNOWN;
                    }
                }
                return new rgs0(cardProductTypeEntity, 511);
            case 4:
                slideableHeight_delegate$lambda$0 = SlidableCoordinatorLayout.slideableHeight_delegate$lambda$0((SlidableCoordinatorLayout) obj2);
                return Float.valueOf(slideableHeight_delegate$lambda$0);
            case 5:
                documentTracker_delegate$lambda$0 = SlidableFlexView.documentTracker_delegate$lambda$0((SlidableFlexView) obj2);
                return documentTracker_delegate$lambda$0;
            case 6:
                documentTracker_delegate$lambda$02 = SlideableFlexModalView.documentTracker_delegate$lambda$0((SlideableFlexModalView) obj2);
                return documentTracker_delegate$lambda$02;
            case 7:
                ((SliderButtonView) obj2).startBounceAnimation();
                return zy11Var;
            case 8:
                return Float.valueOf(r11.heightPixels / ((avj0) ((oxs0) obj2).b).d().density);
            case 9:
                m0t0 m0t0Var = (m0t0) obj2;
                if (m0t0Var.a != null && !m0t0Var.e) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                ((p) obj2).q.a();
                return zy11Var;
            case 11:
                insetsType$lambda$0 = SomethingWrongOnboardingScreenModalView.insetsType$lambda$0((SomethingWrongOnboardingScreenModalView) obj2);
                return insetsType$lambda$0;
            case 12:
                ((b8t0) obj2).c.setVisibility(8);
                return zy11Var;
            case 13:
                ((hhs0) obj2).w(bat0.a);
                return zy11Var;
            case 14:
                ((gbt0) obj2).M = true;
                return zy11Var;
            case 15:
                return Boolean.valueOf(((SourceDestinationOnTopExperiment) ((nct0) obj2).a.c()).b);
            case 16:
                return new tqk0(((tct0) obj2).a);
            case 17:
                onAttach$lambda$0 = SourcePointFragment.onAttach$lambda$0((SourcePointFragment) obj2);
                return onAttach$lambda$0;
            case 18:
                ((PinV1Component) obj2).invalidatePinOverlay();
                return zy11Var;
            case 19:
                return Integer.valueOf(((avj0) ((zuj0) ((fcj0) obj2).a)).c(hug0.summary_route_stops_v2_map_top_padding_pin_compensation));
            case 20:
                ((qmp0) obj2).h.invoke();
                return zy11Var;
            case 21:
                return kotlin.collections.b.i(new Pair("type", "say"), new Pair("phrase", rsq0.e((LocalizedPhrase) obj2)));
            case 22:
                viewModel_delegate$lambda$0 = SplashFragment.viewModel_delegate$lambda$0((SplashFragment) obj2);
                return viewModel_delegate$lambda$0;
            case 23:
                render$lambda$16$lambda$15 = SplitDepositAutoTopupStatusFragment.render$lambda$16$lambda$15((SplitDepositAutoTopupStatusFragment) obj2);
                return render$lambda$16$lambda$15;
            case 24:
                SplitDepositScreenParams splitDepositScreenParams = (SplitDepositScreenParams) obj2;
                return new vut0(splitDepositScreenParams.getOrderId(), splitDepositScreenParams.getScenario(), cardProductTypeEntity, 31);
            case 25:
                enableRightPartClick$lambda$10 = StadiumButtonView.enableRightPartClick$lambda$10((StadiumButtonView) obj2);
                return enableRightPartClick$lambda$10;
            case 26:
                amp0 amp0Var = (amp0) obj2;
                Context context = (Context) amp0Var.a;
                ToolbarComponent toolbarComponent = new ToolbarComponent(context, context.getResources().getLayout(sph0.component_abstract_list_item), 0, 4, null);
                toolbarComponent.setTitleTypeface(5);
                toolbarComponent.setTitleAlignment(1);
                toolbarComponent.setAccentBackgroundEnabled(true);
                toolbarComponent.disableNavigationButton();
                androidx.core.view.b.q(toolbarComponent.title(), true);
                ((gu11) amp0Var.b).getClass();
                toolbarComponent.setBackgroundAttr(xng0.bgMinor);
                return toolbarComponent;
            case 27:
                e eVar = (e) obj2;
                View inflate = LayoutInflater.from(eVar.D.getContext()).inflate(olh0.msg_v_starred_label, (ViewGroup) null, false);
                if (inflate == null) {
                    ny61.t("null cannot be cast to non-null type android.view.View");
                    return null;
                }
                inflate.setOnClickListener(new eaj0(26, eVar));
                TextView textView = (TextView) inflate.findViewById(e9h0.text);
                return new b0u0(inflate, textView, textView.getPaddingStart(), textView.getPaddingEnd(), textView.getCompoundDrawablePadding(), textView.getText());
            case 28:
                return (d) ((com.yandex.messaging.internal.view.input.e) obj2).a.get();
            default:
                String string = ((jeu0) obj2).a.getString("pref_key_sticky_variant", null);
                if (string == null) {
                    return new LinkedHashMap();
                }
                W = evu0.W(string, new String[]{"|"}, (r2 & 4) != 0 ? 0 : 2);
                List list = W;
                int d = gw00.d(tcc.n(list, 10));
                if (d < 16) {
                    d = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(d);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    W2 = evu0.W((String) it2.next(), new String[]{"="}, (r2 & 4) != 0 ? 0 : 2);
                    if (W2.size() != 2) {
                        W2 = null;
                    }
                    Pair pair = W2 != null ? new Pair(W2.get(0), W2.get(1)) : new Pair("", "");
                    linkedHashMap.put(pair.c(), pair.f());
                }
                return new LinkedHashMap(linkedHashMap);
        }
    }
}
