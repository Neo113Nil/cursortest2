package defpackage;

import android.net.Uri;
import androidx.compose.ui.semantics.f;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.CardInputMainView;
import com.yandex.go.places.models.data.entities.network.actions.ChangeModalStateAction;
import com.yandex.go.taxi.order.cancel.similar.view.CancelSimilarOrdersModalView;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.model.Zone;
import com.yandex.payment.sdk.cardscanner.CardScannerActivity;
import com.yandex.payment.sdk.flex.impl.customview.views.cardinput.CardInputView;
import com.yandex.payment.sdk.ui.CardInput$State;
import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.presentation.carddeletion.CardDeletionFragment;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.cardpin.CardPinCodeFragment;
import com.ybsdk.feature.card.internal.presentation.cardrename.a;
import com.ybsdk.feature.cashback.impl.entities.CashbackSelectorCategoryEntity;
import com.ybsdk.feature.cashback.impl.entities.SuggestedCashbackPromoEntity;
import com.ybsdk.feature.cashback.impl.screens.categories.CashbackCategoriesFragment;
import com.ybsdk.widgets.common.YbButtonView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;
import ru.yandex.taxi.ChangeOrderSourceAddressFragment;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.web.b;

/* loaded from: classes3.dex */
public final /* synthetic */ class cx7 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cx7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        zy11 adapter$lambda$0;
        vrc render$lambda$5;
        stz0 render$lambda$35$lambda$32;
        j5x0 renderPromoInfo$lambda$42;
        zy11 onAttachedToWindow$lambda$13;
        zy11 onAttachedToWindow$lambda$0;
        Object obj2;
        ofy ofyVar;
        zy11 onViewCreated$lambda$3$lambda$1;
        r0 r0Var;
        Object value2;
        zy11 prepareCamera$lambda$0;
        boolean delegatorsHelper$lambda$1;
        YbButtonView.a render$lambda$5$lambda$4;
        zy11 openEntranceInput$lambda$0;
        int i = this.a;
        int i2 = 0;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(!((LinkedHashSet) obj3).contains((String) obj));
            case 1:
                String str = (String) obj;
                r0 r0Var2 = ((jy7) obj3).b.a;
                do {
                    value = r0Var2.getValue();
                } while (!r0Var2.k(value, qy7.a((qy7) value, null, null, null, str, 7)));
                return zy11.a;
            case 2:
                zy7 zy7Var = (zy7) obj3;
                mnq0 mnq0Var = (mnq0) obj;
                f.q(mnq0Var, zy7Var.b);
                String str2 = zy7Var.d;
                f.l(mnq0Var, str2 != null ? str2 : "");
                return zy11.a;
            case 3:
                adapter$lambda$0 = CancelSimilarOrdersModalView.adapter$lambda$0((CancelSimilarOrdersModalView) obj3, (nz7) obj);
                return adapter$lambda$0;
            case 4:
                f28 f28Var = (f28) obj3;
                TaxiOrder taxiOrder = (TaxiOrder) obj;
                gg41 b = ((gf41) f28Var.H).a().b();
                b bVar = UiWebViewConfig.Companion;
                mxf0 mxf0Var = (mxf0) f28Var.I;
                Zone M = taxiOrder.M();
                ih21 ih21Var = M != null ? M.j : null;
                Zone M2 = taxiOrder.M();
                String a = mxf0Var.a(ih21Var, M2 != null ? M2.i : null);
                String str3 = a != null ? a : "";
                bVar.getClass();
                f28Var.A(b, new dg41(b.a(str3, null, null, false, false), null, null, null, null, null, null, 254), sy60.Q2);
                return zy11.a;
            case 5:
                t tVar = (t) obj3;
                if (((d88) obj) instanceof d88) {
                    tVar.r(new qu(9));
                    return zy11.a;
                }
                w511.b();
                return null;
            case 6:
                render$lambda$5 = CardDeletionFragment.render$lambda$5((ed8) obj3, (vrc) obj);
                return render$lambda$5;
            case 7:
                render$lambda$35$lambda$32 = CardDetailsFragment.render$lambda$35$lambda$32((pe8) obj3, (stz0) obj);
                return render$lambda$35$lambda$32;
            case 8:
                renderPromoInfo$lambda$42 = CardDetailsFragment.renderPromoInfo$lambda$42((q9j) obj3, (j5x0) obj);
                return renderPromoInfo$lambda$42;
            case 9:
                onAttachedToWindow$lambda$13 = CardInputMainView.onAttachedToWindow$lambda$13((CardInputMainView) obj3, obj);
                return onAttachedToWindow$lambda$13;
            case 10:
                qg8 qg8Var = (qg8) obj3;
                CardInput$State cardInput$State = (CardInput$State) obj;
                qg8Var.g = cardInput$State;
                g98 g98Var = qg8Var.d;
                if (g98Var != null) {
                    g98Var.e(qg8Var.d(cardInput$State));
                }
                return zy11.a;
            case 11:
                onAttachedToWindow$lambda$0 = CardInputView.onAttachedToWindow$lambda$0((CardInputView) obj3, obj);
                return onAttachedToWindow$lambda$0;
            case 12:
                oi8 oi8Var = (oi8) obj3;
                gi8 gi8Var = (gi8) obj;
                String str4 = gi8Var.c;
                List list = gi8Var.a;
                int i3 = gi8Var.d;
                il8 il8Var = (il8) list.get(i3);
                Locale locale = tm60.a;
                String str5 = gi8Var.b;
                BigDecimal g = tm60.g(str5);
                if (g == null) {
                    ofyVar = null;
                } else {
                    Iterator it = il8Var.f.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            ofy ofyVar2 = (ofy) obj2;
                            MoneyEntity moneyEntity = ofyVar2.a.b;
                            BigDecimal amount = moneyEntity != null ? moneyEntity.getAmount() : null;
                            if (ofyVar2.a.a.getAmount().compareTo(g) >= 0 || (amount != null && amount.compareTo(g) <= 0)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    ofyVar = (ofy) obj2;
                }
                String b2 = oi8Var.a.b(str4);
                if (b2 != null) {
                    str4 = b2;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((il8) it2.next()).b);
                }
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    int i4 = i2 + 1;
                    if (i2 < 0) {
                        scc.m();
                        throw null;
                    }
                    arrayList2.add(new k5x0(g8e.i(Text.Companion, (String) next), i2));
                    i2 = i4;
                }
                j5x0 j5x0Var = new j5x0(arrayList2, Integer.valueOf(i3));
                com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
                String str6 = ofyVar != null ? ofyVar.b : null;
                return new hi8(j5x0Var, g8e.i(bVar2, str6 != null ? str6 : ""), new Text.Constant(il8Var.c), str5, new YbButtonView.a(new Text.Resource(dzh0.ybsdk_card_card_save_button_title), null, null, null, null, null, null, false, gi8Var.e, null, 3070), new Text.Constant(str4));
            case 13:
                lj8 lj8Var = (lj8) obj3;
                fj8 fj8Var = (fj8) obj;
                z80 z80Var = lj8Var.H.c;
                if (z80Var == null || !z80Var.b) {
                    fj8Var.a();
                } else {
                    fj8Var.W0(z80Var);
                    lj8Var.H.c = null;
                }
                lj8Var.H.b = true;
                return zy11.a;
            case 14:
                onViewCreated$lambda$3$lambda$1 = CardPinCodeFragment.onViewCreated$lambda$3$lambda$1((CardPinCodeFragment) obj3, ((Character) obj).charValue());
                return onViewCreated$lambda$3$lambda$1;
            case 15:
                lur0 lur0Var = (lur0) obj;
                pz40 Y = ((a) obj3).Y();
                do {
                    r0Var = (r0) Y;
                    value2 = r0Var.getValue();
                } while (!r0Var.k(value2, ym8.b((ym8) value2, null, null, lur0Var, 11)));
                return zy11.a;
            case 16:
                prepareCamera$lambda$0 = CardScannerActivity.prepareCamera$lambda$0((CardScannerActivity) obj3, (Exception) obj);
                return prepareCamera$lambda$0;
            case 17:
                return new w50(8, (ExecutorService) obj3);
            case 18:
                ((vt8) obj3).a0((q4c) obj);
                return zy11.a;
            case 19:
                vu8 vu8Var = (vu8) obj3;
                int intValue = ((Integer) obj).intValue();
                vu8Var.E((m950) ((yvf0) vu8Var.G).get(), new lbi(intValue == 0 ? gki.a : new fki(intValue - 1), new hu0(intValue), null, null, null, false, null, true, 249), new uu8(vu8Var, intValue), hxx.a);
                return zy11.a;
            case 20:
                bgq0 bgq0Var = (bgq0) obj3;
                nyh nyhVar = (nyh) obj;
                s9e s9eVar = new s9e(bgq0Var.a, bgq0Var.b);
                com.yandex.go.logistics.cargo_flow.a aVar = nyhVar.a;
                nde ndeVar = nyhVar.b;
                ndeVar.h.invoke(com.yandex.go.logistics.cargo_flow.a.Q(aVar, ndeVar.i, s9eVar));
                return zy11.a;
            case 21:
                rzx rzxVar = (rzx) obj;
                a2y a2yVar = ((c) obj3).A;
                zii0 j = gwk0.o(rzxVar).j(rzxVar, true);
                r0 r0Var3 = a2yVar.b;
                r0Var3.getClass();
                r0Var3.m(null, j);
                return zy11.a;
            case 22:
                f.j((mnq0) obj, new hcc(1, ((hz8) obj3).a.a.size()));
                return zy11.a;
            case 23:
                delegatorsHelper$lambda$1 = CashbackCategoriesFragment.delegatorsHelper$lambda$1((CashbackCategoriesFragment) obj3, (CashbackSelectorCategoryEntity) obj);
                return Boolean.valueOf(delegatorsHelper$lambda$1);
            case 24:
                render$lambda$5$lambda$4 = CashbackCategoriesFragment.render$lambda$5$lambda$4((s29) obj3, (YbButtonView.a) obj);
                return render$lambda$5$lambda$4;
            case 25:
                SuggestedCashbackPromoEntity suggestedCashbackPromoEntity = (SuggestedCashbackPromoEntity) obj3;
                m29 m29Var = (m29) obj;
                if (suggestedCashbackPromoEntity == null) {
                    return m29.a(m29Var, null, null, null, 0, 0, r501.a(null, null, null, null, null, null, null, null, null, null, null, null, null, 65535), false, false, 159);
                }
                Text title = suggestedCashbackPromoEntity.getTitle();
                List<CashbackSelectorCategoryEntity> categories = suggestedCashbackPromoEntity.getCategories();
                int maxCategories = suggestedCashbackPromoEntity.getMaxCategories();
                Text subtitle = suggestedCashbackPromoEntity.getSubtitle();
                List<CashbackSelectorCategoryEntity> categories2 = suggestedCashbackPromoEntity.getCategories();
                if (!(categories2 instanceof Collection) || !categories2.isEmpty()) {
                    Iterator<T> it4 = categories2.iterator();
                    while (it4.hasNext()) {
                        if (((CashbackSelectorCategoryEntity) it4.next()).isSelected() && (i2 = i2 + 1) < 0) {
                            scc.l();
                            throw null;
                        }
                    }
                }
                return m29.a(m29Var, title, subtitle, categories, maxCategories, i2, null, false, false, 160);
            case 26:
                return ((avj0) ((x29) obj3).a).i(kyh0.summary_accessibility_tariff_plus_amount_fractional, (String) obj);
            case 27:
                ((mg21) ((com.yandex.go.styling.router.a) obj3).G).b(Uri.parse((String) obj));
                return zy11.a;
            case 28:
                ((com.yandex.go.places.organization.card.impl.ui.card.flex.actions.change_modal_state.a) obj3).a.invoke((ChangeModalStateAction.ModalState) obj);
                return zy11.a;
            default:
                openEntranceInput$lambda$0 = ChangeOrderSourceAddressFragment.openEntranceInput$lambda$0((ChangeOrderSourceAddressFragment) obj3, (String) obj);
                return openEntranceInput$lambda$0;
        }
    }
}
