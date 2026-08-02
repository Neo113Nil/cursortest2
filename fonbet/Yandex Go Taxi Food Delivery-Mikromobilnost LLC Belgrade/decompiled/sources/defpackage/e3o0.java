package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.foundation.text.selection.i;
import com.yandex.go.charity.models.OpenCharitySource;
import com.yandex.go.scooters.insurance.analytics.InsuranceOpenReason;
import com.yandex.go.scooters.offers.v2.analytics.ScootersCardV2Analytics$CardButton;
import com.yandex.go.scooters.offers.v2.details.ScootersOfferDetailsModalView;
import com.yandex.go.scooters.offers.v2.details.c;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.scooters.parking.d;
import com.yandex.go.scooters.passes.purchase.packages.f;
import com.yandex.go.scooters.promocodes.status.ScootersPromocodesStatusModalView;
import com.yandex.go.scooters.qr.ui.ScootersQrModalView;
import com.yandex.passport.sloth.ui.dependencies.m;
import com.yandex.plus.home.feature.webviews.internal.simple.SimpleWebViewLayout;
import com.ybsdk.feature.split.deposit.internal.ui.autotopup.status.SplitDepositAutoTopupStatusFragment;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$LongRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.taxi.address.clarification.AddressClarificationCloseReason;
import ru.yandex.taxi.contacts.SelectContactView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.preorder.summary.solid.l;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes13.dex */
public final /* synthetic */ class e3o0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e3o0(g3o0 g3o0Var, ScootersOfferDetailsModalView scootersOfferDetailsModalView) {
        this.a = 0;
        this.b = scootersOfferDetailsModalView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        final c cVar;
        final c cVar2;
        final c cVar3;
        final ?? r11;
        pav pavVar;
        g18 g18Var;
        pav pavVar2;
        zy11 detailsAdapter$lambda$0$0;
        zy11 prefixSelectorButtonsAdapter_delegate$lambda$0$0$0;
        boolean onAttachedToWindow$lambda$5;
        long j;
        long j2;
        long j3;
        zy11 webViewController_delegate$lambda$2$lambda$1;
        zy11 consumeSideEffect$lambda$4;
        int i = this.a;
        final int i2 = 2;
        final int i3 = 0;
        i3 = 0;
        final int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                final ScootersOfferDetailsModalView scootersOfferDetailsModalView = (ScootersOfferDetailsModalView) obj3;
                ListItemComponent listItemComponent = (ListItemComponent) obj;
                final n15 n15Var = ((f1j) obj2).a;
                Object tag = listItemComponent.getTag();
                g18 g18Var2 = tag instanceof g18 ? (g18) tag : null;
                if (g18Var2 != null) {
                    g18Var2.cancel();
                }
                CharSequence charSequence = (CharSequence) n15Var.b;
                CharSequence charSequence2 = (CharSequence) n15Var.w;
                listItemComponent.setTitle(charSequence);
                listItemComponent.setSubtitle((CharSequence) n15Var.c);
                if (n15Var instanceof v1j) {
                    listItemComponent.setTag(null);
                    listItemComponent.setTrailCompanionText(charSequence2);
                    listItemComponent.setTrailCompanionMode(0);
                    listItemComponent.setTrailMode(0);
                    listItemComponent.setDebounceClickListener(null);
                    listItemComponent.setClickable(false);
                } else if (n15Var instanceof u1j) {
                    ImageView trailCompanionImageView = listItemComponent.getTrailCompanionImageView();
                    if (trailCompanionImageView != null) {
                        pavVar2 = scootersOfferDetailsModalView.imageLoader;
                        lbm a = pavVar2.a(trailCompanionImageView);
                        if (a != null) {
                            g18Var = ((nac) a).c(((u1j) n15Var).x);
                            listItemComponent.setTag(g18Var);
                            listItemComponent.setTrailCompanionMode(1);
                            listItemComponent.setTrailMode(0);
                            listItemComponent.setDebounceClickListener(null);
                            listItemComponent.setClickable(false);
                        }
                    }
                    g18Var = null;
                    listItemComponent.setTag(g18Var);
                    listItemComponent.setTrailCompanionMode(1);
                    listItemComponent.setTrailMode(0);
                    listItemComponent.setDebounceClickListener(null);
                    listItemComponent.setClickable(false);
                } else if (n15Var instanceof q1j) {
                    String str = ((q1j) n15Var).x;
                    if (str != null) {
                        ImageView trailCompanionImageView2 = listItemComponent.getTrailCompanionImageView();
                        if (trailCompanionImageView2 != null) {
                            pavVar = scootersOfferDetailsModalView.imageLoader;
                            lbm a2 = pavVar.a(trailCompanionImageView2);
                            if (a2 != null) {
                                r3 = ((nac) a2).c(str);
                            }
                        }
                        listItemComponent.setTag(r3);
                        r11 = 1;
                        listItemComponent.setTrailCompanionMode(1);
                    } else {
                        r11 = 1;
                        listItemComponent.setTrailCompanionText(charSequence2);
                        listItemComponent.setTrailCompanionMode(0);
                    }
                    listItemComponent.setTrailMode(2);
                    listItemComponent.setDebounceClickListener(new Runnable() { // from class: d3o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            c cVar4;
                            f6n0 f6n0Var;
                            c cVar5;
                            int i5 = r11;
                            n15 n15Var2 = n15Var;
                            ScootersOfferDetailsModalView scootersOfferDetailsModalView2 = scootersOfferDetailsModalView;
                            switch (i5) {
                                case 0:
                                    cVar4 = scootersOfferDetailsModalView2.scootersOfferDetailsPresenter;
                                    s7n0 s7n0Var = ((s1j) n15Var2).x;
                                    g gVar = ((h7n0) cVar4.y).b;
                                    gVar.A((m950) gVar.a0.get(), s7n0Var, sy60.Q2);
                                    break;
                                default:
                                    f6n0Var = scootersOfferDetailsModalView2.scootersCardV2Analytics;
                                    f6n0Var.c(ScootersCardV2Analytics$CardButton.CHARITY);
                                    cVar5 = scootersOfferDetailsModalView2.scootersOfferDetailsPresenter;
                                    q1j q1jVar = (q1j) n15Var2;
                                    n6n0 n6n0Var = cVar5.y;
                                    OpenCharitySource openCharitySource = OpenCharitySource.SCOOTERS_OFFER_CARD;
                                    String str2 = q1jVar.y;
                                    String str3 = q1jVar.z;
                                    h7n0 h7n0Var = (h7n0) n6n0Var;
                                    g gVar2 = h7n0Var.b;
                                    gVar2.A((m950) gVar2.I.get(), new pza(openCharitySource, str2, str3, b.f()), new mo30(25, h7n0Var));
                                    break;
                            }
                        }
                    });
                    listItemComponent.setClickable(r11);
                } else if (n15Var instanceof p1j) {
                    ButtonComponent buttonComponent = new ButtonComponent(listItemComponent.getContext(), null, 0, 6, null);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams.setMarginEnd(tje.r(mrg0.go_design_m_space, buttonComponent.getContext()));
                    buttonComponent.setLayoutParams(layoutParams);
                    buttonComponent.setText(((p1j) n15Var).x);
                    buttonComponent.setTextSize(0, tje.r(mrg0.component_text_size_caption, buttonComponent.getContext()));
                    buttonComponent.setButtonTitleColor(qje.t(xng0.textMain, buttonComponent.getContext()));
                    buttonComponent.setBackground(vng.t(s0h0.bg_rounded_button, buttonComponent.getContext()));
                    buttonComponent.setButtonSize(0);
                    cVar3 = scootersOfferDetailsModalView.scootersOfferDetailsPresenter;
                    buttonComponent.setDebounceClickListener(new Runnable() { // from class: f3o0
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i5 = i3;
                            c cVar4 = cVar3;
                            switch (i5) {
                                case 0:
                                    n6n0 n6n0Var = cVar4.y;
                                    InsuranceOpenReason insuranceOpenReason = InsuranceOpenReason.TARIFF_DETAILS;
                                    b4p0 a3 = cVar4.z.a();
                                    ((h7n0) n6n0Var).g(insuranceOpenReason, a3 != null ? a3.l : null);
                                    break;
                                case 1:
                                    n6n0 n6n0Var2 = cVar4.y;
                                    InsuranceOpenReason insuranceOpenReason2 = InsuranceOpenReason.TARIFF_DETAILS;
                                    b4p0 a4 = cVar4.z.a();
                                    ((h7n0) n6n0Var2).g(insuranceOpenReason2, a4 != null ? a4.l : null);
                                    break;
                                default:
                                    g gVar = ((h7n0) cVar4.y).b;
                                    gVar.z((m950) gVar.m0.get(), sy60.Q2);
                                    break;
                            }
                        }
                    });
                    listItemComponent.setTrailView(buttonComponent);
                    listItemComponent.setTrailCompanionMode(1);
                } else {
                    final int i5 = 1;
                    if (n15Var instanceof t1j) {
                        listItemComponent.setTrailCompanionText(charSequence2);
                        listItemComponent.setTrailCompanionMode(0);
                        listItemComponent.setTrailMode(2);
                        cVar2 = scootersOfferDetailsModalView.scootersOfferDetailsPresenter;
                        listItemComponent.setDebounceClickListener(new Runnable() { // from class: f3o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i5;
                                c cVar4 = cVar2;
                                switch (i52) {
                                    case 0:
                                        n6n0 n6n0Var = cVar4.y;
                                        InsuranceOpenReason insuranceOpenReason = InsuranceOpenReason.TARIFF_DETAILS;
                                        b4p0 a3 = cVar4.z.a();
                                        ((h7n0) n6n0Var).g(insuranceOpenReason, a3 != null ? a3.l : null);
                                        break;
                                    case 1:
                                        n6n0 n6n0Var2 = cVar4.y;
                                        InsuranceOpenReason insuranceOpenReason2 = InsuranceOpenReason.TARIFF_DETAILS;
                                        b4p0 a4 = cVar4.z.a();
                                        ((h7n0) n6n0Var2).g(insuranceOpenReason2, a4 != null ? a4.l : null);
                                        break;
                                    default:
                                        g gVar = ((h7n0) cVar4.y).b;
                                        gVar.z((m950) gVar.m0.get(), sy60.Q2);
                                        break;
                                }
                            }
                        });
                        listItemComponent.setClickable(true);
                    } else if (n15Var instanceof r1j) {
                        listItemComponent.setTrailCompanionText(charSequence2);
                        listItemComponent.setTrailCompanionMode(0);
                        listItemComponent.setTrailMode(2);
                        cVar = scootersOfferDetailsModalView.scootersOfferDetailsPresenter;
                        listItemComponent.setDebounceClickListener(new Runnable() { // from class: f3o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i52 = i2;
                                c cVar4 = cVar;
                                switch (i52) {
                                    case 0:
                                        n6n0 n6n0Var = cVar4.y;
                                        InsuranceOpenReason insuranceOpenReason = InsuranceOpenReason.TARIFF_DETAILS;
                                        b4p0 a3 = cVar4.z.a();
                                        ((h7n0) n6n0Var).g(insuranceOpenReason, a3 != null ? a3.l : null);
                                        break;
                                    case 1:
                                        n6n0 n6n0Var2 = cVar4.y;
                                        InsuranceOpenReason insuranceOpenReason2 = InsuranceOpenReason.TARIFF_DETAILS;
                                        b4p0 a4 = cVar4.z.a();
                                        ((h7n0) n6n0Var2).g(insuranceOpenReason2, a4 != null ? a4.l : null);
                                        break;
                                    default:
                                        g gVar = ((h7n0) cVar4.y).b;
                                        gVar.z((m950) gVar.m0.get(), sy60.Q2);
                                        break;
                                }
                            }
                        });
                        listItemComponent.setClickable(true);
                    } else {
                        if (!(n15Var instanceof s1j)) {
                            w511.b();
                            return null;
                        }
                        listItemComponent.setTrailCompanionMode(0);
                        listItemComponent.setTrailMode(2);
                        listItemComponent.setDebounceClickListener(new Runnable() { // from class: d3o0
                            @Override // java.lang.Runnable
                            public final void run() {
                                c cVar4;
                                f6n0 f6n0Var;
                                c cVar5;
                                int i52 = i3;
                                n15 n15Var2 = n15Var;
                                ScootersOfferDetailsModalView scootersOfferDetailsModalView2 = scootersOfferDetailsModalView;
                                switch (i52) {
                                    case 0:
                                        cVar4 = scootersOfferDetailsModalView2.scootersOfferDetailsPresenter;
                                        s7n0 s7n0Var = ((s1j) n15Var2).x;
                                        g gVar = ((h7n0) cVar4.y).b;
                                        gVar.A((m950) gVar.a0.get(), s7n0Var, sy60.Q2);
                                        break;
                                    default:
                                        f6n0Var = scootersOfferDetailsModalView2.scootersCardV2Analytics;
                                        f6n0Var.c(ScootersCardV2Analytics$CardButton.CHARITY);
                                        cVar5 = scootersOfferDetailsModalView2.scootersOfferDetailsPresenter;
                                        q1j q1jVar = (q1j) n15Var2;
                                        n6n0 n6n0Var = cVar5.y;
                                        OpenCharitySource openCharitySource = OpenCharitySource.SCOOTERS_OFFER_CARD;
                                        String str2 = q1jVar.y;
                                        String str3 = q1jVar.z;
                                        h7n0 h7n0Var = (h7n0) n6n0Var;
                                        g gVar2 = h7n0Var.b;
                                        gVar2.A((m950) gVar2.I.get(), new pza(openCharitySource, str2, str3, b.f()), new mo30(25, h7n0Var));
                                        break;
                                }
                            }
                        });
                        listItemComponent.setClickable(true);
                    }
                }
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                f.j((nvi0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                f.c((e8o0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                d.c((aco0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                ((Integer) obj2).getClass();
                d.b((dco0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                detailsAdapter$lambda$0$0 = ScootersPromocodesStatusModalView.detailsAdapter$lambda$0$0((ScootersPromocodesStatusModalView) obj3, (RobotoTextView) obj, (CharSequence) obj2);
                return detailsAdapter$lambda$0$0;
            case 6:
                prefixSelectorButtonsAdapter_delegate$lambda$0$0$0 = ScootersQrModalView.prefixSelectorButtonsAdapter_delegate$lambda$0$0$0((ScootersQrModalView) obj3, (View) obj, (String) obj2);
                return prefixSelectorButtonsAdapter_delegate$lambda$0$0$0;
            case 7:
                ((Integer) obj2).getClass();
                j4b1.b((wxo0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                k4b1.m((s1p0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                v4b1.e((pvi0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                ((Integer) obj2).getClass();
                b2q0.c((qgg) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 11:
                ((Integer) obj2).getClass();
                a.l((s8q0) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 12:
                onAttachedToWindow$lambda$5 = SelectContactView.onAttachedToWindow$lambda$5((SelectContactView) obj3, (Integer) obj, (KeyEvent) obj2);
                return Boolean.valueOf(onAttachedToWindow$lambda$5);
            case 13:
                ((zvd0) obj).a();
                ((Ref$LongRef) obj3).element = ((wu60) obj2).a;
                return zy11Var;
            case 14:
                i iVar = (i) obj3;
                xky0 xky0Var = (xky0) obj;
                Context context = (Context) obj2;
                Pair e = iVar.e();
                cwc0.a(xky0Var, context, false, e != null ? (kk2) e.c() : null, e != null ? (asy0) e.f() : null, iVar.w, new a5p0(11, iVar, context));
                return zy11Var;
            case 15:
                rzx rzxVar = (rzx) obj3;
                rzx c = ((ho40) obj).c();
                rzx c2 = ((ho40) obj2).c();
                long j4 = 0;
                if (c != null) {
                    j = rzxVar.T(c, 0L);
                    j2 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (c.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) + ((int) (c.e() >> 32))) << 32);
                } else {
                    j = 0;
                    j2 = 0;
                }
                if (c2 != null) {
                    j4 = rzxVar.T(c2, 0L);
                    j3 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + ((int) (c2.e() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j4 >> 32)) + ((int) (c2.e() >> 32))) << 32);
                } else {
                    j3 = 0;
                }
                int i6 = (int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat = Float.intBitsToFloat(i6);
                int i7 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat2 = intBitsToFloat - Float.intBitsToFloat(i7);
                int i8 = (int) (j2 >> 32);
                int i9 = (int) (j >> 32);
                float intBitsToFloat3 = Float.intBitsToFloat(i8) - Float.intBitsToFloat(i9);
                long j5 = j4;
                int i10 = (int) (j3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat4 = Float.intBitsToFloat(i10);
                int i11 = (int) (j5 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                float intBitsToFloat5 = intBitsToFloat4 - Float.intBitsToFloat(i11);
                int i12 = (int) (j3 >> 32);
                int i13 = (int) (j5 >> 32);
                float intBitsToFloat6 = Float.intBitsToFloat(i12) - Float.intBitsToFloat(i13);
                float max = Math.max(0.0f, Math.min(Float.intBitsToFloat(i6), Float.intBitsToFloat(i10)) - Math.max(Float.intBitsToFloat(i7), Float.intBitsToFloat(i11)));
                float max2 = Math.max(0.0f, Math.min(Float.intBitsToFloat(i8), Float.intBitsToFloat(i12)) - Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i13)));
                Object[] objArr = max >= intBitsToFloat2 * 0.5f || max >= intBitsToFloat5 * 0.5f;
                if (max2 < intBitsToFloat3 * 0.5f && max2 < intBitsToFloat6 * 0.5f) {
                    i3 = 1;
                }
                return Integer.valueOf((!objArr == true || i3 == 0) ? Float.valueOf(Float.intBitsToFloat(i7)).compareTo(Float.valueOf(Float.intBitsToFloat(i11))) : Float.valueOf(Float.intBitsToFloat(i9)).compareTo(Float.valueOf(Float.intBitsToFloat(i13))));
            case 16:
                ru.yandex.taxi.widget.c cVar4 = (ru.yandex.taxi.widget.c) obj3;
                View inflate = ((LayoutInflater) obj).inflate(bph0.address_clarification_content_item_separator, (ViewGroup) obj2, false);
                if (inflate != null) {
                    return new ru.yandex.taxi.address.clarification.impl.ui.recycler.b(cVar4, new jr0((RobotoTextView) inflate));
                }
                ny61.t("rootView");
                return null;
            case 17:
                ((Integer) obj2).getClass();
                ((ltr0) obj3).a((fid) obj, vng.O(1));
                return zy11Var;
            case 18:
                final m mVar = (m) obj3;
                xp0 xp0Var = (xp0) obj;
                AddressClarificationCloseReason addressClarificationCloseReason = (AddressClarificationCloseReason) obj2;
                xp0 xp0Var2 = ((wb1) mVar.d).a.d;
                if (xp0Var2.equals(tp0.b)) {
                    if (addressClarificationCloseReason != AddressClarificationCloseReason.MOVE_PIN_OUT_AREA) {
                        yit0 yit0Var = (yit0) mVar.a;
                        bov0 a3 = ((biv0) mVar.b).a();
                        if (a3 == null) {
                            a3 = bov0.e;
                        }
                        yit0Var.c(a3);
                    } else {
                        ru.yandex.taxi.routeselector.a aVar = (ru.yandex.taxi.routeselector.a) ((h3y) mVar.i).get();
                        if (!gtq0.u(aVar)) {
                            ((pep0) ((oep0) mVar.h)).f(new zsa(29, aVar, new sls() { // from class: l5s0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i14 = i3;
                                    zy11 zy11Var2 = zy11.a;
                                    m mVar2 = mVar;
                                    switch (i14) {
                                        case 0:
                                            u uVar = (u) mVar2.j;
                                            uVar.p.d();
                                            uVar.g.e(new tb(13, uVar, null));
                                            break;
                                        default:
                                            ((u) mVar2.j).a(ModalViewOrigin.SUMMARY);
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            }, new sls() { // from class: l5s0
                                @Override // defpackage.sls
                                public final Object invoke() {
                                    int i14 = i4;
                                    zy11 zy11Var2 = zy11.a;
                                    m mVar2 = mVar;
                                    switch (i14) {
                                        case 0:
                                            u uVar = (u) mVar2.j;
                                            uVar.p.d();
                                            uVar.g.e(new tb(13, uVar, null));
                                            break;
                                        default:
                                            ((u) mVar2.j).a(ModalViewOrigin.SUMMARY);
                                            break;
                                    }
                                    return zy11Var2;
                                }
                            }), new y9l0(ModalViewOrigin.SUMMARY, RouteSelectorOpenReason.PIN, null, null, null, RouteSelectorOpenReason.ADJUSTMENT, 32), hxx.a);
                        }
                    }
                } else if (xp0Var2.equals(vp0.b)) {
                    ((nwx0) ((fy01) mVar.e)).a.c().wa();
                    ((qht0) ((rft0) mVar.c)).b.Z();
                } else {
                    if (!xp0Var2.equals(up0.b) && !xp0Var2.equals(wp0.b)) {
                        w511.b();
                        return null;
                    }
                    jst.e.c("Address adjustment unexpected source: " + xp0Var);
                }
                return zy11Var;
            case 19:
                webViewController_delegate$lambda$2$lambda$1 = SimpleWebViewLayout.webViewController_delegate$lambda$2$lambda$1((SimpleWebViewLayout) obj3, (WebView) obj, (String) obj2);
                return webViewController_delegate$lambda$2$lambda$1;
            case 20:
                ((Integer) obj2).getClass();
                beb1.a((fts0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                beb1.b((gts0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 22:
                vus0 vus0Var = (vus0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    zgb1.a(vus0Var.a, an91.l(c530.a, 14.0f, 9.0f), 0, false, null, null, false, null, btsVar, 48, 252);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.e((yus0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.h((bvs0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 25:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.common.a.g((avs0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 26:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.ui.smart_camera_screens.a.a((ldc) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 27:
                o0t0 o0t0Var = (o0t0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ((r0t0) o0t0Var).a.getClass();
                    vqy0.c("Restart the app to apply changes.", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, btsVar2, 0, 0, 262142);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 28:
                ((l) obj3).Pg((String) obj, (String) obj2);
                return zy11Var;
            default:
                consumeSideEffect$lambda$4 = SplitDepositAutoTopupStatusFragment.consumeSideEffect$lambda$4((SplitDepositAutoTopupStatusFragment) obj3, (String) obj, (Bundle) obj2);
                return consumeSideEffect$lambda$4;
        }
    }

    public /* synthetic */ e3o0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ e3o0(Object obj, int i, int i2) {
        this.a = i2;
        this.b = obj;
    }
}
